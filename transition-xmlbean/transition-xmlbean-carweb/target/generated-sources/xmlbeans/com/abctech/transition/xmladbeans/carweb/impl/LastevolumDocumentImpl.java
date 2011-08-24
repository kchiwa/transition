/*
 * An XML document type.
 * Localname: Lastevolum
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.LastevolumDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Lastevolum(@) element.
 *
 * This is a complex type.
 */
public class LastevolumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.LastevolumDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastevolumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTEVOLUM$0 = 
        new javax.xml.namespace.QName("", "Lastevolum");
    
    
    /**
     * Gets the "Lastevolum" element
     */
    public java.lang.String getLastevolum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEVOLUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Lastevolum" element
     */
    public org.apache.xmlbeans.XmlString xgetLastevolum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTEVOLUM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Lastevolum" element
     */
    public void setLastevolum(java.lang.String lastevolum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEVOLUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTEVOLUM$0);
            }
            target.setStringValue(lastevolum);
        }
    }
    
    /**
     * Sets (as xml) the "Lastevolum" element
     */
    public void xsetLastevolum(org.apache.xmlbeans.XmlString lastevolum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTEVOLUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTEVOLUM$0);
            }
            target.set(lastevolum);
        }
    }
}
