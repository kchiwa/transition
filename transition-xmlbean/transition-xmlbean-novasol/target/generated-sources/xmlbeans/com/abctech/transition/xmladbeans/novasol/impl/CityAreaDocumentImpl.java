/*
 * An XML document type.
 * Localname: CityArea
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CityAreaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CityArea(@) element.
 *
 * This is a complex type.
 */
public class CityAreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CityAreaDocument
{
    private static final long serialVersionUID = 1L;
    
    public CityAreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITYAREA$0 = 
        new javax.xml.namespace.QName("", "CityArea");
    
    
    /**
     * Gets the "CityArea" element
     */
    public java.lang.String getCityArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CityArea" element
     */
    public org.apache.xmlbeans.XmlString xgetCityArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CityArea" element
     */
    public void setCityArea(java.lang.String cityArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYAREA$0);
            }
            target.setStringValue(cityArea);
        }
    }
    
    /**
     * Sets (as xml) the "CityArea" element
     */
    public void xsetCityArea(org.apache.xmlbeans.XmlString cityArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYAREA$0);
            }
            target.set(cityArea);
        }
    }
}
