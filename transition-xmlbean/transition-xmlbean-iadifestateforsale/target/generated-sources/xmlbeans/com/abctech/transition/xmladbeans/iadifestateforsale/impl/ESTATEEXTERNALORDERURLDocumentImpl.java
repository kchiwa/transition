/*
 * An XML document type.
 * Localname: ESTATE_EXTERNAL_ORDER_URL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEEXTERNALORDERURLDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_EXTERNAL_ORDER_URL(@) element.
 *
 * This is a complex type.
 */
public class ESTATEEXTERNALORDERURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEEXTERNALORDERURLDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATEEXTERNALORDERURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATEEXTERNALORDERURL$0 = 
        new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_ORDER_URL");
    
    
    /**
     * Gets the "ESTATE_EXTERNAL_ORDER_URL" element
     */
    public java.lang.String getESTATEEXTERNALORDERURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALORDERURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
     */
    public org.apache.xmlbeans.XmlString xgetESTATEEXTERNALORDERURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALORDERURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_EXTERNAL_ORDER_URL" element
     */
    public void setESTATEEXTERNALORDERURL(java.lang.String estateexternalorderurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALORDERURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALORDERURL$0);
            }
            target.setStringValue(estateexternalorderurl);
        }
    }
    
    /**
     * Sets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
     */
    public void xsetESTATEEXTERNALORDERURL(org.apache.xmlbeans.XmlString estateexternalorderurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALORDERURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALORDERURL$0);
            }
            target.set(estateexternalorderurl);
        }
    }
}
