package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class IadIfJobDriverTest {

    private static final Logger log = LoggerFactory.getLogger(IadIfJobDriverTest.class);

    @Test
    public void stringEncodingTest()throws Exception{
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("iadifjob/finn_publish.xml");
        byte[] bytes = IOUtils.toByteArray(inputStream);
        String xml = new String(bytes,"iso-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);
        iniValue.setXml(xml);
        iniValue.setXmlFileLocation("/some/iadifjob/jobzone/finn_publish.xml");
        IadIfJobDriver iadIfJobDriver = new IadIfJobDriver(iniValue);
    }

    @Test
    public void inputStreamEncodingTest()throws Exception{
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("iadifjob/finn_publish.xml");

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);
        iniValue.setXmlInputStream(inputStream);
        iniValue.setXmlFileLocation("/some/iadifjob/jobzone/finn_publish.xml");
        AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
        //log.debug(beanDriver.getXmlBeanDriverIniValue().getXml());

    }
}
