/*
 * An XML document type.
 * Localname: LAANEVILKAARFELLESGJELD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.LAANEVILKAARFELLESGJELDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one LAANEVILKAARFELLESGJELD(@) element.
 *
 * This is a complex type.
 */
public class LAANEVILKAARFELLESGJELDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.LAANEVILKAARFELLESGJELDDocument
{
    private static final long serialVersionUID = 1L;
    
    public LAANEVILKAARFELLESGJELDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAANEVILKAARFELLESGJELD$0 = 
        new javax.xml.namespace.QName("", "LAANEVILKAARFELLESGJELD");
    
    
    /**
     * Gets the "LAANEVILKAARFELLESGJELD" element
     */
    public java.lang.String getLAANEVILKAARFELLESGJELD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVILKAARFELLESGJELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LAANEVILKAARFELLESGJELD" element
     */
    public org.apache.xmlbeans.XmlString xgetLAANEVILKAARFELLESGJELD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAANEVILKAARFELLESGJELD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LAANEVILKAARFELLESGJELD" element
     */
    public void setLAANEVILKAARFELLESGJELD(java.lang.String laanevilkaarfellesgjeld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVILKAARFELLESGJELD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAANEVILKAARFELLESGJELD$0);
            }
            target.setStringValue(laanevilkaarfellesgjeld);
        }
    }
    
    /**
     * Sets (as xml) the "LAANEVILKAARFELLESGJELD" element
     */
    public void xsetLAANEVILKAARFELLESGJELD(org.apache.xmlbeans.XmlString laanevilkaarfellesgjeld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAANEVILKAARFELLESGJELD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAANEVILKAARFELLESGJELD$0);
            }
            target.set(laanevilkaarfellesgjeld);
        }
    }
}
