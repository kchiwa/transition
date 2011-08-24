/*
 * An XML document type.
 * Localname: BNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BNR(@) element.
 *
 * This is a complex type.
 */
public class BNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public BNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BNR$0 = 
        new javax.xml.namespace.QName("", "BNR");
    
    
    /**
     * Gets the "BNR" element
     */
    public java.lang.String getBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BNR" element
     */
    public org.apache.xmlbeans.XmlString xgetBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BNR" element
     */
    public void setBNR(java.lang.String bnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNR$0);
            }
            target.setStringValue(bnr);
        }
    }
    
    /**
     * Sets (as xml) the "BNR" element
     */
    public void xsetBNR(org.apache.xmlbeans.XmlString bnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BNR$0);
            }
            target.set(bnr);
        }
    }
}
