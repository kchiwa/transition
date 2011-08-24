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
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.adtype.CarwebReceipt;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.core.utility.Zip;
import com.abctech.transition.core.utility.ZipInfo;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import com.abctech.transition.webapp.camel.ComponentHelper;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * A controller that handles the carweb requests, 
 * Everything is done with early reply strategy when possible.
 * The customer really only needs to know if we have received the file correctly.
 */

@Controller
public class CarwebController {

	private static final Logger log = LoggerFactory.getLogger(CarwebController.class);
    private static final String USER = "user";
    private static final String FILENAME = "filename";
    private static final String APPLICATION_XML = "application/xml";

	@Autowired(required = true)
	private IMediaStateManager mediaStateManager;
	    	
	@Autowired
	private TransitionProperties transitionProperties;
	
	@Autowired
	private ComponentHelper componentHelper;
	
	// Receipt resultat
	private static final String OK = "ok";
	private static final String ERROR = "feil";
	//private final String WARN = "advarsel";

	@RequestMapping(value="/carweb/upload-images.php", method = RequestMethod.POST) 
	public void uploadImage(@RequestParam(USER) Integer clientId, @RequestParam(FILENAME) MultipartFile file, HttpServletResponse response) throws IOException {
		long time = System.currentTimeMillis();
		// remember all path except for production path starts with /format/clientname/clientId/
		// where the clientId is set when given.
		// TODO: Zip should be stateless. Right now it is not correctly implemented.
	    Zip zip = new Zip();
		CarwebReceipt bildeReceipt = new CarwebReceipt();
		String carwebFTPPath = transitionProperties.getFtpPath()+"/"+CustomerFormat.CARWEB.toTextValue()+"/"+CustomerFormat.CARWEB.toTextValue()+"/"+clientId;
		if (file!=null && !file.isEmpty()) {
			log.debug("Got carweb image upload for clientId: "+clientId + " uploadedFile: "+file.getOriginalFilename() + " size: " +file.getSize());
			try {
				List<ZipInfo>entries = zip.unzipToFile(file.getInputStream(),carwebFTPPath);
				log.debug("clientId: "+clientId+ " "+ " file Size: " + file.getSize());
				for (ZipInfo zipInfo : entries) {
					bildeReceipt.addBilderespons(createUnikId(zipInfo.getEntryName()), zipInfo.getEntryName(), OK, "bilde lagret", zipInfo.getEntrySize().toString(), zipInfo.getMd5());
				}
			}
			catch (TransitionException e) {
				log.error("Got error while trying to unzip incoming zip file",e);
				bildeReceipt.addBilderespons("", "", ERROR, "Got error while trying to unzip the file.", "", "");
			}
			log.debug("Image upload finished in " + (System.currentTimeMillis()-time)+ " ms for clientId: " +clientId + " uploadedFile: "+file.getOriginalFilename() + " size: "+file.getSize());
		}
		response.setContentType(APPLICATION_XML);
		response.getWriter().print(bildeReceipt.createReceipt());
		response.getWriter().flush();
	}

	@RequestMapping(value="/carweb/downloadimagedata.php")
	public void retrieveImageData(@RequestParam(USER) Integer clientId, HttpServletResponse response) throws IOException {
		long time = System.currentTimeMillis();
		CarwebReceipt bildeReceipt = new CarwebReceipt();
		// get all image by this user.
		try {
			List<MediaStateModel>mediastates = mediaStateManager.findMediaStatesByClientId(Integer.valueOf(clientId));
			if (mediastates!=null) {
				for (MediaStateModel media : mediastates) {
					if (media!=null && (media.getMediaStatus()==MediaStatus.UPLOADED || media.getMediaStatus()==MediaStatus.PRODUCTION)) {
						bildeReceipt.addBilderespons(media.getAdStateModel().getAdExternalRef(), media.getExtref(), OK, null, null, media.getMd5hash());
					}
				}
			}
		}
		catch (DAOException e) {
			log.error("Got dao excepting while trying to fetching the mediastates",e);
			bildeReceipt.addBilderespons("", "", ERROR, "Error, when trying to get the image data.", "", "");
		}
		log.debug("Download image data information finished in " + (System.currentTimeMillis()-time)+ " ms for clientId: " +clientId);
		response.setContentType(APPLICATION_XML);
		response.getWriter().print(bildeReceipt.createReceipt());
		response.getWriter().flush();
	}
	
	@RequestMapping(value="/carweb/upload-cars.php", method=RequestMethod.POST) 
	public void uploadCarSynced(@RequestParam(USER) Integer clientId, @RequestParam(FILENAME) MultipartFile file, HttpServletResponse response) {

		if (file!=null && !file.isEmpty()) {
			try {
				String filePath = FileUtility.getCorrectFtpPath(CustomerFormat.CARWEB, CustomerFormat.CARWEB.toTextValue(), clientId);
				Future<Exchange> future = componentHelper.createAndSendExchangeToWebServiceRoute(CustomerFormat.CARWEB.toTextValue(), CustomerFormat.CARWEB.toTextValue(), clientId, file.getOriginalFilename(), 
						file.getSize(), file.getInputStream(), filePath);
				Exchange received = future.get();
				CamelBeanHelper.dumpCamelHeaders(received);
				response.setContentType(APPLICATION_XML);
				response.setCharacterEncoding("UTF-8");
				CarwebReceipt bilReceipt = createBilReceipt(received);
				log.debug(""+bilReceipt.hasError());
				response.getWriter().println(bilReceipt.createReceipt());
				response.getWriter().flush();
			}
			catch (Exception e) { //NOSONAR intentional so that we can wrap all exception to one error receipt
				log.error("Got error while executing uploadCar",e);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private CarwebReceipt createBilReceipt(Exchange received) {
		CarwebReceipt bilReceipt = new CarwebReceipt();
		// if the xml somehow can not be read or parse, we need to report that.
		if (received.getProperty(HeaderName.FILE_STATE)!=null) {
			FileStateModel fileState = (FileStateModel) received.getProperty(HeaderName.FILE_STATE);
			if (FileStateStatus.ERROR == fileState.getFileStateStatus()) {
				bilReceipt.setHasError(true);
				bilReceipt.addBilRespons(ERROR+": "+fileState.getErrorLogModel().getId(), ERROR, fileState.getErrorLogModel().getErrorMessage());
			}
		}
		List<AdStateModel> adstates = null;
		if (received.getProperty(HeaderName.AD_STATE_LIST)!=null) {
			adstates = (ArrayList<AdStateModel>) received.getProperty(HeaderName.AD_STATE_LIST);
		}
		if (adstates!=null) {
			for (AdStateModel m : adstates) {
				String status = OK;
				String message = "ZettId: "+m.getZadObjectId();
				if (AdStateStatus.ERROR == m.getAdStateStatus()) {
					bilReceipt.setHasError(true);
					status = ERROR+": "+m.getError().getId();
					if (m.getError()!=null) {
						message = m.getError().getErrorMessage();
					}
				}
				bilReceipt.addBilRespons(m.getAdExternalRef(), status, message );
			}
		}
		return bilReceipt;
	}
		
	private String createUnikId(String zipEntryName) {
		int index=zipEntryName.indexOf('L');
		// all files should have the unikid splitted with letter L.
		if (index>0) {
			return zipEntryName.substring(0,index);
		}
		else {
			log.error("Unikid could not be generated!");
		}
		return null;
	}

}
