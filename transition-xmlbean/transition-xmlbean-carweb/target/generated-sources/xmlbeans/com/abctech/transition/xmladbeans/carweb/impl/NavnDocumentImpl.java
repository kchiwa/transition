/*
 * An XML document type.
 * Localname: Navn
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.NavnDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Navn(@) element.
 *
 * This is a complex type.
 */
public class NavnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.NavnDocument
{
    private static final long serialVersionUID = 1L;
    
    public NavnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAVN$0 = 
        new javax.xml.namespace.QName("", "Navn");
    
    
    /**
     * Gets the "Navn" element
     */
    public java.lang.String getNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Navn" element
     */
    public org.apache.xmlbeans.XmlString xgetNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Navn" element
     */
    public void setNavn(java.lang.String navn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAVN$0);
            }
            target.setStringValue(navn);
        }
    }
    
    /**
     * Sets (as xml) the "Navn" element
     */
    public void xsetNavn(org.apache.xmlbeans.XmlString navn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAVN$0);
            }
            target.set(navn);
        }
    }
}
