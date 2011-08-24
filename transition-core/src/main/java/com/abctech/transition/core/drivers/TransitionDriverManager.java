package com.abctech.transition.core.drivers;


import com.abctech.transition.core.drivers.mediahandlers.*;
import com.abctech.transition.core.drivers.transformers.*;
import com.abctech.transition.core.drivers.xmlbeans.*;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import org.springframework.stereotype.Component;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * All media, transformers and xmlbean handlers in one driver factory manager.
 * Extend the factory when there is new import format to support.
 * @author tuan
 *
 */
@Component
public final class TransitionDriverManager {

	private TransitionDriverManager() {
		
	}
	
	public static AXmlBeanDriver getXmlBeanDriver(XmlBeanDriverIniValue iniValue) throws UnknownCustomerFormatException, InvalidXMLException {
		AXmlBeanDriver xmlBeanDriver = null;
		CustomerFormat format = iniValue.getFormat();
		if (format==null) {
			throw new UnknownCustomerFormatException("Format is not given!");
        }
		switch (format) {
          case CARWEB:
              xmlBeanDriver =  new CarwebDriver(iniValue);
              break;       
          case TIETOENATOR:
              xmlBeanDriver = new TietoenatorDriver(iniValue);
              break;
          case ITMAKERIET:
              xmlBeanDriver = new ItmakerietDriver(iniValue);
              break;
          case EMPROF:
              xmlBeanDriver = new EmprofDriver(iniValue);
              break;
          case ZETTXML:
              xmlBeanDriver = new ZettXmlDriver(iniValue);
              break;
          case FINNJOB:
        	  xmlBeanDriver = new FinnJobDriver(iniValue);
        	  break;
          case IADIFJOB:
        	  xmlBeanDriver = new IadIfJobDriver(iniValue);
        	  break;
          case RETTBEMANNING:
              xmlBeanDriver = new RettbemanningDriver(iniValue);
              break;
          case WEBMEGLER:
              xmlBeanDriver = new WebmeglerDriver(iniValue);
              break;
          case WEBCRUITER:
              xmlBeanDriver = new WebcruiterDriver(iniValue);
              break;
          case WEBTEMP:
              xmlBeanDriver = new WebTempDriver(iniValue);
              break;
          case OLDONLINEBOOKING:
              xmlBeanDriver = new OldOnlineBookingDriver(iniValue);
              break;
          case SOLOGSTRAND:
              xmlBeanDriver = new SologstrandDriver(iniValue);
              break;
          case NOVASOL:
              xmlBeanDriver = new NovasolDriver(iniValue);
              break;
          case IADIFESTATEFORSALE:
              xmlBeanDriver = new IadifestateforsaleDriver(iniValue);
              break;
          case IADIFMMO:
              xmlBeanDriver = new IadifmmoDriver(iniValue);
              break;
          default:
              throw new UnknownCustomerFormatException(format +" " + CustomerFormat.UNSUPPORTED.toTextValue());
		}
		return xmlBeanDriver;
	}
	
