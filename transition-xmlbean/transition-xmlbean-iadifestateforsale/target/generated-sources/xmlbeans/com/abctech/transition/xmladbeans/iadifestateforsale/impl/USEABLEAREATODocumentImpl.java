/*
 * An XML document type.
 * Localname: USEABLE_AREA_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREATODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one USEABLE_AREA_TO(@) element.
 *
 * This is a complex type.
 */
public class USEABLEAREATODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREATODocument
{
    private static final long serialVersionUID = 1L;
    
    public USEABLEAREATODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEABLEAREATO$0 = 
        new javax.xml.namespace.QName("", "USEABLE_AREA_TO");
    
    
    /**
     * Gets the "USEABLE_AREA_TO" element
     */
    public java.lang.String getUSEABLEAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "USEABLE_AREA_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetUSEABLEAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREATO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "USEABLE_AREA_TO" element
     */
    public void setUSEABLEAREATO(java.lang.String useableareato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREATO$0);
            }
            target.setStringValue(useableareato);
        }
    }
    
    /**
     * Sets (as xml) the "USEABLE_AREA_TO" element
     */
    public void xsetUSEABLEAREATO(org.apache.xmlbeans.XmlString useableareato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREATO$0);
            }
            target.set(useableareato);
        }
    }
}
