/*
 * An XML document type.
 * Localname: Telefon
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.TelefonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Telefon(@) element.
 *
 * This is a complex type.
 */
public class TelefonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.TelefonDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelefonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEFON$0 = 
        new javax.xml.namespace.QName("", "Telefon");
    
    
    /**
     * Gets the "Telefon" element
     */
    public java.lang.String getTelefon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Telefon" element
     */
    public org.apache.xmlbeans.XmlString xgetTelefon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Telefon" element
     */
    public void setTelefon(java.lang.String telefon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEFON$0);
            }
            target.setStringValue(telefon);
        }
    }
    
    /**
     * Sets (as xml) the "Telefon" element
     */
    public void xsetTelefon(org.apache.xmlbeans.XmlString telefon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEFON$0);
            }
            target.set(telefon);
        }
    }
}
