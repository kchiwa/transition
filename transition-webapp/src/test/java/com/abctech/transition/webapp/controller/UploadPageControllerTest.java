package com.abctech.transition.webapp.controller;

import com.abctech.mockland.runner.Mockland;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.io.InputStream;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class UploadPageControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(UploadPageControllerTest.class);
    private Mockland mockland;

    @Autowired
    private UploadPageController uploadPageController;

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    private MockMultipartFile file;



    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void stopMockland() throws Exception {
        mockland.stop();
    }


    @Test
    public void testGoToUploadPage() {
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        Model model = new ExtendedModelMap();
        Assert.assertEquals("uploadpage", uploadPageController.entryPage(model, request));
    }

    //@Test
    public void testGoToItmakarietProcess() throws Exception {
        String clientName = "zemaja";
        response = new MockHttpServletResponse();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("xml/tietoenator.xml");
        file = new MockMultipartFile("filename", "tietoenator.xml", "multipart/form-data", is);
        Model model = new ExtendedModelMap();
        Assert.assertEquals("uploadpage", uploadPageController.itmakarietProcess(clientName, file, model, response));
    }

    //@Test
    public void testGoToFinnjobProcess() throws Exception {
        String clientName = "rcconsas";
        response = new MockHttpServletResponse();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("xml/finnjob.xml");
        file = new MockMultipartFile("filename", "finnjob.xml.xml", "multipart/form-data", is);
        Model model = new ExtendedModelMap();
        Assert.assertEquals("uploadpage", uploadPageController.finjobProcess(clientName, file, model, response));
    }

    @Test
    public void testGoToWebmeglerProcess() throws Exception {
        //String clientName = "rcconsas";
        //response = new MockHttpServletResponse();
        //InputStream is = this.getClass().getClassLoader().getResourceAsStream("xml/finnjob.xml");
        //file = new MockMultipartFile("filename", "finnjob.xml.xml", "multipart/form-data", is);
        //Model model = new ExtendedModelMap();
        //Assert.assertEquals("uploadpage", uploadPageController.finjobProcess(clientName, file, model, response));
    }

    //@Test
    public void testZettProcess() throws Exception {
        String zettURL = mockland.getBaseURI() + "xml/transition/zettxml.xml";
        response = new org.springframework.mock.web.MockHttpServletResponse();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("xml/zettxml.xml");
        file = new MockMultipartFile("filename", "zettxml.xml", "multipart/form-data", is);
        //uploadPageController.zettProcess(file, response);
        //Assert.assertEquals("application/xml", response.getContentType());
        //Assert.assertNotNull(response.getContentAsString());
    }

    //@Test
    public void testGoToLinkPage() throws Exception {
        Model model = new ExtendedModelMap();
        Assert.assertEquals("testlink", uploadPageController.testLinkPage(model));
    }


}