    public static AMediaHandlerDriver getMediaHandler(XmlBeanDriverIniValue iniValue) throws UnknownCustomerFormatException, InvalidXMLException {
		AMediaHandlerDriver mediaHandler = null;
		CustomerFormat format = iniValue.getFormat();
		switch (format) {
          case CARWEB:
              mediaHandler =  new HandleMediaCarweb(new CarwebDriver(iniValue));
              break;
          case TIETOENATOR:
              mediaHandler = new HandleMediaTietoenator(new TietoenatorDriver(iniValue));
              break;
          case ITMAKERIET:
              mediaHandler = new HandleMediaItmakeriet(new ItmakerietDriver(iniValue));
              break;
          case EMPROF:
              mediaHandler = new HandleMediaEmprof(new EmprofDriver(iniValue));
              break;
          case ZETTXML:
              mediaHandler = new HandleMediaZettXml(new ZettXmlDriver(iniValue));
              break;
          case FINNJOB:
              mediaHandler = new HandleMediaFinnJob(new FinnJobDriver(iniValue));
              break;
          case IADIFJOB:
              mediaHandler = new HandleMediaIadIfJob(new IadIfJobDriver(iniValue));
              break;
          case RETTBEMANNING:
              mediaHandler = new HandleMediaRettbemanning(new RettbemanningDriver(iniValue));
              break;
          case WEBMEGLER:
              mediaHandler = new HandleMediaWebmegler(new WebmeglerDriver(iniValue));
              break;
          case WEBCRUITER:
              mediaHandler = new HandleMediaWebcruiter(new WebcruiterDriver(iniValue));
              break;
          case WEBTEMP:
              mediaHandler = new HandleMediaWebTemp(new WebTempDriver(iniValue));
              break;
          case OLDONLINEBOOKING:
              mediaHandler = new HandleMediaOldOnlineBooking(new OldOnlineBookingDriver(iniValue))  ;
              break;
          case SOLOGSTRAND:
              mediaHandler = new HandleMediaSologstrand(new SologstrandDriver(iniValue))  ;
              break;
          case NOVASOL:
              mediaHandler = new HandleMediaNovasol(new NovasolDriver(iniValue)) ;
              break;
          case IADIFMMO:
              mediaHandler = new HandleMediaIadifmmo(new IadifmmoDriver(iniValue)) ;
              break;
          case IADIFESTATEFORSALE:
              mediaHandler = new HandleMediaIadifestateforsale(new IadifestateforsaleDriver(iniValue)) ;
              break;
          default:
              throw new UnknownCustomerFormatException(format.toTextValue() +" " + CustomerFormat.UNSUPPORTED.toTextValue());
		}
		return mediaHandler;

	}
	
	public static ATransformationDriver getTransformer(XmlBeanDriverIniValue iniValue) throws UnknownCustomerFormatException, InvalidXMLException {
		ATransformationDriver transformer = null;
		CustomerFormat format = iniValue.getFormat();
		switch (format) {
          case CARWEB:
              transformer =  new TransformCarweb(new CarwebDriver(iniValue));
              break;       
          case TIETOENATOR:
              transformer = new TransformTietoenator(new TietoenatorDriver(iniValue));
              break;
          case ITMAKERIET:
              transformer = new TransformItmakeriet(new ItmakerietDriver(iniValue));
              break;
          case EMPROF:
              transformer = new TransformEmprof(new EmprofDriver(iniValue));
              break;
          case ZETTXML:
              transformer = new TransformZettXml(new ZettXmlDriver(iniValue));
              break;
          case FINNJOB:
              transformer = new TransformFinnJob(new FinnJobDriver(iniValue));
              break;
          case IADIFJOB:
              transformer = new TransformIadiFJob(new IadIfJobDriver(iniValue));
              break;
          case RETTBEMANNING:
              transformer = new TransformRettbemanning(new RettbemanningDriver(iniValue));
              break;
          case WEBMEGLER:
              transformer = new TransformWebmegler(new WebmeglerDriver(iniValue)) ;
              break;
          case WEBTEMP:
              transformer = new TransformWebTemp(new WebTempDriver(iniValue));
              break;
          case WEBCRUITER:
               transformer = new TransformWebcruiter(new WebcruiterDriver(iniValue));
               break;
          case OLDONLINEBOOKING:
               transformer = new TransformOldOnlineBooking(new OldOnlineBookingDriver(iniValue));
               break;
          case SOLOGSTRAND:
               transformer = new TransformSologtrand(new SologstrandDriver(iniValue))  ;
               break;
          case NOVASOL:
               transformer = new TransformNovasol(new NovasolDriver(iniValue))  ;
               break;
          case IADIFESTATEFORSALE:
              transformer = new TransformIadifestateforsale(new IadifestateforsaleDriver(iniValue)) ;
              break;
          default:
              throw new UnknownCustomerFormatException(format.toTextValue() +" " + CustomerFormat.UNSUPPORTED.toTextValue());
		}
		return transformer;
		
	}
	

	
}
