/*
 * An XML document type.
 * Localname: DEBT_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.DEBTFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one DEBT_FROM(@) element.
 *
 * This is a complex type.
 */
public class DEBTFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.DEBTFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public DEBTFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBTFROM$0 = 
        new javax.xml.namespace.QName("", "DEBT_FROM");
    
    
    /**
     * Gets the "DEBT_FROM" element
     */
    public java.lang.String getDEBTFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DEBT_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetDEBTFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DEBT_FROM" element
     */
    public void setDEBTFROM(java.lang.String debtfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTFROM$0);
            }
            target.setStringValue(debtfrom);
        }
    }
    
    /**
     * Sets (as xml) the "DEBT_FROM" element
     */
    public void xsetDEBTFROM(org.apache.xmlbeans.XmlString debtfrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEBTFROM$0);
            }
            target.set(debtfrom);
        }
    }
}
