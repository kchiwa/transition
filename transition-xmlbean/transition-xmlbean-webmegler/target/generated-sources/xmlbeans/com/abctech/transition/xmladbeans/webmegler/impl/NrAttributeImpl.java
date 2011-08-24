/*
 * An XML attribute type.
 * Localname: nr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.NrAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one nr(@) attribute.
 *
 * This is a complex type.
 */
public class NrAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.NrAttribute
{
    private static final long serialVersionUID = 1L;
    
    public NrAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NR$0 = 
        new javax.xml.namespace.QName("", "nr");
    
    
    /**
     * Gets the "nr" attribute
     */
    public java.math.BigInteger getNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "nr" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$0);
            return target;
        }
    }
    
    /**
     * True if has "nr" attribute
     */
    public boolean isSetNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NR$0) != null;
        }
    }
    
    /**
     * Sets the "nr" attribute
     */
    public void setNr(java.math.BigInteger nr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NR$0);
            }
            target.setBigIntegerValue(nr);
        }
    }
    
    /**
     * Sets (as xml) the "nr" attribute
     */
    public void xsetNr(org.apache.xmlbeans.XmlInteger nr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NR$0);
            }
            target.set(nr);
        }
    }
    
    /**
     * Unsets the "nr" attribute
     */
    public void unsetNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NR$0);
        }
    }
}
