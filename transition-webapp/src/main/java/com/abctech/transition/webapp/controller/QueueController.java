package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.Converter;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import com.abctech.transition.webapp.form.AdFileSearch;
import com.abctech.transition.webapp.manager.syncronize.FileStateErrorQueueSyncronize;
import com.abctech.transition.webapp.model.QueueListModel;
import org.apache.camel.Exchange;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
public class QueueController {
    private static final int SEVEN = 7;
    private static final String FILE_STATUS_LIST = "fileStatusList";
    private static final String CUSTOMER_FORMAT_LIST = "customerFormatList";
    //private static final String AD_STATUS_LIST = "adStatusList";
    //private static Logger log = LoggerFactory.getLogger(QueueController.class);
    private static final Logger log = LoggerFactory.getLogger(QueueController.class);
    private static final String QUEUE_SIZE = "queueSize";
    private static final String DASH_STRING = "-";

    @Autowired(required = true)
    private QueueManager queueManager;

    @Autowired
    private FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize;

    @ModelAttribute("searchMessage")
    public AdFileSearch createMessage() {
        return new AdFileSearch();
    }

    @RequestMapping("/export_error.html")
    public void adminExportErrorQueue(Model model,
                                      @ModelAttribute("searchMessage") AdFileSearch adFileSearch,
                                      @RequestParam(value = "queueName", required = true) String activeMQQueue,
                                      HttpServletResponse response) throws IOException {
        // queueManager.browseMessageByQueueNameJMSCorrelationId(StringUtils.capitalize(activeMQQueue.substring(activeMQQueue.lastIndexOf(':') + SEVEN).replace('.', ' ')),)
        // FileInformationBean fileInformationBean = searchManager.findFileStateDataModelById(Long.parseLong(fileID));
        List<Exchange> exchangeList = queueManager.browseMessageByQueueName(activeMQQueue);
        log.debug("Queue : " + activeMQQueue);
        List<QueueListModel> queueListModels = getQueueListModel(exchangeList, adFileSearch);
        response.setContentType("text/csv; charset=utf-8");
        String disposition = "attachment; fileName=error_queue.csv";
        response.setHeader("Content-Disposition", disposition);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("Client Name|Client ID|Client Ref|Format|File|Timestamp|Error Message ");
        for (QueueListModel list : queueListModels) {
            String clientFormat = list.getFormat();
            String clientId = list.getClientId();
            String clientName = list.getClientName();
            String clientRef = list.getClientRef();
            String fileName = list.getFileName();
            String incomingTime = list.getIncomingTime();


            String errorMessage = "" + list.getErrorMessage();
            if (errorMessage.equals("null")) {
                errorMessage = "java.lang.NullPointerException";
            }

            if (list.getErrorDetail() != null && !list.getErrorDetail().equals("")) {
                errorMessage += " [Detail :  " + list.getErrorDetail() + " ]";
            }

            errorMessage = errorMessage.replaceAll("<(.*?)*>", "");
            errorMessage = errorMessage.replaceAll("\n", "");
            errorMessage = errorMessage.replaceAll("\\|", ", ");
            response.getWriter().println(clientName + "|" + clientId + "|" + clientRef + "|" + clientFormat + "|" + fileName + "|" + incomingTime + "|" + errorMessage);
        }
        response.getWriter().flush();
    }


    @RequestMapping("/queue_list.html")
    public String adminAdInfoPage(Model model,
                                  @ModelAttribute("searchMessage") AdFileSearch adFileSearch,
                                  @RequestParam(value = "queueName", required = true) String activeMQQueue,
                                  @RequestParam(value = "jmsId", required = false) String jmsId,
                                  @RequestParam(value = "jmsIds", required = false) String[] jmsIds) throws DAOException {
        //delete multiple message
        List<Exchange> exchangeList = null;
        if (queueManager != null) {
            if (jmsIds != null) {
                   fileStateErrorQueueSyncronize.deleteQueueByJmsIds(activeMQQueue, jmsIds);
            }
            exchangeList = queueManager.browseMessageByQueueName(activeMQQueue);
        }

        model.addAttribute("queueName", StringUtils.capitalize(activeMQQueue.substring(activeMQQueue.lastIndexOf(':') + SEVEN).replace('.', ' ')));
        String[] tmpQueueName = activeMQQueue.split(",");
        String queueName = activeMQQueue;
        if (tmpQueueName.length > 1) {
            queueName = tmpQueueName[0];
        }
        model.addAttribute("queueNameFull", queueName);
        if (exchangeList == null) {
            model.addAttribute(QUEUE_SIZE, 0);
            model.addAttribute("queueListModels", null);
            return "admin_queue_detail";
        }
        model.addAttribute(QUEUE_SIZE, exchangeList.size());
        List<QueueListModel> queueListModels = getQueueListModel(exchangeList, adFileSearch);
        if (queueListModels == null) {
            model.addAttribute("searchError", "ZclientID can only be number");
            model.addAttribute(QUEUE_SIZE, 0);
            return "admin_queue_detail";
        }
        //CamelBeanHelper.dumpCamelHeaders(exchangeList.get(0));
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute(FILE_STATUS_LIST, ControllerUtil.getFileStateStatusList());

        //reverse order list
        Collections.reverse(queueListModels);

        model.addAttribute("queueListModels", queueListModels);
        model.addAttribute(QUEUE_SIZE, queueListModels.size());
        return "admin_queue_detail";
    }

