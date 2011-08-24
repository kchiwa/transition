/*
 * An XML document type.
 * Localname: Waterpark
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.WaterparkDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Waterpark(@) element.
 *
 * This is a complex type.
 */
public class WaterparkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.WaterparkDocument
{
    private static final long serialVersionUID = 1L;
    
    public WaterparkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WATERPARK$0 = 
        new javax.xml.namespace.QName("", "Waterpark");
    
    
    /**
     * Gets the "Waterpark" element
     */
    public java.lang.String getWaterpark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WATERPARK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Waterpark" element
     */
    public org.apache.xmlbeans.XmlString xgetWaterpark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WATERPARK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Waterpark" element
     */
    public void setWaterpark(java.lang.String waterpark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WATERPARK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WATERPARK$0);
            }
            target.setStringValue(waterpark);
        }
    }
    
    /**
     * Sets (as xml) the "Waterpark" element
     */
    public void xsetWaterpark(org.apache.xmlbeans.XmlString waterpark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WATERPARK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WATERPARK$0);
            }
            target.set(waterpark);
        }
    }
}
