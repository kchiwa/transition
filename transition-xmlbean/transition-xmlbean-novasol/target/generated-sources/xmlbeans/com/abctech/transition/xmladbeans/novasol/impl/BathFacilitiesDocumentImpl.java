/*
 * An XML document type.
 * Localname: BathFacilities
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BathFacilitiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BathFacilities(@) element.
 *
 * This is a complex type.
 */
public class BathFacilitiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BathFacilitiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public BathFacilitiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BATHFACILITIES$0 = 
        new javax.xml.namespace.QName("", "BathFacilities");
    
    
    /**
     * Gets the "BathFacilities" element
     */
    public java.lang.String getBathFacilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHFACILITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BathFacilities" element
     */
    public org.apache.xmlbeans.XmlString xgetBathFacilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATHFACILITIES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BathFacilities" element
     */
    public void setBathFacilities(java.lang.String bathFacilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHFACILITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATHFACILITIES$0);
            }
            target.setStringValue(bathFacilities);
        }
    }
    
    /**
     * Sets (as xml) the "BathFacilities" element
     */
    public void xsetBathFacilities(org.apache.xmlbeans.XmlString bathFacilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATHFACILITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BATHFACILITIES$0);
            }
            target.set(bathFacilities);
        }
    }
}
