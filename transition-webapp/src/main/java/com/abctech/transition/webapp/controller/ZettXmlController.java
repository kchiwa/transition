package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;
import com.abctech.transition.core.receipt.adtype.ZettXMLReceipt;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import com.abctech.transition.webapp.camel.ComponentHelper;
import com.abctech.transition.xmladbeans.zettxml.ReferenceDocument;
import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import org.apache.camel.Exchange;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Controller
public class ZettXmlController {

    private static Logger log = LoggerFactory.getLogger(ZettXmlController.class);
    private static final String CLIENT_ID = "clientId";
    private static final String ZETTXML = "zettxml";
    private static final String APPLICATION_XML = "application/xml";
    private static final String ERROR = "ERROR";
    private static final String CLIENT_NAME = "clientName";
    private static final String CLIENT_REF = "clientRef";

    @Autowired(required = true)
	private IMediaStateManager mediaStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
	private TransitionProperties transitionProperties;
    
    @Autowired
    private ComponentHelper componentHelper;

        private ZettXMLReceipt generateReceipt(Exchange received){

        ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
        Integer zettId = 0;
        Integer clientId = 0;
        String clientName = "";
        String externalRef = "";
        String format = CustomerFormat.ZETTXML.toTextValue();
        String returnHeader = "";
        String returnText = "";

        // in error in file cas, no need to response if it's ok
        if (received.getProperty(HeaderName.FILE_STATE)!=null) {
			FileStateModel fileState = (FileStateModel) received.getProperty(HeaderName.FILE_STATE);
			if (FileStateStatus.ERROR == fileState.getFileStateStatus()) {
                zettId = 0;
                clientId = 0;
                externalRef = "";
                clientName = fileState.getClientName();
                returnHeader = "ERROR";
                returnText = fileState.getErrorLogModel().getErrorMessage();
			}
		}

        //response about the ad
        List<AdStateModel> adstates = null;
		if (received.getProperty(HeaderName.AD_STATE_LIST)!=null) {
			adstates = (ArrayList<AdStateModel>) received.getProperty(HeaderName.AD_STATE_LIST);
			for (AdStateModel m : adstates){
				returnHeader = "OK";
				zettId = m.getZadObjectId();
                clientId = m.getzClientId();
                clientName = received.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
                externalRef = m.getAdExternalRef();
				if (AdStateStatus.ERROR == m.getAdStateStatus()) {
					returnHeader = "ERROR";
					if (m.getError()!=null) {
						returnText = m.getError().getErrorMessage();
					}
				}
			}
		}

        zettXMLReceipt.addAd(zettId,clientId,externalRef,format,clientName,returnHeader,returnText,null);
        return zettXMLReceipt;

    }

    private void checkFTPFolder(String destination) throws TransitionException {
		File filepath = new File(destination);
		if (!filepath.exists() && !filepath.mkdirs()) {
			log.error("Can not create folder: " +destination);
			throw new TransitionException("Can not create folder "+ destination+", do we have permission ?");

		}

	}

    @RequestMapping(method = RequestMethod.GET, value = "/rest/zettxml/{clientName}/{clientId}/{clientRef}.xml")
    public void getAd(HttpServletResponse response,
    				  @PathVariable(CLIENT_NAME) String clientName,
                      @PathVariable(CLIENT_ID) int clientId,
                      @PathVariable(CLIENT_REF) String clientRef) throws DAOException, IOException {
    	
    	log.info("Got REST GET request from: "+clientName + " clientId: "+clientId + " clientRef: " + clientRef);
    	
        AdStateModel adstate = adStateManager.findAdStateByClientIdClientRef(clientId, clientRef);
        Receipt receipt = new Receipt();
        receipt.setRoot(new ReceiptElement("receipt", null));
        ReceiptElement adResponse = receipt.getRoot().addChild("ad", null);

        if (adstate != null) {
            List<MediaStateModel> mediastate = mediaStateManager.findMediaStateByAdStateID(adstate.getId());

            adResponse.addChild("adstateid", adstate.getId().toString());
            adResponse.addChild("status", adstate.getAdStateStatus().toTextValue());
            adResponse.addChild("clientid", Integer.valueOf(adstate.getzClientId()).toString());
            adResponse.addChild("adexternalref", adstate.getAdExternalRef());
            adResponse.addChild("shahash", adstate.getShaHash());

            ReceiptElement fileResponse = new ReceiptElement("file", null);
            fileResponse.addChild("customerformat", adstate.getFileStateModel().getCustomerFormat());
            fileResponse.addChild("owner", adstate.getFileStateModel().getClientName());
            fileResponse.addChild("filename", adstate.getFileStateModel().getFileName());
            fileResponse.addChild("createdtime", adstate.getFileStateModel().getCreatedTime().toString());

            ReceiptElement medias = new ReceiptElement("medias", null);
            if (mediastate != null) {
                for (int i = 0; i <= mediastate.size() - 1; i++) {
                    ReceiptElement media = new ReceiptElement("media", null);
                    media.addChild("title", mediastate.get(i).getTitle());
                    media.addChild("contenttype", mediastate.get(i).getContentType().toTextValue());
                    media.addChild("extref", mediastate.get(i).getExtref());
                    media.addChild("status", mediastate.get(i).getStatus());
                    media.addChild("sequencenum", mediastate.get(i).getSequenceNum() + "");
                    media.addChild("md5hash", mediastate.get(i).getMd5hash());
                    media.addChild("prodref", mediastate.get(i).getProdref());
                    media.addChild("lastModified", mediastate.get(i).getLastModified().toString());
                    medias.addChild(media);
                }
            }
            adResponse.addChild(fileResponse);
            adResponse.addChild(medias);
        } else {
            String errorMessage = "Can not find Adstate with clientID : " + clientId + " adExternalRef : " + clientRef;
            ReceiptElement errorResponse = new ReceiptElement("error", null);
            errorResponse.addChild(CLIENT_ID, String.valueOf(clientId));
            errorResponse.addChild("adExternalRef", clientRef);
            errorResponse.addChild("message", errorMessage);
            adResponse.addChild(errorResponse);
        }

        response.setContentType(APPLICATION_XML);
        response.getWriter().print(receipt.createReceipt());
        response.getWriter().flush();

    }

