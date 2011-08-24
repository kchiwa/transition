package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.IHttpFecthSchedulerManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.RSSFetchException;
import com.abctech.transition.webapp.camel.RSSFetchComponent;
import com.abctech.transition.webapp.manager.camel.QuartzRouteManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.concurrent.ExecutionException;


/**
 *
 */

@Controller
public class SchedulerAdminController {

    private Logger log = LoggerFactory.getLogger(SystemCheckController.class);

    private static final String SCHEDULER_FORM = "schedulerForm";
    private static final String SCHEDULER_ADMIN = "scheduler_admin";
    private static final String MESSAGE = "message";
    private static final String STATUS = "status";
    private static final String SELECTED = "selected";
    private static final String CHECKED = "checked";
    private static final String DISASBLE = "disabled";

    @Autowired
    private IHttpFecthSchedulerManager httpFecthSchedulerManager;

    @Autowired
    private QuartzRouteManager quartzRouteManager;

    @Autowired
    private RSSFetchComponent rssFetchComponent;


    @ModelAttribute(SCHEDULER_FORM)
    public HttpFecthSchedulerModel createSchedulerForm() {
        return new HttpFecthSchedulerModel();
    }

    @RequestMapping("/scheduler_admin.html")
    public String schedulerPage(Model model) throws DAOException {
        model.addAttribute("schedulerList", findSchedulerList());
        return SCHEDULER_ADMIN;
    }


    @RequestMapping(value = "/scheduler_admin_selectClient.html", method = RequestMethod.POST)
    public String schedulerSelectClient(Model model, @ModelAttribute(SCHEDULER_FORM) HttpFecthSchedulerModel httpFecthSchedulerModel) throws DAOException {

        if (httpFecthSchedulerModel.getClientName() == null || "".equals(httpFecthSchedulerModel.getClientName())) {
            return SCHEDULER_ADMIN;
        }
        HttpFecthSchedulerModel schedulerModel = httpFecthSchedulerManager.loadByClientName(httpFecthSchedulerModel.getClientName());
        String url = httpFecthSchedulerManager.getURLFromClientName(httpFecthSchedulerModel.getClientName());
        schedulerModel.setUrl(url);
        fullFieldUI(model, schedulerModel);
        model.addAttribute("schedulerList", findSchedulerList());
        return SCHEDULER_ADMIN;
    }

    @RequestMapping(value = "/saveScheduler.html", method = RequestMethod.POST)
    public String saveScheduler(Model model, @ModelAttribute(SCHEDULER_FORM) HttpFecthSchedulerModel httpFecthSchedulerModel) throws DAOException, RSSFetchException {

        boolean isCronValid = org.quartz.CronExpression.isValidExpression(httpFecthSchedulerModel.getCronTrigger());
        if (!isCronValid) {
            log.debug("Invalid cron can not save. ::: "+ httpFecthSchedulerModel.getCronTrigger());
            setModelStatusError(model);
            model.addAttribute(MESSAGE, "Invalid schedule.");
            return SCHEDULER_ADMIN;
        }

        String clientName = httpFecthSchedulerModel.getClientName();
        if(clientName == null || "".equals(clientName)) {
            setModelStatusError(model);
            model.addAttribute(MESSAGE, "Please select client.");
            fullFieldUI(model, httpFecthSchedulerModel);
            return SCHEDULER_ADMIN;
        }

        httpFecthSchedulerManager.save(httpFecthSchedulerModel);
        quartzRouteManager.reInitQuartzRoute(httpFecthSchedulerModel.getClientName());

        model.addAttribute(STATUS, "OK");
        model.addAttribute(MESSAGE, httpFecthSchedulerModel.getClientName() + " save complete.");
        String url = httpFecthSchedulerManager.getURLFromClientName(httpFecthSchedulerModel.getClientName());
        httpFecthSchedulerModel.setUrl(url);
        fullFieldUI(model, httpFecthSchedulerModel);
        model.addAttribute("schedulerList", findSchedulerList());
        return SCHEDULER_ADMIN;
    }

