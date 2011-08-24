package com.abctech.transition.core.dao.utility.novasol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PriceManager {
    private static final Logger log = LoggerFactory.getLogger(PictureManager.class);

    private Map<String, PriceModel> priceModelMap = new HashMap<String, PriceModel>();
    private String lastUpdate;

    public void parseXML(String filePath) {
        priceModelMap = new HashMap<String, PriceModel>();

        Document doc = NovasolUtility.documentBuilder(filePath);
            //log.debug("Root element " + doc.getDocumentElement().getNodeName());
            //get last update
            NodeList nodeLst = doc.getElementsByTagName("LastUpdate");
            lastUpdate = nodeLst.item(0).getTextContent();
            //log.debug("====>last update " + lastUpdate);

            nodeLst = doc.getElementsByTagName("PropertySeasonPrice");
            for (int s = 0; s < nodeLst.getLength(); s++) {
                PriceModel priceModel = new PriceModel();
                //log.debug("===================================");
                Node nNode = nodeLst.item(s);
                Element eElement = (Element) nNode;
                String propertyNumber = getTagValue("PropertyNumber", eElement);
                //log.debug("propertyNumber====> " + propertyNumber);
                priceModel.setPropertyNumber(propertyNumber);

                String season = getTagValue("Season", eElement);
                //log.debug("Season====> " + season);
                priceModel.setSeason(Integer.parseInt(season));

                List<PriceDetailModel> priceList = new ArrayList<PriceDetailModel>();
                //loop for priceList
                //NodeList priceNodeList = eElement.getElementsByTagName("SeasonPriceList").item(0).getChildNodes();
                for (int j = 0; j < eElement.getElementsByTagName("SeasonPrice").getLength(); j++) {
                    NodeList seasonPriceNode = eElement.getElementsByTagName("SeasonPrice").item(j).getChildNodes();
                    String seasonCode =  seasonPriceNode.item(0).getTextContent();
                    String seasonStartDate = seasonPriceNode.item(1).getTextContent();
                    String seasonEndDate = seasonPriceNode.item(2).getTextContent();
                    String price = seasonPriceNode.item(3).getTextContent();
                    PriceDetailModel priceDetailModel = new PriceDetailModel();
                    priceDetailModel.setSeasonCode(seasonCode);

                    String newDate = seasonStartDate.substring(0,4) + "." + seasonStartDate.substring(4,6) + "." + seasonStartDate.substring(6,8);
                    priceDetailModel.setSeasonStartDate(newDate);

                    newDate = seasonEndDate.substring(0,4) + "." + seasonEndDate.substring(4,6) + "." + seasonEndDate.substring(6,8);
                    priceDetailModel.setSeasonEndDate(newDate);
                    priceDetailModel.setPrice(price);
                    priceList.add(priceDetailModel);
                    //log.debug("Price >> SeasonCode = " + seasonCode + ", StartDate = " + seasonStartDate + ", EndDate = "+ seasonEndDate + ", Price = " + price);
                }
                priceModel.setPriceList(priceList);
                priceModelMap.put(propertyNumber, priceModel);

            }//end for

    }

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue == null) {
            return null;
        }
        return nValue.getNodeValue();
    }

    public PriceModel lookupPropertyNumber(String propertyNumber) {
        PriceModel result = null;
        try {
            result = priceModelMap.get(propertyNumber);
        } catch (Exception ex) {
            log.error("Can not get PropertyNumber by : " + propertyNumber, ex);
            result = null;
        }
        return result;
    }

    public Integer findPriceMap() {
        return priceModelMap.size();
    }

    public void clearHashMap() {
        priceModelMap.clear();
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

}
