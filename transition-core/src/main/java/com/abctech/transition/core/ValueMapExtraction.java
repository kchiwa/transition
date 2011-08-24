package com.abctech.transition.core;

import com.abctech.transition.core.bean.TransformPath;
import com.abctech.transition.core.exception.TransitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 */
public final class ValueMapExtraction {
    private static final Logger log = LoggerFactory.getLogger(ValueMapExtraction.class);
    private static ValueMapExtraction instance = new ValueMapExtraction();
    private Map<String,ValueMapBean> allValueMapBean = null;
    private TransformPath valueMapXmlPath;


    private ValueMapExtraction() 
    {
        log.debug("ValueMapExtraction");
        loadValueMapPath();
        try {
        	loadValueMapFile();
        }
        catch (TransitionException e) {
        	log.error("Got error while trying to load the value map",e);
            // TODO CR Erlend 08042011 If this is something we can actually recover from, we need a comment to that effect
        }
    }

    private void loadValueMapFile() throws TransitionException
            // TODO CR Erlend 08042011 We use starting braces on same line
    {
        XMLExtraction xmlExtraction = new XMLExtraction();
        URL url = getClass().getClassLoader().getResource(valueMapXmlPath.getXmlPath());
        File valuemapFile = new File( url.getFile() );
        Document document = xmlExtraction.readXmlFile(valuemapFile);
        allValueMapBean = extractValueMap(document);
    }

    private void loadValueMapPath() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transition-core.xml");
        valueMapXmlPath = context.getBean("valueMapXmlPath", TransformPath.class);
    }

    public Map<String,ValueMapBean> extractValueMap(Document document) {
        NodeList nodeLst = document.getElementsByTagName("map");
        int contactCount = nodeLst.getLength();
        Map<String, ValueMapBean> valueMaps = new HashMap<String, ValueMapBean>();
        //String tmp = "";
        // TODO CR Erlend 08042011 Better to do for ( Node fstNode : nodeLst
        for (int i = 0; i < contactCount; i++) {
            Node fstNode = nodeLst.item(i);
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                Element contactElement = (Element) fstNode;
                String format = contactElement.getAttribute("format");
                String field = contactElement.getAttribute("field");
                String lookup = contactElement.getAttribute("lookup");
                String zettvalue = contactElement.getAttribute("zettvalue");
                ValueMapBean vmb = new ValueMapBean();
                vmb.setFormat(format);
                vmb.setField(field);
                vmb.setLookup(lookup);
                vmb.setZettValue(zettvalue);
                String key = format.toLowerCase() + "_" + field.toLowerCase() + "_" + lookup.toLowerCase();
                //tmp += "jdbcTemplate.execute(\"INSERT INTO valuemap ( format, field, lookup, zettvalue) VALUES ('"+format+"', '"+field+"', '"+lookup+"', '"+zettvalue+"');\");" + "\n";
                valueMaps.put(key, vmb);
            }
        }
        //log.debug(tmp);
        //log.debug("All ValueMap = " + valueMaps);
        return valueMaps;
    }

    public String lookupValue(String format, String field, String lookup) {
        String key = format.toLowerCase() + "_" + field.toLowerCase() + "_" + lookup.toLowerCase();
        if (allValueMapBean.get(key)!= null) {
            return allValueMapBean.get(key).getZettValue();
        }
        return null;
    }

    public static ValueMapExtraction getInstance() {
        return instance;
    }

}
