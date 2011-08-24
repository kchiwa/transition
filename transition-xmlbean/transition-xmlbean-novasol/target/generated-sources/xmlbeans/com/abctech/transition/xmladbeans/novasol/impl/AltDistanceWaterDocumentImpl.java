/*
 * An XML document type.
 * Localname: AltDistanceWater
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AltDistanceWaterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one AltDistanceWater(@) element.
 *
 * This is a complex type.
 */
public class AltDistanceWaterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AltDistanceWaterDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltDistanceWaterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTDISTANCEWATER$0 = 
        new javax.xml.namespace.QName("", "AltDistanceWater");
    
    
    /**
     * Gets the "AltDistanceWater" element
     */
    public java.lang.String getAltDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTDISTANCEWATER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AltDistanceWater" element
     */
    public org.apache.xmlbeans.XmlString xgetAltDistanceWater()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTDISTANCEWATER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AltDistanceWater" element
     */
    public void setAltDistanceWater(java.lang.String altDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTDISTANCEWATER$0);
            }
            target.setStringValue(altDistanceWater);
        }
    }
    
    /**
     * Sets (as xml) the "AltDistanceWater" element
     */
    public void xsetAltDistanceWater(org.apache.xmlbeans.XmlString altDistanceWater)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTDISTANCEWATER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTDISTANCEWATER$0);
            }
            target.set(altDistanceWater);
        }
    }
}
