/*
 * An XML document type.
 * Localname: USEABLE_AREA_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREAFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one USEABLE_AREA_FROM(@) element.
 *
 * This is a complex type.
 */
public class USEABLEAREAFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREAFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public USEABLEAREAFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEABLEAREAFROM$0 = 
        new javax.xml.namespace.QName("", "USEABLE_AREA_FROM");
    
    
    /**
     * Gets the "USEABLE_AREA_FROM" element
     */
    public java.lang.String getUSEABLEAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREAFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "USEABLE_AREA_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetUSEABLEAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREAFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "USEABLE_AREA_FROM" element
     */
    public void setUSEABLEAREAFROM(java.lang.String useableareafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREAFROM$0);
            }
            target.setStringValue(useableareafrom);
        }
    }
    
    /**
     * Sets (as xml) the "USEABLE_AREA_FROM" element
     */
    public void xsetUSEABLEAREAFROM(org.apache.xmlbeans.XmlString useableareafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREAFROM$0);
            }
            target.set(useableareafrom);
        }
    }
}
