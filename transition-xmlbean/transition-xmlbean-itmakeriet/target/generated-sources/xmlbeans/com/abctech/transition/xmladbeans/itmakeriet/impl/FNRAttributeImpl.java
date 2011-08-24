/*
 * An XML attribute type.
 * Localname: FNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.FNRAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one FNR(@) attribute.
 *
 * This is a complex type.
 */
public class FNRAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.FNRAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FNRAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FNR$0 = 
        new javax.xml.namespace.QName("", "FNR");
    
    
    /**
     * Gets the "FNR" attribute
     */
    public java.math.BigInteger getFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FNR$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FNR" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FNR$0);
            return target;
        }
    }
    
    /**
     * True if has "FNR" attribute
     */
    public boolean isSetFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FNR$0) != null;
        }
    }
    
    /**
     * Sets the "FNR" attribute
     */
    public void setFNR(java.math.BigInteger fnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FNR$0);
            }
            target.setBigIntegerValue(fnr);
        }
    }
    
    /**
     * Sets (as xml) the "FNR" attribute
     */
    public void xsetFNR(org.apache.xmlbeans.XmlInteger fnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FNR$0);
            }
            target.set(fnr);
        }
    }
    
    /**
     * Unsets the "FNR" attribute
     */
    public void unsetFNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FNR$0);
        }
    }
}
