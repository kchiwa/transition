/*
 * An XML document type.
 * Localname: Boat
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BoatDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Boat(@) element.
 *
 * This is a complex type.
 */
public class BoatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BoatDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOAT$0 = 
        new javax.xml.namespace.QName("", "Boat");
    
    
    /**
     * Gets the "Boat" element
     */
    public java.lang.String getBoat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Boat" element
     */
    public org.apache.xmlbeans.XmlString xgetBoat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Boat" element
     */
    public void setBoat(java.lang.String boat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOAT$0);
            }
            target.setStringValue(boat);
        }
    }
    
    /**
     * Sets (as xml) the "Boat" element
     */
    public void xsetBoat(org.apache.xmlbeans.XmlString boat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOAT$0);
            }
            target.set(boat);
        }
    }
}
