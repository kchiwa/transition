/*
 * An XML document type.
 * Localname: Pets
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Pets(@) element.
 *
 * This is a complex type.
 */
public class PetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PETS$0 = 
        new javax.xml.namespace.QName("", "Pets");
    
    
    /**
     * Gets the "Pets" element
     */
    public java.lang.String getPets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pets" element
     */
    public org.apache.xmlbeans.XmlString xgetPets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Pets" element
     */
    public void setPets(java.lang.String pets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETS$0);
            }
            target.setStringValue(pets);
        }
    }
    
    /**
     * Sets (as xml) the "Pets" element
     */
    public void xsetPets(org.apache.xmlbeans.XmlString pets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETS$0);
            }
            target.set(pets);
        }
    }
}
