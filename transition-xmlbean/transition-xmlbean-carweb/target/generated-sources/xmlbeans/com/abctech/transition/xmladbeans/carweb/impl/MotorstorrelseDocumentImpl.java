/*
 * An XML document type.
 * Localname: Motorstorrelse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.MotorstorrelseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Motorstorrelse(@) element.
 *
 * This is a complex type.
 */
public class MotorstorrelseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.MotorstorrelseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MotorstorrelseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOTORSTORRELSE$0 = 
        new javax.xml.namespace.QName("", "Motorstorrelse");
    
    
    /**
     * Gets the "Motorstorrelse" element
     */
    public java.lang.String getMotorstorrelse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTORSTORRELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Motorstorrelse" element
     */
    public org.apache.xmlbeans.XmlString xgetMotorstorrelse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTORSTORRELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Motorstorrelse" element
     */
    public void setMotorstorrelse(java.lang.String motorstorrelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTORSTORRELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOTORSTORRELSE$0);
            }
            target.setStringValue(motorstorrelse);
        }
    }
    
    /**
     * Sets (as xml) the "Motorstorrelse" element
     */
    public void xsetMotorstorrelse(org.apache.xmlbeans.XmlString motorstorrelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTORSTORRELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOTORSTORRELSE$0);
            }
            target.set(motorstorrelse);
        }
    }
}