    @RequestMapping(method = RequestMethod.POST, value = "/rest/zettxml/{clientName}/{clientId}/{clientRef}.xml")
    public void postAd(@PathVariable(CLIENT_NAME) String clientName,
                       @PathVariable(CLIENT_ID) int clientId,
                       @PathVariable(CLIENT_REF) String clientRef,
                       HttpServletResponse response,
                       @RequestParam("file") MultipartFile file)throws IOException{
    	log.info("Got REST POST request from: " +clientName + " clientId: "+clientId+" clientRef: " +clientRef);
        try {
        	if(file!=null) {
        		String fileName = file.getOriginalFilename();
        		String filePath = FileUtility.getCorrectFtpPath(CustomerFormat.ZETTXML, clientName, clientId);
        		Future<Exchange>future = componentHelper.createAndSendExchangeToWebServiceRoute(CustomerFormat.ZETTXML.toTextValue(), clientName, clientId, fileName,file.getSize(),file.getInputStream(),filePath);
        		Exchange received = future.get();
        		CamelBeanHelper.dumpCamelHeaders(received);
        		response.setContentType(APPLICATION_XML);
        		response.setCharacterEncoding("UTF-8");
                ZettXMLReceipt zettXMLReceipt = generateReceipt(received);
        		response.setContentType(APPLICATION_XML);
        		response.getWriter().print(zettXMLReceipt.createReceipt());
        		response.getWriter().flush();
        	}
        }
        catch (Exception error) { //NOSONAR intentionally to wrap all exceptions, in one error receipt.
        	log.error("Got error while excuting the xml webservice request",error);
            Integer zettId = 0;
            String returnHeader = ERROR;
            String returnText = error.getMessage();
            response.setContentType(APPLICATION_XML);
            response.setCharacterEncoding("UTF-8");
        	ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
        	zettXMLReceipt.addAd(zettId,clientId,clientRef,CustomerFormat.ZETTXML.toTextValue(),clientName,returnHeader,returnText,null);
        	response.setContentType(APPLICATION_XML);
        	response.getWriter().print(zettXMLReceipt.createReceipt());
        	response.getWriter().flush();
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/rest/zettxml/{clientName}/{clientId}/{adExternalRef}.xml")
    public void deleteAd(@PathVariable(CLIENT_NAME) String clientNameInput
            ,@PathVariable(CLIENT_ID) int clientIdInput
            , @PathVariable("adExternalRef") String adExternalRefInput
            , HttpServletResponse response){

        //client id must be set in the Ad.Company attribute and ExternalReferences.Reference source attribute.
        //adExternalRef must be set in the ExternalReferences.Reference tag
        //now we set default category id = 10200

        String categoryIdInput = "10200";
        Integer zettId = 0;
        String msg = "";
        ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
        String status = ERROR;

        try{
            AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientIdInput,adExternalRefInput);

            if(adStateModel == null){
                msg += " Can not foud zettid from client id = "+clientIdInput +" and client ref = "+ adExternalRefInput;
                log.error(msg);
                throw new TransitionException(msg);
            }

            zettId = adStateModel.getZadObjectId()  ;

            BigInteger clientId = new BigInteger(Integer.toString(clientIdInput));
            BigInteger categoryId = new BigInteger(categoryIdInput);

            InputStream is = this.getClass().getClassLoader().getResourceAsStream("xml/zettTemplate.xml");
            ZettNoDocument zettNoDocument = ZettNoDocument.Factory.parse(IOUtils.toString(is,"UTF-8").trim());
            zettNoDocument.getZettNo().getAdArray(0).setCompany(clientId);
            zettNoDocument.getZettNo().getAdArray(0).getExternalReferences().getReference().setSource(clientId);
            zettNoDocument.getZettNo().getAdArray(0).setAdCategoryId(categoryId);
            ReferenceDocument.Reference ref = zettNoDocument.getZettNo().getAdArray(0).getExternalReferences().getReference();
            ref.setStringValue(adExternalRefInput);
            zettNoDocument.getZettNo().getAdArray(0).getExternalReferences().setReference(ref);
            log.debug("xml = "+zettNoDocument.xmlText());

            String ftpPath;

			if(transitionProperties != null){
				ftpPath = transitionProperties.getFtpPath();
			}else{
				msg += " Can not get the ftp path from the properties file";
				log.error(msg);
				throw new TransitionException(msg);
			}

			StringBuffer pathBuffer = new StringBuffer();
			pathBuffer.append(ftpPath);
			pathBuffer.append("/");
            pathBuffer.append(ZETTXML);
            pathBuffer.append("/");
            pathBuffer.append(clientNameInput);
            pathBuffer.append("/");
			String path = pathBuffer.toString();
			String fileName = path + "/delete_"+zettId+".xml";

			checkFTPFolder(path);
			File file = new File(fileName);
			byte[] bytes = IOUtils.toByteArray(IOUtils.toInputStream(zettNoDocument.xmlText()));
            if(file!=null&&bytes!=null){
                log.debug("file size = "+bytes.length);
                FileUtils.writeByteArrayToFile(file, bytes);
                status = "OK";
                msg = "Success";
            }else{
                msg += " Can not find the file from this path : "+fileName;
                log.error(msg);
                throw new IOException(msg);
            }


        }catch (IOException e){
            msg += " Can not find write xml file to ftp folder";
            log.error(msg);
        }catch (XmlException e){
            msg += " Can not parse data to xml object";
            log.error(msg);
        }catch (TransitionException e){
            msg += " Has a problem for close this ad(client name = "+clientNameInput+"client id = "+categoryIdInput+" adExternalRef = "+adExternalRefInput;
            log.error(msg);
        }

        try{
            zettXMLReceipt.addAd(zettId,clientIdInput, adExternalRefInput, ZETTXML, clientNameInput, status, msg.trim(), null);
            response.setContentType(APPLICATION_XML);
            response.getWriter().print(zettXMLReceipt.createReceipt());
            response.getWriter().flush();
        }catch(IOException err){
            log.error("Can not write the zettxml receipt");
        }


    }

    @RequestMapping(method = RequestMethod.PUT, value = "/zettxml/{clientName}/{clientId}/{adExternalRef}.xml")
    public void uploadMediaFile(@PathVariable(CLIENT_NAME) String clientNameInput
            ,@PathVariable(CLIENT_ID) int clientIdInput
            ,@PathVariable("adExternalRef") String adExternalRefInput
            ,HttpServletRequest request
            ,HttpServletResponse response){

            String msg = "";
            ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
            String status = ERROR;
            String ftpPath;
            Integer zettId = 0;

            try{
                if(transitionProperties != null){
                    ftpPath = transitionProperties.getFtpPath();
                }else{
                    msg += " Can not get the ftp path from the properties file";
                    log.error(msg);
                    throw new TransitionException(msg);
                }

                AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientIdInput,adExternalRefInput);
                if(adStateModel == null){
                    msg += " Can not foud zettid from client id = "+clientIdInput +" and client ref = "+ adExternalRefInput;
                    log.error(msg);
                    throw new TransitionException(msg);
                }
                zettId = adStateModel.getZadObjectId();

                StringBuffer pathBuffer = new StringBuffer();
                pathBuffer.append(ftpPath);
                pathBuffer.append("/");
                pathBuffer.append(ZETTXML);
                pathBuffer.append("/");
                pathBuffer.append(clientNameInput);
                pathBuffer.append("/");
                String path = pathBuffer.toString();
                String fileName = path + "/image_"+zettId+".zip";

                checkFTPFolder(path);
                File file = new File(fileName);
                InputStream is = request.getInputStream();
                byte[] bytes = IOUtils.toByteArray(is);
                FileUtils.writeByteArrayToFile(file,bytes);
                status = "OK";
                msg = "Success";
            }catch (IOException e){
                msg += " Has a problem for close this ad(client name = "+clientNameInput+"client id = "+clientIdInput+" adExternalRef = "+adExternalRefInput;
                log.error(msg);
            }catch (TransitionException e){
                msg += " Has a problem for close this ad(client name = "+clientNameInput+"client id = "+clientIdInput+" adExternalRef = "+adExternalRefInput;
                log.error(msg);
            }

            try{
                zettXMLReceipt.addAd(zettId,clientIdInput , adExternalRefInput, ZETTXML, clientNameInput, status, msg.trim(), null);
                response.setContentType(APPLICATION_XML);
                response.getWriter().print(zettXMLReceipt.createReceipt());
                response.getWriter().flush();
            }catch(IOException err){
                log.error("Can not write the zettxml receipt");
            }

    }

}
