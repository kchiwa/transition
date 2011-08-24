/*
 * An XML document type.
 * Localname: PropertySite2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertySite2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertySite2(@) element.
 *
 * This is a complex type.
 */
public class PropertySite2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertySite2Document
{
    private static final long serialVersionUID = 1L;
    
    public PropertySite2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYSITE2$0 = 
        new javax.xml.namespace.QName("", "PropertySite2");
    
    
    /**
     * Gets the "PropertySite2" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 getPropertySite2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().find_element_user(PROPERTYSITE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PropertySite2" element
     */
    public void setPropertySite2(com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 propertySite2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().find_element_user(PROPERTYSITE2$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().add_element_user(PROPERTYSITE2$0);
            }
            target.set(propertySite2);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertySite2" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 addNewPropertySite2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().add_element_user(PROPERTYSITE2$0);
            return target;
        }
    }
    /**
     * An XML PropertySite2(@).
     *
     * This is a complex type.
     */
    public static class PropertySite2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2
    {
        private static final long serialVersionUID = 1L;
        
        public PropertySite2Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
