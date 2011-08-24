/*
 * An XML attribute type.
 * Localname: postal_code
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.PostalCodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one postal_code(@) attribute.
 *
 * This is a complex type.
 */
public class PostalCodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.PostalCodeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PostalCodeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALCODE$0 = 
        new javax.xml.namespace.QName("", "postal_code");
    
    
    /**
     * Gets the "postal_code" attribute
     */
    public java.lang.String getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postal_code" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "postal_code" attribute
     */
    public boolean isSetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTALCODE$0) != null;
        }
    }
    
    /**
     * Sets the "postal_code" attribute
     */
    public void setPostalCode(java.lang.String postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTALCODE$0);
            }
            target.setStringValue(postalCode);
        }
    }
    
    /**
     * Sets (as xml) the "postal_code" attribute
     */
    public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTALCODE$0);
            }
            target.set(postalCode);
        }
    }
    
    /**
     * Unsets the "postal_code" attribute
     */
    public void unsetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTALCODE$0);
        }
    }
}
