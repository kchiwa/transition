/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_EMAIL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTOREMAILDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_EMAIL(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTOREMAILDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTOREMAILDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTOREMAILDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTOREMAIL$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_EMAIL");
    
    
    /**
     * Gets the "MEGLER_KONTOR_EMAIL" element
     */
    public java.lang.String getMEGLERKONTOREMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTOREMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_EMAIL" element
     */
    public org.apache.xmlbeans.XmlString xgetMEGLERKONTOREMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTOREMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_EMAIL" element
     */
    public void setMEGLERKONTOREMAIL(java.lang.String meglerkontoremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTOREMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTOREMAIL$0);
            }
            target.setStringValue(meglerkontoremail);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_EMAIL" element
     */
    public void xsetMEGLERKONTOREMAIL(org.apache.xmlbeans.XmlString meglerkontoremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTOREMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTOREMAIL$0);
            }
            target.set(meglerkontoremail);
        }
    }
}
