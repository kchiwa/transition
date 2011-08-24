/*
 * An XML document type.
 * Localname: TOTIME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.TOTIMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one TOTIME(@) element.
 *
 * This is a complex type.
 */
public class TOTIMEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.TOTIMEDocument
{
    private static final long serialVersionUID = 1L;
    
    public TOTIMEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTIME$0 = 
        new javax.xml.namespace.QName("", "TOTIME");
    
    
    /**
     * Gets the "TOTIME" element
     */
    public java.lang.String getTOTIME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TOTIME" element
     */
    public org.apache.xmlbeans.XmlString xgetTOTIME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TOTIME" element
     */
    public void setTOTIME(java.lang.String totime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIME$0);
            }
            target.setStringValue(totime);
        }
    }
    
    /**
     * Sets (as xml) the "TOTIME" element
     */
    public void xsetTOTIME(org.apache.xmlbeans.XmlString totime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOTIME$0);
            }
            target.set(totime);
        }
    }
}
