/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_ID
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTORIDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_ID(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTORIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTORIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTORIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTORID$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_ID");
    
    
    /**
     * Gets the "MEGLER_KONTOR_ID" element
     */
    public java.math.BigInteger getMEGLERKONTORID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_ID" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMEGLERKONTORID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MEGLERKONTORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_ID" element
     */
    public void setMEGLERKONTORID(java.math.BigInteger meglerkontorid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORID$0);
            }
            target.setBigIntegerValue(meglerkontorid);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_ID" element
     */
    public void xsetMEGLERKONTORID(org.apache.xmlbeans.XmlPositiveInteger meglerkontorid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MEGLERKONTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MEGLERKONTORID$0);
            }
            target.set(meglerkontorid);
        }
    }
}
