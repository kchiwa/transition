/*
 * An XML document type.
 * Localname: BEDROOMS_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BEDROOMSTODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BEDROOMS_TO(@) element.
 *
 * This is a complex type.
 */
public class BEDROOMSTODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BEDROOMSTODocument
{
    private static final long serialVersionUID = 1L;
    
    public BEDROOMSTODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDROOMSTO$0 = 
        new javax.xml.namespace.QName("", "BEDROOMS_TO");
    
    
    /**
     * Gets the "BEDROOMS_TO" element
     */
    public java.lang.String getBEDROOMSTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BEDROOMS_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetBEDROOMSTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BEDROOMS_TO" element
     */
    public void setBEDROOMSTO(java.lang.String bedroomsto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMSTO$0);
            }
            target.setStringValue(bedroomsto);
        }
    }
    
    /**
     * Sets (as xml) the "BEDROOMS_TO" element
     */
    public void xsetBEDROOMSTO(org.apache.xmlbeans.XmlString bedroomsto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDROOMSTO$0);
            }
            target.set(bedroomsto);
        }
    }
}
