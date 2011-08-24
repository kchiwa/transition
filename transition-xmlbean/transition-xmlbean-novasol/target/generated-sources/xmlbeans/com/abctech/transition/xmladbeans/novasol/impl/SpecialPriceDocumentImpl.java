/*
 * An XML document type.
 * Localname: SpecialPrice
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SpecialPriceDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SpecialPrice(@) element.
 *
 * This is a complex type.
 */
public class SpecialPriceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SpecialPriceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SpecialPriceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIALPRICE$0 = 
        new javax.xml.namespace.QName("", "SpecialPrice");
    
    
    /**
     * Gets the "SpecialPrice" element
     */
    public java.lang.String getSpecialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALPRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SpecialPrice" element
     */
    public org.apache.xmlbeans.XmlString xgetSpecialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALPRICE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SpecialPrice" element
     */
    public void setSpecialPrice(java.lang.String specialPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALPRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALPRICE$0);
            }
            target.setStringValue(specialPrice);
        }
    }
    
    /**
     * Sets (as xml) the "SpecialPrice" element
     */
    public void xsetSpecialPrice(org.apache.xmlbeans.XmlString specialPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALPRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPECIALPRICE$0);
            }
            target.set(specialPrice);
        }
    }
}
