/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_POSTSTED
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTORPOSTSTEDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_POSTSTED(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTORPOSTSTEDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTORPOSTSTEDDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTORPOSTSTEDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTORPOSTSTED$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_POSTSTED");
    
    
    /**
     * Gets the "MEGLER_KONTOR_POSTSTED" element
     */
    public java.lang.String getMEGLERKONTORPOSTSTED()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTSTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_POSTSTED" element
     */
    public org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTSTED()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTSTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_POSTSTED" element
     */
    public void setMEGLERKONTORPOSTSTED(java.lang.String meglerkontorpoststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTSTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORPOSTSTED$0);
            }
            target.setStringValue(meglerkontorpoststed);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_POSTSTED" element
     */
    public void xsetMEGLERKONTORPOSTSTED(org.apache.xmlbeans.XmlString meglerkontorpoststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTSTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORPOSTSTED$0);
            }
            target.set(meglerkontorpoststed);
        }
    }
}
