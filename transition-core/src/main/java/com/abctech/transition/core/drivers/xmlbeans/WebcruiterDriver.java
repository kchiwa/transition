package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.xmladbeans.webcruiter.JobDocument;
import com.abctech.transition.xmladbeans.webcruiter.TASImportDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class WebcruiterDriver extends AXmlBeanDriver {
    private static final Logger log = Logger.getLogger(WebcruiterDriver.class);
    private TASImportDocument tasImportDocument = null;
    private JobDocument.Job job = null;

    public WebcruiterDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        if (xml == null || xml.length() < 1) {
            throw new TransitionRuntimeException("XML is null or empty string. Not allowed");
        }
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{TASImportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});

            tasImportDocument = (TASImportDocument) stl.parse(xml, TASImportDocument.type, null);
            setJob(tasImportDocument.getTASImport().getJobArray(0));
        } catch (XmlException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{TASImportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            //String xmlRemovenameSpace = removeNameSpace(convertStreamToString(xmlStream));
            //tasImportDocument = TASImportDocument.Factory.parse(IOUtils.toInputStream(xmlRemovenameSpace), getXmlOptions());
            tasImportDocument = (TASImportDocument) stl.parse(xmlStream, TASImportDocument.type, getXmlOptions());
            setJob(tasImportDocument.getTASImport().getJobArray(0));
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }
    }


    @Override
    public String getClientRef() {
        return getJob().getClientsRef().trim();
    }

    @Override
    public Integer getClientId() throws DAOException {
        return Integer.valueOf(getJob().getClient().trim());
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        for (JobDocument.Job transactionJob : tasImportDocument.getTASImport().getJobArray()) {
            if (transactionJob.getStatus().getCode().equals("AKTIV") && transactionJob.getStatus().getStringValue().equals("AKTIV")) {
                return AdObjectTransactionStatus.OPEN;
            }
        }
        return AdObjectTransactionStatus.CLOSED;
    }

    @Override
    public String getAdTitle() {
        return getJob().getTitle();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return tasImportDocument;
    }

    public JobDocument.Job getJob() {
        return job;
    }

    public void setJob(JobDocument.Job job) {
        this.job = job;
    }

//    public static String removeNameSpace(String xml){
//        String eraseNameSpace = StringUtils.replace(xml, "wc:RefNr", "RefNr");
//        //log.debug("######################" + eraseNameSpace);
//        return  eraseNameSpace;
//
//    }
//
//    private String convertStreamToString(InputStream inputStream){
//        try{
//            return IOUtils.toString(inputStream);
//        }catch (IOException err){
//            String errorMessage = "can not convert this inputstream to string";
//            log.debug(errorMessage);
//            throw new TransitionRuntimeException(errorMessage,err);
//        }
//    }
}
