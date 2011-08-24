/*
 * An XML document type.
 * Localname: orderplacementcode
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.OrderplacementcodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one orderplacementcode(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class OrderplacementcodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrderplacementcodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderplacementcodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERPLACEMENTCODE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "orderplacementcode");
    
    
    /**
     * Gets the "orderplacementcode" element
     */
    public java.lang.String getOrderplacementcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPLACEMENTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderplacementcode" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderplacementcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPLACEMENTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderplacementcode" element
     */
    public void setOrderplacementcode(java.lang.String orderplacementcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPLACEMENTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERPLACEMENTCODE$0);
            }
            target.setStringValue(orderplacementcode);
        }
    }
    
    /**
     * Sets (as xml) the "orderplacementcode" element
     */
    public void xsetOrderplacementcode(org.apache.xmlbeans.XmlString orderplacementcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPLACEMENTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERPLACEMENTCODE$0);
            }
            target.set(orderplacementcode);
        }
    }
}
