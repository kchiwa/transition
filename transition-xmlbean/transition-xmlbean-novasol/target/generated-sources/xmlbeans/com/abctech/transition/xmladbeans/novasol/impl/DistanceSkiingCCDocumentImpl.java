/*
 * An XML document type.
 * Localname: DistanceSkiingCC
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceSkiingCCDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceSkiingCC(@) element.
 *
 * This is a complex type.
 */
public class DistanceSkiingCCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceSkiingCCDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceSkiingCCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCESKIINGCC$0 = 
        new javax.xml.namespace.QName("", "DistanceSkiingCC");
    
    
    /**
     * Gets the "DistanceSkiingCC" element
     */
    public java.lang.String getDistanceSkiingCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIINGCC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceSkiingCC" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceSkiingCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIINGCC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceSkiingCC" element
     */
    public void setDistanceSkiingCC(java.lang.String distanceSkiingCC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIINGCC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIINGCC$0);
            }
            target.setStringValue(distanceSkiingCC);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceSkiingCC" element
     */
    public void xsetDistanceSkiingCC(org.apache.xmlbeans.XmlString distanceSkiingCC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIINGCC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIINGCC$0);
            }
            target.set(distanceSkiingCC);
        }
    }
}
