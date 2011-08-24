/*
 * An XML document type.
 * Localname: EnergyClass
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.EnergyClassDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one EnergyClass(@) element.
 *
 * This is a complex type.
 */
public class EnergyClassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.EnergyClassDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnergyClassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENERGYCLASS$0 = 
        new javax.xml.namespace.QName("", "EnergyClass");
    
    
    /**
     * Gets the "EnergyClass" element
     */
    public java.lang.String getEnergyClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EnergyClass" element
     */
    public org.apache.xmlbeans.XmlString xgetEnergyClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYCLASS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EnergyClass" element
     */
    public void setEnergyClass(java.lang.String energyClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYCLASS$0);
            }
            target.setStringValue(energyClass);
        }
    }
    
    /**
     * Sets (as xml) the "EnergyClass" element
     */
    public void xsetEnergyClass(org.apache.xmlbeans.XmlString energyClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYCLASS$0);
            }
            target.set(energyClass);
        }
    }
}
