/*
 * An XML document type.
 * Localname: ordernumber
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.OrdernumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one ordernumber(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class OrdernumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrdernumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrdernumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "ordernumber");
    
    
    /**
     * Gets the "ordernumber" element
     */
    public java.lang.String getOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ordernumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ordernumber" element
     */
    public void setOrdernumber(java.lang.String ordernumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$0);
            }
            target.setStringValue(ordernumber);
        }
    }
    
    /**
     * Sets (as xml) the "ordernumber" element
     */
    public void xsetOrdernumber(org.apache.xmlbeans.XmlString ordernumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$0);
            }
            target.set(ordernumber);
        }
    }
}
