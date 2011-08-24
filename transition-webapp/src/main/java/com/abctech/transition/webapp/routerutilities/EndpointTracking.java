package com.abctech.transition.webapp.routerutilities;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;
import java.util.Map;

public class EndpointTracking {

    private static Logger log = LoggerFactory.getLogger(EndpointTracking.class);
    private static final String CRITICAL_ERROR_MESSAGE = "Found the critical error in ";
    private String errorLog;
    private Map<String,String> queueForDisplayMap = new Hashtable<String,String>();

    public EndpointTracking(){
        queueForDisplayMap.put(QueueName.XML_QUEUE.toTextValue()," xml queue ");
        queueForDisplayMap.put(QueueName.XML_VALIDATION.toTextValue(),"xml validation process");
        queueForDisplayMap.put(QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue(),"xml split and wrap process");
        queueForDisplayMap.put(QueueName.ERROR_QUEUE.toTextValue()," error queue");
        queueForDisplayMap.put(QueueName.CRITICAL_ERROR.toTextValue(),"critical error queue");
        queueForDisplayMap.put(QueueName.IDENTICAL_AD_QUEUE.toTextValue(),"identical ad queue");
        queueForDisplayMap.put(QueueName.FTP_QUEUE.toTextValue(),"ftp folder");
        queueForDisplayMap.put(QueueName.ZIP_QUEUE.toTextValue(),"zip handler process");
        queueForDisplayMap.put(QueueName.PERSIST_QUEUE.toTextValue(),"persist queue");
        queueForDisplayMap.put(QueueName.RECEIPT_QUEUE.toTextValue(),"receipt queue");
        queueForDisplayMap.put(QueueName.IMPROVE_AD_EMAIL_QUEUE.toTextValue(),"improve ad email queue");
        queueForDisplayMap.put(QueueName.MEDIA_HANDLING.toTextValue(),"media handling process");
        queueForDisplayMap.put(QueueName.MEDIA_MISSING.toTextValue(),"media missing queue");
        queueForDisplayMap.put(QueueName.MEDIA_COPY.toTextValue(),"media copy process");
        queueForDisplayMap.put(QueueName.TRANSFORMATION_QUEUE.toTextValue(),"transformation queue");
    }

    private String getDisplayName(String queueName){
        String display = queueForDisplayMap.get(queueName);
        if(display!=null){
            return display;
        }else{
            return queueName;
        }
    }

    private void tracking(Exchange exchange,String fromEndPoint,String toEndPoint,String errorLog){

        exchange.getIn().setHeader(HeaderName.FROM_END_POINT,fromEndPoint);
        exchange.getIn().setHeader(HeaderName.TO_END_POINT,toEndPoint);

        String newErrorLog = errorLog +" (from " +getDisplayName(fromEndPoint) + " to "+getDisplayName(toEndPoint) +")";

        if(!errorLog.equals("")){
            log.warn(newErrorLog);
        }

        exchange.getIn().setHeader("ERROR_LOG",errorLog);

    }

    public void onCriticalErrorInFTPToXML(Exchange exchange){
        errorLog = CRITICAL_ERROR_MESSAGE + exchange.getIn().getHeader(HeaderName.FILE_NAME).toString();
        tracking(exchange,QueueName.FTP_QUEUE.toTextValue(),QueueName.XML_QUEUE.toTextValue(),errorLog);
    }

    public void onCriticalErrorInXMLToIndentical(Exchange exchange){
        errorLog = CRITICAL_ERROR_MESSAGE + exchange.getIn().getHeader(HeaderName.FILE_NAME).toString();

        tracking(exchange,QueueName.XML_QUEUE.toTextValue(),QueueName.IDENTICAL_AD_QUEUE.toTextValue(),errorLog);
    }

    public void onCriticalErrorInMediaHandling(Exchange exchange){
        errorLog = CRITICAL_ERROR_MESSAGE + exchange.getIn().getHeader(HeaderName.FILE_NAME).toString();
        tracking(exchange,QueueName.MEDIA_HANDLING.toTextValue(),QueueName.TRANSFORMATION_QUEUE.toTextValue(),errorLog);
    }

    public void onCriticalErrorInTransformRoute(Exchange exchange){
        errorLog = CRITICAL_ERROR_MESSAGE + exchange.getIn().getHeader(HeaderName.FILE_NAME).toString();
        tracking(exchange,QueueName.TRANSFORMATION_QUEUE.toTextValue(),QueueName.PERSIST_QUEUE.toTextValue(),errorLog);
    }

    public void onZipException(Exchange exchange){
        errorLog = "Has a problem when try to unzip "+ exchange.getIn().getHeader(HeaderName.FILE_NAME).toString();
        tracking(exchange,QueueName.FTP_QUEUE.toTextValue(),QueueName.ZIP_QUEUE.toTextValue(),errorLog);
    }

    public void onInvalidXMLException(Exchange exchange){
        errorLog = exchange.getIn().getHeader(HeaderName.FILE_NAME).toString() +" is not a valid xml file";
        tracking(exchange,QueueName.FTP_QUEUE.toTextValue(),QueueName.XML_QUEUE.toTextValue(),errorLog);
    }

    public void onUnknownFileTypeException(Exchange exchange){
        errorLog = exchange.getIn().getHeader(HeaderName.FILE_TYPE).toString() +" is not support";
        tracking(exchange,QueueName.FTP_QUEUE.toTextValue(),QueueName.XML_QUEUE.toTextValue(),errorLog);
    }

    // just for track the message be put to validation process.
    public void onValidateXML(Exchange exchange){
        errorLog = "";
        log.debug("put the file for validation");
        tracking(exchange,QueueName.XML_QUEUE.toTextValue(),QueueName.XML_VALIDATION.toTextValue(),errorLog);
    }

    public void onValidateXMLException(Exchange exchange){
        errorLog = "has a problem when try to validate this file.";
        tracking(exchange,QueueName.XML_QUEUE.toTextValue(),QueueName.XML_VALIDATION.toTextValue(),errorLog);
    }

    public void onNotFoundClientIdInIdenticalException(Exchange exchange){
        errorLog = "can not map this client id in xml with partner map table";
        tracking(exchange,QueueName.XML_QUEUE.toTextValue(),QueueName.XML_VALIDATION.toTextValue(),errorLog);
    }

    public void onAdSplitAndWrapException(Exchange exchange){
        errorLog = "has a problem when try to split the ad from xml";
        tracking(exchange,QueueName.XML_QUEUE.toTextValue(),QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue(),errorLog);
    }

    public void onAdValidateException(Exchange exchange){
        errorLog = "has a problem when try to transform message to the zett ad object.";
        tracking(exchange,QueueName.PERSIST_QUEUE.toTextValue(),QueueName.PERSIST_QUEUE.toTextValue(),errorLog);
    }

    public void onAdPersistTransportException(Exchange exchange){
        errorLog = "has a problem when try to transform the ad";
        tracking(exchange,QueueName.PERSIST_QUEUE.toTextValue(),QueueName.PERSIST_QUEUE.toTextValue(),errorLog);
    }
}
