/*
 * An XML document type.
 * Localname: VEDLEGGHASH
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGHASHDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGGHASH(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGHASHDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGHASHDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGHASHDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGGHASH$0 = 
        new javax.xml.namespace.QName("", "VEDLEGGHASH");
    
    
    /**
     * Gets the "VEDLEGGHASH" element
     */
    public java.lang.String getVEDLEGGHASH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGHASH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEDLEGGHASH" element
     */
    public org.apache.xmlbeans.XmlString xgetVEDLEGGHASH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGHASH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGGHASH" element
     */
    public void setVEDLEGGHASH(java.lang.String vedlegghash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGHASH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGHASH$0);
            }
            target.setStringValue(vedlegghash);
        }
    }
    
    /**
     * Sets (as xml) the "VEDLEGGHASH" element
     */
    public void xsetVEDLEGGHASH(org.apache.xmlbeans.XmlString vedlegghash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGHASH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGHASH$0);
            }
            target.set(vedlegghash);
        }
    }
}
