package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.dao.search.SearchManager;
import com.abctech.transition.core.dao.search.ValueMapInformationBean;
import com.abctech.transition.core.dao.utility.ValueMapExportUtility;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionExportException;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.form.ValueMapSearchForm;
import com.abctech.transition.webapp.form.validation.ValueMapValidation;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
public class ValueMapController {
    private static Logger log = LoggerFactory.getLogger(ValueMapController.class);
    private static final String CUSTOMER_FORMAT_LIST = "customerFormatList";
    private static final String VALUE_MAP_FORM = "valueMapFormSearch";
    private static final String VALUE_MAP_LIST = "valueMapList";
    private static final String PAGING = "paging";
    private static final String ADMIN_VALUEMAPMAIN = "admin_valuemapmain";

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private ValueMapManager valueMapManager;

    @Autowired
    private ValueMapExportUtility valueMapExportUtility;

    @RequestMapping(value = "/importValueMap.html", method = RequestMethod.POST)
    public String importValueMap(Model model, @RequestParam("importFile") MultipartFile file, HttpServletResponse response) throws IOException, InterruptedException, ExecutionException {
        if (file != null && !file.isEmpty()) {

            //compare old file with uploaded file.
            //old file
            File oldFile = new File("tmp.csv");
            oldFile.renameTo(new File("lastest_tmp.csv"));
            oldFile = new File("lastest_tmp.csv");
            //uploaded file
            FileOutputStream fos = null;
            File fileUpload = null;
            try {
                fos = new FileOutputStream("tmp.csv");
                fos.write(file.getBytes());
                fileUpload = new File("tmp.csv");
                if (oldFile.exists() && FileUtility.isSameFile(oldFile, fileUpload)) {  //compare here
                    //same file
                    model.addAttribute("errorMessage", "This file is already import at the last time.");
                    return "admin_importvaluemap";
                }
            } finally {
                if (fos != null) {
                    fos.close();
                }
            }
            List<ValueMapModel> valueMapModelList = null;
            try {
                valueMapModelList = valueMapExportUtility.csvToValueMapModelListWithValidation(fileUpload);

                // add updatedtime to valuemap
                for(ValueMapModel valueMapModel : valueMapModelList) {
                    valueMapModel.setUpdatedtime(new DateTime());
                }

                List<String> importDetail = valueMapExportUtility.importValueMap(valueMapModelList);
                model.addAttribute("importDetail", importDetail);
                ValueMapManager.loadValueMapToHashMap();
            } catch (TransitionExportException e) {
                model.addAttribute("errorMessage", e.getMessage());
            } catch (DAOException e) {
                model.addAttribute("errorMessage", e.getMessage());
            }
        }

        return "admin_importvaluemap";
    }


    @RequestMapping(value = "/exportValueMap.html")
    public void export(Model model,
                       @ModelAttribute(VALUE_MAP_FORM) ValueMapSearchForm valueMapForm,
                       @RequestParam(value = "valueMapID", required = false) String[] valueMapID,
                       HttpServletResponse response
    ) throws DAOException, IOException {

        List<ValueMapModel> valueMapModelList = searchManager.searchAllVAlueMap();
        response.setContentType("text/csv; charset=utf-8");
        String disposition = "attachment; fileName=valumap_export.csv";
        response.setHeader("Content-Disposition", disposition);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("ID|Format|Field|Lookup|Zett Value|CategoryID|Updatedtime");
        for (ValueMapModel valueMapModel : valueMapModelList) {
            String id = valueMapModel.getId().toString();
            String format = valueMapModel.getFormat();
            String field = valueMapModel.getField();
            String lookup = valueMapModel.getLookup();
            String zettValue = valueMapModel.getZettValue();
            String categoryId = valueMapModel.getCategoryId().toString();
            DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
            String updatedtime = valueMapModel.getUpdatedtime().toString(formatter);
            response.getWriter().println(id + "|" + format + "|" + field + "|" + lookup + "|" + zettValue + "|" + categoryId + "|" + updatedtime);
        }
        response.getWriter().flush();
    }

