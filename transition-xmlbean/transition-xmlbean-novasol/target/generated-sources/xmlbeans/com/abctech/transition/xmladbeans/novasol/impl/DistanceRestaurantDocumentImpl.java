/*
 * An XML document type.
 * Localname: DistanceRestaurant
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceRestaurantDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceRestaurant(@) element.
 *
 * This is a complex type.
 */
public class DistanceRestaurantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceRestaurantDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceRestaurantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCERESTAURANT$0 = 
        new javax.xml.namespace.QName("", "DistanceRestaurant");
    
    
    /**
     * Gets the "DistanceRestaurant" element
     */
    public java.lang.String getDistanceRestaurant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCERESTAURANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceRestaurant" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceRestaurant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCERESTAURANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceRestaurant" element
     */
    public void setDistanceRestaurant(java.lang.String distanceRestaurant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCERESTAURANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCERESTAURANT$0);
            }
            target.setStringValue(distanceRestaurant);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceRestaurant" element
     */
    public void xsetDistanceRestaurant(org.apache.xmlbeans.XmlString distanceRestaurant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCERESTAURANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCERESTAURANT$0);
            }
            target.set(distanceRestaurant);
        }
    }
}
