package com.abctech.transition.webapp.manager.camel.bean;

import com.abctech.transition.core.TransitionProperties;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;

public class SologstrandHouseId {

    @Autowired
    private TransitionProperties property;

    public String  handleHouseIds(String xml) throws ParserConfigurationException, IOException, SAXException {
        // get house id from xml string and add it to arraylist
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource( new StringReader(xml) );
        Document doc = builder.parse(is);
        NodeList nodes = doc.getElementsByTagName("house-id");
        ArrayList<String> houseIdList = new ArrayList<String>();
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            houseIdList.add(element.getTextContent().trim());
        }
        Collections.sort(houseIdList);
        ArrayList<String> urlList = new ArrayList<String>();
        int adnum = property.getRSSFetchSologstrandAdNum();
        int countHouseId = houseIdList.size();
        int start = 0;
        int end = 0;
        int round = countHouseId / adnum;
        if(countHouseId % adnum>0) {
            round++;
        }
        for(int i=1;i<=round;i++) {
            if(i==round) {
                end = countHouseId-1;
            } else {
                end = (adnum*i)-1;
            }
            urlList.add(property.getRSSFetchSologstrandXmlUrl(houseIdList.get(start), houseIdList.get(end)));
            start = i*adnum;
        }
        return StringUtils.join(urlList.toArray(), ",");
    }

}
