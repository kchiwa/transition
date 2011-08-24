/*
 * An XML document type.
 * Localname: Dishwasher
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DishwasherDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Dishwasher(@) element.
 *
 * This is a complex type.
 */
public class DishwasherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DishwasherDocument
{
    private static final long serialVersionUID = 1L;
    
    public DishwasherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISHWASHER$0 = 
        new javax.xml.namespace.QName("", "Dishwasher");
    
    
    /**
     * Gets the "Dishwasher" element
     */
    public java.lang.String getDishwasher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISHWASHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dishwasher" element
     */
    public org.apache.xmlbeans.XmlString xgetDishwasher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISHWASHER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Dishwasher" element
     */
    public void setDishwasher(java.lang.String dishwasher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISHWASHER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISHWASHER$0);
            }
            target.setStringValue(dishwasher);
        }
    }
    
    /**
     * Sets (as xml) the "Dishwasher" element
     */
    public void xsetDishwasher(org.apache.xmlbeans.XmlString dishwasher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISHWASHER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISHWASHER$0);
            }
            target.set(dishwasher);
        }
    }
}
