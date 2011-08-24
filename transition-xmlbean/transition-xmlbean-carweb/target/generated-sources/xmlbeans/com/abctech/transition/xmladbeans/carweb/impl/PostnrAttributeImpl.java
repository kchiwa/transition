/*
 * An XML attribute type.
 * Localname: postnr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.PostnrAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one postnr(@) attribute.
 *
 * This is a complex type.
 */
public class PostnrAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.PostnrAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PostnrAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTNR$0 = 
        new javax.xml.namespace.QName("", "postnr");
    
    
    /**
     * Gets the "postnr" attribute
     */
    public java.lang.String getPostnr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTNR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postnr" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPostnr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTNR$0);
            return target;
        }
    }
    
    /**
     * True if has "postnr" attribute
     */
    public boolean isSetPostnr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTNR$0) != null;
        }
    }
    
    /**
     * Sets the "postnr" attribute
     */
    public void setPostnr(java.lang.String postnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTNR$0);
            }
            target.setStringValue(postnr);
        }
    }
    
    /**
     * Sets (as xml) the "postnr" attribute
     */
    public void xsetPostnr(org.apache.xmlbeans.XmlString postnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTNR$0);
            }
            target.set(postnr);
        }
    }
    
    /**
     * Unsets the "postnr" attribute
     */
    public void unsetPostnr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTNR$0);
        }
    }
}
