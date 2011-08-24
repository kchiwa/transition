/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_BESOKSADRESSE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTORBESOKSADRESSEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_BESOKSADRESSE(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTORBESOKSADRESSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTORBESOKSADRESSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTORBESOKSADRESSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTORBESOKSADRESSE$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_BESOKSADRESSE");
    
    
    /**
     * Gets the "MEGLER_KONTOR_BESOKSADRESSE" element
     */
    public java.lang.String getMEGLERKONTORBESOKSADRESSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
     */
    public org.apache.xmlbeans.XmlString xgetMEGLERKONTORBESOKSADRESSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_BESOKSADRESSE" element
     */
    public void setMEGLERKONTORBESOKSADRESSE(java.lang.String meglerkontorbesoksadresse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORBESOKSADRESSE$0);
            }
            target.setStringValue(meglerkontorbesoksadresse);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
     */
    public void xsetMEGLERKONTORBESOKSADRESSE(org.apache.xmlbeans.XmlString meglerkontorbesoksadresse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORBESOKSADRESSE$0);
            }
            target.set(meglerkontorbesoksadresse);
        }
    }
}
