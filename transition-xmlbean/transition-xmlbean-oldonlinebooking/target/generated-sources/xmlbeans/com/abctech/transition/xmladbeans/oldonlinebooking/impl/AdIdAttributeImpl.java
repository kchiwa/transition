/*
 * An XML attribute type.
 * Localname: ad_id
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AdIdAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one ad_id(@) attribute.
 *
 * This is a complex type.
 */
public class AdIdAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AdIdAttribute
{
    private static final long serialVersionUID = 1L;
    
    public AdIdAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADID$0 = 
        new javax.xml.namespace.QName("", "ad_id");
    
    
    /**
     * Gets the "ad_id" attribute
     */
    public java.lang.String getAdId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ad_id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAdId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADID$0);
            return target;
        }
    }
    
    /**
     * True if has "ad_id" attribute
     */
    public boolean isSetAdId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADID$0) != null;
        }
    }
    
    /**
     * Sets the "ad_id" attribute
     */
    public void setAdId(java.lang.String adId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADID$0);
            }
            target.setStringValue(adId);
        }
    }
    
    /**
     * Sets (as xml) the "ad_id" attribute
     */
    public void xsetAdId(org.apache.xmlbeans.XmlString adId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADID$0);
            }
            target.set(adId);
        }
    }
    
    /**
     * Unsets the "ad_id" attribute
     */
    public void unsetAdId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADID$0);
        }
    }
}
