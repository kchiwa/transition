/*
 * An XML document type.
 * Localname: Ekstrautstyr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.EkstrautstyrDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Ekstrautstyr(@) element.
 *
 * This is a complex type.
 */
public class EkstrautstyrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.EkstrautstyrDocument
{
    private static final long serialVersionUID = 1L;
    
    public EkstrautstyrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EKSTRAUTSTYR$0 = 
        new javax.xml.namespace.QName("", "Ekstrautstyr");
    
    
    /**
     * Gets the "Ekstrautstyr" element
     */
    public java.lang.String getEkstrautstyr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EKSTRAUTSTYR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ekstrautstyr" element
     */
    public org.apache.xmlbeans.XmlString xgetEkstrautstyr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EKSTRAUTSTYR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ekstrautstyr" element
     */
    public void setEkstrautstyr(java.lang.String ekstrautstyr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EKSTRAUTSTYR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EKSTRAUTSTYR$0);
            }
            target.setStringValue(ekstrautstyr);
        }
    }
    
    /**
     * Sets (as xml) the "Ekstrautstyr" element
     */
    public void xsetEkstrautstyr(org.apache.xmlbeans.XmlString ekstrautstyr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EKSTRAUTSTYR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EKSTRAUTSTYR$0);
            }
            target.set(ekstrautstyr);
        }
    }
}
