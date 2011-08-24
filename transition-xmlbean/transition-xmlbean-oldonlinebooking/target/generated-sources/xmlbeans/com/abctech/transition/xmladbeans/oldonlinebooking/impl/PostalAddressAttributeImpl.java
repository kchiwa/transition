/*
 * An XML attribute type.
 * Localname: postal_address
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.PostalAddressAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one postal_address(@) attribute.
 *
 * This is a complex type.
 */
public class PostalAddressAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.PostalAddressAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PostalAddressAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALADDRESS$0 = 
        new javax.xml.namespace.QName("", "postal_address");
    
    
    /**
     * Gets the "postal_address" attribute
     */
    public java.lang.String getPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALADDRESS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postal_address" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALADDRESS$0);
            return target;
        }
    }
    
    /**
     * True if has "postal_address" attribute
     */
    public boolean isSetPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTALADDRESS$0) != null;
        }
    }
    
    /**
     * Sets the "postal_address" attribute
     */
    public void setPostalAddress(java.lang.String postalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALADDRESS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTALADDRESS$0);
            }
            target.setStringValue(postalAddress);
        }
    }
    
    /**
     * Sets (as xml) the "postal_address" attribute
     */
    public void xsetPostalAddress(org.apache.xmlbeans.XmlString postalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALADDRESS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTALADDRESS$0);
            }
            target.set(postalAddress);
        }
    }
    
    /**
     * Unsets the "postal_address" attribute
     */
    public void unsetPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTALADDRESS$0);
        }
    }
}
