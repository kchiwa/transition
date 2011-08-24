/*
 * An XML document type.
 * Localname: PoolRoomEquipment
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PoolRoomEquipmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PoolRoomEquipment(@) element.
 *
 * This is a complex type.
 */
public class PoolRoomEquipmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PoolRoomEquipmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public PoolRoomEquipmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLROOMEQUIPMENT$0 = 
        new javax.xml.namespace.QName("", "PoolRoomEquipment");
    
    
    /**
     * Gets the "PoolRoomEquipment" element
     */
    public java.lang.String getPoolRoomEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLROOMEQUIPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PoolRoomEquipment" element
     */
    public org.apache.xmlbeans.XmlString xgetPoolRoomEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLROOMEQUIPMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PoolRoomEquipment" element
     */
    public void setPoolRoomEquipment(java.lang.String poolRoomEquipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLROOMEQUIPMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLROOMEQUIPMENT$0);
            }
            target.setStringValue(poolRoomEquipment);
        }
    }
    
    /**
     * Sets (as xml) the "PoolRoomEquipment" element
     */
    public void xsetPoolRoomEquipment(org.apache.xmlbeans.XmlString poolRoomEquipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLROOMEQUIPMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLROOMEQUIPMENT$0);
            }
            target.set(poolRoomEquipment);
        }
    }
}
