/*
 * An XML document type.
 * Localname: AREA_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.AREAFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one AREA_FROM(@) element.
 *
 * This is a complex type.
 */
public class AREAFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.AREAFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public AREAFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREAFROM$0 = 
        new javax.xml.namespace.QName("", "AREA_FROM");
    
    
    /**
     * Gets the "AREA_FROM" element
     */
    public java.lang.String getAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AREA_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AREA_FROM" element
     */
    public void setAREAFROM(java.lang.String areafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREAFROM$0);
            }
            target.setStringValue(areafrom);
        }
    }
    
    /**
     * Sets (as xml) the "AREA_FROM" element
     */
    public void xsetAREAFROM(org.apache.xmlbeans.XmlString areafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREAFROM$0);
            }
            target.set(areafrom);
        }
    }
}
