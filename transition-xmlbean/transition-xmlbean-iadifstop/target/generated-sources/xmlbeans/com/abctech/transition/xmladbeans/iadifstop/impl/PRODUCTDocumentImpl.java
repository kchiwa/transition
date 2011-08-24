/*
 * An XML document type.
 * Localname: PRODUCT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.PRODUCTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop.impl;
/**
 * A document containing one PRODUCT(@) element.
 *
 * This is a complex type.
 */
public class PRODUCTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.PRODUCTDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRODUCTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("", "PRODUCT");
    
    
    /**
     * Gets the "PRODUCT" element
     */
    public java.lang.String getPRODUCT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRODUCT" element
     */
    public org.apache.xmlbeans.XmlString xgetPRODUCT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRODUCT" element
     */
    public void setPRODUCT(java.lang.String product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCT$0);
            }
            target.setStringValue(product);
        }
    }
    
    /**
     * Sets (as xml) the "PRODUCT" element
     */
    public void xsetPRODUCT(org.apache.xmlbeans.XmlString product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCT$0);
            }
            target.set(product);
        }
    }
}
