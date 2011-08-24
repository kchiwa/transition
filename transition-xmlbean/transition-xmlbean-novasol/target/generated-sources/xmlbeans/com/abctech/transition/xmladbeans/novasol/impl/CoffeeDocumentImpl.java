/*
 * An XML document type.
 * Localname: Coffee
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CoffeeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Coffee(@) element.
 *
 * This is a complex type.
 */
public class CoffeeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CoffeeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoffeeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COFFEE$0 = 
        new javax.xml.namespace.QName("", "Coffee");
    
    
    /**
     * Gets the "Coffee" element
     */
    public java.lang.String getCoffee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COFFEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Coffee" element
     */
    public org.apache.xmlbeans.XmlString xgetCoffee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COFFEE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Coffee" element
     */
    public void setCoffee(java.lang.String coffee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COFFEE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COFFEE$0);
            }
            target.setStringValue(coffee);
        }
    }
    
    /**
     * Sets (as xml) the "Coffee" element
     */
    public void xsetCoffee(org.apache.xmlbeans.XmlString coffee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COFFEE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COFFEE$0);
            }
            target.set(coffee);
        }
    }
}
