package com.abctech.transition.webapp.manager.syncronize;


import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Why the name Syncronize?
@Service
public class FileStateErrorQueueSyncronize {
    private static final Logger log = LoggerFactory.getLogger(FileStateErrorQueueSyncronize.class);

    @Autowired(required = true)
    private QueueManager queueManager;

   // @Autowired
   // private ErrorLogDAO errorLogDAO;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    public int deleteQueueByJmsIds(String activeMQQueue, String[] jmsIds) throws DAOException {
        int result = 0;
        for (String id : jmsIds) {
            Exchange exchange = queueManager.deleteMessageByQueueNameJMSCorrelationId(activeMQQueue, id);
            if (activeMQQueue.equals(QueueName.ERROR_QUEUE.toTextValue()) && exchange != null   ) {
                    Long fileStateId = null;
                    if (exchange.getIn().getHeader(HeaderName.FILE_STATE_ID) != null) {
                        fileStateId = Long.parseLong(exchange.getIn().getHeader(HeaderName.FILE_STATE_ID).toString());
                    }
                    Long adStateId = null;
                    if (exchange.getIn().getHeader(HeaderName.AD_STATE_ID) != null) {
                        adStateId = Long.parseLong(exchange.getIn().getHeader(HeaderName.AD_STATE_ID).toString());
                    }
                    if (fileStateId != null) {
                        fileStateManager.delete(fileStateId);
                        log.debug("Delete FileID : " + fileStateId + ", JmsId : " + id);
                    } else if (adStateId != null) {
                        adStateManager.delete(adStateId);
                        log.debug("Delete AdID : " + adStateId + ", JmsId : " + id);
                    }
            }
           result++;
        }
        return result;
    }

    public int deleteFileByIds(String[] filestateID) throws DAOException {
        int result = 0;
        for (String id : filestateID) {
            FileStateModel fileStateModel = fileStateManager.findById(Long.parseLong(id));
            fileStateManager.delete(Long.parseLong(id));
            if (fileStateModel.getErrorLogModel() != null) {
                String jmsID = fileStateModel.getErrorLogModel().getJmsmessageid();
                queueManager.deleteMessageByQueueNameJMSCorrelationId(QueueName.ERROR_QUEUE.toTextValue(), jmsID);
            }
        }
        return result;
    }

    public void productionFileStateErrorQueueSync() throws DAOException {
        List<Exchange> exchange = queueManager.browseMessageByQueueName(QueueName.ERROR_QUEUE.toTextValue());
        for (Exchange exc : exchange) {
            if (exc.getIn().getHeader(HeaderName.JMS_CORRELATION_ID) != null) {
              String jmsId = exc.getIn().getHeader(HeaderName.JMS_CORRELATION_ID).toString();
               Long fileStateId = null;
                    if (exc.getIn().getHeader(HeaderName.FILE_STATE_ID) != null) {
                        fileStateId = Long.parseLong(exc.getIn().getHeader(HeaderName.FILE_STATE_ID).toString());
                    }
                    if (fileStateId != null) {
                       log.debug("Found FileID : " + fileStateId + ", JmsId : " + jmsId);
                       if(fileStateManager.findById(fileStateId) == null ) {
                           log.debug("No fileState id : " + fileStateId+ "  in DB, must be delete Error Queue JmsID : " + jmsId);
                           queueManager.deleteMessageByQueueNameJMSCorrelationId(QueueName.ERROR_QUEUE.toTextValue(), jmsId);
                       }
                    }
            }
        }
    }

}
