/*
 * An XML document type.
 * Localname: Merke
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.MerkeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Merke(@) element.
 *
 * This is a complex type.
 */
public class MerkeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.MerkeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MerkeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MERKE$0 = 
        new javax.xml.namespace.QName("", "Merke");
    
    
    /**
     * Gets the "Merke" element
     */
    public java.lang.String getMerke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERKE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Merke" element
     */
    public org.apache.xmlbeans.XmlString xgetMerke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERKE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Merke" element
     */
    public void setMerke(java.lang.String merke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERKE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERKE$0);
            }
            target.setStringValue(merke);
        }
    }
    
    /**
     * Sets (as xml) the "Merke" element
     */
    public void xsetMerke(org.apache.xmlbeans.XmlString merke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERKE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERKE$0);
            }
            target.set(merke);
        }
    }
}
