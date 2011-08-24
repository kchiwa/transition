/*
 * An XML document type.
 * Localname: Kmstand
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KmstandDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kmstand(@) element.
 *
 * This is a complex type.
 */
public class KmstandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KmstandDocument
{
    private static final long serialVersionUID = 1L;
    
    public KmstandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KMSTAND$0 = 
        new javax.xml.namespace.QName("", "Kmstand");
    
    
    /**
     * Gets the "Kmstand" element
     */
    public java.lang.String getKmstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KMSTAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kmstand" element
     */
    public org.apache.xmlbeans.XmlString xgetKmstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KMSTAND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kmstand" element
     */
    public void setKmstand(java.lang.String kmstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KMSTAND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KMSTAND$0);
            }
            target.setStringValue(kmstand);
        }
    }
    
    /**
     * Sets (as xml) the "Kmstand" element
     */
    public void xsetKmstand(org.apache.xmlbeans.XmlString kmstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KMSTAND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KMSTAND$0);
            }
            target.set(kmstand);
        }
    }
}
