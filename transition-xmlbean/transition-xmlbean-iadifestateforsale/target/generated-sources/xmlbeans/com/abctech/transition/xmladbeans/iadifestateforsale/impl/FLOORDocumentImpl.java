/*
 * An XML document type.
 * Localname: FLOOR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FLOORDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FLOOR(@) element.
 *
 * This is a complex type.
 */
public class FLOORDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FLOORDocument
{
    private static final long serialVersionUID = 1L;
    
    public FLOORDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOOR$0 = 
        new javax.xml.namespace.QName("", "FLOOR");
    
    
    /**
     * Gets the "FLOOR" element
     */
    public java.lang.String getFLOOR()
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
     * Gets (as xml) the "FLOOR" element
     */
    public org.apache.xmlbeans.XmlString xgetFLOOR()
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
     * Sets the "FLOOR" element
     */
    public void setFLOOR(java.lang.String floor)
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
     * Sets (as xml) the "FLOOR" element
     */
    public void xsetFLOOR(org.apache.xmlbeans.XmlString floor)
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
