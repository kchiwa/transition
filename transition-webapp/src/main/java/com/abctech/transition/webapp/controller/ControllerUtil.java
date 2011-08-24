package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-16
 */
public final class ControllerUtil {
    private static Logger log = LoggerFactory.getLogger(ControllerUtil.class);
    private ControllerUtil(){}

   /**
     * Utility methof for putting logging string into block for better viewing.
     * @param log a string log to put in block
     * @return string in a block
     */
    public static String putLogInBlock(String log) {
        return ("\n------------------------------------------------------------------------\n" +
                "\t" + log + "\n" +
                "------------------------------------------------------------------------\n");
    }

    /**
     * Utility class for getting http request information headers
     * @param request http request to get information
     * @return http request information
     */
     public static String getHttpServletHeaderDetails(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        Enumeration e = request.getHeaderNames();
        sb.append("\n------------------------------------------------------------------------\n");
        while (e.hasMoreElements()) {
            String header = e.nextElement().toString();
            sb.append(header).append(" :: ").append(request.getHeader(header)).append("\n");
        }
        sb.append("------------------------------------------------------------------------\n");
        return sb.toString();
    }

    /**
     * Utility class for getting CustomerFormat list from enum class
     * @return A String list of CustomerFormat
     */
     public static  List<String> getCustomerFormatList() {
        log.debug("Retrieving system's customer format...");
        List<String> customerFormatList = new ArrayList<String>();
        for (CustomerFormat customerFormat : CustomerFormat.values()) {
            if (!customerFormat.toTextValue().equalsIgnoreCase(CustomerFormat.UNSUPPORTED.toTextValue())) {
                customerFormatList.add(customerFormat.toTextValue());
            }
        }
        log.debug("Done retrieving system's customer format. Found " + customerFormatList.size() + " format(s).");
        return customerFormatList;
    }

    /**
     * A utility class for getting Protocol list from enum class
     * @return A string list of Protocol
     */
     public static  List<String> getProtocolList() {
        log.debug("Retrieving system's protocol list...");
        List<String> protocolList = new ArrayList<String>();
        for (Protocol protocol : Protocol.values()) {
            protocolList.add(protocol.toTextValue());
        }
        log.debug("Done retrieving system's protocol list. Found " + protocolList.size() + " protocol(s).");
        return protocolList;
    }

    /**
     * A utility class for getting AdStateStatus list from enum class
     * @return A string list of AdStateStatus
     */
     public static List<String> getAdStateStatusList() {
        log.debug("Retrieving system's AdStateStatus...");
        List<String> adStatusList = new ArrayList<String>();
        for (AdStateStatus adStateStatus : AdStateStatus.values()) {
            adStatusList.add(adStateStatus.toTextValue());
        }
        log.debug("Done retrieving system's AdStateStatus. Found " + adStatusList.size() + " status.");
        return adStatusList;
    }

    /**
     * A utility class for getting FileStateStatus list from enum class
     * @return A string list of FileStateStatus
     */
     public static List<String> getFileStateStatusList() {
        log.debug("Retrieving system's FileStateStatus...");
        List<String> fileStatusList = new ArrayList<String>();
        for (FileStateStatus fileStateStatus : FileStateStatus.values()) {
            fileStatusList.add(fileStateStatus.toTextValue());
        }
        log.debug("Done retrieving system's FileStateStatus. Found " + fileStatusList.size() + " status.");
        return fileStatusList;
    }
}
