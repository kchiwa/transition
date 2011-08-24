/*
 * An XML document type.
 * Localname: PropertyType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyType(@) element.
 *
 * This is a complex type.
 */
public class PropertyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYTYPE$0 = 
        new javax.xml.namespace.QName("", "PropertyType");
    
    
    /**
     * Gets the "PropertyType" element
     */
    public java.lang.String getPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyType" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyType" element
     */
    public void setPropertyType(java.lang.String propertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$0);
            }
            target.setStringValue(propertyType);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyType" element
     */
    public void xsetPropertyType(org.apache.xmlbeans.XmlString propertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$0);
            }
            target.set(propertyType);
        }
    }
}
