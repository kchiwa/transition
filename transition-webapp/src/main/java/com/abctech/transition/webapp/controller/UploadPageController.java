package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.webapp.manager.camel.bean.NovasolDownloadService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class UploadPageController {

    private static final Logger log = LoggerFactory.getLogger(UploadPageController.class);
    private static final String UPLOADPAGE = "uploadpage";
    private static final String FINJOBMESSAGE = "finjobmessage";
    private static final String PLEASE_INPUT_FILE_AND_CLIENT_NAME = "please input file and client name";
    private static final String WEBMEGLERMESSAGE = "webmeglerMsg";
    private static final String WEBCRUITERMESSAGE = "webcruiterMsg" ;

    public static final String REDIRECT_ACCESSDENIED_HTML = "redirect:/accessdenied.html";
    public static final String SUCCESSFUL = " successful";
    public static final String UPLOAD = "upload";
    private static final String UTF_8_ENCODING = "UTF-8";

     @Autowired
    private NovasolDownloadService novasolDownloadService;

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/" + UPLOADPAGE + ".html")
    public String entryPage(Model model, HttpServletRequest request) {
        return UPLOADPAGE;
    }


     @RequestMapping(value = "/test-iadifmmo-process.html", method = RequestMethod.POST)
    public String iadifmmoProcess(@RequestParam(value = "clientName", required = true) String clientName,
                                @RequestParam(value = "fileiadifmmo", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.IADIFMMO.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("iadifmmoMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for iadifmmo");
            model.addAttribute("iadifmmoMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }



    @RequestMapping(value = "/test-itmakariet-process.html", method = RequestMethod.POST)
    public String itmakarietProcess(@RequestParam(value = "txtitmakarietname", required = true) String clientName,
                                    @RequestParam(value = "fileitmakariet", required = true) MultipartFile file,
                                    Model model,
                                    HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.ITMAKERIET.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("itmakarietmessage", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error(PLEASE_INPUT_FILE_AND_CLIENT_NAME);
            model.addAttribute("itmakarietmessage", " " + PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-novasol-process.html", method = RequestMethod.POST)
    public String itmakarietProcess(@RequestParam(value = "clientId", required = true) String clientId,
                                    @RequestParam(value = "testtype", required = true) String testtype,
                                    Model model,
                                    HttpServletResponse response) throws IOException {

        String host = "http://asoke.dev.abctech-thailand.com/transition/test/novasol/";
        String propertyRequest = "property-small-badday.zip";
        String test = "Bad day.";
        if (testtype.equals("happy")) {
           propertyRequest = "property-small.zip";
            test = "Happy day.";
        }
        String pictureRequest = "picture-small.zip";
        String priceRequest = "price-small.zip";
        //String clientId = "21947";
        try {
        novasolDownloadService.downloadAllFiles(host, propertyRequest, pictureRequest, priceRequest, clientId);
        model.addAttribute("novasolMsg", "  Started download all file with " + test);
        }catch (TransitionRuntimeException ex) {
           model.addAttribute("novasolMsg", "Could not download all file  : " + ex.getMessage());
        }
        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-finnjob-process.html", method = RequestMethod.POST)
    public String finjobProcess(@RequestParam(value = "txtfinnjobname", required = true) String clientName,
                                @RequestParam(value = "filefinnjob", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.FINNJOB.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute(FINJOBMESSAGE, " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for finnjob");
            model.addAttribute(FINJOBMESSAGE, PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-webmegler-process.html", method = RequestMethod.POST)
    public String webmeglerProcess(@RequestParam(value = "txtwebmegler", required = true) String clientName,
                                @RequestParam(value = "filewebmegler", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.WEBMEGLER.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute(WEBMEGLERMESSAGE, " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for finnjob");
            model.addAttribute(WEBMEGLERMESSAGE, PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }


    @RequestMapping(value = "/test-webcruiter-process.html", method = RequestMethod.POST)
    public String webcruiterProcess(@RequestParam(value = "txtwebcruiter" , required = true) String clientName,
                                    @RequestParam(value = "filewebcruiter", required = true)MultipartFile file ,
                                    Model model,
                                    HttpServletResponse response)throws IOException {
        if(file!= null && clientName != null){
            String ftpPath = transitionProperties.getFtpPath()+ "/" + CustomerFormat.WEBCRUITER.toTextValue()+ "/" + clientName ;
            copyToFTPFolder(file , ftpPath);
            model.addAttribute(WEBCRUITERMESSAGE, " " + UPLOAD  + " " + file.getName() + " " + SUCCESSFUL) ;

        }else {
            log.error("please input file and client for webcruiter");
            model.addAttribute(WEBCRUITERMESSAGE , PLEASE_INPUT_FILE_AND_CLIENT_NAME) ;
        }

         return UPLOADPAGE ;
    }

    /*
    @RequestMapping(value = "/test-zett-process.html", method = RequestMethod.POST)
    public String zettProcess(@RequestParam(value = "filezett", required = true) MultipartFile file,
                            @RequestParam(value = "txtzetthost", required = true) String host,
                            @RequestParam(value = "txtzettclientname", required = true) String clientName,
                            @RequestParam(value = "txtzettclientid", required = true) String clientId,
                            @RequestParam(value = "txtzettclientref", required = true) String clientRef,
                            HttpServletResponse response) {

        //zett post url = "/zettxml/{clientName}/{clientId}/{clientRef}.xml"
        //txtzetthost
        StringBuffer urlBuffer = new StringBuffer();
        urlBuffer.append(host);
        urlBuffer.append("/zettxml/");
        urlBuffer.append(clientName);
        urlBuffer.append("/");
        urlBuffer.append(clientId);
        urlBuffer.append("/");
        urlBuffer.append(clientRef);
        urlBuffer.append(".xml");

        processRequest(RequestMethod.POST,urlBuffer.toString(),file, response);

        return null;
    }*/

    @RequestMapping(value = "/test-zett-put-process.html", method = RequestMethod.POST)
    public String zettPutProcess(@RequestParam(value = "filezett", required = true) MultipartFile file,
                               @RequestParam(value = "txtzetthost", required = true) String host,
                               @RequestParam(value = "txtzettclientname", required = true) String clientName,
                               @RequestParam(value = "txtzettclientid", required = true) String clientId,
                               @RequestParam(value = "txtzettexternalref", required = true) String externalRef,
                               HttpServletResponse response) {

        // zett put url =  "/zettxml/{clientName}/{clientId}/{adExternalRef}.xml"
        StringBuffer urlBuffer = new StringBuffer();
        urlBuffer.append(host);
        urlBuffer.append("/zettxml/");
        urlBuffer.append(clientName);
        urlBuffer.append("/");
        urlBuffer.append(clientId);
        urlBuffer.append("/");
        urlBuffer.append(externalRef);
        urlBuffer.append(".xml");

        processRequest(RequestMethod.PUT,urlBuffer.toString(),file, response);

        return null;
    }

    @RequestMapping(value = "/test-webtemp-process.html", method = RequestMethod.POST)
    public String webtempProcess(@RequestParam(value = "txtwebtemp", required = true) String clientName,
                                @RequestParam(value = "filewebtemp", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.WEBTEMP.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("webtempMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for webtemp");
            model.addAttribute("webtempMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-sologstrand-process.html", method = RequestMethod.POST)
    public String sologstrandProcess(@RequestParam(value = "txtsologstrand", required = true) String clientName,
                                @RequestParam(value = "filesologstrand", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {

        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.SOLOGSTRAND.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("sologstrandMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for webtemp");
            model.addAttribute("sologstrandMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-oldonlinebooking-process.html", method = RequestMethod.POST)
    public String oldonlinebookingProcess(@RequestParam(value = "txtoldonlinebooking", required = true) String clientName,
                                @RequestParam(value = "fileoldonlinebooking", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.OLDONLINEBOOKING.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("oldonlinebookingMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for oldonlinebooking");
            model.addAttribute("oldonlinebookingMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }


    @RequestMapping("/testlink.html")
    public String testLinkPage(Model model) {
        return "testlink";
    }

    private void processRequest(RequestMethod requestMethod,
                                String urlString,
                                MultipartFile file,
                                HttpServletResponse response){
        try {

            //http://asoke.dev.abctech-thailand.com/transition/zettxml/triolink/794668/000085.xml
            log.debug("redirect to : "+urlString);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (requestMethod == RequestMethod.PUT) {
                connection.setRequestMethod("PUT");
            } else if (requestMethod == RequestMethod.POST) {
                connection.setRequestMethod("POST");
            }
            connection.setDoOutput(true);
            //byte[] bytes = file.getBytes();
            OutputStream output = connection.getOutputStream();
            InputStream inputStream = file.getInputStream();
            byte[] bytes = IOUtils.toByteArray(inputStream);
            String xml = new String(bytes,UTF_8_ENCODING);
            output.write(xml.getBytes());
            connection.connect();
            String responseBody = IOUtils.toString(connection.getInputStream(),UTF_8_ENCODING);
            response.setContentType("application/xml");
            response.getWriter().print(responseBody);
            response.getWriter().flush();

            connection.disconnect();

        } catch (MalformedURLException err) {
            log.error("found the error about url.");
        } catch (IOException err) {
            log.error("can not connect to the host.");
        }
    }

    private void copyToFTPFolder(MultipartFile file, String destination) throws IOException {

        File filepath = new File(destination);
        if (!filepath.exists() && !filepath.mkdirs()) {
            log.error("Can not create folder: " + destination);
            throw new IOException("Can not create folder " + destination + ", do we have permission ?");
        }

        String path = destination + "/" + file.getOriginalFilename();
        file.transferTo(new File(path));
    }

    @RequestMapping(value = "/test-iadiFjob-process.html", method = RequestMethod.POST)
    public String iadiFinjobProcess(@RequestParam(value = "txtfinnjobname", required = true) String clientName,
                                @RequestParam(value = "fileIadiFjob", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {

        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.IADIFJOB.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("iadifjobmsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for IadiFjob");
            model.addAttribute("iadifjobmsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-rettbemanning.html", method = RequestMethod.POST)
    public String rettbemanningTest(@RequestParam(value = "clientName", required = true) String clientName,
                                @RequestParam(value = "rettbemanningFile", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {

        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.RETTBEMANNING.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("rettbemanningMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("Please select file and client name for Rettbemanning");
            model.addAttribute("rettbemanningMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-zett.html", method = RequestMethod.POST)
    public String zettFtpTest(@RequestParam(value = "clientName", required = true) String clientName,
                                @RequestParam(value = "zettFile", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {

        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.ZETTXML.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("zettMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("Please select file and client name for Zett XML");
            model.addAttribute("zettMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/test-iadifestateforsale-process.html", method = RequestMethod.POST)
    public String iadifestateforsaleProcess(@RequestParam(value = "txtiadifestateforsale", required = true) String clientName,
                                @RequestParam(value = "fileiadifestateforsale", required = true) MultipartFile file,
                                Model model,
                                HttpServletResponse response) throws IOException {
        if (file != null && clientName != null) {
            String ftpPath = transitionProperties.getFtpPath() + "/" + CustomerFormat.IADIFESTATEFORSALE.toTextValue() + "/" + clientName;
            copyToFTPFolder(file, ftpPath);
            model.addAttribute("iadifestateforsaleMsg", " " + UPLOAD + " " + file.getName() + " " + SUCCESSFUL);
        } else {
            log.error("please input file and client name for iadifestateforsale");
            model.addAttribute("iadifestateforsaleMsg", PLEASE_INPUT_FILE_AND_CLIENT_NAME);
        }

        return UPLOADPAGE;

    }

    @RequestMapping(value = "/clearValueMap.html", method = RequestMethod.GET)
    public String zettPutProcess(HttpServletResponse response) {
        jdbcTemplate.execute("DROP TABLE valuemap;");
        return "redirect:/testlink.html";
    }

}