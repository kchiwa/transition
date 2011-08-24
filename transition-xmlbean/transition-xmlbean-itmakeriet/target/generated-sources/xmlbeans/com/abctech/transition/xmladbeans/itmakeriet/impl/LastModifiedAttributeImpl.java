/*
 * An XML attribute type.
 * Localname: LastModified
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.LastModifiedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one LastModified(@) attribute.
 *
 * This is a complex type.
 */
public class LastModifiedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.LastModifiedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LastModifiedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTMODIFIED$0 = 
        new javax.xml.namespace.QName("", "LastModified");
    
    
    /**
     * Gets the "LastModified" attribute
     */
    public java.lang.String getLastModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastModified" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLastModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$0);
            return target;
        }
    }
    
    /**
     * True if has "LastModified" attribute
     */
    public boolean isSetLastModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTMODIFIED$0) != null;
        }
    }
    
    /**
     * Sets the "LastModified" attribute
     */
    public void setLastModified(java.lang.String lastModified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTMODIFIED$0);
            }
            target.setStringValue(lastModified);
        }
    }
    
    /**
     * Sets (as xml) the "LastModified" attribute
     */
    public void xsetLastModified(org.apache.xmlbeans.XmlString lastModified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTMODIFIED$0);
            }
            target.set(lastModified);
        }
    }
    
    /**
     * Unsets the "LastModified" attribute
     */
    public void unsetLastModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTMODIFIED$0);
        }
    }
}
