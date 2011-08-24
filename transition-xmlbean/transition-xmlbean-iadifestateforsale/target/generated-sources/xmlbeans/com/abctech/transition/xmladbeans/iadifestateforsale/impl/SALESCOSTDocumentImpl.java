/*
 * An XML document type.
 * Localname: SALES_COST
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.SALESCOSTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one SALES_COST(@) element.
 *
 * This is a complex type.
 */
public class SALESCOSTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.SALESCOSTDocument
{
    private static final long serialVersionUID = 1L;
    
    public SALESCOSTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESCOST$0 = 
        new javax.xml.namespace.QName("", "SALES_COST");
    
    
    /**
     * Gets the "SALES_COST" element
     */
    public java.lang.String getSALESCOST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESCOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SALES_COST" element
     */
    public org.apache.xmlbeans.XmlString xgetSALESCOST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SALES_COST" element
     */
    public void setSALESCOST(java.lang.String salescost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESCOST$0);
            }
            target.setStringValue(salescost);
        }
    }
    
    /**
     * Sets (as xml) the "SALES_COST" element
     */
    public void xsetSALESCOST(org.apache.xmlbeans.XmlString salescost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALESCOST$0);
            }
            target.set(salescost);
        }
    }
}
