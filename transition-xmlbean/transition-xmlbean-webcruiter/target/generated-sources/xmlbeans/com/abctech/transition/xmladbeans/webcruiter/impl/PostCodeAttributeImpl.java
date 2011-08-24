/*
 * An XML attribute type.
 * Localname: PostCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.PostCodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one PostCode(@) attribute.
 *
 * This is a complex type.
 */
public class PostCodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.PostCodeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PostCodeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTCODE$0 = 
        new javax.xml.namespace.QName("", "PostCode");
    
    
    /**
     * Gets the "PostCode" attribute
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "PostCode" attribute
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTCODE$0) != null;
        }
    }
    
    /**
     * Sets the "PostCode" attribute
     */
    public void setPostCode(java.lang.String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTCODE$0);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostCode" attribute
     */
    public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTCODE$0);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "PostCode" attribute
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTCODE$0);
        }
    }
}
