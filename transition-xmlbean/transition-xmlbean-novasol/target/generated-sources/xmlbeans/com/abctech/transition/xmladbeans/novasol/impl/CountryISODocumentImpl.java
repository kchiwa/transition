/*
 * An XML document type.
 * Localname: CountryISO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CountryISODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CountryISO(@) element.
 *
 * This is a complex type.
 */
public class CountryISODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CountryISODocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryISODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYISO$0 = 
        new javax.xml.namespace.QName("", "CountryISO");
    
    
    /**
     * Gets the "CountryISO" element
     */
    public java.lang.String getCountryISO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryISO" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryISO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CountryISO" element
     */
    public void setCountryISO(java.lang.String countryISO)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYISO$0);
            }
            target.setStringValue(countryISO);
        }
    }
    
    /**
     * Sets (as xml) the "CountryISO" element
     */
    public void xsetCountryISO(org.apache.xmlbeans.XmlString countryISO)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYISO$0);
            }
            target.set(countryISO);
        }
    }
}
