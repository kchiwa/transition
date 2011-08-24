/*
 * An XML document type.
 * Localname: PRIMARY_ROOM_AREA_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREAFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRIMARY_ROOM_AREA_FROM(@) element.
 *
 * This is a complex type.
 */
public class PRIMARYROOMAREAFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREAFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMARYROOMAREAFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYROOMAREAFROM$0 = 
        new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA_FROM");
    
    
    /**
     * Gets the "PRIMARY_ROOM_AREA_FROM" element
     */
    public java.lang.String getPRIMARYROOMAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREAFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMARY_ROOM_AREA_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREAFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREAFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMARY_ROOM_AREA_FROM" element
     */
    public void setPRIMARYROOMAREAFROM(java.lang.String primaryroomareafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREAFROM$0);
            }
            target.setStringValue(primaryroomareafrom);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMARY_ROOM_AREA_FROM" element
     */
    public void xsetPRIMARYROOMAREAFROM(org.apache.xmlbeans.XmlString primaryroomareafrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREAFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREAFROM$0);
            }
            target.set(primaryroomareafrom);
        }
    }
}
