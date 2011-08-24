/*
 * An XML document type.
 * Localname: NORTHING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NORTHINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NORTHING(@) element.
 *
 * This is a complex type.
 */
public class NORTHINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NORTHINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public NORTHINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORTHING$0 = 
        new javax.xml.namespace.QName("", "NORTHING");
    
    
    /**
     * Gets the "NORTHING" element
     */
    public java.lang.String getNORTHING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NORTHING" element
     */
    public org.apache.xmlbeans.XmlString xgetNORTHING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORTHING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NORTHING" element
     */
    public void setNORTHING(java.lang.String northing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTHING$0);
            }
            target.setStringValue(northing);
        }
    }
    
    /**
     * Sets (as xml) the "NORTHING" element
     */
    public void xsetNORTHING(org.apache.xmlbeans.XmlString northing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORTHING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NORTHING$0);
            }
            target.set(northing);
        }
    }
}
