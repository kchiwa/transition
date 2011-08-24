/*
 * An XML document type.
 * Localname: COUNTRYCODE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.COUNTRYCODEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one COUNTRYCODE(@) element.
 *
 * This is a complex type.
 */
public class COUNTRYCODEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.COUNTRYCODEDocument
{
    private static final long serialVersionUID = 1L;
    
    public COUNTRYCODEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYCODE$0 = 
        new javax.xml.namespace.QName("", "COUNTRYCODE");
    
    
    /**
     * Gets the "COUNTRYCODE" element
     */
    public java.lang.String getCOUNTRYCODE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COUNTRYCODE" element
     */
    public org.apache.xmlbeans.XmlString xgetCOUNTRYCODE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COUNTRYCODE" element
     */
    public void setCOUNTRYCODE(java.lang.String countrycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$0);
            }
            target.setStringValue(countrycode);
        }
    }
    
    /**
     * Sets (as xml) the "COUNTRYCODE" element
     */
    public void xsetCOUNTRYCODE(org.apache.xmlbeans.XmlString countrycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$0);
            }
            target.set(countrycode);
        }
    }
}
