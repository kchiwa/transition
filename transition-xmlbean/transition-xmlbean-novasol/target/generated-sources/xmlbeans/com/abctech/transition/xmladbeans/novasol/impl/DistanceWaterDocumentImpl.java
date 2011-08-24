/*
 * An XML document type.
 * Localname: DistanceWater
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceWaterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceWater(@) element.
 *
 * This is a complex type.
 */
public class DistanceWaterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceWaterDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceWaterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCEWATER$0 = 
        new javax.xml.namespace.QName("", "DistanceWater");
    
    
    /**
     * Gets the "DistanceWater" element
     */
    public java.lang.String getDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEWATER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceWater" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEWATER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceWater" element
     */
    public void setDistanceWater(java.lang.String distanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEWATER$0);
            }
            target.setStringValue(distanceWater);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceWater" element
     */
    public void xsetDistanceWater(org.apache.xmlbeans.XmlString distanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEWATER$0);
            }
            target.set(distanceWater);
        }
    }
}
