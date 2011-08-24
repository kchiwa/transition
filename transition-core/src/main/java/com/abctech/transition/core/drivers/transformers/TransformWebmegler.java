package com.abctech.transition.core.drivers.transformers;


import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebmeglerDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.webmegler.EiendommerDocument;
import com.abctech.transition.xmladbeans.webmegler.EneiendomDocument;
import com.abctech.transition.xmladbeans.webmegler.FeltDocument;
import com.abctech.transition.xmladbeans.webmegler.FritekstDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransformWebmegler extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformWebmegler.class);
    private AdObject webmeglerAdObject = new AdObject();
    private EiendommerDocument eiendommerDocument = null;
    private EneiendomDocument.Eneiendom eneiendom = null;
    private static final String ERROR = "ERROR";
    private static final String SYSTEM = CustomerFormat.WEBMEGLER.toTextValue();

    public TransformWebmegler(WebmeglerDriver webmeglerDriver) {
        this.setXmlBeanDriver(webmeglerDriver);
        eiendommerDocument = (EiendommerDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        eneiendom = eiendommerDocument.getEiendommer().getEneiendomArray(0);

    }


    @Override
    protected AdObject mapping() throws DAOException {

        Timestamp currentTimeStamp = new Timestamp(new Date().getTime());

        webmeglerAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        webmeglerAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());

        AdObjectTransactionType adObjectTransactionType = AdObjectTransactionType.fromTextValue(retrieveTypeforTransaction());
        webmeglerAdObject.setTransactionType(adObjectTransactionType);


        webmeglerAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        webmeglerAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        webmeglerAdObject.setCategoryId(getCategoryId(CustomerFormat.WEBMEGLER.toTextValue(), "category", retrieveType()));
        webmeglerAdObject.setCreatedBy(SYSTEM);
        webmeglerAdObject.setCreatedTime(currentTimeStamp);
        webmeglerAdObject.setPublishFromTime(convertStringToDate(retrieveFromDate()));
        webmeglerAdObject.setPublishToTime(convertStringToDate(retrieveToDate()));

        webmeglerAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        webmeglerAdObject.setShortDescription(retrieveStringValue("SAMMENDRAG"));
        webmeglerAdObject.setAddress(retrieveAddress());
        webmeglerAdObject.setExternalReferences(retrieveExternalReferance(getEneiendom()));
        webmeglerAdObject.addContact(retrieveContact());

        //Attribute
        StringBuilder text = new StringBuilder();
        for (FritekstDocument.Fritekst fritekst : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFritekster().getFritekstArray()) {
            String title = null;
            String plainText = null;
            for (FeltDocument.Felt feild : fritekst.getFeltArray()) {
                if (feild.getNavn().equals("overskrift")) {
                    title = feild.getStringValue();
                }
                if (feild.getNavn().equals("tekst")) {
                    plainText = feild.getStringValue();
                }

            }

            text.append("<strong>").append(title).append("</strong>").append("\n<br />").append(plainText).append("\n<br />");
        }
        // CR: Not helpful debug, Remove unnecessary debug.
        log.debug("****************"); 
        log.debug(text.toString());

        AdTransformationUtility.addAdAttribute(webmeglerAdObject, "text", text.toString());



      setAttribute("areadescription", "Bygninger");
      setAttribute("price","prisantydning");
      setAttribute("valueestimate","verditakst");
      setAttribute("loanestimate","laanetakst");
      setAttribute("primaryroomarea" ,"prom");
      setAttribute("availablearea" , "bruksareal");
      setAttribute("grossarea" , "bruttoareal");
      setAttribute("propertytype","tinde_eiendomstype");
      setAttribute("bedrooms","soverom");
      setAttribute("bathrooms","bad");
      setAttribute("buildyear","byggeaar");
      setAttribute("modernizedyear","modernisert");
      setAttribute("cadastralnumber" ,"gaardsnummer");
      setAttribute("holdingnumber" ,"bruksnummer");
      setAttribute("ownership" ,"tinde_eierformbygninger");
      setAttribute("lotownership" ,"tinde_eierformbygninger");
      setAttribute("viewingtime" ,"befaringsdato");
      setAttribute("energy" ,"energimerke_bokstav");
      setAttribute("heating" ,"energimerke_farge");

      List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(),getXmlBeanDriver().getClientRef());
       if(objectMediaList != null && objectMediaList.size() > 0){
           for(ObjectMedia objectMedia : objectMediaList){
               webmeglerAdObject.addMediaElement(objectMedia);
           }
       }

        return webmeglerAdObject;
    }

    private void setAttribute(String attributeName, String keyValue) {
        AdTransformationUtility.addAdAttribute(webmeglerAdObject, attributeName, retrieveStringValueForAttribulte(keyValue));
    }


    public String retriveShortDescString(FritekstDocument.Fritekst fritekst) {
        for (FeltDocument.Felt felt : fritekst.getFeltArray()) {
            if (felt.getNavn().equals("tekst")) {
                return felt.getStringValue();
            }
        }

        return null;
    }


    public String retrieveStringValue(String nameToMatch) {
        for (FritekstDocument.Fritekst fritekst : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFritekster().getFritekstArray()) {
            for (FeltDocument.Felt feild : fritekst.getFeltArray()) {
                if (feild.getNavn().equals("overskrift") && feild.getStringValue().equals(nameToMatch)) {
                    return retriveShortDescString(fritekst);
                }
            }

        }

        return null;
    }


    public String retrieveStringValueForAttribulte(String nameTomach) {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals(nameTomach)) {
                return felt.getStringValue();
            }
        }
        return null;
    }

    private Address retrieveAddress() throws DAOException {
        Address address = new Address();
        address.setPrimaryAddress(retrievePrimaryAddress());
        address.setPostCode(retrievePostCode());
        address.setPostLocation(retrievePostLocation());

        return address;

    }

    private String retrievePrimaryAddress() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("adresse")) {
                return felt.getStringValue();
            }

        }

        return null;
    }

    private String retrievePostCode() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("postnummer")) {
                return felt.getStringValue();
            }
        }

        return null;
    }

    private String retrievePostLocation() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("poststed")) {
                return felt.getStringValue();
            }
        }

        return null;
    }

    private String retrieveFromDate() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("oppdragsdato")) {
                return felt.getStringValue();
            }
        }

        return null;
    }

    private String retrieveToDate() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("utlopsdato")) {
                return felt.getStringValue();
            }
        }

        return null;
    }

    private Contact retrieveContact() {
        Contact contact = new Contact();
        contact.setName(retrieveContactName());
        contact.setEmail(retrieveContactEmail());
        ContactAttribute contactMobile = new ContactAttribute();
        contactMobile.setSection("DEFAULT");
        contactMobile.setType(ContactAttributeType.MOBILE);
        contactMobile.setValue(retrieveContactMobile());
        contact.addAttribute(contactMobile);
        return contact;

    }


    private String retrieveContactName() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("ansatte1_navn")) {
                return felt.getStringValue();
            }
        }

        return null;
    }

    private String retrieveContactEmail() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("ansatte1_email")) {
                return felt.getStringValue();
            }
        }

        return null;
    }


    private String retrieveContactMobile() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("ansatte1_mobiltelefon")) {
                return felt.getStringValue();
            }
        }

        return null;
    }


    private String retrieveType() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("tinde_eiendomstype")) {
                return felt.getStringValue();
            }
        }

        return null;
    }


    private Date convertStringToDate(String dateString) {
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat(("dd.MM.yyyy"));
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            log.error(ERROR + " error in converting string to date ");
        }

        return date;
    }

    public List<ObjectExternalReference> retrieveExternalReferance(EneiendomDocument.Eneiendom eneiendom) {
        List<ObjectExternalReference> objectExternalReferenceList = new ArrayList<ObjectExternalReference>();
        ObjectExternalReference objectExternalReference = new ObjectExternalReference();
        objectExternalReference.setReference(getXmlBeanDriver().getClientRef());
        objectExternalReference.setSource(retrieveSouece());
        objectExternalReference.setSystem(SYSTEM);
        objectExternalReference.setSystemVersion(VERSION);
        objectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        objectExternalReferenceList.add(objectExternalReference);
        return objectExternalReferenceList;

    }

    private String retrieveSouece() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("kundenummer_finn")) {
                return felt.getStringValue();
            }
        }
        return null;
    }

    private String retrieveTypeforTransaction() {
        for (FeltDocument.Felt felt : eneiendom.getFeltArray()) {
            if (felt.getNavn().equals("tinde_oppdragstype")) {
                return felt.getStringValue();
            }
        }

        return null;
    }


    public EneiendomDocument.Eneiendom getEneiendom() {
        return eneiendom;
    }

}