    private String valueChecking(Exchange exchange,String headerName){
        if(exchange.getIn().getHeader(headerName,String.class)!=null){
            if(!exchange.getIn().getHeader(headerName,String.class).trim().equals("")){
                return exchange.getIn().getHeader(headerName,String.class);
            }
            return DASH_STRING;
        }else{
            return DASH_STRING;
        }
    }


    private List<QueueListModel> getQueueListModel(List<Exchange> exchangeList, AdFileSearch adFileSearch) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        List<QueueListModel> queueListModels = new ArrayList<QueueListModel>();
        for (Exchange exchange : exchangeList) {

            //======================================//
            String incomingTime = new DateTime(exchange.getIn().getHeader(HeaderName.INCOMING_TIME)).toString(formatter);
            QueueListModel list = new QueueListModel();
            list.setIncomingTime(incomingTime);
            list.setJmsId(exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID, String.class));

            //checking value;
            list.setFormat(valueChecking(exchange,HeaderName.CLIENT_FORMAT));
            list.setClientId(valueChecking(exchange,HeaderName.CLIENT_ID));
            list.setClientName(valueChecking(exchange,HeaderName.CLIENT_NAME));
            list.setClientRef(valueChecking(exchange,HeaderName.CLIENT_REF));

            list.setFileName(exchange.getIn().getHeader("CamelFileName", String.class));
            list.setFileStateId(exchange.getIn().getHeader(HeaderName.FILE_STATE_ID, String.class));
            list.setErrorMessage(exchange.getIn().getHeader(HeaderName.ERROR_MESSAGE, String.class));
            list.setErrorDetail(exchange.getIn().getHeader(HeaderName.ERROR_MESSAGE_TEXT, String.class));

            //CamelBeanHelper.dumpCamelHeaders(exchange);
            //======================================//
            long incoming = Long.parseLong(exchange.getIn().getHeader(HeaderName.INCOMING_TIME).toString());
            String fromDate = adFileSearch.getSearchFromDate();
            String toDate = adFileSearch.getSearchToDate();

            long startDate = 0L;
            long endDate = 0L;
            if (fromDate != null && fromDate.length() > 0) {
                startDate = Converter.getFromDate(fromDate);
                if (toDate != null && toDate.length() > 0) {
                    endDate = Converter.getToDate(toDate);
                } else {
                    endDate = Converter.getToDate(fromDate);
                }
            }

            if (startDate > 0L) {
                if (incoming >= startDate && incoming <= endDate) {
                    queueListModels.add(list);
                }
            } else {
                queueListModels.add(list);
            }

            String customerFormat = adFileSearch.getSearchFormat();
            queueListModels = filterCustermerFormat(queueListModels, customerFormat);


            String clientName = adFileSearch.getSearchClientName();
            queueListModels = filterCustermerClientName(queueListModels, clientName);

            String fileName = adFileSearch.getSearchFileName();
            queueListModels = filterFileName(queueListModels, fileName);

            String clientId = adFileSearch.getSearchClientId();
            if (clientId != null && clientId.length() > 0) {
                try {
                    Long.parseLong(clientId);
                    queueListModels = filterClientId(queueListModels, clientId);
                } catch (NumberFormatException e) {
                    //log.debug("searchError", "ZclientID can only be number");

                    return null;
                }
            }

            String clientRef = adFileSearch.getSearchClientRef();
            queueListModels = filterClientRef(queueListModels, clientRef);

        }

        return queueListModels;
    }


    private List<QueueListModel> filterCustermerFormat(List<QueueListModel> queueListModels, String customerFormat) {
        List<QueueListModel> queueListModelList = new ArrayList<QueueListModel>();
        if (customerFormat != null && customerFormat.length() > 0) {
            for (QueueListModel list : queueListModels) {
                if (customerFormat.equals(list.getFormat())) {
                    queueListModelList.add(list);
                }
            }
        } else {
            return queueListModels;
        }
        return queueListModelList;
    }

    private List<QueueListModel> filterCustermerClientName(List<QueueListModel> queueListModels, String clientName) {
        List<QueueListModel> queueListModelList = new ArrayList<QueueListModel>();
        if (clientName != null && clientName.length() > 0) {
            for (QueueListModel list : queueListModels) {
                if (clientName.equals(list.getClientName())) {
                    queueListModelList.add(list);
                }
            }
        } else {
            return queueListModels;
        }
        return queueListModelList;
    }

    private List<QueueListModel> filterFileName(List<QueueListModel> queueListModels, String fileName) {
        List<QueueListModel> queueListModelList = new ArrayList<QueueListModel>();
        if (fileName != null && fileName.length() > 0) {
            for (QueueListModel list : queueListModels) {
                if (list.getFileName().indexOf(fileName) > -1) {
                    queueListModelList.add(list);
                }
            }
        } else {
            return queueListModels;
        }
        return queueListModelList;
    }

    private List<QueueListModel> filterClientId(List<QueueListModel> queueListModels, String clientId) {
        List<QueueListModel> queueListModelList = new ArrayList<QueueListModel>();
        for (QueueListModel list : queueListModels) {
            if (clientId.equals(list.getClientId())) {
                queueListModelList.add(list);
            }
        }
        return queueListModelList;
    }

    private List<QueueListModel> filterClientRef(List<QueueListModel> queueListModels, String clientRef) {
        List<QueueListModel> queueListModelList = new ArrayList<QueueListModel>();
        if (clientRef != null && clientRef.length() > 0) {
            for (QueueListModel list : queueListModels) {
                if (clientRef.equals(list.getClientRef())) {
                    queueListModelList.add(list);
                }
            }
        } else {
            return queueListModels;
        }
        return queueListModelList;
    }

}
