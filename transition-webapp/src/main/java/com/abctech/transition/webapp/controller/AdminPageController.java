package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.bean.ContactBean;
import com.abctech.transition.core.dao.CamelLockFileInformationBean;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.router.IRouterManager;
import com.abctech.transition.core.dao.router.RouterModel;
import com.abctech.transition.core.dao.search.AdInformationBean;
import com.abctech.transition.core.dao.search.FileFormatInformationBean;
import com.abctech.transition.core.dao.search.FileInformationBean;
import com.abctech.transition.core.dao.search.SearchManager;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import com.abctech.transition.core.utility.TransitionTimer;
import com.abctech.transition.webapp.adminPing.SystemCheck;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import com.abctech.transition.webapp.camel.queue.QueueStatusModel;
import com.abctech.transition.webapp.form.AdFileSearch;
import com.abctech.transition.webapp.manager.camel.CamelLockFileManipulation;
import com.abctech.transition.webapp.manager.queue.AdStateServices;
import com.abctech.transition.webapp.manager.queue.FileStateServices;
import com.abctech.transition.webapp.manager.syncronize.FileStateErrorQueueSyncronize;
import com.abctech.transition.webapp.model.SystemCheckModel;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jms.JMSException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-16
 */
@Controller
public class AdminPageController {

    private static final String AD_STATE_DATA_MODEL_LIST = "AdStateDataModelList";
    private static final String TOTAL_PAGE = "totalPage";
    private static final String TOTAL_ROW = "totalRow";
    private static final String FILE_STATE_DATA_MODEL_LIST = "FileStateDataModelList";
    private static final String SEARCH_MESSAGE = "SearchMessage";
    private static final String FILE_STATUS_LIST = "fileStatusList";
    private static final String CUSTOMER_FORMAT_LIST = "customerFormatList";
    private static final String AD_STATUS_LIST = "adStatusList";
    private static final String RECORDS = " record(s)";
    private static final String DEFAULT_REQ_PAGE = "1";
    
    private Logger log = LoggerFactory.getLogger(AdminPageController.class);

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private QueueManager queueManager;

    @Autowired
    private FileStateServices fileStateServices;

    @Autowired
    private AdStateServices adStateServices;

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private SystemCheck systemCheck;


    @Autowired
    private FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize;

    @Autowired
    private IRouterManager routerManager;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;


    @Autowired
    private CamelLockFileManipulation camelLockFileManipulation;

    @ModelAttribute("searchMessage")
    public AdFileSearch createMessage() {
        return new AdFileSearch();
    }

    @RequestMapping("/index.html")
    public String entryPage(Model model) {
        log.debug("index.html");
        ContactBean cb = new ContactBean();
        cb.setNavn("Example name 123");
        model.addAttribute("contact", cb);
        return "index";
    }

    /**
     * Main mapping for admin. Return admin login page.
     *
     * @return login page
     */
    @RequestMapping("/admin.html")
    public String adminLandingPage(@RequestParam(required = false) String token) {
        return "redirect:/admin_dashboard.html";
    }

