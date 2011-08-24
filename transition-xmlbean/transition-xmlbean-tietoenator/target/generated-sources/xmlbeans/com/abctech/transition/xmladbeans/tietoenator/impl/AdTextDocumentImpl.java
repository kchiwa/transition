/*
 * An XML document type.
 * Localname: ad_text
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdTextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one ad_text(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADTEXT$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "ad_text");
    
    
    /**
     * Gets the "ad_text" element
     */
    public java.lang.String getAdText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ad_text" element
     */
    public org.apache.xmlbeans.XmlString xgetAdText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ad_text" element
     */
    public void setAdText(java.lang.String adText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTEXT$0);
            }
            target.setStringValue(adText);
        }
    }
    
    /**
     * Sets (as xml) the "ad_text" element
     */
    public void xsetAdText(org.apache.xmlbeans.XmlString adText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTEXT$0);
            }
            target.set(adText);
        }
    }
}
