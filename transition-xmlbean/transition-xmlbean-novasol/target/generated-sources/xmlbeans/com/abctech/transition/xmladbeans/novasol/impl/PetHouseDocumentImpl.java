/*
 * An XML document type.
 * Localname: PetHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PetHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PetHouse(@) element.
 *
 * This is a complex type.
 */
public class PetHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PetHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PetHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PETHOUSE$0 = 
        new javax.xml.namespace.QName("", "PetHouse");
    
    
    /**
     * Gets the "PetHouse" element
     */
    public java.lang.String getPetHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PetHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetPetHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PetHouse" element
     */
    public void setPetHouse(java.lang.String petHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETHOUSE$0);
            }
            target.setStringValue(petHouse);
        }
    }
    
    /**
     * Sets (as xml) the "PetHouse" element
     */
    public void xsetPetHouse(org.apache.xmlbeans.XmlString petHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETHOUSE$0);
            }
            target.set(petHouse);
        }
    }
}