    /**
     * Dashboard controller. Checking for system status and retrieve error items from error queue.
     *
     * @param model to add system check information and error queue
     * @return dashboard page
     */
    @RequestMapping("/admin_dashboard.html")
    public String adminDashboardPage(Model model, @RequestParam(required = false) String token) throws DAOException {

        SystemCheckModel systemCheckModel = new SystemCheckModel();
        TransitionTimer systemCheckTimer = new TransitionTimer("SystemCheckTimer");
        systemCheckTimer.start();
        systemCheck.testAccessibility(systemCheckModel);
        systemCheck.testDB(systemCheckModel);
        systemCheck.testMemcached(systemCheckModel);
        //SystemCheckModel systemCheckModel = systemCheck.getSystemCheckModel();
        if (systemCheckModel.getFtpPathError() != null && !systemCheckModel.getFtpPathError().isEmpty() ||
                systemCheckModel.getMediaPathError() != null && !systemCheckModel.getMediaPathError().isEmpty() ||
                systemCheckModel.getProductionImagePathError() != null && !systemCheckModel.getProductionImagePathError().isEmpty() ||
                systemCheckModel.getProductionFilePathError() != null && !systemCheckModel.getProductionFilePathError().isEmpty() ||
                systemCheckModel.getDbError() != null && !systemCheckModel.getDbError().isEmpty()) {
            model.addAttribute("SystemCheck", "ERROR");
        } else {
            model.addAttribute("SystemCheck", "OK");
        }
        systemCheckTimer.finish();

        TransitionTimer errorQueueTimer = new TransitionTimer("ErrorQueueTimer");
        errorQueueTimer.start();
        QueueStatusModel errorQueueStatus = queueManager.getQueueInfo(QueueName.ERROR_QUEUE);
        model.addAttribute("ErrorQueueName", QueueName.ERROR_QUEUE.toTextValue());
        model.addAttribute("ErrorQueueItem", errorQueueStatus.getQueueCount());
        errorQueueTimer.finish();

        TransitionTimer lastImportTimer = new TransitionTimer("LastImportTimer");
        lastImportTimer.start();
        List<FileStateModel> fileFormatInfoList = fileStateManager.findLastImportByCustomerFormatList();
        FileFormatInformationBean fileFormatInformationBeanUtil = new FileFormatInformationBean();
        List<FileFormatInformationBean> fileFormatInformationBeanList = fileFormatInformationBeanUtil.createFileFormatInformationBeanByList(fileFormatInfoList);
        model.addAttribute("FileFormatInformationBeanList", fileFormatInformationBeanList);
        lastImportTimer.finish();

        TransitionTimer activeRouteTimer = new TransitionTimer("ActiveFormatTimer");
        activeRouteTimer.start();
        List<RouterModel> routerModels = routerManager.findAll();
        StringBuilder sb = new StringBuilder();
        for (RouterModel routerModel : routerModels) {
            if (routerModel.getActive()) {
                sb.append(routerModel.getCustomerFormat()).append(" ");
            }
        }
        model.addAttribute("routerOnline", sb.toString());
        activeRouteTimer.finish();

        return "admin_dashboard";
    }


    /**
     * Mapping for Advertisement Lookup page when performing search.
     *
     * @param model        for adding search results and some variables use in frontend
     * @param adFileSearch search form information
     * @return Advertisement Lookup page with search results
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/admin_admain.html")
    public String adminAdMainPageSearch(Model model
            , @ModelAttribute("searchMessage") AdFileSearch adFileSearch
            , @RequestParam(value = "adstateID", required = false) String[] adstateID
             , @RequestParam(value = "action", required = false) String action) throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        if (adstateID != null) {
            StringBuilder sb = new StringBuilder();
            if (action.equals("delete")) {
            sb.append("Deleted adstate with id :: ");
            }else {
             sb.append("Reset adstate with id :: ");
            }
            for (String id : adstateID) {
                if (action.equals("reset")) {
                    log.debug("reset ssh");
                    AdStateModel adStateModel =  adStateManager.findById(Long.parseLong(id));
                    adStateModel.setShaHash("reset by admin");
                    adStateManager.save(adStateModel);
                } else if(action.equals("delete"))  {
                    adStateManager.delete(Long.parseLong(id));
                }
                sb.append(id).append(" ");
            }
            log.debug(ControllerUtil.putLogInBlock(sb.toString()));
        }

        if (adFileSearch.getSearchClientId() != null && adFileSearch.getSearchClientId().length() > 0) {
            try {
                Long.parseLong(adFileSearch.getSearchClientId());
            } catch (NumberFormatException e) {
                log.error("ClientID can only be number!!! " + e.getMessage());
                model.addAttribute("searchError", "Client ID can only be number");
                model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
                model.addAttribute(AD_STATUS_LIST, ControllerUtil.getAdStateStatusList());
                return "admin_admain";
            }
        }

        if (adFileSearch.getSearchZettId() != null && adFileSearch.getSearchZettId().length() > 0) {
            try {
                Long.parseLong(adFileSearch.getSearchZettId());
            } catch (NumberFormatException e) {
                log.error("ZettID can only be number!!! " + e.getMessage());
                model.addAttribute("searchError", "Zett ID can only be number");
                model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
                model.addAttribute(AD_STATUS_LIST, ControllerUtil.getAdStateStatusList());
                return "admin_admain";
            }
        }

        if (adFileSearch.getRequestPage() == null) {
            adFileSearch.setRequestPage(DEFAULT_REQ_PAGE);
        }

        List<AdInformationBean> adInformationBeanList = searchManager.findAdStateInformation(adFileSearch.getSearchFormat(), adFileSearch.getSearchClientId(), adFileSearch.getSearchZettId(), adFileSearch.getSearchClientRef(), adFileSearch.getSearchStatus(), adFileSearch.getSearchFromDate(), adFileSearch.getSearchToDate(), Integer.parseInt(adFileSearch.getRequestPage()), false);

        if (adInformationBeanList != null && adInformationBeanList.size() > 0) {
            log.debug(ControllerUtil.putLogInBlock("searchManager.findAdStateInformation returns " + adInformationBeanList.get(0).getTotalRow() + RECORDS));
            adFileSearch.setNextPage(adInformationBeanList.get(0).getNextPage());
            adFileSearch.setPrevPage(adInformationBeanList.get(0).getPrevPage());
            model.addAttribute("zettUrl", transitionProperties.getZettServerHost());
            model.addAttribute(AD_STATE_DATA_MODEL_LIST, adInformationBeanList);
            model.addAttribute(SEARCH_MESSAGE, adFileSearch);
            model.addAttribute(TOTAL_PAGE, adInformationBeanList.get(0).getTotalPage());
            model.addAttribute(TOTAL_ROW, adInformationBeanList.get(0).getTotalRow());
        } else {
            log.debug(ControllerUtil.putLogInBlock("searchManager.findAdStateInformation returns 0" + RECORDS));
        }
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(AD_STATUS_LIST, ControllerUtil.getAdStateStatusList());
        return "admin_admain";
    }

    /**
     * Mapping for File Lookup search
     *
     * @param model        for adding search result and some variables use in frontend
     * @param adFileSearch containing form information
     * @return File Lookup page with results
     * @throws DAOException when something wrong
     */
    @RequestMapping(value = "/admin_filemain.html")
    public String adminFileMainPageSearch(Model model
            , @ModelAttribute("searchMessage") AdFileSearch adFileSearch
            , @RequestParam(value = "filestateID", required = false) String[] filestateID) throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        if (filestateID != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Deleted filestate with id :: ");
            for (String id : filestateID) {
                sb.append(id).append(" ");
            }
            fileStateErrorQueueSyncronize.deleteFileByIds(filestateID);
            log.debug(ControllerUtil.putLogInBlock(sb.toString()));
        }

