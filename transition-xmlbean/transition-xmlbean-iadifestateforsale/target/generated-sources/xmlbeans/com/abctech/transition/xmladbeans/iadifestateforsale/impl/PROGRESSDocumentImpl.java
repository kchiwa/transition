/*
 * An XML document type.
 * Localname: PROGRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PROGRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PROGRESS(@) element.
 *
 * This is a complex type.
 */
public class PROGRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PROGRESSDocument
{
    private static final long serialVersionUID = 1L;
    
    public PROGRESSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROGRESS$0 = 
        new javax.xml.namespace.QName("", "PROGRESS");
    
    
    /**
     * Gets the "PROGRESS" element
     */
    public java.lang.String getPROGRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PROGRESS" element
     */
    public org.apache.xmlbeans.XmlString xgetPROGRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PROGRESS" element
     */
    public void setPROGRESS(java.lang.String progress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRESS$0);
            }
            target.setStringValue(progress);
        }
    }
    
    /**
     * Sets (as xml) the "PROGRESS" element
     */
    public void xsetPROGRESS(org.apache.xmlbeans.XmlString progress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROGRESS$0);
            }
            target.set(progress);
        }
    }
}
