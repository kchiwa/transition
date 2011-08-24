package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.utility.FileOperator;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncomingFTPCarweb {
    private static final String FILE_TYPE = "FILE_TYPE";
    private Logger log = LoggerFactory.getLogger(IncomingFTPCarweb.class);


    public byte[] testInputFile(Exchange exchange,@Body byte[] msg) {
            exchange.getIn().setHeader("JMSCorrelationID",exchange.getIn().getMessageId());

            //get file type that be set from route
            String fileType = exchange.getIn().getHeader(FILE_TYPE).toString();

            boolean imageFile = false;
            if(exchange.getIn().getHeader(FILE_TYPE).equals("jpg") ||
                    exchange.getIn().getHeader(FILE_TYPE).equals("jpeg") ||
                    exchange.getIn().getHeader(FILE_TYPE).equals("png") ||
                    exchange.getIn().getHeader(FILE_TYPE).equals("gif")){
                imageFile = true;
            }

            //Check file type
            if((!imageFile && !exchange.getIn().getHeader(FILE_TYPE).equals("pdf"))){
                FileOperator fileOperator = new FileOperator();
                fileType = fileOperator.checkType(msg);
                exchange.getIn().setHeader(FILE_TYPE,fileType);
            }


            log.debug("file name = "+exchange.getIn().getHeader("FILE_NAME"));
            exchange.getIn().setHeader("FILE_NAME",exchange.getIn().getHeader("FILE_NAME"));

            log.debug("file type = " +fileType);


            log.debug("client name = "+exchange.getFromRouteId());
            exchange.getIn().setHeader("CLIENT_NAME",exchange.getFromRouteId());

            //check file format
            String clientFormat = CustomerFormat.CARWEB.toTextValue();

            exchange.getIn().setHeader("FILE_FORMAT",clientFormat);
            exchange.getIn().setHeader("FORMAT_CHECK","valid");


        return msg;
    }
}
