/*
 * An XML document type.
 * Localname: PropertySiteM2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertySiteM2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertySiteM2(@) element.
 *
 * This is a complex type.
 */
public class PropertySiteM2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertySiteM2Document
{
    private static final long serialVersionUID = 1L;
    
    public PropertySiteM2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYSITEM2$0 = 
        new javax.xml.namespace.QName("", "PropertySiteM2");
    
    
    /**
     * Gets the "PropertySiteM2" element
     */
    public java.math.BigInteger getPropertySiteM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITEM2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertySiteM2" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPropertySiteM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYSITEM2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertySiteM2" element
     */
    public void setPropertySiteM2(java.math.BigInteger propertySiteM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITEM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYSITEM2$0);
            }
            target.setBigIntegerValue(propertySiteM2);
        }
    }
    
    /**
     * Sets (as xml) the "PropertySiteM2" element
     */
    public void xsetPropertySiteM2(org.apache.xmlbeans.XmlInteger propertySiteM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYSITEM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYSITEM2$0);
            }
            target.set(propertySiteM2);
        }
    }
}
