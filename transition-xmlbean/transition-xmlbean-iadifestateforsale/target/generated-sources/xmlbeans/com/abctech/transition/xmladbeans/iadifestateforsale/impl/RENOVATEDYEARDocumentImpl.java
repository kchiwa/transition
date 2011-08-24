/*
 * An XML document type.
 * Localname: RENOVATED_YEAR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.RENOVATEDYEARDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one RENOVATED_YEAR(@) element.
 *
 * This is a complex type.
 */
public class RENOVATEDYEARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.RENOVATEDYEARDocument
{
    private static final long serialVersionUID = 1L;
    
    public RENOVATEDYEARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENOVATEDYEAR$0 = 
        new javax.xml.namespace.QName("", "RENOVATED_YEAR");
    
    
    /**
     * Gets the "RENOVATED_YEAR" element
     */
    public java.lang.String getRENOVATEDYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENOVATEDYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RENOVATED_YEAR" element
     */
    public org.apache.xmlbeans.XmlString xgetRENOVATEDYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENOVATEDYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RENOVATED_YEAR" element
     */
    public void setRENOVATEDYEAR(java.lang.String renovatedyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENOVATEDYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENOVATEDYEAR$0);
            }
            target.setStringValue(renovatedyear);
        }
    }
    
    /**
     * Sets (as xml) the "RENOVATED_YEAR" element
     */
    public void xsetRENOVATEDYEAR(org.apache.xmlbeans.XmlString renovatedyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENOVATEDYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENOVATEDYEAR$0);
            }
            target.set(renovatedyear);
        }
    }
}
