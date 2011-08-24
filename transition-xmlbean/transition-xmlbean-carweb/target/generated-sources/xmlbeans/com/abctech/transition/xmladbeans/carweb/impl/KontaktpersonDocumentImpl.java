/*
 * An XML document type.
 * Localname: Kontaktperson
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontaktpersonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kontaktperson(@) element.
 *
 * This is a complex type.
 */
public class KontaktpersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public KontaktpersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTAKTPERSON$0 = 
        new javax.xml.namespace.QName("", "Kontaktperson");
    
    
    /**
     * Gets the "Kontaktperson" element
     */
    public java.lang.String getKontaktperson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KONTAKTPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kontaktperson" element
     */
    public org.apache.xmlbeans.XmlString xgetKontaktperson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KONTAKTPERSON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kontaktperson" element
     */
    public void setKontaktperson(java.lang.String kontaktperson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KONTAKTPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KONTAKTPERSON$0);
            }
            target.setStringValue(kontaktperson);
        }
    }
    
    /**
     * Sets (as xml) the "Kontaktperson" element
     */
    public void xsetKontaktperson(org.apache.xmlbeans.XmlString kontaktperson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KONTAKTPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KONTAKTPERSON$0);
            }
            target.set(kontaktperson);
        }
    }
}
