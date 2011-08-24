/*
 * An XML document type.
 * Localname: LINKTYPE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.LINKTYPEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one LINKTYPE(@) element.
 *
 * This is a complex type.
 */
public class LINKTYPEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.LINKTYPEDocument
{
    private static final long serialVersionUID = 1L;
    
    public LINKTYPEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKTYPE$0 = 
        new javax.xml.namespace.QName("", "LINKTYPE");
    
    
    /**
     * Gets the "LINKTYPE" element
     */
    public java.lang.String getLINKTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LINKTYPE" element
     */
    public org.apache.xmlbeans.XmlString xgetLINKTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LINKTYPE" element
     */
    public void setLINKTYPE(java.lang.String linktype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTYPE$0);
            }
            target.setStringValue(linktype);
        }
    }
    
    /**
     * Sets (as xml) the "LINKTYPE" element
     */
    public void xsetLINKTYPE(org.apache.xmlbeans.XmlString linktype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTYPE$0);
            }
            target.set(linktype);
        }
    }
}
