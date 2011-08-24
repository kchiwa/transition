/*
 * An XML document type.
 * Localname: RegNr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.RegNrDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one RegNr(@) element.
 *
 * This is a complex type.
 */
public class RegNrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.RegNrDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegNrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGNR$0 = 
        new javax.xml.namespace.QName("", "RegNr");
    
    
    /**
     * Gets the "RegNr" element
     */
    public java.lang.String getRegNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegNr" element
     */
    public org.apache.xmlbeans.XmlString xgetRegNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegNr" element
     */
    public void setRegNr(java.lang.String regNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGNR$0);
            }
            target.setStringValue(regNr);
        }
    }
    
    /**
     * Sets (as xml) the "RegNr" element
     */
    public void xsetRegNr(org.apache.xmlbeans.XmlString regNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGNR$0);
            }
            target.set(regNr);
        }
    }
}
