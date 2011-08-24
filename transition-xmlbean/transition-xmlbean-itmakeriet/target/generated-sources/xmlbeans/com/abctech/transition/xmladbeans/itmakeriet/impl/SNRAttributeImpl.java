/*
 * An XML attribute type.
 * Localname: SNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.SNRAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one SNR(@) attribute.
 *
 * This is a complex type.
 */
public class SNRAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.SNRAttribute
{
    private static final long serialVersionUID = 1L;
    
    public SNRAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SNR$0 = 
        new javax.xml.namespace.QName("", "SNR");
    
    
    /**
     * Gets the "SNR" attribute
     */
    public java.math.BigInteger getSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNR$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SNR" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SNR$0);
            return target;
        }
    }
    
    /**
     * True if has "SNR" attribute
     */
    public boolean isSetSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SNR$0) != null;
        }
    }
    
    /**
     * Sets the "SNR" attribute
     */
    public void setSNR(java.math.BigInteger snr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SNR$0);
            }
            target.setBigIntegerValue(snr);
        }
    }
    
    /**
     * Sets (as xml) the "SNR" attribute
     */
    public void xsetSNR(org.apache.xmlbeans.XmlInteger snr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SNR$0);
            }
            target.set(snr);
        }
    }
    
    /**
     * Unsets the "SNR" attribute
     */
    public void unsetSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SNR$0);
        }
    }
}
