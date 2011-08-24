/*
 * An XML document type.
 * Localname: ChassisNr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ChassisNrDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one ChassisNr(@) element.
 *
 * This is a complex type.
 */
public class ChassisNrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ChassisNrDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChassisNrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHASSISNR$0 = 
        new javax.xml.namespace.QName("", "ChassisNr");
    
    
    /**
     * Gets the "ChassisNr" element
     */
    public java.lang.String getChassisNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHASSISNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChassisNr" element
     */
    public org.apache.xmlbeans.XmlString xgetChassisNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHASSISNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ChassisNr" element
     */
    public void setChassisNr(java.lang.String chassisNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHASSISNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHASSISNR$0);
            }
            target.setStringValue(chassisNr);
        }
    }
    
    /**
     * Sets (as xml) the "ChassisNr" element
     */
    public void xsetChassisNr(org.apache.xmlbeans.XmlString chassisNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHASSISNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHASSISNR$0);
            }
            target.set(chassisNr);
        }
    }
}
