/*
 * An XML document type.
 * Localname: PER_MONTH_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHTODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PER_MONTH_TO(@) element.
 *
 * This is a complex type.
 */
public class PERMONTHTODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PERMONTHTODocument
{
    private static final long serialVersionUID = 1L;
    
    public PERMONTHTODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERMONTHTO$0 = 
        new javax.xml.namespace.QName("", "PER_MONTH_TO");
    
    
    /**
     * Gets the "PER_MONTH_TO" element
     */
    public java.lang.String getPERMONTHTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PER_MONTH_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetPERMONTHTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PER_MONTH_TO" element
     */
    public void setPERMONTHTO(java.lang.String permonthto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTHTO$0);
            }
            target.setStringValue(permonthto);
        }
    }
    
    /**
     * Sets (as xml) the "PER_MONTH_TO" element
     */
    public void xsetPERMONTHTO(org.apache.xmlbeans.XmlString permonthto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTHTO$0);
            }
            target.set(permonthto);
        }
    }
}
