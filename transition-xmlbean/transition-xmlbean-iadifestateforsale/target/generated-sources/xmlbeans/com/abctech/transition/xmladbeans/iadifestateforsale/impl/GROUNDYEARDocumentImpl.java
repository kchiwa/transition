/*
 * An XML document type.
 * Localname: GROUND_YEAR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GROUNDYEARDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GROUND_YEAR(@) element.
 *
 * This is a complex type.
 */
public class GROUNDYEARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GROUNDYEARDocument
{
    private static final long serialVersionUID = 1L;
    
    public GROUNDYEARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUNDYEAR$0 = 
        new javax.xml.namespace.QName("", "GROUND_YEAR");
    
    
    /**
     * Gets the "GROUND_YEAR" element
     */
    public java.lang.String getGROUNDYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GROUND_YEAR" element
     */
    public org.apache.xmlbeans.XmlString xgetGROUNDYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GROUND_YEAR" element
     */
    public void setGROUNDYEAR(java.lang.String groundyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDYEAR$0);
            }
            target.setStringValue(groundyear);
        }
    }
    
    /**
     * Sets (as xml) the "GROUND_YEAR" element
     */
    public void xsetGROUNDYEAR(org.apache.xmlbeans.XmlString groundyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDYEAR$0);
            }
            target.set(groundyear);
        }
    }
}
