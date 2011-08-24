/*
 * An XML document type.
 * Localname: gentime
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.GentimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one gentime(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class GentimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.GentimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GentimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENTIME$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "gentime");
    
    
    /**
     * Gets the "gentime" element
     */
    public java.lang.String getGentime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gentime" element
     */
    public org.apache.xmlbeans.XmlString xgetGentime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gentime" element
     */
    public void setGentime(java.lang.String gentime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENTIME$0);
            }
            target.setStringValue(gentime);
        }
    }
    
    /**
     * Sets (as xml) the "gentime" element
     */
    public void xsetGentime(org.apache.xmlbeans.XmlString gentime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENTIME$0);
            }
            target.set(gentime);
        }
    }
}
