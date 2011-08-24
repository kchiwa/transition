package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.XMLAdSplitException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.transformation.splitter.XmlAdSplitter;
import org.apache.camel.Body;
import org.apache.camel.Exchange;

import java.util.List;


public class XmlSplitAndWrapQueueManager {
        //private static final Logger LOG = LoggerFactory.getLogger(XmlSplitAndWrapQueueManager.class);
        public List<String> splitAndWrap(@Body String xmlString, Exchange exchange) throws TransitionException {

            String fileFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class);
            
            List<String> splitList = new XmlAdSplitter().doSplit(xmlString, CustomerFormat.fromTextValue(fileFormat));

            int splitListSize = splitList.size();

            if(splitListSize <= 0){
                //the least number of the must more than or equal 1
                throw new XMLAdSplitException("the split size is less than 1");
            }
           return splitList;
        }
}
