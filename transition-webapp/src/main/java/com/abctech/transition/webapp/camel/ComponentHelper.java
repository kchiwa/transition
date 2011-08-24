package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.FileUtility;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.concurrent.Future;

@Component
public class ComponentHelper {
	
	private static final Logger log = LoggerFactory.getLogger(ComponentHelper.class);
	
	@Autowired
	private TransitionProperties transitionProperties;
	
	@Autowired
	private IFileStateManager fileStateManager;
	
    @Autowired
	private CamelContext camelContext;
	
	@Autowired
	private ProducerTemplate producerTemplate;
	
	
    public boolean checkMediaFileTypeSupport(String fileTypeExtention) {
		boolean checkStatus = false;
		String[] fileTypeSupport = transitionProperties.getMediaSupport().split(",");
		if(fileTypeSupport.length == 0) {
			return false;
		}
		else{
			for(String supportType:fileTypeSupport){
				if(supportType.trim().equalsIgnoreCase(fileTypeExtention.trim())){
					log.debug("File type matched!! (" + supportType + ")");
					checkStatus = true;
					break;
				}
			}
		}
		return checkStatus;
	}
    
	public FileStateModel saveFileState(String clientName, String clientFormat, String filePathOnly, 
			String fileName, Long fileSize, FileType type, FileStateModel parent)
			throws DAOException {
		FileStateModel fileStateModel = new FileStateModel();
		fileStateModel.setClientName(clientName);
		fileStateModel.setCustomerFormat(clientFormat);
		fileStateModel.setFileName(fileName);
		fileStateModel.setFileSize(fileSize);
		fileStateModel.setFileType(type);
		// use the same zip path as the filepath for the media entry
		fileStateModel.setFilePath(filePathOnly);
		fileStateModel.setParentFileState(parent);            
		fileStateModel = fileStateManager.save(fileStateModel);
		return fileStateModel;
	}
	
	public Future<Exchange> createAndSendExchangeToWebServiceRoute(String customerFormat, String clientName, Integer clientId,
			String fileName, Long fileSize, InputStream xmlInputStream, String filePathOnly) {
		Exchange exchange = commonExchangeHeaders(customerFormat, clientName,
				clientId, fileName, fileSize, filePathOnly);
		exchange.getIn().setBody(xmlInputStream);
		Future<Exchange> future = producerTemplate.asyncSend(QueueName.WEBSERVICE.toTextValue(), exchange);
		return future;
	}

	private Exchange commonExchangeHeaders(String customerFormat,
			String clientName, Integer clientId, String fileName,
			Long fileSize, String filePathOnly) {
		Exchange exchange = new DefaultExchange(camelContext);
		exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, customerFormat);
		exchange.getIn().setHeader(HeaderName.CLIENT_NAME, clientName);
		exchange.getIn().setHeader(HeaderName.CLIENT_ID, clientId);
		exchange.getIn().setHeader(Exchange.FILE_NAME_ONLY, fileName);
		exchange.getIn().setHeader(Exchange.FILE_PATH, filePathOnly+"/"+fileName);
		exchange.getIn().setHeader(Exchange.FILE_PARENT, filePathOnly);
		exchange.getIn().setHeader(HeaderName.FILE_TYPE, FileUtility.getFileExtention(fileName).toLowerCase());
		exchange.getIn().setHeader(HeaderName.FILE_SIZE, fileSize);
		exchange.setPattern(ExchangePattern.InOnly);
		return exchange;
	}
	
	public Future<Exchange> createAndSendExchangeToWebServiceRoute(String customerFormat, String clientName, Integer clientId,
			String fileName, Long fileSize, String xml, String filePathOnly) {
		Exchange exchange = commonExchangeHeaders(customerFormat, clientName,
				clientId, fileName, fileSize, filePathOnly);
		exchange.getIn().setBody(xml);
		Future<Exchange> future = producerTemplate.asyncSend(QueueName.WEBSERVICE.toTextValue(), exchange);
		return future;
	}
}
