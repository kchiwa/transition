/*
 * An XML document type.
 * Localname: Mattresses
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MattressesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Mattresses(@) element.
 *
 * This is a complex type.
 */
public class MattressesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MattressesDocument
{
    private static final long serialVersionUID = 1L;
    
    public MattressesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATTRESSES$0 = 
        new javax.xml.namespace.QName("", "Mattresses");
    
    
    /**
     * Gets the "Mattresses" element
     */
    public java.math.BigInteger getMattresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATTRESSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mattresses" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMattresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATTRESSES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Mattresses" element
     */
    public void setMattresses(java.math.BigInteger mattresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATTRESSES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATTRESSES$0);
            }
            target.setBigIntegerValue(mattresses);
        }
    }
    
    /**
     * Sets (as xml) the "Mattresses" element
     */
    public void xsetMattresses(org.apache.xmlbeans.XmlInteger mattresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATTRESSES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MATTRESSES$0);
            }
            target.set(mattresses);
        }
    }
}
