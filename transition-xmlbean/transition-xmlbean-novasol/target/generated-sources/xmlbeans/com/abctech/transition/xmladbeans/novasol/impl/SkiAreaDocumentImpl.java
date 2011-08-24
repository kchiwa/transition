/*
 * An XML document type.
 * Localname: SkiArea
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SkiAreaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SkiArea(@) element.
 *
 * This is a complex type.
 */
public class SkiAreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SkiAreaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SkiAreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKIAREA$0 = 
        new javax.xml.namespace.QName("", "SkiArea");
    
    
    /**
     * Gets the "SkiArea" element
     */
    public java.lang.String getSkiArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SkiArea" element
     */
    public org.apache.xmlbeans.XmlString xgetSkiArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKIAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SkiArea" element
     */
    public void setSkiArea(java.lang.String skiArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKIAREA$0);
            }
            target.setStringValue(skiArea);
        }
    }
    
    /**
     * Sets (as xml) the "SkiArea" element
     */
    public void xsetSkiArea(org.apache.xmlbeans.XmlString skiArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKIAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKIAREA$0);
            }
            target.set(skiArea);
        }
    }
}
