/*
 * An XML document type.
 * Localname: GROSS_AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GROSSAREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GROSS_AREA(@) element.
 *
 * This is a complex type.
 */
public class GROSSAREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GROSSAREADocument
{
    private static final long serialVersionUID = 1L;
    
    public GROSSAREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROSSAREA$0 = 
        new javax.xml.namespace.QName("", "GROSS_AREA");
    
    
    /**
     * Gets the "GROSS_AREA" element
     */
    public java.lang.String getGROSSAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GROSS_AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetGROSSAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROSSAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GROSS_AREA" element
     */
    public void setGROSSAREA(java.lang.String grossarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSAREA$0);
            }
            target.setStringValue(grossarea);
        }
    }
    
    /**
     * Sets (as xml) the "GROSS_AREA" element
     */
    public void xsetGROSSAREA(org.apache.xmlbeans.XmlString grossarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROSSAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROSSAREA$0);
            }
            target.set(grossarea);
        }
    }
}
