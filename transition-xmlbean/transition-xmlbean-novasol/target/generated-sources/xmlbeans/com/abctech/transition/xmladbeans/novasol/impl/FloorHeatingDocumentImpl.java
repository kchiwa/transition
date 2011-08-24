/*
 * An XML document type.
 * Localname: FloorHeating
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FloorHeatingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FloorHeating(@) element.
 *
 * This is a complex type.
 */
public class FloorHeatingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FloorHeatingDocument
{
    private static final long serialVersionUID = 1L;
    
    public FloorHeatingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOORHEATING$0 = 
        new javax.xml.namespace.QName("", "FloorHeating");
    
    
    /**
     * Gets the "FloorHeating" element
     */
    public java.lang.String getFloorHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORHEATING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FloorHeating" element
     */
    public org.apache.xmlbeans.XmlString xgetFloorHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORHEATING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FloorHeating" element
     */
    public void setFloorHeating(java.lang.String floorHeating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORHEATING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOORHEATING$0);
            }
            target.setStringValue(floorHeating);
        }
    }
    
    /**
     * Sets (as xml) the "FloorHeating" element
     */
    public void xsetFloorHeating(org.apache.xmlbeans.XmlString floorHeating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORHEATING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOORHEATING$0);
            }
            target.set(floorHeating);
        }
    }
}
