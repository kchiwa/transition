/*
 * An XML document type.
 * Localname: DistanceSkiarea
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceSkiareaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceSkiarea(@) element.
 *
 * This is a complex type.
 */
public class DistanceSkiareaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceSkiareaDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceSkiareaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCESKIAREA$0 = 
        new javax.xml.namespace.QName("", "DistanceSkiarea");
    
    
    /**
     * Gets the "DistanceSkiarea" element
     */
    public java.lang.String getDistanceSkiarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceSkiarea" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceSkiarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceSkiarea" element
     */
    public void setDistanceSkiarea(java.lang.String distanceSkiarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIAREA$0);
            }
            target.setStringValue(distanceSkiarea);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceSkiarea" element
     */
    public void xsetDistanceSkiarea(org.apache.xmlbeans.XmlString distanceSkiarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIAREA$0);
            }
            target.set(distanceSkiarea);
        }
    }
}