    @RequestMapping(value = "/runScheduler.html", method = RequestMethod.POST)
    public String runScheduler(Model model, @ModelAttribute(SCHEDULER_FORM) HttpFecthSchedulerModel schedulerModel) throws DAOException, ExecutionException, InterruptedException {
        String clientName = schedulerModel.getClientName();
        String customerFormatStr = schedulerModel.getCustomerFormat();
        if (clientName == null || clientName.equals("")) {
            setModelStatusError(model);
            model.addAttribute(MESSAGE, "Please select client.");
            return SCHEDULER_ADMIN;
        }
        if (customerFormatStr == null || customerFormatStr.equals("")) {
            setModelStatusError(model);
            model.addAttribute(MESSAGE, "Can not fetch data.");
            return SCHEDULER_ADMIN;
        }

        HttpFecthSchedulerModel httpFecthSchedulerModel = httpFecthSchedulerManager.loadByClientName(clientName);
        if (httpFecthSchedulerModel == null || httpFecthSchedulerModel.getClientName() == null
                || httpFecthSchedulerModel.getClientName().equals("")) {

            setModelStatusError(model);
            setModelClientNameError(model, clientName);
            return SCHEDULER_ADMIN;
        }

        try {
            String url = httpFecthSchedulerManager.getURLFromClientName(clientName);
            rssFetchComponent.fetchRSSForController(url, httpFecthSchedulerModel.getClientName(),
                    httpFecthSchedulerModel.getCustomerFormat());

        } catch (RSSFetchException e) {
            setModelStatusError(model);
            setModelClientNameError(model, clientName);
            //initModel(model);
            return SCHEDULER_ADMIN;
        }

        model.addAttribute(STATUS, "OK");
        model.addAttribute(MESSAGE, "Fetch data from " + clientName + " complete.");
        httpFecthSchedulerModel = httpFecthSchedulerManager.loadByClientName(httpFecthSchedulerModel.getClientName());
        String url = httpFecthSchedulerManager.getURLFromClientName(httpFecthSchedulerModel.getClientName());
        httpFecthSchedulerModel.setUrl(url);
        fullFieldUI(model, httpFecthSchedulerModel);
        model.addAttribute("schedulerList", findSchedulerList());
        return SCHEDULER_ADMIN;
    }

    private void setModelClientNameError(Model model, String clientName) {
        model.addAttribute(MESSAGE, "Can not fetch data from " + clientName + ".");
    }

    private void setModelStatusError(Model model) {
        model.addAttribute(STATUS, "ERROR");
    }

    private void fullFieldUI(Model model, HttpFecthSchedulerModel httpFecthSchedulerModel) {

        model.addAttribute("HttpFecthSchedulerModel", httpFecthSchedulerModel);

        model.addAttribute(httpFecthSchedulerModel.getClientName().replaceAll(" ",""), SELECTED);
        String cronStr = httpFecthSchedulerModel.getCronTrigger();
        String[] cronSprited = cronStr.split(" ");

        String[] minElm = cronSprited[1].split(",");
        String minEnable = DISASBLE;
        String everyMin = CHECKED;
        String choseMin = "";
        if (!"*".equals(minElm[0]) && !"?".equals(minElm[0])) {
            for (String min : minElm) {
                minEnable = "";
                everyMin = "";
                choseMin = CHECKED;
                model.addAttribute("minChecked" + min, SELECTED);
            }
        }
        model.addAttribute("minEnable", minEnable);
        model.addAttribute("everyMin", everyMin);
        model.addAttribute("choseMin", choseMin);

        String[] hrElm = cronSprited[2].split(",");
        String hrEnable = DISASBLE;
        String everyHr = CHECKED;
        String choseHr = "";
        if (!"*".equals(hrElm[0]) && !"?".equals(hrElm[0])) {
            for (String hr : hrElm) {
                hrEnable = "";
                everyHr = "";
                choseHr = CHECKED;
                model.addAttribute("hrChecked" + hr, SELECTED);
            }
        }
        model.addAttribute("hrEnable", hrEnable);
        model.addAttribute("everyHr", everyHr);
        model.addAttribute("choseHr", choseHr);

        String[] dayElm = cronSprited[3].split(",");
        String dayEnable = DISASBLE;
        String everyDay = CHECKED;
        String choseDay = "";
        if (!"*".equals(dayElm[0]) && !"?".equals(dayElm[0])) {
            for (String day : dayElm) {
                dayEnable = "";
                everyDay = "";
                choseDay = CHECKED;
                model.addAttribute("dayChecked" + day, SELECTED);
            }
        }
        model.addAttribute("dayEnable", dayEnable);
        model.addAttribute("everyDay", everyDay);
        model.addAttribute("choseDay", choseDay);

        String[] monthElm = cronSprited[4].split(",");
        String monthEnable = DISASBLE;
        String everyMonth = CHECKED;
        String choseMonth = "";
        if (!"*".equals(monthElm[0]) && !"?".equals(monthElm[0])) {
            for (String month : monthElm) {
                monthEnable = "";
                everyMonth = "";
                choseMonth = CHECKED;
                model.addAttribute("monthChecked" + month, SELECTED);
            }
        }
        model.addAttribute("monthEnable", monthEnable);
        model.addAttribute("everyMonth", everyMonth);
        model.addAttribute("choseMonth", choseMonth);

        String[] wkDayElm = cronSprited[5].split(",");
        String wkDayEnable = DISASBLE;
        String everyWkDay = CHECKED;
        String choseWkDay = "";
        if (!"*".equals(wkDayElm[0]) && !"?".equals(wkDayElm[0])) {
            for (String wkDay : wkDayElm) {
                wkDayEnable = "";
                everyWkDay = "";
                choseWkDay = CHECKED;
                model.addAttribute("wkDayChecked" + wkDay, SELECTED);
            }
        }
        model.addAttribute("wkDayEnable", wkDayEnable);
        model.addAttribute("everyWkDay", everyWkDay);
        model.addAttribute("choseWkDay", choseWkDay);
    }

    private List<HttpFecthSchedulerModel> findSchedulerList() throws DAOException {
       return httpFecthSchedulerManager.listRSSFecthScheduler();
    }

}
