/*
 * An XML document type.
 * Localname: Golf
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.GolfDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Golf(@) element.
 *
 * This is a complex type.
 */
public class GolfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.GolfDocument
{
    private static final long serialVersionUID = 1L;
    
    public GolfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GOLF$0 = 
        new javax.xml.namespace.QName("", "Golf");
    
    
    /**
     * Gets the "Golf" element
     */
    public java.lang.String getGolf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOLF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Golf" element
     */
    public org.apache.xmlbeans.XmlString xgetGolf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOLF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Golf" element
     */
    public void setGolf(java.lang.String golf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOLF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOLF$0);
            }
            target.setStringValue(golf);
        }
    }
    
    /**
     * Sets (as xml) the "Golf" element
     */
    public void xsetGolf(org.apache.xmlbeans.XmlString golf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOLF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOLF$0);
            }
            target.set(golf);
        }
    }
}
