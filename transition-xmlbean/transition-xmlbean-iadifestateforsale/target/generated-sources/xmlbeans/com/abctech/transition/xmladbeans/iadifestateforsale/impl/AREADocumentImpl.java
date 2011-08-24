/*
 * An XML document type.
 * Localname: AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.AREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one AREA(@) element.
 *
 * This is a complex type.
 */
public class AREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.AREADocument
{
    private static final long serialVersionUID = 1L;
    
    public AREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREA$0 = 
        new javax.xml.namespace.QName("", "AREA");
    
    
    /**
     * Gets the "AREA" element
     */
    public java.lang.String getAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AREA" element
     */
    public void setAREA(java.lang.String area)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREA$0);
            }
            target.setStringValue(area);
        }
    }
    
    /**
     * Sets (as xml) the "AREA" element
     */
    public void xsetAREA(org.apache.xmlbeans.XmlString area)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREA$0);
            }
            target.set(area);
        }
    }
}
