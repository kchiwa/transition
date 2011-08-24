/*
 * An XML document type.
 * Localname: DistanceAirport
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceAirportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceAirport(@) element.
 *
 * This is a complex type.
 */
public class DistanceAirportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceAirportDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceAirportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCEAIRPORT$0 = 
        new javax.xml.namespace.QName("", "DistanceAirport");
    
    
    /**
     * Gets the "DistanceAirport" element
     */
    public java.lang.String getDistanceAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEAIRPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceAirport" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEAIRPORT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceAirport" element
     */
    public void setDistanceAirport(java.lang.String distanceAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEAIRPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEAIRPORT$0);
            }
            target.setStringValue(distanceAirport);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceAirport" element
     */
    public void xsetDistanceAirport(org.apache.xmlbeans.XmlString distanceAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEAIRPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEAIRPORT$0);
            }
            target.set(distanceAirport);
        }
    }
}
