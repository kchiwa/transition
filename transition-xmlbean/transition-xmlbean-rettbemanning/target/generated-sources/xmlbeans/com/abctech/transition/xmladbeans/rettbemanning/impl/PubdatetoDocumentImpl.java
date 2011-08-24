/*
 * An XML document type.
 * Localname: pubdateto
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.PubdatetoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one pubdateto(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class PubdatetoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.PubdatetoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PubdatetoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBDATETO$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "pubdateto");
    
    
    /**
     * Gets the "pubdateto" element
     */
    public java.lang.String getPubdateto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pubdateto" element
     */
    public org.apache.xmlbeans.XmlString xgetPubdateto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATETO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pubdateto" element
     */
    public void setPubdateto(java.lang.String pubdateto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATETO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBDATETO$0);
            }
            target.setStringValue(pubdateto);
        }
    }
    
    /**
     * Sets (as xml) the "pubdateto" element
     */
    public void xsetPubdateto(org.apache.xmlbeans.XmlString pubdateto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATETO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBDATETO$0);
            }
            target.set(pubdateto);
        }
    }
}
