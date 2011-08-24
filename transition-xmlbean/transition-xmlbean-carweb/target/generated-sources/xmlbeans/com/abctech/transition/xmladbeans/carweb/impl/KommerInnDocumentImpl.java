/*
 * An XML document type.
 * Localname: KommerInn
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KommerInnDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one KommerInn(@) element.
 *
 * This is a complex type.
 */
public class KommerInnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KommerInnDocument
{
    private static final long serialVersionUID = 1L;
    
    public KommerInnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMERINN$0 = 
        new javax.xml.namespace.QName("", "KommerInn");
    
    
    /**
     * Gets the "KommerInn" element
     */
    public java.lang.String getKommerInn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMERINN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KommerInn" element
     */
    public org.apache.xmlbeans.XmlString xgetKommerInn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMERINN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KommerInn" element
     */
    public void setKommerInn(java.lang.String kommerInn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMERINN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMERINN$0);
            }
            target.setStringValue(kommerInn);
        }
    }
    
    /**
     * Sets (as xml) the "KommerInn" element
     */
    public void xsetKommerInn(org.apache.xmlbeans.XmlString kommerInn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMERINN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMERINN$0);
            }
            target.set(kommerInn);
        }
    }
}
