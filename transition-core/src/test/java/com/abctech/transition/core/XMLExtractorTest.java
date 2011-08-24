package com.abctech.transition.core;

import com.abctech.transition.core.bean.TransformPath;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLExtractorTest {

    private TransformPath carXmlPath;
    private static final Logger log = LoggerFactory.getLogger(XMLExtractorTest.class);

    @Before
    public void setUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transition-core.xml");
        carXmlPath = context.getBean("carXmlPath", TransformPath.class);
    }

    @Test
    public void testContextIsReadOk() {
        Assert.assertNotNull(carXmlPath);
        Assert.assertNotNull(carXmlPath.getXmlPath());
        Assert.assertNotNull(carXmlPath.getXslPath());
    }

    

}
