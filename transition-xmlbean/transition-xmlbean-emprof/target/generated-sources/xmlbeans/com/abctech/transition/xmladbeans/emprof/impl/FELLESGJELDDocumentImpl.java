/*
 * An XML document type.
 * Localname: FELLESGJELD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.FELLESGJELDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one FELLESGJELD(@) element.
 *
 * This is a complex type.
 */
public class FELLESGJELDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.FELLESGJELDDocument
{
    private static final long serialVersionUID = 1L;
    
    public FELLESGJELDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FELLESGJELD$0 = 
        new javax.xml.namespace.QName("", "FELLESGJELD");
    
    
    /**
     * Gets the "FELLESGJELD" element
     */
    public java.lang.String getFELLESGJELD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESGJELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FELLESGJELD" element
     */
    public org.apache.xmlbeans.XmlString xgetFELLESGJELD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESGJELD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FELLESGJELD" element
     */
    public void setFELLESGJELD(java.lang.String fellesgjeld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESGJELD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FELLESGJELD$0);
            }
            target.setStringValue(fellesgjeld);
        }
    }
    
    /**
     * Sets (as xml) the "FELLESGJELD" element
     */
    public void xsetFELLESGJELD(org.apache.xmlbeans.XmlString fellesgjeld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESGJELD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FELLESGJELD$0);
            }
            target.set(fellesgjeld);
        }
    }
}
