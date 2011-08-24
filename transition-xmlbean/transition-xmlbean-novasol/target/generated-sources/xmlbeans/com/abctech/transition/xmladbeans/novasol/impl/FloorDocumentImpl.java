/*
 * An XML document type.
 * Localname: Floor
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FloorDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Floor(@) element.
 *
 * This is a complex type.
 */
public class FloorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FloorDocument
{
    private static final long serialVersionUID = 1L;
    
    public FloorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOOR$0 = 
        new javax.xml.namespace.QName("", "Floor");
    
    
    /**
     * Gets the "Floor" element
     */
    public java.lang.String getFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Floor" element
     */
    public org.apache.xmlbeans.XmlString xgetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Floor" element
     */
    public void setFloor(java.lang.String floor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOOR$0);
            }
            target.setStringValue(floor);
        }
    }
    
    /**
     * Sets (as xml) the "Floor" element
     */
    public void xsetFloor(org.apache.xmlbeans.XmlString floor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOOR$0);
            }
            target.set(floor);
        }
    }
}
