package com.abctech.transition.core.jms;

import com.abctech.transition.core.dao.search.AdInformationBean;
import com.abctech.transition.core.dao.search.FileInformationBean;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;

@Service
public class JmsMessageManager {

    private String queueName = "queue.error";
    //private static final Logger log = LoggerFactory.getLogger(JmsMessageManager.class);

    @Autowired
    @Qualifier(value = "jmsDao")
    private JmsDao jmsDao;

    private MessageHolder getMessageHolderFromJmsId(String jmsId)throws JmsMessageTypeNotSupportException,JMSException{
       return jmsDao.read(queueName, jmsId);
    }

    public AdInformationBean getMessageInformation(AdInformationBean adInformationBean)throws JmsMessageTypeNotSupportException,JMSException{
            MessageHolder messageHolder = getMessageHolderFromJmsId(adInformationBean.getError().getJmsmessageid());
            if(messageHolder != null){
                adInformationBean.setJmsId(messageHolder.getMessageId());
                adInformationBean.setErrorMessage(adInformationBean.getError().getErrorMessage());
                adInformationBean.setXmlFileLocation(messageHolder.getXmlFileLocation());
                adInformationBean.setIncomingTime(messageHolder.getIncomingTime());
                if(messageHolder.getPayload() instanceof String){
                    adInformationBean.setXml(((String) messageHolder.getPayload()).trim());
                    adInformationBean.setValidationErrorMessage(messageHolder.getValidationErrorMessage());
                }else{
                    adInformationBean.setXml("this content is not string .... (" + messageHolder.getMessageType() + ")");
                }

            }else{
                adInformationBean.setJmsId("-");
                adInformationBean.setErrorMessage("-");
                adInformationBean.setXml("-");
                adInformationBean.setValidationErrorMessage("-");
                adInformationBean.setXmlFileLocation("-");
            }

        return adInformationBean;
    }

    public FileInformationBean getMessageInformation(FileInformationBean fileInformationBean)throws JmsMessageTypeNotSupportException,JMSException{
        MessageHolder messageHolder = getMessageHolderFromJmsId(fileInformationBean.getError().getJmsmessageid());
        if(messageHolder != null){
            fileInformationBean.setJmsId(messageHolder.getMessageId());
            fileInformationBean.setErrorMessage(StringEscapeUtils.escapeHtml(fileInformationBean.getError().getErrorMessage()));
            fileInformationBean.setXmlFileLocation(messageHolder.getXmlFileLocation());
            fileInformationBean.setIncomingTime(messageHolder.getIncomingTime());
            fileInformationBean.setFileName(messageHolder.getFileName());
            fileInformationBean.setFileType(messageHolder.getFileType());
            if(messageHolder.getPayload() instanceof String){
                fileInformationBean.setXml(((String) messageHolder.getPayload()).trim());
                fileInformationBean.setValidationErrorMessage(messageHolder.getValidationErrorMessage());
            }
        }else{
            fileInformationBean.setJmsId("-");
            fileInformationBean.setFileName("-");
            fileInformationBean.setErrorMessage("-");
            fileInformationBean.setXml("-");
            fileInformationBean.setValidationErrorMessage("-");
            fileInformationBean.setXmlFileLocation("-");
        }

        return fileInformationBean;
    }

}
