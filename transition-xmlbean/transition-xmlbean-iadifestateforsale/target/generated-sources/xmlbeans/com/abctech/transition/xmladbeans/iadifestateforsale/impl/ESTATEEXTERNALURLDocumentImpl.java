/*
 * An XML document type.
 * Localname: ESTATE_EXTERNAL_URL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEEXTERNALURLDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_EXTERNAL_URL(@) element.
 *
 * This is a complex type.
 */
public class ESTATEEXTERNALURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEEXTERNALURLDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATEEXTERNALURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATEEXTERNALURL$0 = 
        new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_URL");
    
    
    /**
     * Gets the "ESTATE_EXTERNAL_URL" element
     */
    public java.lang.String getESTATEEXTERNALURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ESTATE_EXTERNAL_URL" element
     */
    public org.apache.xmlbeans.XmlString xgetESTATEEXTERNALURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_EXTERNAL_URL" element
     */
    public void setESTATEEXTERNALURL(java.lang.String estateexternalurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALURL$0);
            }
            target.setStringValue(estateexternalurl);
        }
    }
    
    /**
     * Sets (as xml) the "ESTATE_EXTERNAL_URL" element
     */
    public void xsetESTATEEXTERNALURL(org.apache.xmlbeans.XmlString estateexternalurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALURL$0);
            }
            target.set(estateexternalurl);
        }
    }
}
