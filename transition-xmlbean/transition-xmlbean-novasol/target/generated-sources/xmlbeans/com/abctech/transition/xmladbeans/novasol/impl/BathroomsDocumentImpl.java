/*
 * An XML document type.
 * Localname: Bathrooms
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BathroomsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Bathrooms(@) element.
 *
 * This is a complex type.
 */
public class BathroomsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BathroomsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BathroomsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BATHROOMS$0 = 
        new javax.xml.namespace.QName("", "Bathrooms");
    
    
    /**
     * Gets the "Bathrooms" element
     */
    public java.math.BigInteger getBathrooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Bathrooms" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBathrooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BATHROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Bathrooms" element
     */
    public void setBathrooms(java.math.BigInteger bathrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATHROOMS$0);
            }
            target.setBigIntegerValue(bathrooms);
        }
    }
    
    /**
     * Sets (as xml) the "Bathrooms" element
     */
    public void xsetBathrooms(org.apache.xmlbeans.XmlInteger bathrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BATHROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BATHROOMS$0);
            }
            target.set(bathrooms);
        }
    }
}
