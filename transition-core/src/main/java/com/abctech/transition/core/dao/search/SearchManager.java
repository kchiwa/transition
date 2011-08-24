package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.jms.JmsMessageManager;
import com.abctech.transition.core.utility.Converter;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class SearchManager {
    private static final String AND_SPACED = " AND ";
    private static final Logger log = LoggerFactory.getLogger(SearchManager.class);
    private static final String SHOWALL = "show_all";
    private static final String WHERE = " WHERE ";
    private static final String LIMIT = " LIMIT ";
    private static final String OFFSET = " OFFSET ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("jmsMessageManager")
    private JmsMessageManager jmsMessageManager;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IMediaStateManager mediaStateManager;

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private ValueMapManager valueMapManager;


    /**
     * Find AdInformationBean List
     *
     * @param clientFormat customerformat in fileState table
     * @param clientId     zclientid in adState table
     * @param zettId       zadobjectid
     * @param clientRef    adexternalref in adState table
     * @param status       status in adState table
     * @param includeMedia true = include media
     */
    public synchronized List<AdInformationBean> findAdStateInformation(String clientFormat,
                                                                       String clientId,
                                                                       String zettId,
                                                                       String clientRef,
                                                                       String status,
                                                                       String fromDate,
                                                                       String toDate,
                                                                       int requestPage,
                                                                       Boolean includeMedia
    ) throws DAOException, JmsMessageTypeNotSupportException, JMSException {

        String convertedClientFormat = checkAndConvertClientFormat(clientFormat);
        String convertedClientId = checkAndConcertClientId(clientId);
        String convertedZett = checkAndConvertZeetId(zettId);
        String concertedClientRef = checkAndConvertClientRef(clientRef);
        String convertedStatus = checkAndConvertStatus(status);

        Paging page = new Paging();

        List<AdInformationBean> adInformationBeanList = new ArrayList<AdInformationBean>();

        List<Long> adStateIds = searchForAdStateIds(convertedClientFormat, convertedClientId, convertedZett, concertedClientRef, convertedStatus, fromDate, toDate, requestPage, page);
        if (adStateIds.size() == 0) {
            return null;
        }

        for (Long id : adStateIds) {
            //Assign Page information
            AdInformationBean adInformationBean = findAdStateInformationModelById(id, includeMedia);
            adInformationBean.setTotalPage(page.getTotalPage());
            adInformationBean.setCurrentPage(page.getCurrentPage());
            adInformationBean.setNextPage(page.getNextPage());
            adInformationBean.setPrevPage(page.getPrevPage());
            adInformationBean.setTotalRow(page.getTotalRecord());
            adInformationBeanList.add(adInformationBean);

        }
        return adInformationBeanList;
    }

    /**
     * Find AdStateInformationObject
     *
     * @param id to find
     * @return AdStateInformationModel
     */
    public AdInformationBean findAdStateInformationModelById(Long id, boolean includeMedia) throws DAOException, JmsMessageTypeNotSupportException, JMSException {

        AdStateModel adStateModel = adStateManager.findById(id);

        if (adStateModel == null) {
            throw new TransitionRuntimeException("ad " +id +" does not exist");
        }

        AdInformationBean adInformationBean = new AdInformationBean();
        adInformationBean.setId(adStateModel.getId());
        adInformationBean.setFileStateModel(adStateModel.getFileStateModel());
        adInformationBean.setZadObjectId(adStateModel.getZadObjectId());
        adInformationBean.setzClientId(adStateModel.getzClientId());
        adInformationBean.setShaHash(adStateModel.getShaHash());
        adInformationBean.setModifiedTime(adStateModel.getModifiedTime());
        adInformationBean.setCreatedTime(adStateModel.getCreatedTime());
        adInformationBean.setAdStateStatus(adStateModel.getAdStateStatus());
        adInformationBean.setStatus(adStateModel.getAdStateStatus().toTextValue());
        adInformationBean.setAdExternalRef(adStateModel.getAdExternalRef());
        adInformationBean.setError(adStateModel.getError());
        adInformationBean.setClientFormat(adStateModel.getClientFormat());
        adInformationBean.setFileStateID(adStateModel.getFileStateModel().getId().toString());

        //get error information from the queue
        if (adInformationBean.getError() != null) {
            log.debug("jms id = " + adStateModel.getError().getJmsmessageid());
            adInformationBean = jmsMessageManager.getMessageInformation(adInformationBean);
        } else {
            adInformationBean.setErrorMessage("-");
        }

        if (includeMedia) {
            List<MediaStateModel> media = mediaStateManager.findMediaStateByAdStateID(id);
            adInformationBean.setMediaStateModelsList(media);
        }

        return adInformationBean;
    }

    /**
     * @param customerFormat customerformat in fileState table
     * @param customerId     zclientid in adState table
     * @param zettId         This is zadobjectid
     * @param adExternalRef  adexternalref in adState table
     * @param adStateStatus  status in adState table
     */
    private List<Long> searchForAdStateIds(String customerFormat, String customerId, String zettId, String adExternalRef,
                                           String adStateStatus, String fromDate, String toDate, int requestPage, Paging paging) throws DAOException {

        StringBuilder sql = new StringBuilder();

        if (customerFormat != null && customerFormat.length() > 0) {
            sql.append("filestate.customerformat = '").append(customerFormat).append("'");
        }
        if (customerId != null && customerId.length() > 0) {
            appendAndIfNotEmpty(sql);
            sql.append("adstate.zclientid =").append(customerId);
        }
        if (zettId != null && zettId.length() > 0) {
            appendAndIfNotEmpty(sql);
            sql.append("adstate.zadobjectid =").append(zettId);
        }
        if (adExternalRef != null && adExternalRef.length() > 0) {
            appendAndIfNotEmpty(sql);
            sql.append(clientRefCondition(adExternalRef));
        }
        if (adStateStatus != null && adStateStatus.length() > 0) {
            appendAndIfNotEmpty(sql);
            sql.append("adstate.status =").append(AdStateStatus.valueOf(adStateStatus.replace(" ", "")).toNumberValue());
        }
        //===================  filter by datetime ==============================//
        String dateCondtion = getDateConditionAdState(fromDate, toDate);
        if (dateCondtion != null) {
            appendAndIfNotEmpty(sql);
            sql.append(dateCondtion);
        }

        appendAndIfNotEmpty(sql);

        sql.append("adstate.filestate_id = filestate.id ");
        // sql.append(" AND_SPACED mediastate.adstate_id = adstate.id ");

        final String sqlSelection = "SELECT adstate.id";
        final String sqlFrom = " FROM adstate, filestate WHERE ";

        int totalRow = jdbcTemplate.queryForInt("SELECT count(adstate.id) " + sqlFrom + sql);
        paging.initialDatas(totalRow, transitionProperties.getSearchPageSize(), requestPage);

        //Limit record
        int adStateInformationpageSize = transitionProperties.getSearchPageSize();
        int startRecord = ((adStateInformationpageSize * requestPage) - adStateInformationpageSize);

        sql.append(" ORDER BY adstate.modifiedtime DESC ");
        sql.append(LIMIT).append(adStateInformationpageSize).append(OFFSET).append(startRecord);

        log.debug("\n------------------------------------------------------------------------\n" +
                "\t" + sqlSelection + sqlFrom + sql + "\n" +
                "------------------------------------------------------------------------\n");

        return jdbcTemplate.queryForList(sqlSelection + sqlFrom + sql, Long.class);
    }


    private String getDateConditionAdState(String fromDate, String toDate) {
        String dateCondition = null;
        long startDate;
        long endDate;
        if (fromDate != null && fromDate.length() > 0) {
            startDate = Converter.getFromDate(fromDate);
            if (toDate != null && toDate.length() > 0) {
                endDate = Converter.getToDate(toDate);
            } else {
                endDate = Converter.getToDate(fromDate);
            }
            dateCondition = " (adstate.modifiedtime >= " + startDate + " AND adstate.modifiedtime <= " + endDate + " ) ";
        }
        return dateCondition;
    }

    private String getDateConditionFileState(String fromDate, String toDate) {
        String dateCondition = null;
        long startDate;
        long endDate;
        if (fromDate != null && fromDate.length() > 0) {
            startDate = Converter.getFromDate(fromDate);
            if (toDate != null && toDate.length() > 0) {
                endDate = Converter.getToDate(toDate);
            } else {
                endDate = Converter.getToDate(fromDate);
            }
            dateCondition = " (filestate.createdtime >= " + startDate + " AND filestate.createdtime <= " + endDate + " ) ";
        }
        return dateCondition;
    }

    private void appendAndIfNotEmpty(StringBuilder sql) {
        if (sql.length() > 0) {
            sql.append(AND_SPACED);
        }
    }

    /*-------------------------------------*/
    /* Start for search FileStateDataModel*/
    /*-------------------------------------*
    /**
     * Find FileInformationBean List
     *
     * @return List of FileInformationBean
     */
    public List<FileInformationBean> findFileStateInformation(String clientName,
                                                              String clientFormat,
                                                              String fileName,
                                                              String status,
                                                              String fromDate,
                                                              String toDate,
                                                              int requestPage) throws DAOException, JmsMessageTypeNotSupportException, JMSException {


        //assignParameterForFileState(clientName, clientFormat, fileName, status);
        String convertedClientName = checkAndConvertClientName(clientName);
        String convertedClientFormat = checkAndConvertClientFormat(clientFormat);
        String convertedFileName = checkAndConvertFileName(fileName);
        String convertedStatus = checkAndConvertStatus(status);

        Paging page = new Paging();
        List<Long> fileStateIds = getFileStateIds(convertedClientName, convertedClientFormat, convertedFileName, convertedStatus, fromDate, toDate, requestPage, page);

        if (fileStateIds.size() == 0) {
            return null;
        }

        List<FileInformationBean> fileInformationBeans = new ArrayList<FileInformationBean>();
        for (Long id : fileStateIds) {
            FileInformationBean fileInformationBean = findFileStateDataModelById(id);
            fileInformationBean.setTotalPage(page.getTotalPage());
            fileInformationBean.setCurrentPage(page.getCurrentPage());
            fileInformationBean.setTotalRow(page.getTotalRecord());
            fileInformationBean.setPrevPage(page.getPrevPage());
            fileInformationBean.setNextPage(page.getNextPage());
            fileInformationBeans.add(fileInformationBean);
        }
        return fileInformationBeans;
    }

    /**
     * This method has call for search adState in case memcached is disable.
     *
     * @param clientName   client name
     * @param clientFormat customer format
     * @param fileName     file name
     * @param status       status
     * @param fromDate     date from for search
     * @param toDate       date to for search
     */
    public List<FileInformationBean> findFileStateInformationWithMemCachedDisable(String clientName,
                                                                                  String clientFormat,
                                                                                  String fileName,
                                                                                  String status,
                                                                                  String fromDate,
                                                                                  String toDate,
                                                                                  int requestPage) throws DAOException, JmsMessageTypeNotSupportException, JMSException {

        String convertedClientName = checkAndConvertClientName(clientName);
        String convertedClientFormat = checkAndConvertClientFormat(clientFormat);
        String convertedFileName = checkAndConvertFileName(fileName);
        String convertedStatus = checkAndConvertStatus(status);

        String condition = generateConditionForSearch(convertedClientName, convertedClientFormat, convertedFileName,
                convertedStatus, fromDate, toDate, requestPage);

        //Do paging for display data
        int fileStateInformationpageSize = transitionProperties.getSearchPageSize();
        Paging page = new Paging();
        int totalRows = fileStateManager.countRowByCondition(condition);

        condition = addLimitRecordToCondition(condition, requestPage);

        log.debug("Condition : " + condition);
        List<FileStateModel> fileStateModelList = fileStateManager.findFileStateByCondition(condition);
        if (fileStateModelList == null || fileStateModelList.size() == 0) {
            return Collections.emptyList();
        }

        List<FileInformationBean> fileInformationBeans = new ArrayList<FileInformationBean>();

        page.initialDatas(totalRows, fileStateInformationpageSize, requestPage);

        for (FileStateModel model : fileStateModelList) {

            FileInformationBean fileInformationBean = convertFileStateModelToFileInformationBean(model);
            fileInformationBean.setTotalPage(page.getTotalPage());
            fileInformationBean.setCurrentPage(page.getCurrentPage());
            fileInformationBean.setTotalRow(page.getTotalRecord());
            fileInformationBean.setPrevPage(page.getPrevPage());
            fileInformationBean.setNextPage(page.getNextPage());
            fileInformationBeans.add(fileInformationBean);
        }

        return fileInformationBeans;
    }

    /**
     * This method for generate condition use in search adstate query
     *
     * @param clientName   client name
     * @param clientFormat customer format
     * @param fileName     file name
     * @param status       status
     * @param fromDate     date from for search
     * @param toDate       date to for search
     */
    public String generateConditionForSearch(String clientName, String clientFormat, String fileName, String status,
                                             String fromDate,
                                             String toDate,
                                             int requestPage) {

        StringBuffer conditionBulder = new StringBuffer();
        boolean criteriaSet = false;
        if (clientName != null && clientName.length() > 0) {

            conditionBulder.append("WHERE clientname= '").append(clientName).append("'");
            criteriaSet = true;
        }

        if (clientFormat != null && clientFormat.length() > 0) {

            if (criteriaSet) {
                conditionBulder.append(AND_SPACED);
            } else {
                conditionBulder.append(WHERE);
                criteriaSet = true;
            }
            conditionBulder.append("customerformat = '").append(clientFormat).append("'");
            criteriaSet = true;
        }

        if (fileName != null && fileName.length() > 0) {

            if (criteriaSet) {
                conditionBulder.append(AND_SPACED);
            } else {
                conditionBulder.append(WHERE);
                criteriaSet = true;
            }
            conditionBulder.append(fileNameCondition(fileName));
            criteriaSet = true;
        }

        if (status != null && !"".equals(status)) {

            if (criteriaSet) {
                conditionBulder.append(AND_SPACED);
            } else {
                conditionBulder.append(WHERE);
                criteriaSet = true;
            }
            conditionBulder.append("status = ").append(FileStateStatus.valueOf(status).toNumberValue());
        }

        //=======date condition===========//
        String dateCondition = getDateConditionFileState(fromDate, toDate);
        if (dateCondition != null) {

            if (criteriaSet) {
                conditionBulder.append(AND_SPACED);
            } else {
                conditionBulder.append(WHERE);
                criteriaSet = true;
            }
            conditionBulder.append(dateCondition);
        }
        conditionBulder.append(" ORDER BY createdtime DESC ");
        conditionBulder.append(" ");

        return conditionBulder.toString();
    }

    private String addLimitRecordToCondition(String conditionStr, int requestPage) {
        if (conditionStr == null || "".equals(conditionStr)) {
            return "";
        }
        //Limit record
        StringBuffer condition = new StringBuffer(conditionStr);
        int fileStateInformationpageSize = transitionProperties.getSearchPageSize();
        int startRecord = ((fileStateInformationpageSize * requestPage) - fileStateInformationpageSize);
        condition.append(LIMIT).append(fileStateInformationpageSize).append(OFFSET).append(startRecord);

        return condition.toString();
    }

    public FileInformationBean findFileStateDataModelById(Long id) throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        FileStateModel fileStateModel = fileStateManager.findById(id);
        FileInformationBean result = new FileInformationBean();
        if (fileStateModel != null) {
            result.setClientName(fileStateModel.getClientName());
            result.setCreatedTime(fileStateModel.getCreatedTime());
            result.setCustomerFormat(fileStateModel.getCustomerFormat());
            result.setError(fileStateModel.getErrorLogModel());
            result.setFileName(fileStateModel.getFileName());
            result.setFileSize(FileUtils.byteCountToDisplaySize(fileStateModel.getFileSize()));
            result.setFileStateStatus(fileStateModel.getFileStateStatus());
            result.setStatus(fileStateModel.getFileStateStatus().toTextValue());
            result.setId(fileStateModel.getId());
            result.setFileType(fileStateModel.getFileType().toTextValue());
            if (fileStateModel.getParentFileState() != null) {
                result.setParentFile(fileStateModel.getParentFileState());
            } else {
                result.setParentFile(null);
            }
        }

        if (fileStateModel == null) {
            throw new TransitionRuntimeException("file is not existed.");
        }

        //get message information from queue

        if (result.getError() != null) {
            result = jmsMessageManager.getMessageInformation(result);
        } else {
            result.setErrorMessage("-");
        }

        //assign AdStateModel
        List<AdStateModel> ads = adStateManager.findByFileStateId(fileStateModel.getId());
        result.setAdStateModelsList(ads);

        return result;
    }

    private List<Long> getFileStateIds(String clientName,
                                       String clientFormat,
                                       String fileName,
                                       String status,
                                       String fromDate,
                                       String toDate,
                                       int requestPage,
                                       Paging paging) {
        boolean criteriaSet = false;

        StringBuffer baseSql = new StringBuffer("SELECT id FROM filestate ");

        StringBuffer condition = new StringBuffer();

        if (clientName != null && clientName.length() > 0) {
            condition.append("WHERE clientname= '").append(clientName).append("'");
            criteriaSet = true;
        }
        if (clientFormat != null && clientFormat.length() > 0) {
            if (criteriaSet) {
                condition.append(AND_SPACED);
            } else {
                condition.append(WHERE);
                criteriaSet = true;
            }
            condition.append("customerformat = '").append(clientFormat).append("'");
            criteriaSet = true;
        }
        if (fileName != null && fileName.length() > 0) {
            if (criteriaSet) {
                condition.append(AND_SPACED);
            } else {
                condition.append(WHERE);
                criteriaSet = true;
            }
            //sql.append("filename = '").append(fileName).append("'");
            condition.append(fileNameCondition(fileName));
            criteriaSet = true;
        }
        if (status != null && !"".equals(status)) {
            if (criteriaSet) {
                condition.append(AND_SPACED);
            } else {
                condition.append(WHERE);
                criteriaSet = true;
            }
            condition.append("status = ").append(FileStateStatus.valueOf(status).toNumberValue());
        }
        //=======date condition===========//
        String dateCondition = getDateConditionFileState(fromDate, toDate);
        if (dateCondition != null) {
            if (criteriaSet) {
                condition.append(AND_SPACED);
            } else {
                condition.append(WHERE);
                criteriaSet = true;
            }
            condition.append(dateCondition);
        }

        int totalRow = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM filestate " + condition.toString());
        paging.initialDatas(totalRow, transitionProperties.getSearchPageSize(), requestPage);

        condition.append(" ORDER BY createdtime DESC ");
        condition.append(" ");

        //Limit record
        int fileStateInformationpageSize = transitionProperties.getSearchPageSize();
        int startRecord = ((fileStateInformationpageSize * requestPage) - fileStateInformationpageSize);
        condition.append(LIMIT).append(fileStateInformationpageSize).append(OFFSET).append(startRecord);
        return jdbcTemplate.queryForList(baseSql.append(condition).toString(), Long.class);

    }

    private String fileNameCondition(String fileNameParam) {
        StringBuffer condition = new StringBuffer();
        String fileNameKey = fileNameParam;
        int indexOfStar = fileNameKey.indexOf('*');
        if (indexOfStar > -1) {
            while (indexOfStar > -1) {
                fileNameKey = fileNameKey.replace('*', '%');
                condition.append("filename LIKE '").append(fileNameKey).append("'");
                indexOfStar = fileNameKey.indexOf('*');
            }
        } else {
            condition.append("filename = '").append(fileNameKey).append("'");
        }
        return condition.toString();
    }

    private String clientRefCondition(String adExternalRefParam) {
        String adExternalRef = adExternalRefParam;
        StringBuffer condition = new StringBuffer();
        int indexOfStar = adExternalRef.indexOf('*');
        if (indexOfStar > -1) {
            while (indexOfStar > -1) {
                adExternalRef = adExternalRef.replace('*', '%');
                condition.append("adstate.adexternalref LIKE '").append(adExternalRef).append("'");
                indexOfStar = adExternalRef.indexOf('*');
            }
        } else {
            condition.append("adstate.adexternalref = '").append(adExternalRef).append("'");
        }
        return condition.toString();
    }

    public List<ValueMapModel> searchAllVAlueMap() throws DAOException {
        String sql = "SELECT id FROM valuemap;";
        List<Long> ids = jdbcTemplate.queryForList(sql, Long.class);
        List<ValueMapModel> valueMapModelList = new ArrayList<ValueMapModel>();
        for (Long id : ids) {
            valueMapModelList.add(valueMapManager.findById(id.intValue()));
        }
        return valueMapModelList;
    }

    public ValueMapInformationBean searchValueMap(String clientFormat, String field, int requestPage) throws DAOException {

        List<ValueMapModel> valueMapModelList = new ArrayList<ValueMapModel>();
        //assigParamForValueMap(clientFormat, field);
        String convertedClientFormat = checkAndConvertClientFormat(clientFormat);
        String convertedFiled = checkAndConvertField(field);

        Paging page = new Paging();
        List<Long> ids = getValueMapIds(convertedClientFormat, convertedFiled, requestPage, page);
        if (ids.size() == 0) {
            return null;
        }


//        int pageSize = transitionProperties.getSearchPageSize();
//        Paging page = new Paging();
//        page.initialDatas(totalRow, pageSize, requestPage);
        for (Long id : ids) {
            valueMapModelList.add(valueMapManager.findById(id.intValue()));
        }

        ValueMapInformationBean valueMapInformations = new ValueMapInformationBean();
        valueMapInformations.setValueMapModelList(valueMapModelList);
        valueMapInformations.setPage(page);

        return valueMapInformations;
    }

    private List<Long> getValueMapIds(String clientFormat, String field, int requestPage, Paging paging) {

        boolean criteriaSet = false;
        StringBuffer baseSql = new StringBuffer("SELECT id FROM valuemap ");
        StringBuffer condition = new StringBuffer();
        if (field != null) {
            condition.append("WHERE field= '").append(field).append("'");
            criteriaSet = true;
        }
        if (clientFormat != null) {
            if (criteriaSet) {
                condition.append(AND_SPACED);
            } else {
                condition.append(WHERE);
                criteriaSet = true;
            }
            condition.append("format = '").append(clientFormat).append("'");
        }

        int totalRow = jdbcTemplate.queryForInt(" SELECT COUNT(*) FROM valuemap " + condition.toString());
        paging.initialDatas(totalRow, transitionProperties.getSearchPageSize(), requestPage);

        //Limit record
        int pageSize = transitionProperties.getSearchPageSize();
        int startRecord = ((pageSize * requestPage) - pageSize);
        condition.append(LIMIT).append(pageSize).append(OFFSET).append(startRecord);

        //log.debug(sql.toString());

        return jdbcTemplate.queryForList(baseSql.append(condition).toString(), Long.class);

    }

    private FileInformationBean convertFileStateModelToFileInformationBean(FileStateModel fileStateModel)
            throws DAOException, JmsMessageTypeNotSupportException, JMSException {

        FileInformationBean fileInformationBean = new FileInformationBean();
        if (fileStateModel != null) {

            fileInformationBean.setClientName(fileStateModel.getClientName());
            fileInformationBean.setCreatedTime(fileStateModel.getCreatedTime());
            fileInformationBean.setCustomerFormat(fileStateModel.getCustomerFormat());
            fileInformationBean.setError(fileStateModel.getErrorLogModel());
            fileInformationBean.setFileName(fileStateModel.getFileName());
            fileInformationBean.setFileSize(FileUtils.byteCountToDisplaySize(fileStateModel.getFileSize()));
            fileInformationBean.setFileStateStatus(fileStateModel.getFileStateStatus());
            fileInformationBean.setStatus(fileStateModel.getFileStateStatus().toTextValue());
            fileInformationBean.setId(fileStateModel.getId());
            fileInformationBean.setFileType(fileStateModel.getFileType().toTextValue());
            if (fileStateModel.getParentFileState() != null) {
                fileInformationBean.setParentFile(fileStateModel.getParentFileState());
            } else {
                fileInformationBean.setParentFile(null);
            }
        }

        if (fileStateModel == null) {
            throw new TransitionRuntimeException("file is not existed.");
        }

        if (fileInformationBean.getError() != null) {
            fileInformationBean = jmsMessageManager.getMessageInformation(fileInformationBean);
        } else {
            fileInformationBean.setErrorMessage("-");
        }

        List<AdStateModel> ads = adStateManager.findByFileStateId(fileStateModel.getId());
        fileInformationBean.setAdStateModelsList(ads);

        return fileInformationBean;
    }

    private String checkAndConvertClientName(String clientName) {
        if ("".equals(clientName)) {
            return "";
        }
        return clientName;
    }

    private String checkAndConvertClientFormat(String clientFormat) {
        if (clientFormat != null && clientFormat.equalsIgnoreCase(SHOWALL)) {
            return "";
        }
        return clientFormat;
    }

    private String checkAndConvertFileName(String fileName) {
        if ( "".equals(fileName)) {
            return "";
        }
        return fileName;
    }

    private String checkAndConvertStatus(String status) {
        if (status != null && status.equalsIgnoreCase(SHOWALL)) {
            return "";
        }
        return status;
    }

    public String checkAndConcertClientId(String clientId) {
        if ("".equals(clientId)) {
            return "";
        }
        return clientId;
    }

    private String checkAndConvertZeetId(String zeetId) {
        if ("".equals(zeetId)) {
            return "";
        }
        return zeetId;
    }

    private String checkAndConvertClientRef(String clientRef) {
        if ( "".equals(clientRef)) {
            return "";
        }
        return clientRef;
    }

    private String checkAndConvertField(String filed) {
        if ("".equals(filed)) {
            return "";
        }
        return filed;
    }
}

