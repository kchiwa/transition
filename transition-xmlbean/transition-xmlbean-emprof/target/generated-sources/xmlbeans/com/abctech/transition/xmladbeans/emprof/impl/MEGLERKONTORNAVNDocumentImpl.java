/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_NAVN
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTORNAVNDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_NAVN(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTORNAVNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTORNAVNDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTORNAVNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTORNAVN$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_NAVN");
    
    
    /**
     * Gets the "MEGLER_KONTOR_NAVN" element
     */
    public java.lang.String getMEGLERKONTORNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORNAVN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_NAVN" element
     */
    public org.apache.xmlbeans.XmlString xgetMEGLERKONTORNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORNAVN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_NAVN" element
     */
    public void setMEGLERKONTORNAVN(java.lang.String meglerkontornavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORNAVN$0);
            }
            target.setStringValue(meglerkontornavn);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_NAVN" element
     */
    public void xsetMEGLERKONTORNAVN(org.apache.xmlbeans.XmlString meglerkontornavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORNAVN$0);
            }
            target.set(meglerkontornavn);
        }
    }
}
