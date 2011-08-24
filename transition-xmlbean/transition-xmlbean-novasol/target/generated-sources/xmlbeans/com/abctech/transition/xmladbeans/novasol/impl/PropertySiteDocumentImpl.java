/*
 * An XML document type.
 * Localname: PropertySite
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertySiteDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertySite(@) element.
 *
 * This is a complex type.
 */
public class PropertySiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertySiteDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertySiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYSITE$0 = 
        new javax.xml.namespace.QName("", "PropertySite");
    
    
    /**
     * Gets the "PropertySite" element
     */
    public java.lang.String getPropertySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertySite" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYSITE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertySite" element
     */
    public void setPropertySite(java.lang.String propertySite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYSITE$0);
            }
            target.setStringValue(propertySite);
        }
    }
    
    /**
     * Sets (as xml) the "PropertySite" element
     */
    public void xsetPropertySite(org.apache.xmlbeans.XmlString propertySite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYSITE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYSITE$0);
            }
            target.set(propertySite);
        }
    }
}
