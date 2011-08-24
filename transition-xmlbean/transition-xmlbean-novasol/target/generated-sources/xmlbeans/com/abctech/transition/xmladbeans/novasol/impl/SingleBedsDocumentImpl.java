/*
 * An XML document type.
 * Localname: SingleBeds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SingleBedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SingleBeds(@) element.
 *
 * This is a complex type.
 */
public class SingleBedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SingleBedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SingleBedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEBEDS$0 = 
        new javax.xml.namespace.QName("", "SingleBeds");
    
    
    /**
     * Gets the "SingleBeds" element
     */
    public java.math.BigInteger getSingleBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEBEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SingleBeds" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSingleBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SINGLEBEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SingleBeds" element
     */
    public void setSingleBeds(java.math.BigInteger singleBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLEBEDS$0);
            }
            target.setBigIntegerValue(singleBeds);
        }
    }
    
    /**
     * Sets (as xml) the "SingleBeds" element
     */
    public void xsetSingleBeds(org.apache.xmlbeans.XmlInteger singleBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SINGLEBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SINGLEBEDS$0);
            }
            target.set(singleBeds);
        }
    }
}
