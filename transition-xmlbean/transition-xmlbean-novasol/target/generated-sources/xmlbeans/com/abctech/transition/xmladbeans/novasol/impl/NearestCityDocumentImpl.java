/*
 * An XML document type.
 * Localname: NearestCity
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.NearestCityDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one NearestCity(@) element.
 *
 * This is a complex type.
 */
public class NearestCityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.NearestCityDocument
{
    private static final long serialVersionUID = 1L;
    
    public NearestCityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEARESTCITY$0 = 
        new javax.xml.namespace.QName("", "NearestCity");
    
    
    /**
     * Gets the "NearestCity" element
     */
    public java.lang.String getNearestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEARESTCITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NearestCity" element
     */
    public org.apache.xmlbeans.XmlString xgetNearestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEARESTCITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NearestCity" element
     */
    public void setNearestCity(java.lang.String nearestCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEARESTCITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEARESTCITY$0);
            }
            target.setStringValue(nearestCity);
        }
    }
    
    /**
     * Sets (as xml) the "NearestCity" element
     */
    public void xsetNearestCity(org.apache.xmlbeans.XmlString nearestCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEARESTCITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEARESTCITY$0);
            }
            target.set(nearestCity);
        }
    }
}
