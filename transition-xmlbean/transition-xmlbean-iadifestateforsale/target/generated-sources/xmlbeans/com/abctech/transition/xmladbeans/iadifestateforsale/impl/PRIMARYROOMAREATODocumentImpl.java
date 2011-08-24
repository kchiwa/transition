/*
 * An XML document type.
 * Localname: PRIMARY_ROOM_AREA_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREATODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRIMARY_ROOM_AREA_TO(@) element.
 *
 * This is a complex type.
 */
public class PRIMARYROOMAREATODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREATODocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMARYROOMAREATODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYROOMAREATO$0 = 
        new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA_TO");
    
    
    /**
     * Gets the "PRIMARY_ROOM_AREA_TO" element
     */
    public java.lang.String getPRIMARYROOMAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMARY_ROOM_AREA_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREATO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREATO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMARY_ROOM_AREA_TO" element
     */
    public void setPRIMARYROOMAREATO(java.lang.String primaryroomareato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREATO$0);
            }
            target.setStringValue(primaryroomareato);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMARY_ROOM_AREA_TO" element
     */
    public void xsetPRIMARYROOMAREATO(org.apache.xmlbeans.XmlString primaryroomareato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREATO$0);
            }
            target.set(primaryroomareato);
        }
    }
}
