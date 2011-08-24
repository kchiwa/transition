package com.abctech.transition.webapp.model;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.search.FileInformationBean;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
public class FileStateDataModelTest {

    private static final Logger log = LoggerFactory.getLogger(FileStateDataModelTest.class);

    private static final String clientName = "abc";
    private static final String customerFormat = "abcFormat";
    private static final DateTime testCurrentTime = new DateTime();
    private static final String fileName = "test.xml";
    private static final int totalRow = 0;
    private static final int currentPage = 1;
    private static final int totalPage = 0;
    private static final String searchFormat = "emprof";
    private static final String searchClientId = "100";
    private static final String searchClientRef = "101";
    private static final String searchStatus = "ok";
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    @Test
    public void testInitializeValue()throws DAOException {
        //get id , clientName , customerFormat , createTime and fileName
        List adStateModelsList;
        ErrorLogModel errorLogModel = new ErrorLogModel();

        //declare file state id = new Long(1) and create 3 adStateModels that has fileStateId.
        Long fileStateId = (long) 1;
        adStateModelsList = initializeAdStateModel(fileStateId);

        //creare errorlog model
        errorLogModel.setErrorMessage("has an error");
        errorLogModel.setJmsmessageid("12345");

        FileInformationBean fileInformationBean = new FileInformationBean();
        fileInformationBean.setClientName(clientName);
        fileInformationBean.setCustomerFormat(customerFormat);
        fileInformationBean.setCreatedTime(testCurrentTime);
        fileInformationBean.setFileName(fileName);
        fileInformationBean.setTotalRow(totalRow);
        fileInformationBean.setCurrentPage(currentPage);
        fileInformationBean.setTotalPage(totalPage);
        fileInformationBean.setAdStateModelsList(adStateModelsList);
        fileInformationBean.setError(errorLogModel);

        //test value
        Assert.assertEquals(clientName, fileInformationBean.getClientName());
        Assert.assertEquals(customerFormat, fileInformationBean.getCustomerFormat());
        Assert.assertEquals(testCurrentTime.toString(formatter), fileInformationBean.getCreatedTime());
        Assert.assertEquals(fileName, fileInformationBean.getFileName());
        Assert.assertEquals(totalRow, fileInformationBean.getTotalRow());
        Assert.assertEquals(currentPage, fileInformationBean.getCurrentPage());
        Assert.assertEquals(totalPage, fileInformationBean.getTotalPage());
        Assert.assertEquals(adStateModelsList.size(), fileInformationBean.getAdStateModelsList().size());
        Assert.assertEquals(errorLogModel.getErrorMessage(), fileInformationBean.getError().getErrorMessage());
        Assert.assertEquals(errorLogModel.getJmsmessageid(), fileInformationBean.getError().getJmsmessageid());

    }

    public List<AdStateModel> initializeAdStateModel(Long fileStateId) throws DAOException{

        List<AdStateModel> adStateModelList = new ArrayList<AdStateModel>();

        //create fileStateModel
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");

        AdStateModel adStateModel1 = new AdStateModel();
        adStateModel1.setFileStateModel(fileStateModel);
        adStateModel1.setZadObjectId(1);
        adStateModel1.setzClientId(1);
        adStateModel1.setShaHash("1");
        adStateModel1.setAdExternalRef("1");
        adStateModelList.add(adStateModel1);

        AdStateModel adStateModel2 = new AdStateModel();
        adStateModel2.setFileStateModel(fileStateModel);
        adStateModel2.setZadObjectId(2);
        adStateModel2.setzClientId(2);
        adStateModel2.setShaHash("2");
        adStateModel2.setAdExternalRef("2");
        adStateModelList.add(adStateModel2);

        AdStateModel adStateModel3 = new AdStateModel();
        adStateModel3.setFileStateModel(fileStateModel);
        adStateModel3.setZadObjectId(3);
        adStateModel3.setzClientId(3);
        adStateModel3.setShaHash("3");
        adStateModel3.setAdExternalRef("3");
        adStateModelList.add(adStateModel3);

        return adStateModelList;
    }
}


