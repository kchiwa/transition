/*
 * An XML document type.
 * Localname: ORDERNO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.ORDERNODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one ORDERNO(@) element.
 *
 * This is a complex type.
 */
public class ORDERNODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.ORDERNODocument
{
    private static final long serialVersionUID = 1L;
    
    public ORDERNODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNO$0 = 
        new javax.xml.namespace.QName("", "ORDERNO");
    
    
    /**
     * Gets the "ORDERNO" element
     */
    public java.lang.String getORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ORDERNO" element
     */
    public org.apache.xmlbeans.XmlString xgetORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ORDERNO" element
     */
    public void setORDERNO(java.lang.String orderno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNO$0);
            }
            target.setStringValue(orderno);
        }
    }
    
    /**
     * Sets (as xml) the "ORDERNO" element
     */
    public void xsetORDERNO(org.apache.xmlbeans.XmlString orderno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNO$0);
            }
            target.set(orderno);
        }
    }
}
