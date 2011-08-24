package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.dao.search.Paging;
import com.abctech.transition.core.dao.search.PartnerSearchManager;
import com.abctech.transition.core.enumeration.Protocol;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.webapp.form.FormError;
import com.abctech.transition.webapp.form.PartnerForm;
import com.abctech.transition.webapp.form.validation.LoginValidation;
import com.abctech.transition.webapp.form.validation.PartnerValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-16
 */

@Controller
public class PartnerPageController {

    // FIXME many unnecessary declarations.
    private static final String SEARCHING_LOGIN_FOR = "SEARCHING LOGIN FOR... ::";
    private static final String SEARCHING_PARTNER_FOR = "SEARCHING PARTNER FOR... ::";
    private static final String CUSTOMER_FORMAT_LIST = "customerFormatList";
    private static final String QUATATION_CLOSE = "\'";
    private static final String QUATATION_OPEN = " " + QUATATION_CLOSE;
    private static final String SPACE = QUATATION_CLOSE + " ::" + QUATATION_OPEN;
    private static final String PARTNER_FORM = "partnerForm";
    private static final String RECORDS = " record(s)";
    private static final String PROTOCOL_LIST = "ProtocolList";
    private static final String PARTNER_LOGIN_MODEL_LIST = "partnerLoginModelList";
    private static final String PAGING = "Paging";
    private static final String FORM_ERROR_LIST = "formErrorList";
    private static final String ADMIN_LOGINADD = "admin_loginadd";
    private static final String CREATED_COMPLETED = "createdCompleted";
    private static final String ADMIN_PARTNERMAIN = "admin_partnermain";
    private static final String ADMIN_PARTNERADD = "admin_partneradd";
    private static final String PARTNER_MODEL_LIST = "partnerModelList";
    private static final String ADMIN_LOGINMAIN = "admin_loginmain";
    private static final String HTML_EXT = ".html";
    private static final String ALREADY_EXIST = " already exist.";
    private static final String DEFAULT_REQ_PAGE = "1";
    private Logger log = LoggerFactory.getLogger(PartnerPageController.class);


    @Autowired
    private PartnerSearchManager partnerSearchManager;

    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    @Autowired
    private IPartnerMapManager partnerMapManager;

    @Autowired
    private TransitionProperties transitionProperties;

    @ModelAttribute(PARTNER_FORM)
    public PartnerForm createPartnerForm() {
        return new PartnerForm();
    }

    /**
     * Mapping for PartnerLogin search
     *
     * @param model       for attaching result and some variables use by frontend
     * @param partnerForm containing search form information
     * @return PartnerLogin page with search results
     * @throws DAOException when something wrong
     */
    // FIXME The requestmappings should be plain string for easily debugging and lookup.
    @RequestMapping(value = "/" + ADMIN_LOGINMAIN + HTML_EXT)
    public String adminLoginLookup(Model model
            , @ModelAttribute(PARTNER_FORM) PartnerForm partnerForm) throws DAOException {
        if (partnerForm.getRequestPage() == null) {
            partnerForm.setRequestPage(DEFAULT_REQ_PAGE);
        }



        if (partnerForm.getLoginId() != null && !"".equals(partnerForm.getLoginId())) {

        PartnerLoginModel partnerLoginModel = partnerLoginManager.findById(Long.parseLong(partnerForm.getLoginId()));


            if (partnerLoginModel.isReceipt() == true) {
                partnerLoginModel.setReceipt(false);
            } else {
                partnerLoginModel.setReceipt(true);
            }
            partnerLoginManager.save(partnerLoginModel);

        }

        log.debug(ControllerUtil.putLogInBlock(SEARCHING_LOGIN_FOR + QUATATION_OPEN + partnerForm.getCustomerFormat() + SPACE + partnerForm.getLogin() + SPACE + partnerForm.getProtocol() + QUATATION_CLOSE));
        List<PartnerLoginModel> partnerLoginModelList = partnerSearchManager.retrievePartnerLoginList(partnerForm.getCustomerFormat(), partnerForm.getLogin(), partnerForm.getProtocol(), Integer.parseInt(partnerForm.getRequestPage()), transitionProperties.getSearchPageSize());
        Paging page = new Paging();
        int totalRowFound = partnerSearchManager.retrievePartnerLoginIDResultSize(partnerForm.getCustomerFormat(), partnerForm.getLogin(), partnerForm.getProtocol());
        page.initialDatas(totalRowFound, transitionProperties.getSearchPageSize(), Integer.parseInt(partnerForm.getRequestPage()));
        log.debug(ControllerUtil.putLogInBlock("partnerSearchManager.retrievePartnerLoginList returns " + partnerLoginModelList.size() + RECORDS));
        model.addAttribute(PAGING, page);
        model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerLoginModelList);
        model.addAttribute(PARTNER_FORM, partnerForm);
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(PROTOCOL_LIST, ControllerUtil.getProtocolList());
        return ADMIN_LOGINMAIN;

