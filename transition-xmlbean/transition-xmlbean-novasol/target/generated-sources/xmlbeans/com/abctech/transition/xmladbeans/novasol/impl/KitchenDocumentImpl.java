/*
 * An XML document type.
 * Localname: Kitchen
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.KitchenDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Kitchen(@) element.
 *
 * This is a complex type.
 */
public class KitchenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.KitchenDocument
{
    private static final long serialVersionUID = 1L;
    
    public KitchenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KITCHEN$0 = 
        new javax.xml.namespace.QName("", "Kitchen");
    
    
    /**
     * Gets the "Kitchen" element
     */
    public java.lang.String getKitchen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KITCHEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kitchen" element
     */
    public org.apache.xmlbeans.XmlString xgetKitchen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KITCHEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kitchen" element
     */
    public void setKitchen(java.lang.String kitchen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KITCHEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KITCHEN$0);
            }
            target.setStringValue(kitchen);
        }
    }
    
    /**
     * Sets (as xml) the "Kitchen" element
     */
    public void xsetKitchen(org.apache.xmlbeans.XmlString kitchen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KITCHEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KITCHEN$0);
            }
            target.set(kitchen);
        }
    }
}
