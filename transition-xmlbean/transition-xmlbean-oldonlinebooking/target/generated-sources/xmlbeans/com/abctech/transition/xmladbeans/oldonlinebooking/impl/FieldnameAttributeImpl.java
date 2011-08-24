/*
 * An XML attribute type.
 * Localname: fieldname
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.FieldnameAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one fieldname(@) attribute.
 *
 * This is a complex type.
 */
public class FieldnameAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.FieldnameAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FieldnameAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNAME$0 = 
        new javax.xml.namespace.QName("", "fieldname");
    
    
    /**
     * Gets the "fieldname" attribute
     */
    public java.lang.String getFieldname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFieldname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "fieldname" attribute
     */
    public boolean isSetFieldname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDNAME$0) != null;
        }
    }
    
    /**
     * Sets the "fieldname" attribute
     */
    public void setFieldname(java.lang.String fieldname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
            }
            target.setStringValue(fieldname);
        }
    }
    
    /**
     * Sets (as xml) the "fieldname" attribute
     */
    public void xsetFieldname(org.apache.xmlbeans.XmlString fieldname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
            }
            target.set(fieldname);
        }
    }
    
    /**
     * Unsets the "fieldname" attribute
     */
    public void unsetFieldname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDNAME$0);
        }
    }
}
