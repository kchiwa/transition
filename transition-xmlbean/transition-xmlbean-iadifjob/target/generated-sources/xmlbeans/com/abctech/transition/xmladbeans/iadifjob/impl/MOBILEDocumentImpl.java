/*
 * An XML document type.
 * Localname: MOBILE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.MOBILEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one MOBILE(@) element.
 *
 * This is a complex type.
 */
public class MOBILEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.MOBILEDocument
{
    private static final long serialVersionUID = 1L;
    
    public MOBILEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOBILE$0 = 
        new javax.xml.namespace.QName("", "MOBILE");
    
    
    /**
     * Gets the "MOBILE" element
     */
    public java.lang.String getMOBILE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MOBILE" element
     */
    public org.apache.xmlbeans.XmlString xgetMOBILE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MOBILE" element
     */
    public void setMOBILE(java.lang.String mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$0);
            }
            target.setStringValue(mobile);
        }
    }
    
    /**
     * Sets (as xml) the "MOBILE" element
     */
    public void xsetMOBILE(org.apache.xmlbeans.XmlString mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILE$0);
            }
            target.set(mobile);
        }
    }
}
