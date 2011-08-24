/*
 * An XML document type.
 * Localname: TypeDistanceWater
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TypeDistanceWaterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one TypeDistanceWater(@) element.
 *
 * This is a complex type.
 */
public class TypeDistanceWaterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TypeDistanceWaterDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDistanceWaterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEDISTANCEWATER$0 = 
        new javax.xml.namespace.QName("", "TypeDistanceWater");
    
    
    /**
     * Gets the "TypeDistanceWater" element
     */
    public java.lang.String getTypeDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeDistanceWater" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDISTANCEWATER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TypeDistanceWater" element
     */
    public void setTypeDistanceWater(java.lang.String typeDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEDISTANCEWATER$0);
            }
            target.setStringValue(typeDistanceWater);
        }
    }
    
    /**
     * Sets (as xml) the "TypeDistanceWater" element
     */
    public void xsetTypeDistanceWater(org.apache.xmlbeans.XmlString typeDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEDISTANCEWATER$0);
            }
            target.set(typeDistanceWater);
        }
    }
}
