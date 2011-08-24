/*
 * An XML document type.
 * Localname: DistanceSkibus
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceSkibusDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceSkibus(@) element.
 *
 * This is a complex type.
 */
public class DistanceSkibusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceSkibusDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceSkibusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCESKIBUS$0 = 
        new javax.xml.namespace.QName("", "DistanceSkibus");
    
    
    /**
     * Gets the "DistanceSkibus" element
     */
    public java.lang.String getDistanceSkibus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIBUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceSkibus" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceSkibus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIBUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceSkibus" element
     */
    public void setDistanceSkibus(java.lang.String distanceSkibus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIBUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIBUS$0);
            }
            target.setStringValue(distanceSkibus);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceSkibus" element
     */
    public void xsetDistanceSkibus(org.apache.xmlbeans.XmlString distanceSkibus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIBUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIBUS$0);
            }
            target.set(distanceSkibus);
        }
    }
}
