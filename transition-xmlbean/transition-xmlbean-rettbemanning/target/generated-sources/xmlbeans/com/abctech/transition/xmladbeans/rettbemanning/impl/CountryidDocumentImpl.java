/*
 * An XML document type.
 * Localname: countryid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.CountryidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one countryid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class CountryidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.CountryidDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "countryid");
    
    
    /**
     * Gets the "countryid" element
     */
    public java.lang.String getCountryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryid" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "countryid" element
     */
    public void setCountryid(java.lang.String countryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYID$0);
            }
            target.setStringValue(countryid);
        }
    }
    
    /**
     * Sets (as xml) the "countryid" element
     */
    public void xsetCountryid(org.apache.xmlbeans.XmlString countryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYID$0);
            }
            target.set(countryid);
        }
    }
}
