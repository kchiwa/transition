/*
 * An XML document type.
 * Localname: CozyHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CozyHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CozyHouse(@) element.
 *
 * This is a complex type.
 */
public class CozyHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CozyHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CozyHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COZYHOUSE$0 = 
        new javax.xml.namespace.QName("", "CozyHouse");
    
    
    /**
     * Gets the "CozyHouse" element
     */
    public java.lang.String getCozyHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COZYHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CozyHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetCozyHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COZYHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CozyHouse" element
     */
    public void setCozyHouse(java.lang.String cozyHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COZYHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COZYHOUSE$0);
            }
            target.setStringValue(cozyHouse);
        }
    }
    
    /**
     * Sets (as xml) the "CozyHouse" element
     */
    public void xsetCozyHouse(org.apache.xmlbeans.XmlString cozyHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COZYHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COZYHOUSE$0);
            }
            target.set(cozyHouse);
        }
    }
}