        if (adFileSearch.getRequestPage() == null) {
            adFileSearch.setRequestPage(DEFAULT_REQ_PAGE);
        }

        //log.debug("=============++>>>> " + adFileSearch.getSearchStatus());
        log.debug("*********************");
        log.debug("Memchech Status : "+memcachedTransactionManager.isMemCachedEnable());
        List<FileInformationBean> fileInformationBeanList = Collections.emptyList();
        int requestPage = Integer.parseInt(adFileSearch.getRequestPage());

        // Check memcache enable or not.
        if(memcachedTransactionManager.isMemCachedEnable()) {
            log.debug("Try use serch method with memchech.");
            fileInformationBeanList = searchManager.findFileStateInformation(adFileSearch.getSearchClientName(),
                    adFileSearch.getSearchFormat(), adFileSearch.getSearchFileName(), adFileSearch.getSearchStatus(),
                    adFileSearch.getSearchFromDate(), adFileSearch.getSearchToDate(), requestPage);
        } else {
            log.debug("Memchech is DISABLE try use serch method with no memchech.");
            fileInformationBeanList = searchManager.findFileStateInformationWithMemCachedDisable(adFileSearch.getSearchClientName(),
                    adFileSearch.getSearchFormat(), adFileSearch.getSearchFileName(), adFileSearch.getSearchStatus(),
                    adFileSearch.getSearchFromDate(), adFileSearch.getSearchToDate(), requestPage);
        }


