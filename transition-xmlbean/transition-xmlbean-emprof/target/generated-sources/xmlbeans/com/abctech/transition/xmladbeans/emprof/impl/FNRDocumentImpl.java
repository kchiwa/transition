/*
 * An XML document type.
 * Localname: FNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.FNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one FNR(@) element.
 *
 * This is a complex type.
 */
public class FNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.FNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public FNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FNR$0 = 
        new javax.xml.namespace.QName("", "FNR");
    
    
    /**
     * Gets the "FNR" element
     */
    public java.lang.String getFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FNR" element
     */
    public org.apache.xmlbeans.XmlString xgetFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FNR" element
     */
    public void setFNR(java.lang.String fnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FNR$0);
            }
            target.setStringValue(fnr);
        }
    }
    
    /**
     * Sets (as xml) the "FNR" element
     */
    public void xsetFNR(org.apache.xmlbeans.XmlString fnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FNR$0);
            }
            target.set(fnr);
        }
    }
}
