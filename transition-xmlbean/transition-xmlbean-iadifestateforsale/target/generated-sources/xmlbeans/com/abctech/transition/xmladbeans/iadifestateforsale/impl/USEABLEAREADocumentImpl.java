/*
 * An XML document type.
 * Localname: USEABLE_AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one USEABLE_AREA(@) element.
 *
 * This is a complex type.
 */
public class USEABLEAREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.USEABLEAREADocument
{
    private static final long serialVersionUID = 1L;
    
    public USEABLEAREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEABLEAREA$0 = 
        new javax.xml.namespace.QName("", "USEABLE_AREA");
    
    
    /**
     * Gets the "USEABLE_AREA" element
     */
    public java.lang.String getUSEABLEAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "USEABLE_AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetUSEABLEAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "USEABLE_AREA" element
     */
    public void setUSEABLEAREA(java.lang.String useablearea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREA$0);
            }
            target.setStringValue(useablearea);
        }
    }
    
    /**
     * Sets (as xml) the "USEABLE_AREA" element
     */
    public void xsetUSEABLEAREA(org.apache.xmlbeans.XmlString useablearea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREA$0);
            }
            target.set(useablearea);
        }
    }
}
