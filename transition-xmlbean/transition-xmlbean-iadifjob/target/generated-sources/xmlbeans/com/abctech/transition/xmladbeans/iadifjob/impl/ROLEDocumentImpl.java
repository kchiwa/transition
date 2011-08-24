/*
 * An XML document type.
 * Localname: ROLE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ROLEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one ROLE(@) element.
 *
 * This is a complex type.
 */
public class ROLEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ROLEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ROLEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("", "ROLE");
    
    
    /**
     * Gets the "ROLE" element
     */
    public java.lang.String getROLE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ROLE" element
     */
    public org.apache.xmlbeans.XmlString xgetROLE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ROLE" element
     */
    public void setROLE(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$0);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "ROLE" element
     */
    public void xsetROLE(org.apache.xmlbeans.XmlString role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
}
