/*
 * An XML attribute type.
 * Localname: deleted
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.DeletedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one deleted(@) attribute.
 *
 * This is a complex type.
 */
public class DeletedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.DeletedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DeletedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETED$0 = 
        new javax.xml.namespace.QName("", "deleted");
    
    
    /**
     * Gets the "deleted" attribute
     */
    public java.lang.String getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleted" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELETED$0);
            return target;
        }
    }
    
    /**
     * True if has "deleted" attribute
     */
    public boolean isSetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETED$0) != null;
        }
    }
    
    /**
     * Sets the "deleted" attribute
     */
    public void setDeleted(java.lang.String deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETED$0);
            }
            target.setStringValue(deleted);
        }
    }
    
    /**
     * Sets (as xml) the "deleted" attribute
     */
    public void xsetDeleted(org.apache.xmlbeans.XmlString deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELETED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELETED$0);
            }
            target.set(deleted);
        }
    }
    
    /**
     * Unsets the "deleted" attribute
     */
    public void unsetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETED$0);
        }
    }
}
