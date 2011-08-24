/*
 * An XML document type.
 * Localname: Slepevekt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.SlepevektDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Slepevekt(@) element.
 *
 * This is a complex type.
 */
public class SlepevektDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.SlepevektDocument
{
    private static final long serialVersionUID = 1L;
    
    public SlepevektDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLEPEVEKT$0 = 
        new javax.xml.namespace.QName("", "Slepevekt");
    
    
    /**
     * Gets the "Slepevekt" element
     */
    public java.lang.String getSlepevekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEPEVEKT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Slepevekt" element
     */
    public org.apache.xmlbeans.XmlString xgetSlepevekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLEPEVEKT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Slepevekt" element
     */
    public void setSlepevekt(java.lang.String slepevekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEPEVEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLEPEVEKT$0);
            }
            target.setStringValue(slepevekt);
        }
    }
    
    /**
     * Sets (as xml) the "Slepevekt" element
     */
    public void xsetSlepevekt(org.apache.xmlbeans.XmlString slepevekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLEPEVEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SLEPEVEKT$0);
            }
            target.set(slepevekt);
        }
    }
}
