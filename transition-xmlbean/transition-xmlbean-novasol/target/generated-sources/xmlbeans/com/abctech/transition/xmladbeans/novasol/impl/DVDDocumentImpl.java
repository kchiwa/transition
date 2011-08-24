/*
 * An XML document type.
 * Localname: DVD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DVDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DVD(@) element.
 *
 * This is a complex type.
 */
public class DVDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DVDDocument
{
    private static final long serialVersionUID = 1L;
    
    public DVDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DVD$0 = 
        new javax.xml.namespace.QName("", "DVD");
    
    
    /**
     * Gets the "DVD" element
     */
    public java.lang.String getDVD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DVD" element
     */
    public org.apache.xmlbeans.XmlString xgetDVD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DVD" element
     */
    public void setDVD(java.lang.String dvd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVD$0);
            }
            target.setStringValue(dvd);
        }
    }
    
    /**
     * Sets (as xml) the "DVD" element
     */
    public void xsetDVD(org.apache.xmlbeans.XmlString dvd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVD$0);
            }
            target.set(dvd);
        }
    }
}
