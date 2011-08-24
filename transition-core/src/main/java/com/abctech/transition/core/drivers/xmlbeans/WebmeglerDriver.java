package com.abctech.transition.core.drivers.xmlbeans;


import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.utility.Converter;
import com.abctech.transition.xmladbeans.webmegler.EiendommerDocument;
import com.abctech.transition.xmladbeans.webmegler.FeltDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.io.InputStream;

public class WebmeglerDriver extends AXmlBeanDriver {
    private static final Logger log = Logger.getLogger(WebmeglerDriver.class);
    private EiendommerDocument eiendommerDocument;
    //private EneiendomDocument.Eneiendom eneiendom;

    public WebmeglerDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
        initDriver(xmlBeanValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        if (xml == null || xml.length() < 1) {
            throw new TransitionRuntimeException("XML is null or empty string. Not allowed.");
        }
        try {
            SchemaTypeLoader schemaTypeLoader = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{EiendommerDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            eiendommerDocument = (EiendommerDocument) schemaTypeLoader.parse(xml, EiendommerDocument.type, null);

            //eneiendom = eiendommerDocument.getEiendommer().getEneiendomArray(0);

        } catch (XmlException e) {
            // TODO Consider changing signature and exception type
            throw new TransitionRuntimeException("Got a problem with the XML in:\n" + xml, e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader schemaTypeLoader = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{EiendommerDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            eiendommerDocument = (EiendommerDocument) schemaTypeLoader.parse(xmlStream, EiendommerDocument.type, getXmlOptions());
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }


    }

    @Override
    public String getClientRef() {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals("id") && !felt.getStringValue().trim().equals("")) {
                log.debug(felt.getStringValue().trim());
                return (felt.getStringValue().trim());
            }
        }
        throw new TransitionRuntimeException("this xml is not has an client ref");
    }

    @Override
    public Integer getClientId() {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals("kundenummer_zett") && !felt.getStringValue().trim().equals("")) {
                try {
                    return Integer.parseInt(felt.getStringValue().trim());
                } catch (NumberFormatException err) {
                    throw new TransitionRuntimeException("client id that provide is not number", err);
                }
            }
        }
        throw new TransitionRuntimeException("this xml is not has an client id");
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        long expireTime;
        String stringAdDate = stringExpireDate().replaceAll("\\.", "-");
        expireTime = Converter.getLongDate(stringAdDate);
        long current = currentDateToLong();
        if (expireTime > current && !checkStatus().equals("0")) {
            // vispaazett is a field which is "show on zett". It is 0 if it is false, and
            // something else in other cases.
            log.debug("expiretime =====> " + expireTime);
            log.debug("current ===== > " + current);
            return AdObjectTransactionStatus.OPEN;
        }
        return AdObjectTransactionStatus.CLOSED;
    }

    public String checkStatus() {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals("vispaazett")) {
                return felt.getStringValue();
            }
        }
        return null;
    }

    public static long currentDateToLong() {
        DateTimeFormatter dateFormat = org.joda.time.format.DateTimeFormat.forPattern("dd-MM-yyyy");
        DateTime currentTime = new DateTime();
        return Converter.getFromDate(currentTime.toString(dateFormat));
    }


    @Override
    public String getAdTitle() {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals("overskrift")) {
                return felt.getStringValue();

            }
        }

        return null;
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return this.eiendommerDocument;
    }

    public String stringExpireDate() {
        for (FeltDocument.Felt felt : eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray()) {
            if (felt.getNavn().equals("utlopsdato")) {
                log.debug("utlopsdato ====== > " + felt.getStringValue());
                return felt.getStringValue();

            }

        }

        return null;
    }

}
