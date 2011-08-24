/*
 * An XML document type.
 * Localname: AltTypeDistanceWater
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AltTypeDistanceWaterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one AltTypeDistanceWater(@) element.
 *
 * This is a complex type.
 */
public class AltTypeDistanceWaterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AltTypeDistanceWaterDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltTypeDistanceWaterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTTYPEDISTANCEWATER$0 = 
        new javax.xml.namespace.QName("", "AltTypeDistanceWater");
    
    
    /**
     * Gets the "AltTypeDistanceWater" element
     */
    public java.lang.String getAltTypeDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTTYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AltTypeDistanceWater" element
     */
    public org.apache.xmlbeans.XmlString xgetAltTypeDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTTYPEDISTANCEWATER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AltTypeDistanceWater" element
     */
    public void setAltTypeDistanceWater(java.lang.String altTypeDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTTYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTTYPEDISTANCEWATER$0);
            }
            target.setStringValue(altTypeDistanceWater);
        }
    }
    
    /**
     * Sets (as xml) the "AltTypeDistanceWater" element
     */
    public void xsetAltTypeDistanceWater(org.apache.xmlbeans.XmlString altTypeDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTTYPEDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTTYPEDISTANCEWATER$0);
            }
            target.set(altTypeDistanceWater);
        }
    }
}
