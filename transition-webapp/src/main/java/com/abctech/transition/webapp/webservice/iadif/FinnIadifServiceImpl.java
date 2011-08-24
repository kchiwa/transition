package com.abctech.transition.webapp.webservice.iadif;

import com.abctech.transition.core.drivers.xmlbeans.IadIfJobDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.receipt.adtype.IadifjobReceipt;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import com.abctech.transition.webapp.camel.ComponentHelper;
import com.abctech.transition.webapp.camel.receipt.IadifjobReceiptCreator;
import org.apache.camel.Exchange;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class FinnIadifServiceImpl implements IFinnIadifService {
	
	public static final Logger log = LoggerFactory.getLogger(FinnIadifServiceImpl.class);
	
	@Autowired
	private ComponentHelper componentHelper;
	
	@Autowired
	private IadifjobReceiptCreator iadifjobReceiptCreator;

	public String importXml(String xml) {
		try {
			log.debug("importxml is called!");
			DateTime date = new DateTime();
			IadIfJobDriver iadifDriver = new IadIfJobDriver(xml);
			String clientName = iadifDriver.getClientName();
			Integer clientId = iadifDriver.getClientId();
			String filePath = FileUtility.getCorrectFtpPath(CustomerFormat.IADIFJOB, clientName, clientId);
			String fileName = date.getMillis()+"_"+iadifDriver.getClientRef()+".xml";
            Future<Exchange> future = componentHelper.createAndSendExchangeToWebServiceRoute(CustomerFormat.ZETTXML.toTextValue(), clientName, clientId, fileName,new Long(xml.length()),xml,filePath);
       		Exchange received = future.get();
    		CamelBeanHelper.dumpCamelHeaders(received);
    		IadifjobReceipt iadifjobReceipt = iadifjobReceiptCreator.createReceipt(received);
    		return iadifjobReceipt.createReceipt();
		}
		catch (InvalidXMLException ie) {
			log.error("Got xml exception",ie);
			//TODO write error receipt here.
		}
		catch (Exception e) {
			log.error("Got exception",e);
			//TODO write error receipt here.
		}
		return "importXML has been called";
	}
	
}
