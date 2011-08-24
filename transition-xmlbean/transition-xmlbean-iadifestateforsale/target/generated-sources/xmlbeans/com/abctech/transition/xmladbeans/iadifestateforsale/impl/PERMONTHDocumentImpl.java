/*
 * An XML document type.
 * Localname: PER_MONTH
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PER_MONTH(@) element.
 *
 * This is a complex type.
 */
public class PERMONTHDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHDocument
{
    private static final long serialVersionUID = 1L;
    
    public PERMONTHDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERMONTH$0 = 
        new javax.xml.namespace.QName("", "PER_MONTH");
    
    
    /**
     * Gets the "PER_MONTH" element
     */
    public java.lang.String getPERMONTH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PER_MONTH" element
     */
    public org.apache.xmlbeans.XmlString xgetPERMONTH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PER_MONTH" element
     */
    public void setPERMONTH(java.lang.String permonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTH$0);
            }
            target.setStringValue(permonth);
        }
    }
    
    /**
     * Sets (as xml) the "PER_MONTH" element
     */
    public void xsetPERMONTH(org.apache.xmlbeans.XmlString permonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTH$0);
            }
            target.set(permonth);
        }
    }
}
