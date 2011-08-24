/*
 * An XML attribute type.
 * Localname: TIL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.TILAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one TIL(@) attribute.
 *
 * This is a complex type.
 */
public class TILAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.TILAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TILAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIL$0 = 
        new javax.xml.namespace.QName("", "TIL");
    
    
    /**
     * Gets the "TIL" attribute
     */
    public java.lang.String getTIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TIL" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIL$0);
            return target;
        }
    }
    
    /**
     * True if has "TIL" attribute
     */
    public boolean isSetTIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIL$0) != null;
        }
    }
    
    /**
     * Sets the "TIL" attribute
     */
    public void setTIL(java.lang.String til)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIL$0);
            }
            target.setStringValue(til);
        }
    }
    
    /**
     * Sets (as xml) the "TIL" attribute
     */
    public void xsetTIL(org.apache.xmlbeans.XmlString til)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIL$0);
            }
            target.set(til);
        }
    }
    
    /**
     * Unsets the "TIL" attribute
     */
    public void unsetTIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIL$0);
        }
    }
}
