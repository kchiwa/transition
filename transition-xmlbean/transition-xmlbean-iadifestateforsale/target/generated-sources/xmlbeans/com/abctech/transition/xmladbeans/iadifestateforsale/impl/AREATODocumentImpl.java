/*
 * An XML document type.
 * Localname: AREA_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.AREATODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one AREA_TO(@) element.
 *
 * This is a complex type.
 */
public class AREATODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.AREATODocument
{
    private static final long serialVersionUID = 1L;
    
    public AREATODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREATO$0 = 
        new javax.xml.namespace.QName("", "AREA_TO");
    
    
    /**
     * Gets the "AREA_TO" element
     */
    public java.lang.String getAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AREA_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREATO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AREA_TO" element
     */
    public void setAREATO(java.lang.String areato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREATO$0);
            }
            target.setStringValue(areato);
        }
    }
    
    /**
     * Sets (as xml) the "AREA_TO" element
     */
    public void xsetAREATO(org.apache.xmlbeans.XmlString areato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREATO$0);
            }
            target.set(areato);
        }
    }
}
