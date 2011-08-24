/*
 * An XML document type.
 * Localname: BoatHP
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BoatHPDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BoatHP(@) element.
 *
 * This is a complex type.
 */
public class BoatHPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BoatHPDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoatHPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOATHP$0 = 
        new javax.xml.namespace.QName("", "BoatHP");
    
    
    /**
     * Gets the "BoatHP" element
     */
    public java.lang.String getBoatHP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATHP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BoatHP" element
     */
    public org.apache.xmlbeans.XmlString xgetBoatHP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATHP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BoatHP" element
     */
    public void setBoatHP(java.lang.String boatHP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATHP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOATHP$0);
            }
            target.setStringValue(boatHP);
        }
    }
    
    /**
     * Sets (as xml) the "BoatHP" element
     */
    public void xsetBoatHP(org.apache.xmlbeans.XmlString boatHP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATHP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOATHP$0);
            }
            target.set(boatHP);
        }
    }
}
