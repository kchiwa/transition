package com.abctech.transition.webapp.manager.camel.bean;

import com.abctech.transition.core.dao.utility.novasol.PictureManager;
import com.abctech.transition.core.dao.utility.novasol.PriceManager;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class NovasolDowloadComponent {

    @Autowired
    private NovasolDownloadService novasolDownloadService;


    @Autowired
    private PictureManager pictureManager;

    @Autowired
    private PriceManager priceManager;

    //private static final int MAX_LENGTH = 8192;

    public boolean handleDownloadAllFile(Exchange exchange) {
        String host = "http://partner.novasol.com/web/search.nsf/xml2?openagent";
        String propertyRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLproperties><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLproperties>";
        String pictureRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLpropertyDescription><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLpropertyDescription>";
        String priceRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLseasonPrices><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLseasonPrices>";


        //should be clear the old picture and price HashMap
        pictureManager.clearHashMap();
        priceManager.clearHashMap();
        //for testing
        host = "http://localhost:9032/mockland/xml/transition/novasol/";
        propertyRequest = "property-small-badday.zip";
        pictureRequest = "picture-small.zip";
        priceRequest = "price-small.zip";
        String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME).toString();
        return novasolDownloadService.downloadAllFiles(host, propertyRequest, pictureRequest, priceRequest, clientName);
    }


}
