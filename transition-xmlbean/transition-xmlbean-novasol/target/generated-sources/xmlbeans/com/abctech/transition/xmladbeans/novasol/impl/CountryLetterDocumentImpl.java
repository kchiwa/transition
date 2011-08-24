/*
 * An XML document type.
 * Localname: CountryLetter
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CountryLetterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CountryLetter(@) element.
 *
 * This is a complex type.
 */
public class CountryLetterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CountryLetterDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryLetterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYLETTER$0 = 
        new javax.xml.namespace.QName("", "CountryLetter");
    
    
    /**
     * Gets the "CountryLetter" element
     */
    public java.lang.String getCountryLetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLETTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryLetter" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryLetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLETTER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CountryLetter" element
     */
    public void setCountryLetter(java.lang.String countryLetter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLETTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYLETTER$0);
            }
            target.setStringValue(countryLetter);
        }
    }
    
    /**
     * Sets (as xml) the "CountryLetter" element
     */
    public void xsetCountryLetter(org.apache.xmlbeans.XmlString countryLetter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLETTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYLETTER$0);
            }
            target.set(countryLetter);
        }
    }
}
