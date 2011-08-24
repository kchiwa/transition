/*
 * An XML document type.
 * Localname: adresulted
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdresultedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one adresulted(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdresultedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdresultedDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdresultedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADRESULTED$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "adresulted");
    
    
    /**
     * Gets the "adresulted" element
     */
    public java.lang.String getAdresulted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRESULTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adresulted" element
     */
    public org.apache.xmlbeans.XmlString xgetAdresulted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADRESULTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "adresulted" element
     */
    public void setAdresulted(java.lang.String adresulted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRESULTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADRESULTED$0);
            }
            target.setStringValue(adresulted);
        }
    }
    
    /**
     * Sets (as xml) the "adresulted" element
     */
    public void xsetAdresulted(org.apache.xmlbeans.XmlString adresulted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADRESULTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADRESULTED$0);
            }
            target.set(adresulted);
        }
    }
}
