/*
 * An XML document type.
 * Localname: PropertyM2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyM2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyM2(@) element.
 *
 * This is a complex type.
 */
public class PropertyM2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyM2Document
{
    private static final long serialVersionUID = 1L;
    
    public PropertyM2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYM2$0 = 
        new javax.xml.namespace.QName("", "PropertyM2");
    
    
    /**
     * Gets the "PropertyM2" element
     */
    public java.math.BigInteger getPropertyM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYM2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyM2" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPropertyM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYM2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyM2" element
     */
    public void setPropertyM2(java.math.BigInteger propertyM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYM2$0);
            }
            target.setBigIntegerValue(propertyM2);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyM2" element
     */
    public void xsetPropertyM2(org.apache.xmlbeans.XmlInteger propertyM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYM2$0);
            }
            target.set(propertyM2);
        }
    }
}
