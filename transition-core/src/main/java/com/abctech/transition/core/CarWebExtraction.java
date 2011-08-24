package com.abctech.transition.core;

import com.abctech.transition.core.bean.ContactBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class CarWebExtraction extends XMLExtraction {
    private static final Logger log = LoggerFactory.getLogger(CarWebExtraction.class);

    public Map<String, ContactBean> extractContactsFromXml(Document document) {
        NodeList nodeLst = document.getElementsByTagName("Kontaktpunkt");
        int contactCount = nodeLst.getLength();
        log.debug("Number of Contact = " + contactCount);
        Map<String, ContactBean> contactsMap = new HashMap<String, ContactBean>();
        // TODO CR Erlend 08042011 Better to do for ( Node fstNode : nodeLst
        for (int i = 0; i < contactCount; i++) {
            Node fstNode = nodeLst.item(i);
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                Element contactElement = (Element) fstNode;

                //extraction id
                String id = contactElement.getAttribute("id");

                //extraction Contact value
                String navn = extractTagValueFrom(contactElement, "Navn");
                String telefon = extractTagValueFrom(contactElement, "Telefon");
                String mobil = extractTagValueFrom(contactElement, "Mobil");
                String email = extractTagValueFrom(contactElement, "Email");
                String beskrivelse = extractTagValueFrom(contactElement, "Beskrivelse");
                String javascript = extractTagValueFrom(contactElement, "Javascript");

                //give contact to HashMap
                ContactBean cb = new ContactBean();
                cb.setNavn(navn);
                cb.setTelefon(telefon);
                cb.setMobil(mobil);
                cb.setEmail(email);
                cb.setBeskrivelse(beskrivelse);
                cb.setJavascript(javascript);
                contactsMap.put(id, cb);
            }
        }
        return contactsMap;
    }

}
