/*
 * An XML document type.
 * Localname: Alpine
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AlpineDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Alpine(@) element.
 *
 * This is a complex type.
 */
public class AlpineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AlpineDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlpineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALPINE$0 = 
        new javax.xml.namespace.QName("", "Alpine");
    
    
    /**
     * Gets the "Alpine" element
     */
    public java.lang.String getAlpine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALPINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Alpine" element
     */
    public org.apache.xmlbeans.XmlString xgetAlpine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALPINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Alpine" element
     */
    public void setAlpine(java.lang.String alpine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALPINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALPINE$0);
            }
            target.setStringValue(alpine);
        }
    }
    
    /**
     * Sets (as xml) the "Alpine" element
     */
    public void xsetAlpine(org.apache.xmlbeans.XmlString alpine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALPINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALPINE$0);
            }
            target.set(alpine);
        }
    }
}
