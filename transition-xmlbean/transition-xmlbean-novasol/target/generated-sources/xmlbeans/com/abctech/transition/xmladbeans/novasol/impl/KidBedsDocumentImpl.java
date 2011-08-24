/*
 * An XML document type.
 * Localname: KidBeds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.KidBedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one KidBeds(@) element.
 *
 * This is a complex type.
 */
public class KidBedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.KidBedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public KidBedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KIDBEDS$0 = 
        new javax.xml.namespace.QName("", "KidBeds");
    
    
    /**
     * Gets the "KidBeds" element
     */
    public java.math.BigInteger getKidBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDBEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "KidBeds" element
     */
    public org.apache.xmlbeans.XmlInteger xgetKidBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KIDBEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KidBeds" element
     */
    public void setKidBeds(java.math.BigInteger kidBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KIDBEDS$0);
            }
            target.setBigIntegerValue(kidBeds);
        }
    }
    
    /**
     * Sets (as xml) the "KidBeds" element
     */
    public void xsetKidBeds(org.apache.xmlbeans.XmlInteger kidBeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KIDBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(KIDBEDS$0);
            }
            target.set(kidBeds);
        }
    }
}
