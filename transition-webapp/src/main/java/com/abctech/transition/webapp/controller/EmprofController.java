package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.adtype.EmprofReceipt;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import com.abctech.transition.webapp.camel.ComponentHelper;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Controller
public class EmprofController {

	private static final Logger log = LoggerFactory.getLogger(EmprofController.class);
    private static final String APPLICATION_XML = "application/xml";

	@Autowired
	private IMediaStateManager mediaStateManager;

	@Autowired
	private TransitionProperties properties;
	
	@Autowired
	private ComponentHelper componentHelper;
	
	private String format = CustomerFormat.EMPROF.toTextValue();
	
	private static final String ERROR = "ERROR";
	private static final String SUCCESS = "SUCCESS";
	//private static final String WARN = "WARNING";
	

	@RequestMapping("/emprof-fetcher.xml")
	public void emprofFetcher(@RequestParam(value = "url", required = true) String url, HttpServletResponse response) {
		try{
			String urlFileName = url.substring(url.lastIndexOf("/")+1);
			if (urlFileName!=null && !urlFileName.endsWith(".xml")) {
				urlFileName+=urlFileName+".xml";
			}
			log.info("emprof requesting to download: " +url);
			URL urlGet = new URL(url);
			HttpURLConnection connection = (HttpURLConnection)urlGet.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			InputStream is = connection.getInputStream();
			String filePath = FileUtility.getCorrectFtpPath(CustomerFormat.EMPROF,format,null);
			//FileStateModel fileStateModel = componentHelper.saveFileState(format, format, filePath, urlFileName, Long.valueOf(connection.getContentLength()), FileType.XML, null);
			//log.debug("FileState Added. (id=" + fileStateModel.getId() + ")");
			
			//exchange.getIn().setHeader(HeaderName.FILE_STATE, fileStateModel);
			//exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, fileStateModel.getId());
			Future<Exchange> future = componentHelper.createAndSendExchangeToWebServiceRoute(CustomerFormat.EMPROF.toTextValue(), CustomerFormat.EMPROF.toTextValue(),null,
					urlFileName, Long.valueOf(connection.getContentLength()), is, filePath);
			Exchange received = future.get();
			EmprofReceipt receipt = createEmprofReceipt(received);
			CamelBeanHelper.dumpCamelHeaders(received);
			response.setContentType(APPLICATION_XML);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().println(receipt.createReceipt());
			response.getWriter().flush();
			
		} 
		catch (Exception ex) { //NOSONAR, no need to reply anything to the sender.
			log.error("Exception caught :: ",ex);
		}
	}

	@SuppressWarnings("unchecked")
	private EmprofReceipt createEmprofReceipt(Exchange received) {
		EmprofReceipt eReceipt = new EmprofReceipt();
		// if the xml somehow can not be read or parse, we need to report that.
		if (received.getProperty(HeaderName.FILE_STATE)!=null) {
			FileStateModel fileState = (FileStateModel) received.getProperty(HeaderName.FILE_STATE);
			if (FileStateStatus.ERROR == fileState.getFileStateStatus()) {
				//eReceipt.addBilRespons(ERROR+": "+fileState.getErrorLogModel().getId(), ERROR, fileState.getErrorLogModel().getErrorMessage());
				eReceipt.addAd(null, null, null, null, ERROR, fileState.getErrorLogModel().getErrorMessage());
			}
		}
		List<AdStateModel> adstates = null;
		if (received.getProperty(HeaderName.AD_STATE_LIST)!=null) {
			adstates = (ArrayList<AdStateModel>) received.getProperty(HeaderName.AD_STATE_LIST);
			for (AdStateModel adstate : adstates) {
				String status = SUCCESS;
				String message = "Sucessfully imported";
				String identicalStatus = received.getIn().getHeader(HeaderName.IDENTICAL_STATUS, String.class);
				if (identicalStatus!=null && identicalStatus.equals("TRUE")) {
					message = "Identical ad already imported";
				}
				if (AdStateStatus.ERROR == adstate.getAdStateStatus() && adstate.getError()!=null) {
					status = ERROR;
					message = adstate.getError().getErrorMessage();
				}
				else if (AdStateStatus.CLOSED == adstate.getAdStateStatus()) {
					message = "Successfully deleted";
				}
				eReceipt.addAd(""+adstate.getzClientId(), adstate.getAdExternalRef(),""+adstate.getZadObjectId(),properties.getZettServerHost()+"/?"+adstate.getZadObjectId(), status, message);
				// generate media receipt for this ad
				if (identicalStatus==null || identicalStatus.equals("FALSE")) {
					addAttachments(eReceipt, adstate);
				}
			}
		}
		return eReceipt;
	}

	private void addAttachments(EmprofReceipt eReceipt, AdStateModel adstate) {
		try {
			List<MediaStateModel>mediaStates = mediaStateManager.findMediaStateByAdStateID(adstate.getId());
			if (mediaStates!=null && mediaStates.size()>0) {
				for (MediaStateModel m : mediaStates) {
					// the exteref should be a full url.
					String url = m.getExtref();
					String mediaRef =  url;
					if (mediaRef!=null && mediaRef.indexOf('/')>0) {
						mediaRef = mediaRef.substring(mediaRef.lastIndexOf('/')+1); 
					}
					String status = m.getStatus();
					if (m.getMediaStateStatus()==MediaStatus.UPLOADED  || m.getMediaStateStatus()==MediaStatus.PRODUCTION) {
						status="SUCCESS";
					}
					eReceipt.addAttachment(adstate.getAdExternalRef(), url, mediaRef, status, m.getInfoMessage());
				}
			}
		}
		catch (DAOException dae) {
			log.error("Got error while trying to fetch mediastates for this adstate",dae);
			eReceipt.addAttachment(adstate.getAdExternalRef(), null, null, "ERROR", "System error while trying to fetch media information");
		}
	}

	@RequestMapping("/emprof.xml")
	public String emprofFetcher() {
        return "emprof_xml_fetcher";
	}

}
