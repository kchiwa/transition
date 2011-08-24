package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.bean.ClientInfo;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class IncomingFTPBean {
	private Logger log = LoggerFactory.getLogger(IncomingFTPBean.class);


	@Autowired
	private IFileStateManager fileStateManager;

	@Autowired
	private TransitionProperties transitionProperties;
	
	@Autowired
	private ComponentHelper componentHelper;
	

	public void handleMessage(Exchange exchange) throws TransitionException {
		log.info("Got Incoming file: " + exchange.getIn().getHeader(Exchange.FILE_PATH));
        log.debug("File size = "+exchange.getIn().getHeader(HeaderName.FILE_SIZE,Long.class));

		exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());

		// For getting headers as debug output: CamelBeanHelper.dumpCamelHeaders(exchange);

		String fileType = exchange.getIn().getHeader(HeaderName.FILE_TYPE).toString().toLowerCase();
		log.debug("fileType :: " + fileType);
		long currentTime = System.currentTimeMillis( );
		exchange.getIn().setHeader(HeaderName.INCOMING_TIME, currentTime);

		//check file type that system accept with Transition Properties class "media.support"
		if(componentHelper.checkMediaFileTypeSupport(fileType)){
			log.debug("Found a media file.");
			exchange.getIn().setHeader(HeaderName.MEDIA_FILE, "true");
		}

		ClientInfo clientInfo = getClientInfoFromCamelFilePath(exchange);
		String clientFormat = clientInfo.getClientFormat();
		String clientName = clientInfo.getClientName();
		log.info("Client Format :: " + clientFormat);
		log.info("Client Name :: " + clientName);

		exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, clientFormat);
		exchange.getIn().setHeader(HeaderName.CLIENT_NAME, clientName);
		exchange.getIn().setHeader(HeaderName.FILE_TYPE, fileType);

		
		boolean validFormat = false;
		for (CustomerFormat format : CustomerFormat.values()) {
			if (format.toTextValue().equals(clientFormat)) {
				validFormat = true;
			}
		}
		if (validFormat) {
			createFileState(exchange, clientFormat, clientName);
		} else {
			log.error("unsupported format found " + clientFormat);
			throw new UnknownCustomerFormatException("Format " +clientFormat + " is not supported!");
		}
	}
	// FIXME Refactor this, use the componenthelper class.
	private void createFileState(Exchange exchange, String clientFormat,
			String clientName) throws DAOException {
		//add FileStateServices to Database
		FileStateModel fileStateModel = new FileStateModel();
		fileStateModel.setClientName(clientName);
		fileStateModel.setCustomerFormat(clientFormat);
		fileStateModel.setFileName(exchange.getIn().getHeader(Exchange.FILE_NAME_ONLY).toString());
        fileStateModel.setFileSize(exchange.getIn().getHeader(HeaderName.FILE_SIZE,Long.class));
		//log.debug(fileStateModel.toString());



        //new column  BKK-770
        if(exchange.getIn().getHeader(HeaderName.MEDIA_FILE) != null && exchange.getIn().getHeader(HeaderName.MEDIA_FILE).toString().equals("true") ) {
           fileStateModel.setFileType(FileType.MEDIA);
        } else {
            fileStateModel.setFileType(FileType.valueOf(exchange.getIn().getHeader(HeaderName.FILE_TYPE).toString().toUpperCase()));
        }
        fileStateModel.setFilePath(exchange.getIn().getHeader(Exchange.FILE_PARENT,String.class));

		fileStateModel = fileStateManager.save(fileStateModel);
		exchange.getIn().setHeader(HeaderName.FILE_STATE, fileStateModel);
		exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, fileStateModel.getId());
		log.debug("FileStateServices Added. (id=" + fileStateModel.getId() + ")");

	}

	private ClientInfo getClientInfoFromCamelFilePath(Exchange exchange) throws TransitionException{
		String ftpPath = transitionProperties.getFtpPath();
		if (ftpPath==null) {
			throw new TransitionException("The ftp path is null, please set it first!");
		}
		ClientInfo clientInfo = new ClientInfo();
		String camelFileParent = (String) exchange.getIn().getHeader(Exchange.FILE_PARENT);
		if (camelFileParent.startsWith(ftpPath)) {
			String temp = camelFileParent.substring(ftpPath.length()+1);
			String info[ ] = temp.split("/");
			if (info.length>=2){
				clientInfo.setClientFormat(info[0]);
				clientInfo.setClientName(info[1]);

				return clientInfo;
			}
			else {
				throw new TransitionException("File structure: "+camelFileParent+" is not correct, the file should have be placed in the ftp path under the customerformat and clientname. For example:"
						+transitionProperties.getFtpPath()+"/"+CustomerFormat.ITMAKERIET.toTextValue()+"/zeeie/"+exchange.getIn().getHeader(Exchange.FILE_NAME_ONLY).toString());
			}

		}
		else {
			throw new TransitionException("The file route: " +camelFileParent+" does not start with the ftp path: " +ftpPath+", please check out if the route is setup correctly!");
		}
	}
}
