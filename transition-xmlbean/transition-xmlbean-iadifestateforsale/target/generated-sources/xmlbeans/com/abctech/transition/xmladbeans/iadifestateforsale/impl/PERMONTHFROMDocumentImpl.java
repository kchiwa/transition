/*
 * An XML document type.
 * Localname: PER_MONTH_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PER_MONTH_FROM(@) element.
 *
 * This is a complex type.
 */
public class PERMONTHFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public PERMONTHFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERMONTHFROM$0 = 
        new javax.xml.namespace.QName("", "PER_MONTH_FROM");
    
    
    /**
     * Gets the "PER_MONTH_FROM" element
     */
    public java.lang.String getPERMONTHFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PER_MONTH_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetPERMONTHFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PER_MONTH_FROM" element
     */
    public void setPERMONTHFROM(java.lang.String permonthfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTHFROM$0);
            }
            target.setStringValue(permonthfrom);
        }
    }
    
    /**
     * Sets (as xml) the "PER_MONTH_FROM" element
     */
    public void xsetPERMONTHFROM(org.apache.xmlbeans.XmlString permonthfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTHFROM$0);
            }
            target.set(permonthfrom);
        }
    }
}
