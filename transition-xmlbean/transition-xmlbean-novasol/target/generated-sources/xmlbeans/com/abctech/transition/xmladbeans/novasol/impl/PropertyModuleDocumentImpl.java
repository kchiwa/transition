/*
 * An XML document type.
 * Localname: PropertyModule
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyModuleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyModule(@) element.
 *
 * This is a complex type.
 */
public class PropertyModuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyModuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyModuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYMODULE$0 = 
        new javax.xml.namespace.QName("", "PropertyModule");
    
    
    /**
     * Gets the "PropertyModule" element
     */
    public java.math.BigInteger getPropertyModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYMODULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyModule" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPropertyModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYMODULE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyModule" element
     */
    public void setPropertyModule(java.math.BigInteger propertyModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYMODULE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYMODULE$0);
            }
            target.setBigIntegerValue(propertyModule);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyModule" element
     */
    public void xsetPropertyModule(org.apache.xmlbeans.XmlInteger propertyModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYMODULE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYMODULE$0);
            }
            target.set(propertyModule);
        }
    }
}
