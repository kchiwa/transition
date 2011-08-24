/*
 * An XML document type.
 * Localname: FishingHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FishingHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FishingHouse(@) element.
 *
 * This is a complex type.
 */
public class FishingHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FishingHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public FishingHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FISHINGHOUSE$0 = 
        new javax.xml.namespace.QName("", "FishingHouse");
    
    
    /**
     * Gets the "FishingHouse" element
     */
    public java.lang.String getFishingHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHINGHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FishingHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetFishingHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHINGHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FishingHouse" element
     */
    public void setFishingHouse(java.lang.String fishingHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHINGHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISHINGHOUSE$0);
            }
            target.setStringValue(fishingHouse);
        }
    }
    
    /**
     * Sets (as xml) the "FishingHouse" element
     */
    public void xsetFishingHouse(org.apache.xmlbeans.XmlString fishingHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHINGHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISHINGHOUSE$0);
            }
            target.set(fishingHouse);
        }
    }
}
