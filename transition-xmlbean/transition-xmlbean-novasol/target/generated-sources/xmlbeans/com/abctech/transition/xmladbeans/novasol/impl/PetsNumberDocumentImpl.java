/*
 * An XML document type.
 * Localname: PetsNumber
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PetsNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PetsNumber(@) element.
 *
 * This is a complex type.
 */
public class PetsNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PetsNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PetsNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PETSNUMBER$0 = 
        new javax.xml.namespace.QName("", "PetsNumber");
    
    
    /**
     * Gets the "PetsNumber" element
     */
    public java.lang.String getPetsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETSNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PetsNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPetsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETSNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PetsNumber" element
     */
    public void setPetsNumber(java.lang.String petsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETSNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETSNUMBER$0);
            }
            target.setStringValue(petsNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PetsNumber" element
     */
    public void xsetPetsNumber(org.apache.xmlbeans.XmlString petsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETSNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETSNUMBER$0);
            }
            target.set(petsNumber);
        }
    }
}
