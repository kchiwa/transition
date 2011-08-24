/*
 * An XML document type.
 * Localname: Sleepingrooms
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SleepingroomsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Sleepingrooms(@) element.
 *
 * This is a complex type.
 */
public class SleepingroomsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SleepingroomsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SleepingroomsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLEEPINGROOMS$0 = 
        new javax.xml.namespace.QName("", "Sleepingrooms");
    
    
    /**
     * Gets the "Sleepingrooms" element
     */
    public java.math.BigInteger getSleepingrooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEEPINGROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sleepingrooms" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSleepingrooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SLEEPINGROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Sleepingrooms" element
     */
    public void setSleepingrooms(java.math.BigInteger sleepingrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEEPINGROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLEEPINGROOMS$0);
            }
            target.setBigIntegerValue(sleepingrooms);
        }
    }
    
    /**
     * Sets (as xml) the "Sleepingrooms" element
     */
    public void xsetSleepingrooms(org.apache.xmlbeans.XmlInteger sleepingrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SLEEPINGROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SLEEPINGROOMS$0);
            }
            target.set(sleepingrooms);
        }
    }
}
