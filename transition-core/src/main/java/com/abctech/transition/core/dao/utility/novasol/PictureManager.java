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
public class PictureManager {
    private static final Logger log = LoggerFactory.getLogger(PictureManager.class);

    private Map<String, PictureModel> pictureModelMap = new HashMap<String, PictureModel>();
    private String lastUpdate;

    public void parseXML(String filePath) {
        pictureModelMap = new HashMap<String, PictureModel>();

        Document doc = NovasolUtility.documentBuilder(filePath);
        log.debug("Root element " + doc.getDocumentElement().getNodeName());

        //get last update
        NodeList nodeLst = doc.getElementsByTagName("LastUpdate");
        lastUpdate = nodeLst.item(0).getTextContent();

        nodeLst = doc.getElementsByTagName("PropertyInformation");
        for (int s = 0; s < nodeLst.getLength(); s++) {
            PictureModel pictureModel = new PictureModel();
            //log.debug("===================================");
            Node nNode = nodeLst.item(s);
            Element eElement = (Element) nNode;
            String propertyNumber = getTagValue("PropertyNumber", eElement);
            //log.debug("propertyNumber====> " + propertyNumber);
            pictureModel.setPropertyNumber(propertyNumber);

            String season = getTagValue("Season", eElement);
            //log.debug("Season====> " + season);
            pictureModel.setSeason(Integer.parseInt(season));

            String description = getTagValue("Description", eElement);
            //log.debug("description====> " + description + " ===> " + getTagValue("PropertyNumber", eElement));
            pictureModel.setDescription(description);

            String notice = getTagValue("Notice", eElement);
            //log.debug("notice====> " + notice);
            pictureModel.setNotice(notice);

            String header = getTagValue("Header", eElement);
            //log.debug("header====> " + header);
            pictureModel.setHeader(header);

            String ownerInformation = getTagValue("OwnerInformation", eElement);
            //log.debug("ownerInformation====> " + ownerInformation);
            pictureModel.setOwnerInformation(ownerInformation);

            String descriptionAlt = getTagValue("DescriptionAlt", eElement);
            //log.debug("descriptionAlt====> " + descriptionAlt);
            pictureModel.setDescriptionAlt(descriptionAlt);

            //get all picture
            NodeList pictureNodeList = eElement.getElementsByTagName("PictureList").item(0).getChildNodes();
            if (pictureNodeList != null) {
                List<PictureDetailModel> pictureDetailModelList = new ArrayList<PictureDetailModel>();
                for (int i = 0; i < pictureNodeList.getLength(); i++) {
                    String pictureName = pictureNodeList.item(i).getTextContent();
                    if (pictureName.length() > 1) {  //A bit confusing with this case, it's alway return the empty string

                        PictureDetailModel pictureDetailModel = new PictureDetailModel();

                        //log.debug("pictureName ===>>>> " + pictureName);
                        pictureDetailModel.setPictureName(pictureName);

                        String type = pictureNodeList.item(i).getAttributes().getNamedItem("type").getTextContent();
                        pictureDetailModel.setType(type);
                        //log.debug("type ===> " + type);

                        // type="W" theme="" domain="http://sdc.novasol.com" path="/pic/abu/" modified="2010-06-23T12:47:35"
                        String theme = pictureNodeList.item(i).getAttributes().getNamedItem("theme").getTextContent();
                        pictureDetailModel.setTheme(theme);
                        //log.debug("theme ===> " + theme);

                        String domain = pictureNodeList.item(i).getAttributes().getNamedItem("domain").getTextContent();
                        pictureDetailModel.setDomain(domain);
                        //log.debug("domain ===> " + domain);

                        String path = pictureNodeList.item(i).getAttributes().getNamedItem("path").getTextContent();
                        pictureDetailModel.setPath(path);
                        //log.debug("path===> " + path);

                        String modified = pictureNodeList.item(i).getAttributes().getNamedItem("modified").getTextContent();
                        pictureDetailModel.setModified(modified);
                        //log.debug("modified ===> " + modified);

                        pictureDetailModelList.add(pictureDetailModel);
                    }
                }//end for
                pictureModel.setPictureDetailModelList(pictureDetailModelList);
                pictureModelMap.put(propertyNumber, pictureModel);
            }
        }

    }

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue == null) {
            return null;
        }
        return nValue.getNodeValue();
    }

    public PictureModel lookupPropertyNumber(String propertyNumber) {
        PictureModel result = null;
        try {
            result = pictureModelMap.get(propertyNumber);
        } catch (Exception ex) {
            log.error("Can not get PropertyNumber by : " + propertyNumber);
            result = null;
        }
        return result;
    }


    public Integer findPictureMap() {
        return pictureModelMap.size();
    }

    public void clearHashMap() {
        pictureModelMap.clear();
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
