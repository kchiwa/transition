/*
 * An XML document type.
 * Localname: Dryer
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DryerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Dryer(@) element.
 *
 * This is a complex type.
 */
public class DryerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DryerDocument
{
    private static final long serialVersionUID = 1L;
    
    public DryerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DRYER$0 = 
        new javax.xml.namespace.QName("", "Dryer");
    
    
    /**
     * Gets the "Dryer" element
     */
    public java.lang.String getDryer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dryer" element
     */
    public org.apache.xmlbeans.XmlString xgetDryer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRYER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Dryer" element
     */
    public void setDryer(java.lang.String dryer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRYER$0);
            }
            target.setStringValue(dryer);
        }
    }
    
    /**
     * Sets (as xml) the "Dryer" element
     */
    public void xsetDryer(org.apache.xmlbeans.XmlString dryer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRYER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRYER$0);
            }
            target.set(dryer);
        }
    }
}