    @RequestMapping(value = "/" + ADMIN_VALUEMAPMAIN + ".html")
    public String mainPage(Model model,
                           @ModelAttribute(VALUE_MAP_FORM) ValueMapSearchForm valueMapForm,
                           @RequestParam(value = "valueMapID", required = false) String[] valueMapID
    ) throws DAOException {

        if (valueMapID != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Deleted valuemap with id :: ");
            for (String id : valueMapID) {
                valueMapManager.delete(Integer.parseInt(id));
                sb.append(id).append(" ");
            }
            log.debug(ControllerUtil.putLogInBlock(sb.toString()));
        }

        if (valueMapForm.getCustomerFormat() == null || valueMapForm.getCustomerFormat().length() <= 0) {
            valueMapForm.setCustomerFormat("show_all");
        }

        log.debug(ControllerUtil.putLogInBlock("Searching valueMap for " + valueMapForm.getCustomerFormat() + " " + valueMapForm.getPage()));

        ValueMapInformationBean result = searchManager.searchValueMap(valueMapForm.getCustomerFormat(), null, Integer.parseInt(valueMapForm.getPage()));

        if (result != null) {
            model.addAttribute(VALUE_MAP_LIST, result.getValueMapModelList());
            model.addAttribute(PAGING, result.getPage());
        } else {
            model.addAttribute(VALUE_MAP_LIST, null);
        }
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(VALUE_MAP_FORM, valueMapForm);
        model.addAttribute("lastupdated", valueMapManager.getLastUpdated());
        return ADMIN_VALUEMAPMAIN;
    }

    @RequestMapping(value = "/admin_valuemapdelete.html")
    public String delete(Model model,
                         @RequestParam(value = "id", required = false) int id
    ) throws DAOException {

        valueMapManager.delete(id);
        return "redirect:/" + ADMIN_VALUEMAPMAIN + ".html";
    }

    @RequestMapping(value = "/admin_valuemapdeletemultiple.html")
    public String deleteMultiple(Model model,
                                 @RequestParam(value = "ids", required = false) String ids,
                                 @RequestParam(value = "customerFormat", required = false) String format,
                                 @RequestParam(value = "page", required = false) String page) throws DAOException {


        if (!ids.equals("")) {
            String[] idArray = ids.split(",");
            for (String idTmp : idArray) {
                valueMapManager.delete(Integer.parseInt(idTmp));
            }
        }
        /*  return "redirect:/admin_valuemapmain.html";*/

        ValueMapSearchForm valueMapForm = new ValueMapSearchForm();
        valueMapForm.setCustomerFormat(format);
        valueMapForm.setPage(page);
        ValueMapInformationBean result = searchManager.searchValueMap(valueMapForm.getCustomerFormat(), null, Integer.parseInt(page));
        //if delete the last item in the page should be get the previous page
        int prePage = Integer.parseInt(page) - 1;
        if (result == null && prePage > 0) {
            result = searchManager.searchValueMap(valueMapForm.getCustomerFormat(), null, prePage);
        }
        if (result != null) {
            model.addAttribute(VALUE_MAP_LIST, result.getValueMapModelList());
            model.addAttribute(PAGING, result.getPage());
        } else {
            model.addAttribute(VALUE_MAP_LIST, null);
        }
        model.addAttribute("statusMessage", "Delete ValueMap Successfully (Ids : " + ids + ").");
        model.addAttribute(VALUE_MAP_FORM, valueMapForm);
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        return ADMIN_VALUEMAPMAIN;
    }


