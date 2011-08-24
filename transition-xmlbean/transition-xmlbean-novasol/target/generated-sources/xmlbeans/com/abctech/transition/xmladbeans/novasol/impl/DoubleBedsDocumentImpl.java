/*
 * An XML document type.
 * Localname: DoubleBeds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DoubleBedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DoubleBeds(@) element.
 *
 * This is a complex type.
 */
public class DoubleBedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DoubleBedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoubleBedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLEBEDS$0 = 
        new javax.xml.namespace.QName("", "DoubleBeds");
    
    
    /**
     * Gets the "DoubleBeds" element
     */
    public java.math.BigInteger getDoubleBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEBEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DoubleBeds" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDoubleBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOUBLEBEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DoubleBeds" element
     */
    public void setDoubleBeds(java.math.BigInteger doubleBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEBEDS$0);
            }
            target.setBigIntegerValue(doubleBeds);
        }
    }
    
    /**
     * Sets (as xml) the "DoubleBeds" element
     */
    public void xsetDoubleBeds(org.apache.xmlbeans.XmlInteger doubleBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOUBLEBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DOUBLEBEDS$0);
            }
            target.set(doubleBeds);
        }
    }
}
