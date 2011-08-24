package com.abctech.transition.webapp.controller;


import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.receipt.adtype.IadifjobReceipt;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import com.abctech.transition.webapp.camel.ComponentHelper;
import com.abctech.transition.webapp.camel.receipt.IadifjobReceiptCreator;
import org.apache.camel.Exchange;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Future;

@Controller
public class IadIfJobController {

    private static final Logger log = LoggerFactory.getLogger(CarwebController.class);
    private static final String APPLICATION_XML = "application/xml";
    private static final String ERROR = "error";
    private static final String FAULT = "fault";

    @Autowired
    private ComponentHelper componentHelper;

    @Autowired
    private IadifjobReceiptCreator iadifjobReceiptCreator;
    
    private IadifjobReceipt createErrorReceipt(String clientName,String clientId,String errorMessage){
        IadifjobReceipt iadifjobReceipt = new IadifjobReceipt();
        String errorLevel = ERROR;
        String status = FAULT;
        DateTime dateTime = DateTime.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy.MM.dd H:mm:ss");
        String date = fmt.print(dateTime);
        iadifjobReceipt.addHead(clientName,"","","",date,"");
        iadifjobReceipt.addObject("","",clientId,"27015942","","",errorMessage,errorLevel,"","",status,"");
        iadifjobReceipt.addFileStatus(errorLevel,"ok","1");

        return iadifjobReceipt;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rest/iadifjob/{clientName}/{clientId}/{clientRef}.xml")
    public void postAd(@PathVariable("clientName") String clientName,
                       @PathVariable("clientId") int clientId,
                       @PathVariable("clientRef") String clientRef,
                       HttpServletResponse response,
                       @RequestParam("file") MultipartFile file) throws IOException{

        log.info("Got REST POST request from: " +clientName + " clientId: "+clientId+" clientRef: " +clientRef);
        try {
        	if(file!=null) {
        		String fileName = file.getOriginalFilename();
                String filePath = FileUtility.getCorrectFtpPath(CustomerFormat.IADIFJOB, clientName, clientId);
                Future<Exchange> future = componentHelper.createAndSendExchangeToWebServiceRoute(CustomerFormat.ZETTXML.toTextValue(), clientName, clientId, fileName,file.getSize(),file.getInputStream(),filePath);
        		Exchange received = future.get();
        		CamelBeanHelper.dumpCamelHeaders(received);
        		response.setContentType(APPLICATION_XML);
        		response.setCharacterEncoding("UTF-8");
        		IadifjobReceipt iadifjobReceipt = iadifjobReceiptCreator.createReceipt(received);
        		response.setContentType(APPLICATION_XML);
        		response.getWriter().print(iadifjobReceipt.createReceipt());
        		response.getWriter().flush();
            }
        } catch (Exception error) { //NOSONAR intentionally to wrap all exceptions, in one error receipt.
        	log.error("Got error while excuting the xml webservice request",error);
            response.setContentType(APPLICATION_XML);
            response.setCharacterEncoding("UTF-8");
            IadifjobReceipt iadifjobReceipt = createErrorReceipt(clientName,Integer.toString(clientId),error.getMessage());
        	response.setContentType(APPLICATION_XML);
        	response.getWriter().print(iadifjobReceipt.createReceipt());
        	response.getWriter().flush();
        }
    }
}