    @RequestMapping(value = "/admin_valuemapedit.html")
    public String edit(Model model,
                       @RequestParam(value = "id", required = false) int id,
                       @RequestParam(value = "lookupForm", required = false) String lookup,
                       @RequestParam(value = "zettValueForm", required = false) String zettValue,
                       @RequestParam(value = "fieldForm", required = false) String field,
                       @RequestParam(value = "categoryIdForm", required = false) String categoryIdForm,
                       @RequestParam(value = "currentFormat", required = false) String currentFormat,
                       @RequestParam(value = "page", required = false) String page
    ) throws DAOException {
        ValueMapModel valueMapModel = valueMapManager.findById(id);
        //if (valueMapModel != null) {
        valueMapModel.setZettValue(zettValue);
        valueMapModel.setField(field);
        valueMapModel.setLookup(lookup);
        try {
            valueMapModel.setCategoryId(Integer.parseInt(categoryIdForm));
        } catch (NumberFormatException e) {
            valueMapModel.setCategoryId(null);
        }
        valueMapModel.setUpdatedtime(new DateTime());
        if (valueMapManager.save(valueMapModel) != null) {
            model.addAttribute("statusMessage", "Edit ValueMap Successfully (id : " + id + ").");
        }
        //}
        ValueMapSearchForm valueMapForm = new ValueMapSearchForm();
        valueMapForm.setCustomerFormat(currentFormat);
        valueMapForm.setPage(page);
        ValueMapInformationBean result = searchManager.searchValueMap(valueMapForm.getCustomerFormat(), null, Integer.parseInt(page));
        if (result != null) {
            model.addAttribute(VALUE_MAP_LIST, result.getValueMapModelList());
            model.addAttribute(PAGING, result.getPage());
        } else {
            model.addAttribute(VALUE_MAP_LIST, null);
        }
        model.addAttribute(VALUE_MAP_FORM, valueMapForm);
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute("lastupdated", valueMapManager.getLastUpdated());
        model.addAttribute("zettValueForm", zettValue);

        return ADMIN_VALUEMAPMAIN;
    }

    @RequestMapping(value = "/admin_valuemapadd.html", method = RequestMethod.GET)
    public String addForm(Model model,
                          @ModelAttribute(VALUE_MAP_FORM) ValueMapSearchForm valueMapForm
    ) {
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(VALUE_MAP_FORM, valueMapForm);
        return "admin_valuemapadd";
    }

    @RequestMapping(value = "/admin_valuemapadd.html", method = RequestMethod.POST)
    public String add(Model model,
                      @ModelAttribute(VALUE_MAP_FORM) ValueMapSearchForm valueMapForm,
                      BindingResult result
    ) throws DAOException {
        ValueMapValidation valueMapValidation = new ValueMapValidation();
        valueMapValidation.validate(valueMapForm, result);
        if (result.hasErrors()) {
            log.debug("Validation failed");
            model.addAttribute(VALUE_MAP_FORM, valueMapForm);
            model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
            return "admin_valuemapadd";
        } else {
            ValueMapModel valueMapModel = new ValueMapModel();
            valueMapModel.setFormat(valueMapForm.getCustomerFormat());
            valueMapModel.setZettValue(valueMapForm.getZettValue());
            valueMapModel.setField(valueMapForm.getField());
            valueMapModel.setLookup(valueMapForm.getLookup());
            if (valueMapForm.getCategoryId().equals("")) {
                valueMapModel.setCategoryId(null);
            } else {
                valueMapModel.setCategoryId(Integer.parseInt(valueMapForm.getCategoryId()));
            }
            valueMapModel.setUpdatedtime(new DateTime());
            valueMapManager.save(valueMapModel);
            valueMapForm.setField("");
            valueMapForm.setLookup("");
            valueMapForm.setZettValue("");
            valueMapForm.setCategoryId("");
            model.addAttribute("save", "success");
        }
        model.addAttribute(VALUE_MAP_FORM, valueMapForm);
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute("lastUpdated", valueMapManager.getLastUpdated());
        return "admin_valuemapadd";
    }


}
