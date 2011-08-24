/*
 * An XML document type.
 * Localname: Karosserifasong
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KarosserifasongDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Karosserifasong(@) element.
 *
 * This is a complex type.
 */
public class KarosserifasongDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KarosserifasongDocument
{
    private static final long serialVersionUID = 1L;
    
    public KarosserifasongDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KAROSSERIFASONG$0 = 
        new javax.xml.namespace.QName("", "Karosserifasong");
    
    
    /**
     * Gets the "Karosserifasong" element
     */
    public java.lang.String getKarosserifasong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAROSSERIFASONG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Karosserifasong" element
     */
    public org.apache.xmlbeans.XmlString xgetKarosserifasong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KAROSSERIFASONG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Karosserifasong" element
     */
    public void setKarosserifasong(java.lang.String karosserifasong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAROSSERIFASONG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KAROSSERIFASONG$0);
            }
            target.setStringValue(karosserifasong);
        }
    }
    
    /**
     * Sets (as xml) the "Karosserifasong" element
     */
    public void xsetKarosserifasong(org.apache.xmlbeans.XmlString karosserifasong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KAROSSERIFASONG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KAROSSERIFASONG$0);
            }
            target.set(karosserifasong);
        }
    }
}
