/*
 * An XML document type.
 * Localname: VEDLEGGURL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGURLDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGGURL(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGURLDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGGURL$0 = 
        new javax.xml.namespace.QName("", "VEDLEGGURL");
    
    
    /**
     * Gets the "VEDLEGGURL" element
     */
    public java.lang.String getVEDLEGGURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEDLEGGURL" element
     */
    public org.apache.xmlbeans.XmlString xgetVEDLEGGURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGGURL" element
     */
    public void setVEDLEGGURL(java.lang.String vedleggurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGURL$0);
            }
            target.setStringValue(vedleggurl);
        }
    }
    
    /**
     * Sets (as xml) the "VEDLEGGURL" element
     */
    public void xsetVEDLEGGURL(org.apache.xmlbeans.XmlString vedleggurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGURL$0);
            }
            target.set(vedleggurl);
        }
    }
}
