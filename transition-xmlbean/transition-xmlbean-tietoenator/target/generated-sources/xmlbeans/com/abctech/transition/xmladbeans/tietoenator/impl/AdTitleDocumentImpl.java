/*
 * An XML document type.
 * Localname: ad_title
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one ad_title(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdTitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADTITLE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "ad_title");
    
    
    /**
     * Gets the "ad_title" element
     */
    public java.lang.String getAdTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ad_title" element
     */
    public org.apache.xmlbeans.XmlString xgetAdTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ad_title" element
     */
    public void setAdTitle(java.lang.String adTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTITLE$0);
            }
            target.setStringValue(adTitle);
        }
    }
    
    /**
     * Sets (as xml) the "ad_title" element
     */
    public void xsetAdTitle(org.apache.xmlbeans.XmlString adTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTITLE$0);
            }
            target.set(adTitle);
        }
    }
}
