/*
 * An XML document type.
 * Localname: Kommentar
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KommentarDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kommentar(@) element.
 *
 * This is a complex type.
 */
public class KommentarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KommentarDocument
{
    private static final long serialVersionUID = 1L;
    
    public KommentarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMENTAR$0 = 
        new javax.xml.namespace.QName("", "Kommentar");
    
    
    /**
     * Gets the "Kommentar" element
     */
    public java.lang.String getKommentar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kommentar" element
     */
    public org.apache.xmlbeans.XmlString xgetKommentar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kommentar" element
     */
    public void setKommentar(java.lang.String kommentar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMENTAR$0);
            }
            target.setStringValue(kommentar);
        }
    }
    
    /**
     * Sets (as xml) the "Kommentar" element
     */
    public void xsetKommentar(org.apache.xmlbeans.XmlString kommentar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMENTAR$0);
            }
            target.set(kommentar);
        }
    }
}
