package com.abctech.transition.core.validate;


import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateErrorMessage;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.xmladbeans.webmegler.EiendommerDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class WebmeglerValidatorTest   {
    private final Logger log = LoggerFactory.getLogger(WebmeglerValidatorTest .class);
    private final XmlValidatorTest file = new XmlValidatorTest();
    Mockland mockland ;
    XmlValidateResult result ;
    String targetPath = "target/";



    @Before
    public void startMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @org.junit.After
    public void stopMockland() throws Exception {
        mockland.stop();
        FileUtility.deleteFile(targetPath + "webmegler.xml");

    }
    @Test
    public void  testWebmeglervalidate() throws  IOException , XmlException , InvalidXMLException {

        String location = mockland.getBaseURI() + "xml/transition/webmegler.xml";
        FileUtility.downloadFile(location , targetPath + "webmegler.xml" );
        File xmlFile = new File(targetPath + "webmegler.xml")  ;
        Assert.assertTrue(xmlFile.exists());
        EiendommerDocument eiendommerDocument = null ;
        try {
            eiendommerDocument = EiendommerDocument.Factory.parse(xmlFile)  ;
        } catch (XmlException e ) {
            System.err.println("ERROR");

        } XmlValidator validator = new XmlValidator();
          result = validator.validate(eiendommerDocument);
          Assert.assertTrue(result.isSuccess());
          log.debug("===========================");


        if(!result.isSuccess()){
            List<XmlValidateErrorMessage> list =  result.getErrorMessage();
            for(XmlValidateErrorMessage xml:list){
                log.debug("*******"+xml.getErrorMessage());
            }
        }else{
            log.debug("success");
        }





}


}