        if (fileInformationBeanList != null && fileInformationBeanList.size() > 0) {
            log.debug(ControllerUtil.putLogInBlock("fileStateDataManager.findFileStateInformation returns " + fileInformationBeanList.get(0).getTotalRow() + RECORDS));
            adFileSearch.setNextPage(fileInformationBeanList.get(0).getNextPage());
            adFileSearch.setPrevPage(fileInformationBeanList.get(0).getPrevPage());
            model.addAttribute(FILE_STATE_DATA_MODEL_LIST, fileInformationBeanList);
            model.addAttribute(SEARCH_MESSAGE, adFileSearch);
            model.addAttribute(TOTAL_PAGE, fileInformationBeanList.get(0).getTotalPage());
            model.addAttribute(TOTAL_ROW, fileInformationBeanList.get(0).getTotalRow());
        } else {
            log.debug(ControllerUtil.putLogInBlock("fileStateDataManager.findFileStateInformation returns 0" + RECORDS));
        }
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(FILE_STATUS_LIST, ControllerUtil.getFileStateStatusList());
        return "admin_filemain";
    }

    /**
     * Mapping for displaying information about an ad
     *
     * @param model for attaching result
     * @param adID  for query
     * @return Ad Information page with queried info
     * @throws DAOException when something wrong
     */
    @RequestMapping("/admin_adinfo.html")
    public String adminAdInfoPage(Model model,
                                  @RequestParam(value = "adID", required = true) Long adID) throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        try {
            AdInformationBean adInformationBean = searchManager.findAdStateInformationModelById(adID, true);
            String imageServerUrl = transitionProperties.getZettimageServer();

            if (adInformationBean != null) {
                log.debug(ControllerUtil.putLogInBlock("Found ad with id " + adID + " with " + adInformationBean.getMediaStateModelsList().size() + " media"));
                model.addAttribute("zettUrl", transitionProperties.getZettServerHost());
                model.addAttribute("AdInformationBean", adInformationBean);
                adInformationBean.setImageServerUrl(imageServerUrl);

            } else {
                log.debug(ControllerUtil.putLogInBlock("Can not find ad with id " + adID));
            }
            model.addAttribute("adId", adID);
            //model.addAttribute("AdInformationBean" , adInformationBean);
        } catch (TransitionRuntimeException ex) {
            model.addAttribute("errorMessage", "ad is not existed.");
        }

        return "admin_adinfo";
    }



    /**
     * Mapping for resubmitting error ad into a queue
     */
    @RequestMapping("/admin_adinfo_process.html")
    public String adminAdInfoProcess(
            @RequestParam(value = "adID", required = true) String adID
            , @RequestParam(value = "jmsid", required = true) String jmsId
            , @RequestParam(value = "xml", required = true) String xml) throws DAOException {
        //update adState in the database to null.
        log.debug("Updating AdStateModel ID ::  " + adID);
        Long ad = new Long(adID);
        AdStateModel adStateModel = adStateManager.findById(ad);
        // before resubmit back to queue, we will reset the status and the error.
        adStateModel.setAdStateStatus(AdStateStatus.QUEUE);
        adStateModel.setError(null);
        adStateManager.save(adStateModel);

        adStateServices.reSubmit(jmsId, xml);

        return "admin_process";

    }

    /**
     * Mapping for File Information page.
     *
     * @param model  for attaching queried result
     * @param fileID file ID to see details
     * @return File Information page with result
     * @throws DAOException when something wrong
     */
    @RequestMapping("/admin_fileinfo.html")
    public String adminFileInfoPage(Model model,
                                    @RequestParam(value = "fileID", required = true) Long fileID) throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        try {
            FileInformationBean fileInformationBean = searchManager.findFileStateDataModelById(fileID);
            if (fileInformationBean != null) {
                log.debug(ControllerUtil.putLogInBlock("Found ad with id " + fileID));
                model.addAttribute("FileInformationBean", fileInformationBean);
                model.addAttribute("fileId", fileID);
                if (fileInformationBean.getParentFile() != null) {
                    model.addAttribute("parentFile", fileInformationBean.getParentFile());
                }
                //set file type
                log.debug(fileInformationBean.getFileType());
                model.addAttribute("fileType",fileInformationBean.getFileType());
            } 
            else {
                log.debug(ControllerUtil.putLogInBlock("Can not find file with id " + fileID));
            }
        } catch (TransitionRuntimeException ex) {
            log.debug(ex.getMessage());
            model.addAttribute("errorMessage", "File is not existed");
        }

        return "admin_fileinfo";
    }

    /**
     * Mapping when resubmitting file into a queue.
     */
    @RequestMapping("/admin_adfile_process.html")
    public String adminAdFileProcess(Model model
            , @RequestParam(value = "fileID", required = true) String fileID
            , @RequestParam(value = "jmsid", required = true) String jmsId
            , @RequestParam(value = "xml", required = true) String xml) throws DAOException {
        //update fileStateServices in the database to null
        log.debug("Updating FileStateModel ID ::  " + fileID);
        Long file = new Long(fileID);
        FileStateModel fileStateModel = fileStateManager.findById(file);

        ErrorLogModel errorLogModel = fileStateModel.getErrorLogModel();
        log.debug("removing errorLog: " + errorLogModel.getId() + " from filestate: " + fileStateModel.getId());
        fileStateModel.setErrorLogModel(null);
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        fileStateManager.save(fileStateModel);

        fileStateServices.reSubmit(jmsId, xml);

        return "admin_process";
    }

    /**
     * Mapping for system status page
     *
     * @param model for attaching return data. Queue info and File info
     * @return System status page with information
     * @throws DAOException when something wrong
     */
    @RequestMapping("/admin_system_status.html")
    public String adminSystemStatus(Model model, @RequestParam(value = "filePath", required = false) String filePath) throws DAOException {

        log.debug("adminSystemStatus");
        List<QueueStatusModel> queueStatusModelList = queueManager.getAllQueueInfo();
        List<FileStateModel> fileFormatInfoList = fileStateManager.findLastImportByCustomerFormatList();
        FileFormatInformationBean fileFormatInformationBeanUtil = new FileFormatInformationBean();
        List<FileFormatInformationBean> fileFormatInformationBeanList = fileFormatInformationBeanUtil.createFileFormatInformationBeanByList(fileFormatInfoList);
        model.addAttribute("QueueInfoList", queueStatusModelList);
        model.addAttribute("FileFormatInformationBeanList", fileFormatInformationBeanList);

        //Camel Lock Files
        if (filePath != null) {
            camelLockFileManipulation.removeLockFile(filePath);
        }
        long lifeTime = camelLockFileManipulation.retriveCamelLockFileLifeTimeInMS();
        List<CamelLockFileInformationBean> camelLocFileInformationBeans = new ArrayList<CamelLockFileInformationBean>();
        for (File file : camelLockFileManipulation.scanOldLockFile(camelLockFileManipulation.retriveFtpFolder() + "", lifeTime)) {
            //fileNames.add(file.getAbsolutePath());
            CamelLockFileInformationBean camelLockFileInformationBean = new CamelLockFileInformationBean();
            camelLockFileInformationBean.setFileName(file.getAbsolutePath());
            Long currentTime = new DateTime().getMillis();
            Long incomingTime = file.lastModified();
            Long diffTime = currentTime - incomingTime;

            StringBuffer lifeTimeStr = getLifeTimeString(diffTime);


            camelLockFileInformationBean.setLifeTime(lifeTimeStr.toString());
            camelLocFileInformationBeans.add(camelLockFileInformationBean);
        }
        model.addAttribute("fileList", camelLocFileInformationBeans);
        return "admin_system_status";
    }

    private StringBuffer getLifeTimeString(Long diffTime) {
        //----------------------------//
        int seconds = (int) ((diffTime / 1000) % 60);
        int minutes = (int) ((diffTime / 1000) / 60);
        int hours   = (int) ((diffTime / 1000) / 3600);
        int days    = (int) ((diffTime / 1000) / 86400);
        int weeks   = (int) ((diffTime / 1000) / 604800);
        int months  = (int) ((diffTime / 1000) / 2419200);
        StringBuffer lifeTimeStr = new StringBuffer();
        if(months > 0 ) {
            lifeTimeStr.append(months).append(" month(s) ");
        }
        if (weeks > 0 ) {
            lifeTimeStr.append(weeks).append(" week(s) ");
        }
        if (days > 0 ) {
            lifeTimeStr.append(days).append(" day(s) ");
        }
        if (hours > 0 ) {
            lifeTimeStr.append(hours).append(" hour(s) ");
        }
        if (minutes > 0 ) {
            lifeTimeStr.append(minutes).append(" minute(s) ");
        }
        if (seconds > 0 ) {
            lifeTimeStr.append(seconds).append(" second(s) ");
        }
        lifeTimeStr.append(" ago.");
        //---------------------------//
        return lifeTimeStr;
    }


}
