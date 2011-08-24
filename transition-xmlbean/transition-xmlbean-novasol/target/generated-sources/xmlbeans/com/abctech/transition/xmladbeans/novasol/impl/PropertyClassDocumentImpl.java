/*
 * An XML document type.
 * Localname: PropertyClass
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyClassDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyClass(@) element.
 *
 * This is a complex type.
 */
public class PropertyClassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyClassDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyClassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYCLASS$0 = 
        new javax.xml.namespace.QName("", "PropertyClass");
    
    
    /**
     * Gets the "PropertyClass" element
     */
    public java.lang.String getPropertyClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyClass" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCLASS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyClass" element
     */
    public void setPropertyClass(java.lang.String propertyClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYCLASS$0);
            }
            target.setStringValue(propertyClass);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyClass" element
     */
    public void xsetPropertyClass(org.apache.xmlbeans.XmlString propertyClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYCLASS$0);
            }
            target.set(propertyClass);
        }
    }
}
