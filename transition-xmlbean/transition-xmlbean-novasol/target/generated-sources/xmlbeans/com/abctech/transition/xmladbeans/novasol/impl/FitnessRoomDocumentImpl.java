/*
 * An XML document type.
 * Localname: FitnessRoom
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FitnessRoomDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FitnessRoom(@) element.
 *
 * This is a complex type.
 */
public class FitnessRoomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FitnessRoomDocument
{
    private static final long serialVersionUID = 1L;
    
    public FitnessRoomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FITNESSROOM$0 = 
        new javax.xml.namespace.QName("", "FitnessRoom");
    
    
    /**
     * Gets the "FitnessRoom" element
     */
    public java.lang.String getFitnessRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FITNESSROOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FitnessRoom" element
     */
    public org.apache.xmlbeans.XmlString xgetFitnessRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FITNESSROOM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FitnessRoom" element
     */
    public void setFitnessRoom(java.lang.String fitnessRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FITNESSROOM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FITNESSROOM$0);
            }
            target.setStringValue(fitnessRoom);
        }
    }
    
    /**
     * Sets (as xml) the "FitnessRoom" element
     */
    public void xsetFitnessRoom(org.apache.xmlbeans.XmlString fitnessRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FITNESSROOM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FITNESSROOM$0);
            }
            target.set(fitnessRoom);
        }
    }
}
