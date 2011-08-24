/*
 * An XML document type.
 * Localname: pubdate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.PubdateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one pubdate(@) element.
 *
 * This is a complex type.
 */
public class PubdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.PubdateDocument
{
    private static final long serialVersionUID = 1L;
    
    public PubdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBDATE$0 = 
        new javax.xml.namespace.QName("", "pubdate");
    
    
    /**
     * Gets the "pubdate" element
     */
    public java.lang.String getPubdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pubdate" element
     */
    public org.apache.xmlbeans.XmlString xgetPubdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pubdate" element
     */
    public void setPubdate(java.lang.String pubdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBDATE$0);
            }
            target.setStringValue(pubdate);
        }
    }
    
    /**
     * Sets (as xml) the "pubdate" element
     */
    public void xsetPubdate(org.apache.xmlbeans.XmlString pubdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBDATE$0);
            }
            target.set(pubdate);
        }
    }
}
