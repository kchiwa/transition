/*
 * An XML attribute type.
 * Localname: poststed
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.PoststedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one poststed(@) attribute.
 *
 * This is a complex type.
 */
public class PoststedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.PoststedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PoststedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTSTED$0 = 
        new javax.xml.namespace.QName("", "poststed");
    
    
    /**
     * Gets the "poststed" attribute
     */
    public java.lang.String getPoststed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTSTED$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "poststed" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPoststed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTSTED$0);
            return target;
        }
    }
    
    /**
     * True if has "poststed" attribute
     */
    public boolean isSetPoststed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTSTED$0) != null;
        }
    }
    
    /**
     * Sets the "poststed" attribute
     */
    public void setPoststed(java.lang.String poststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTSTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTSTED$0);
            }
            target.setStringValue(poststed);
        }
    }
    
    /**
     * Sets (as xml) the "poststed" attribute
     */
    public void xsetPoststed(org.apache.xmlbeans.XmlString poststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTSTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTSTED$0);
            }
            target.set(poststed);
        }
    }
    
    /**
     * Unsets the "poststed" attribute
     */
    public void unsetPoststed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTSTED$0);
        }
    }
}
