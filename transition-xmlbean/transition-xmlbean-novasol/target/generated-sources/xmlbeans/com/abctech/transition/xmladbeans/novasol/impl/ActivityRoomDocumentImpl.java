/*
 * An XML document type.
 * Localname: ActivityRoom
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ActivityRoomDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ActivityRoom(@) element.
 *
 * This is a complex type.
 */
public class ActivityRoomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ActivityRoomDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityRoomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYROOM$0 = 
        new javax.xml.namespace.QName("", "ActivityRoom");
    
    
    /**
     * Gets the "ActivityRoom" element
     */
    public java.lang.String getActivityRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYROOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityRoom" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYROOM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ActivityRoom" element
     */
    public void setActivityRoom(java.lang.String activityRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYROOM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYROOM$0);
            }
            target.setStringValue(activityRoom);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityRoom" element
     */
    public void xsetActivityRoom(org.apache.xmlbeans.XmlString activityRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYROOM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYROOM$0);
            }
            target.set(activityRoom);
        }
    }
}
