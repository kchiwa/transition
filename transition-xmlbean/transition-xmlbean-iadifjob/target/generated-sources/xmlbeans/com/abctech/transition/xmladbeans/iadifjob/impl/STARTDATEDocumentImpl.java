/*
 * An XML document type.
 * Localname: START_DATE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.STARTDATEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one START_DATE(@) element.
 *
 * This is a complex type.
 */
public class STARTDATEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.STARTDATEDocument
{
    private static final long serialVersionUID = 1L;
    
    public STARTDATEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("", "START_DATE");
    
    
    /**
     * Gets the "START_DATE" element
     */
    public java.lang.String getSTARTDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "START_DATE" element
     */
    public org.apache.xmlbeans.XmlString xgetSTARTDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "START_DATE" element
     */
    public void setSTARTDATE(java.lang.String startdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
            }
            target.setStringValue(startdate);
        }
    }
    
    /**
     * Sets (as xml) the "START_DATE" element
     */
    public void xsetSTARTDATE(org.apache.xmlbeans.XmlString startdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$0);
            }
            target.set(startdate);
        }
    }
}
