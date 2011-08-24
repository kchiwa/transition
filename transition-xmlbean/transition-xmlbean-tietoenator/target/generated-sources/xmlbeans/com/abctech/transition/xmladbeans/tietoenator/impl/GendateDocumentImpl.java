/*
 * An XML document type.
 * Localname: gendate
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.GendateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one gendate(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class GendateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.GendateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GendateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENDATE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "gendate");
    
    
    /**
     * Gets the "gendate" element
     */
    public java.lang.String getGendate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gendate" element
     */
    public org.apache.xmlbeans.XmlString xgetGendate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gendate" element
     */
    public void setGendate(java.lang.String gendate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDATE$0);
            }
            target.setStringValue(gendate);
        }
    }
    
    /**
     * Sets (as xml) the "gendate" element
     */
    public void xsetGendate(org.apache.xmlbeans.XmlString gendate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENDATE$0);
            }
            target.set(gendate);
        }
    }
}
