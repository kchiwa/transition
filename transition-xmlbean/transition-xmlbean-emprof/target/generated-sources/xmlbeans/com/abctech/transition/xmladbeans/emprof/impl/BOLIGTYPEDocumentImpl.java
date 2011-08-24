/*
 * An XML document type.
 * Localname: BOLIGTYPE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BOLIGTYPEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BOLIGTYPE(@) element.
 *
 * This is a complex type.
 */
public class BOLIGTYPEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BOLIGTYPEDocument
{
    private static final long serialVersionUID = 1L;
    
    public BOLIGTYPEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOLIGTYPE$0 = 
        new javax.xml.namespace.QName("", "BOLIGTYPE");
    
    
    /**
     * Gets the "BOLIGTYPE" element
     */
    public java.lang.String getBOLIGTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BOLIGTYPE" element
     */
    public org.apache.xmlbeans.XmlString xgetBOLIGTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BOLIGTYPE" element
     */
    public void setBOLIGTYPE(java.lang.String boligtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLIGTYPE$0);
            }
            target.setStringValue(boligtype);
        }
    }
    
    /**
     * Sets (as xml) the "BOLIGTYPE" element
     */
    public void xsetBOLIGTYPE(org.apache.xmlbeans.XmlString boligtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOLIGTYPE$0);
            }
            target.set(boligtype);
        }
    }
}
