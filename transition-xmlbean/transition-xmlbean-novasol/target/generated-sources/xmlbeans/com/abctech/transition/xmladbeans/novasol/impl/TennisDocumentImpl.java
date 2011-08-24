/*
 * An XML document type.
 * Localname: Tennis
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TennisDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Tennis(@) element.
 *
 * This is a complex type.
 */
public class TennisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TennisDocument
{
    private static final long serialVersionUID = 1L;
    
    public TennisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TENNIS$0 = 
        new javax.xml.namespace.QName("", "Tennis");
    
    
    /**
     * Gets the "Tennis" element
     */
    public java.lang.String getTennis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENNIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tennis" element
     */
    public org.apache.xmlbeans.XmlString xgetTennis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TENNIS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Tennis" element
     */
    public void setTennis(java.lang.String tennis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENNIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TENNIS$0);
            }
            target.setStringValue(tennis);
        }
    }
    
    /**
     * Sets (as xml) the "Tennis" element
     */
    public void xsetTennis(org.apache.xmlbeans.XmlString tennis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TENNIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TENNIS$0);
            }
            target.set(tennis);
        }
    }
}
