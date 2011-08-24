/*
 * An XML document type.
 * Localname: DistanceCity
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceCityDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceCity(@) element.
 *
 * This is a complex type.
 */
public class DistanceCityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceCityDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceCityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCECITY$0 = 
        new javax.xml.namespace.QName("", "DistanceCity");
    
    
    /**
     * Gets the "DistanceCity" element
     */
    public java.lang.String getDistanceCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCECITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceCity" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCECITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceCity" element
     */
    public void setDistanceCity(java.lang.String distanceCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCECITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCECITY$0);
            }
            target.setStringValue(distanceCity);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceCity" element
     */
    public void xsetDistanceCity(org.apache.xmlbeans.XmlString distanceCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCECITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCECITY$0);
            }
            target.set(distanceCity);
        }
    }
}
