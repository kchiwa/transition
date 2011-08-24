/*
 * An XML attribute type.
 * Localname: modified
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.ModifiedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one modified(@) attribute.
 *
 * This is a complex type.
 */
public class ModifiedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ModifiedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ModifiedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIED$0 = 
        new javax.xml.namespace.QName("", "modified");
    
    
    /**
     * Gets the "modified" attribute
     */
    public java.lang.String getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" attribute
     */
    public org.apache.xmlbeans.XmlString xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODIFIED$0);
            return target;
        }
    }
    
    /**
     * True if has "modified" attribute
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MODIFIED$0) != null;
        }
    }
    
    /**
     * Sets the "modified" attribute
     */
    public void setModified(java.lang.String modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODIFIED$0);
            }
            target.setStringValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" attribute
     */
    public void xsetModified(org.apache.xmlbeans.XmlString modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODIFIED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODIFIED$0);
            }
            target.set(modified);
        }
    }
    
    /**
     * Unsets the "modified" attribute
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MODIFIED$0);
        }
    }
}
