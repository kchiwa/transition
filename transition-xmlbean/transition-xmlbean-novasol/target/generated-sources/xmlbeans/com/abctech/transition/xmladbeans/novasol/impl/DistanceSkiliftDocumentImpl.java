/*
 * An XML document type.
 * Localname: DistanceSkilift
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceSkiliftDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceSkilift(@) element.
 *
 * This is a complex type.
 */
public class DistanceSkiliftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceSkiliftDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceSkiliftDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCESKILIFT$0 = 
        new javax.xml.namespace.QName("", "DistanceSkilift");
    
    
    /**
     * Gets the "DistanceSkilift" element
     */
    public java.lang.String getDistanceSkilift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKILIFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceSkilift" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceSkilift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKILIFT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceSkilift" element
     */
    public void setDistanceSkilift(java.lang.String distanceSkilift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKILIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKILIFT$0);
            }
            target.setStringValue(distanceSkilift);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceSkilift" element
     */
    public void xsetDistanceSkilift(org.apache.xmlbeans.XmlString distanceSkilift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKILIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKILIFT$0);
            }
            target.set(distanceSkilift);
        }
    }
}
