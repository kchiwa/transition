/*
 * An XML document type.
 * Localname: DayOfChange
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DayOfChangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DayOfChange(@) element.
 *
 * This is a complex type.
 */
public class DayOfChangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DayOfChangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DayOfChangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAYOFCHANGE$0 = 
        new javax.xml.namespace.QName("", "DayOfChange");
    
    
    /**
     * Gets the "DayOfChange" element
     */
    public java.math.BigInteger getDayOfChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DayOfChange" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDayOfChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAYOFCHANGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DayOfChange" element
     */
    public void setDayOfChange(java.math.BigInteger dayOfChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFCHANGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYOFCHANGE$0);
            }
            target.setBigIntegerValue(dayOfChange);
        }
    }
    
    /**
     * Sets (as xml) the "DayOfChange" element
     */
    public void xsetDayOfChange(org.apache.xmlbeans.XmlInteger dayOfChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAYOFCHANGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DAYOFCHANGE$0);
            }
            target.set(dayOfChange);
        }
    }
}
