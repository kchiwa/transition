/*
 * An XML document type.
 * Localname: BELIGGENHET
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BELIGGENHETDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BELIGGENHET(@) element.
 *
 * This is a complex type.
 */
public class BELIGGENHETDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BELIGGENHETDocument
{
    private static final long serialVersionUID = 1L;
    
    public BELIGGENHETDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BELIGGENHET$0 = 
        new javax.xml.namespace.QName("", "BELIGGENHET");
    
    
    /**
     * Gets the "BELIGGENHET" element
     */
    public java.lang.String getBELIGGENHET()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BELIGGENHET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BELIGGENHET" element
     */
    public org.apache.xmlbeans.XmlString xgetBELIGGENHET()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BELIGGENHET$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BELIGGENHET" element
     */
    public void setBELIGGENHET(java.lang.String beliggenhet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BELIGGENHET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BELIGGENHET$0);
            }
            target.setStringValue(beliggenhet);
        }
    }
    
    /**
     * Sets (as xml) the "BELIGGENHET" element
     */
    public void xsetBELIGGENHET(org.apache.xmlbeans.XmlString beliggenhet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BELIGGENHET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BELIGGENHET$0);
            }
            target.set(beliggenhet);
        }
    }
}
