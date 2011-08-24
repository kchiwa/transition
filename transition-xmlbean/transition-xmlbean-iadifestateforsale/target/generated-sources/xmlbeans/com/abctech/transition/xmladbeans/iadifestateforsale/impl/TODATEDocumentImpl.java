/*
 * An XML document type.
 * Localname: TODATE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.TODATEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one TODATE(@) element.
 *
 * This is a complex type.
 */
public class TODATEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.TODATEDocument
{
    private static final long serialVersionUID = 1L;
    
    public TODATEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TODATE$0 = 
        new javax.xml.namespace.QName("", "TODATE");
    
    
    /**
     * Gets the "TODATE" element
     */
    public java.lang.String getTODATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TODATE" element
     */
    public org.apache.xmlbeans.XmlString xgetTODATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TODATE" element
     */
    public void setTODATE(java.lang.String todate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATE$0);
            }
            target.setStringValue(todate);
        }
    }
    
    /**
     * Sets (as xml) the "TODATE" element
     */
    public void xsetTODATE(org.apache.xmlbeans.XmlString todate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TODATE$0);
            }
            target.set(todate);
        }
    }
}
