/*
 * An XML document type.
 * Localname: Activities
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ActivitiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Activities(@) element.
 *
 * This is a complex type.
 */
public class ActivitiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ActivitiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivitiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITIES$0 = 
        new javax.xml.namespace.QName("", "Activities");
    
    
    /**
     * Gets the "Activities" element
     */
    public java.lang.String getActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Activities" element
     */
    public org.apache.xmlbeans.XmlString xgetActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITIES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Activities" element
     */
    public void setActivities(java.lang.String activities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITIES$0);
            }
            target.setStringValue(activities);
        }
    }
    
    /**
     * Sets (as xml) the "Activities" element
     */
    public void xsetActivities(org.apache.xmlbeans.XmlString activities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITIES$0);
            }
            target.set(activities);
        }
    }
}
