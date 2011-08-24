/*
 * An XML attribute type.
 * Localname: mappenavn
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.MappenavnAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one mappenavn(@) attribute.
 *
 * This is a complex type.
 */
public class MappenavnAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.MappenavnAttribute
{
    private static final long serialVersionUID = 1L;
    
    public MappenavnAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPENAVN$0 = 
        new javax.xml.namespace.QName("", "mappenavn");
    
    
    /**
     * Gets the "mappenavn" attribute
     */
    public java.lang.String getMappenavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPENAVN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mappenavn" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetMappenavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(MAPPENAVN$0);
            return target;
        }
    }
    
    /**
     * True if has "mappenavn" attribute
     */
    public boolean isSetMappenavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAPPENAVN$0) != null;
        }
    }
    
    /**
     * Sets the "mappenavn" attribute
     */
    public void setMappenavn(java.lang.String mappenavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPENAVN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPPENAVN$0);
            }
            target.setStringValue(mappenavn);
        }
    }
    
    /**
     * Sets (as xml) the "mappenavn" attribute
     */
    public void xsetMappenavn(org.apache.xmlbeans.XmlNCName mappenavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(MAPPENAVN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(MAPPENAVN$0);
            }
            target.set(mappenavn);
        }
    }
    
    /**
     * Unsets the "mappenavn" attribute
     */
    public void unsetMappenavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAPPENAVN$0);
        }
    }
}
