/*
 * An XML document type.
 * Localname: Garage
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.GarageDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Garage(@) element.
 *
 * This is a complex type.
 */
public class GarageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.GarageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GarageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GARAGE$0 = 
        new javax.xml.namespace.QName("", "Garage");
    
    
    /**
     * Gets the "Garage" element
     */
    public java.lang.String getGarage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Garage" element
     */
    public org.apache.xmlbeans.XmlString xgetGarage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Garage" element
     */
    public void setGarage(java.lang.String garage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GARAGE$0);
            }
            target.setStringValue(garage);
        }
    }
    
    /**
     * Sets (as xml) the "Garage" element
     */
    public void xsetGarage(org.apache.xmlbeans.XmlString garage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GARAGE$0);
            }
            target.set(garage);
        }
    }
}
