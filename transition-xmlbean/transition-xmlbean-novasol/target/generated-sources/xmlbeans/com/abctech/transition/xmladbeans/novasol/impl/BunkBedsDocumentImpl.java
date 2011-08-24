/*
 * An XML document type.
 * Localname: BunkBeds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BunkBedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BunkBeds(@) element.
 *
 * This is a complex type.
 */
public class BunkBedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BunkBedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BunkBedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNKBEDS$0 = 
        new javax.xml.namespace.QName("", "BunkBeds");
    
    
    /**
     * Gets the "BunkBeds" element
     */
    public java.math.BigInteger getBunkBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNKBEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BunkBeds" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBunkBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BUNKBEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BunkBeds" element
     */
    public void setBunkBeds(java.math.BigInteger bunkBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNKBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNKBEDS$0);
            }
            target.setBigIntegerValue(bunkBeds);
        }
    }
    
    /**
     * Sets (as xml) the "BunkBeds" element
     */
    public void xsetBunkBeds(org.apache.xmlbeans.XmlInteger bunkBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BUNKBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BUNKBEDS$0);
            }
            target.set(bunkBeds);
        }
    }
}
