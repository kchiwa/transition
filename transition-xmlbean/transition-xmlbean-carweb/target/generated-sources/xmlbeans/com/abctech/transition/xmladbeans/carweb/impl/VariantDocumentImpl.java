/*
 * An XML document type.
 * Localname: Variant
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.VariantDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Variant(@) element.
 *
 * This is a complex type.
 */
public class VariantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.VariantDocument
{
    private static final long serialVersionUID = 1L;
    
    public VariantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIANT$0 = 
        new javax.xml.namespace.QName("", "Variant");
    
    
    /**
     * Gets the "Variant" element
     */
    public java.lang.String getVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Variant" element
     */
    public org.apache.xmlbeans.XmlString xgetVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Variant" element
     */
    public void setVariant(java.lang.String variant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIANT$0);
            }
            target.setStringValue(variant);
        }
    }
    
    /**
     * Sets (as xml) the "Variant" element
     */
    public void xsetVariant(org.apache.xmlbeans.XmlString variant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIANT$0);
            }
            target.set(variant);
        }
    }
}
