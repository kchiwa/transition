/*
 * An XML document type.
 * Localname: BEDROOMS_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BEDROOMSFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BEDROOMS_FROM(@) element.
 *
 * This is a complex type.
 */
public class BEDROOMSFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BEDROOMSFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public BEDROOMSFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDROOMSFROM$0 = 
        new javax.xml.namespace.QName("", "BEDROOMS_FROM");
    
    
    /**
     * Gets the "BEDROOMS_FROM" element
     */
    public java.lang.String getBEDROOMSFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BEDROOMS_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetBEDROOMSFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BEDROOMS_FROM" element
     */
    public void setBEDROOMSFROM(java.lang.String bedroomsfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMSFROM$0);
            }
            target.setStringValue(bedroomsfrom);
        }
    }
    
    /**
     * Sets (as xml) the "BEDROOMS_FROM" element
     */
    public void xsetBEDROOMSFROM(org.apache.xmlbeans.XmlString bedroomsfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDROOMSFROM$0);
            }
            target.set(bedroomsfrom);
        }
    }
}