        //   page.initialDatas(totalRowFound, transitionProperties.getSearchPageSize(), Integer.parseInt(partnerForm.getRequestPage()));

    }

    /**
     * Mapping for PartnerLogin add page
     *
     * @param model for attaching dynamic drop-down list
     * @return PartnerLogin add page
     * @throws DAOException when something wrong
     */
    @RequestMapping("/" + ADMIN_LOGINADD + HTML_EXT)
    public String adminLoginAdd(Model model) throws DAOException {
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(PROTOCOL_LIST, ControllerUtil.getProtocolList());
        return ADMIN_LOGINADD;
    }

    /**
     * Mapping for adding Login for PartnerLogin
     *
     * @param model       for attaching some return variables to frontend. Such as error list and confirmation message
     * @param partnerForm containing form information
     * @return PartnerLogin page with confirmation message or error message
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/" + ADMIN_LOGINADD + HTML_EXT, method = RequestMethod.POST)
    public String adminLoginAdd(Model model
            , @ModelAttribute(PARTNER_FORM) PartnerForm partnerForm
            , BindingResult result) throws DAOException {
        log.debug(ControllerUtil.putLogInBlock("Try to add following into partnerlogin :: " + QUATATION_OPEN + partnerForm.getCustomerFormat() + SPACE + partnerForm.getLogin() + SPACE + partnerForm.getProtocol() + SPACE + partnerForm.getPassword() + QUATATION_CLOSE));

        LoginValidation loginValidation = new LoginValidation();
        loginValidation.validate(partnerForm, result);
        if (result.hasErrors()) {
            log.debug("Validation failed");
            model.addAttribute(PARTNER_FORM, partnerForm);
            model.addAttribute(PROTOCOL_LIST, ControllerUtil.getProtocolList());
            model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
            return ADMIN_LOGINADD;
        }

        PartnerLoginModel partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat(partnerForm.getCustomerFormat());
        partnerLoginModel.setLogin(partnerForm.getLogin());
        partnerLoginModel.setLoginPassword(partnerForm.getPassword());
        partnerLoginModel.setProtocol(Protocol.valueOf(partnerForm.getProtocol()));
        PartnerLoginModel createdPartnerLogin = null;
        try {
            createdPartnerLogin = partnerLoginManager.save(partnerLoginModel);
            model.addAttribute(CREATED_COMPLETED, createdPartnerLogin.getLogin());
            model.addAttribute(PARTNER_FORM, new PartnerForm());
        } catch (DuplicateKeyException e) {
            List<FormError> formErrorList = new ArrayList<FormError>();
            log.error("Login name " + partnerForm.getLogin() + ALREADY_EXIST);
            formErrorList.add(new FormError("Login name " + partnerForm.getLogin() + ALREADY_EXIST));
            model.addAttribute(FORM_ERROR_LIST, formErrorList);
            model.addAttribute(PARTNER_FORM, partnerForm);
            model.addAttribute(PROTOCOL_LIST, ControllerUtil.getProtocolList());
            return ADMIN_LOGINADD;
        }
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(PROTOCOL_LIST, ControllerUtil.getProtocolList());
        return ADMIN_LOGINADD;
    }

    /**
     * Mapping for PartnerMap search page
     *
     * @param model       for attaching queried result and some variables used in frontend
     * @param partnerForm containing search form information
     * @return PartnerMap page with search results
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/" + ADMIN_PARTNERMAIN + HTML_EXT)
    public String adminPartnerLookup(Model model
            , @ModelAttribute(PARTNER_FORM) PartnerForm partnerForm) throws DAOException {
        if (partnerForm.getRequestPage() == null) {
            partnerForm.setRequestPage(DEFAULT_REQ_PAGE);
        }



        log.debug(ControllerUtil.putLogInBlock(SEARCHING_PARTNER_FOR + QUATATION_OPEN + partnerForm.getId() + SPACE + partnerForm.getzClientID() + SPACE + partnerForm.getIdentifier() + QUATATION_CLOSE));

        if (partnerForm.getzClientID() != null && partnerForm.getzClientID().length() > 0) {
            try {
                Long.parseLong(partnerForm.getzClientID());
            } catch (NumberFormatException e) {
                log.error("ZClientID can only be number!!! " + e.getMessage());
                model.addAttribute("searchError", "ZClientID can only be number");
                model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
                model.addAttribute(PARTNER_FORM, partnerForm);
                return ADMIN_PARTNERMAIN;
            }
        }

        List<PartnerMapModel> partnerMapModelList = partnerSearchManager.retrievePartnerList(partnerForm.getId(), partnerForm.getzClientID(), partnerForm.getIdentifier(), Integer.parseInt(partnerForm.getRequestPage()), transitionProperties.getSearchPageSize());

        int totalRowFound = partnerSearchManager.retrievePartnerIDResultSize(partnerForm.getId(), partnerForm.getzClientID(), partnerForm.getIdentifier());
        Paging page = new Paging();
        page.initialDatas(totalRowFound, transitionProperties.getSearchPageSize(), Integer.parseInt(partnerForm.getRequestPage()));
        log.debug(ControllerUtil.putLogInBlock("partnerSearchManager.retrievePartnerList returns " + partnerMapModelList.size() + RECORDS));
        model.addAttribute(PAGING, page);
        model.addAttribute(PARTNER_MODEL_LIST, partnerMapModelList);
        model.addAttribute(PARTNER_FORM, partnerForm);
        model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
        return ADMIN_PARTNERMAIN;
    }

//    private List<PartnerMapModel> getPartnerModelList(PartnerForm partnerForm) throws DAOException {
//        return partnerSearchManager.retrievePartnerList(partnerForm.getId(), partnerForm.getzClientID(), partnerForm.getIdentifier(), Integer.parseInt(partnerForm.getRequestPage()), transitionProperties.getSearchPageSize());
//    }

    /**
     * Mapping for PartnerMap add page
     *
     * @param model for attaching dynamic drop-down list
     * @return PartnerMap page
     * @throws DAOException when something wrong
     */
    @RequestMapping("/" + ADMIN_PARTNERADD + HTML_EXT)
    public String adminPartnerAdd(Model model) throws DAOException {
        model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
        return ADMIN_PARTNERADD;
    }

    /**
     * Mapping for PartnerMap add page
     *
     * @param model       for attaching error messages or confirmation message
     * @param partnerForm containing add form information
     * @return PartnerMap add page with error messages or confirmation message
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/" + ADMIN_PARTNERADD + HTML_EXT, method = RequestMethod.POST)
    public String adminPartnerAdd(Model model
            , @ModelAttribute(PARTNER_FORM) PartnerForm partnerForm
            , BindingResult result) throws DAOException {
        log.debug(ControllerUtil.putLogInBlock("Try to add following into partnermap :: " + QUATATION_OPEN + partnerForm.getCustomerFormat() + SPACE + partnerForm.getLogin() + SPACE + partnerForm.getProtocol() + SPACE + partnerForm.getPassword() + QUATATION_CLOSE));

        PartnerValidation partnerValidation = new PartnerValidation();
        partnerValidation.validate(partnerForm, result);
        if (result.hasErrors()) {
            log.debug("Validation failed");
            model.addAttribute(PARTNER_FORM, partnerForm);
            model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
            return ADMIN_PARTNERADD;
        }

        PartnerMapModel partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier(partnerForm.getIdentifier());
        partnerMapModel.setPartnerMapPassword(partnerForm.getPassword());
        partnerMapModel.setzClientId(Integer.parseInt(partnerForm.getzClientID()));
        partnerMapModel.setDescription(partnerForm.getDescription());
        partnerMapModel.setPartnerLoginModel(partnerLoginManager.findById(Long.parseLong(partnerForm.getId())));

        PartnerMapModel createdPartner = null;
        try {
            createdPartner = partnerMapManager.save(partnerMapModel);
            model.addAttribute(CREATED_COMPLETED, createdPartner.getIdentifier());
            model.addAttribute(PARTNER_FORM, new PartnerForm());
        } catch (DuplicateKeyException e) {
            List<FormError> formErrorList = new ArrayList<FormError>();
            log.error("Identifier name " + partnerForm.getIdentifier() + ALREADY_EXIST);
            formErrorList.add(new FormError("Identifier name " + partnerForm.getIdentifier() + ALREADY_EXIST));
            model.addAttribute(FORM_ERROR_LIST, formErrorList);
            model.addAttribute(PARTNER_FORM, partnerForm);
            model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
            return ADMIN_PARTNERADD;
        }
        model.addAttribute(PARTNER_LOGIN_MODEL_LIST, partnerSearchManager.retrieveAllPartnerLoginList());
        return ADMIN_PARTNERADD;
    }

    /**
     * Mapping for deleting PartnerLogin
     *
     * @param deleteId id to delete
     * @return PartnerLogin page
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/admin_partnerlogindelete" + HTML_EXT, method = RequestMethod.GET)
    public String adminPartnerLoginDelete(
            @RequestParam(value = "delete_id", required = true) String deleteId
    ) throws DAOException {
        if (partnerLoginManager.delete(Long.parseLong(deleteId))) {
            log.debug("Delete PartnerLogin ID : " + deleteId);
        } else {
            log.debug("Can not delete PartnerLogin ID " + deleteId);
        }
        return "redirect:/" + ADMIN_LOGINMAIN + HTML_EXT;

    }

    /**
     * Mapping for PartnerMap delete
     *
     * @param deleteId to delete
     * @return PartnerMap page
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/admin_partnerdelete" + HTML_EXT, method = RequestMethod.GET)
    public String adminPartnerDelete(
            @RequestParam(value = "delete_id", required = true) String deleteId
    ) throws DAOException {
        if (partnerMapManager.delete(Long.parseLong(deleteId))) {
            log.debug("Delete Partner ID : " + deleteId);
        } else {
            log.debug("Can not delete Partner ID " + deleteId);
        }
        return "redirect:/" + ADMIN_PARTNERMAIN + HTML_EXT;

    }
}
