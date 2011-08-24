/*
 * An XML document type.
 * Localname: FROMDATE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.FROMDATEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one FROMDATE(@) element.
 *
 * This is a complex type.
 */
public class FROMDATEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.FROMDATEDocument
{
    private static final long serialVersionUID = 1L;
    
    public FROMDATEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROMDATE$0 = 
        new javax.xml.namespace.QName("", "FROMDATE");
    
    
    /**
     * Gets the "FROMDATE" element
     */
    public java.lang.String getFROMDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FROMDATE" element
     */
    public org.apache.xmlbeans.XmlString xgetFROMDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FROMDATE" element
     */
    public void setFROMDATE(java.lang.String fromdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATE$0);
            }
            target.setStringValue(fromdate);
        }
    }
    
    /**
     * Sets (as xml) the "FROMDATE" element
     */
    public void xsetFROMDATE(org.apache.xmlbeans.XmlString fromdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMDATE$0);
            }
            target.set(fromdate);
        }
    }
}
