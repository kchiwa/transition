/*
 * An XML document type.
 * Localname: Comfort
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ComfortDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Comfort(@) element.
 *
 * This is a complex type.
 */
public class ComfortDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ComfortDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComfortDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMFORT$0 = 
        new javax.xml.namespace.QName("", "Comfort");
    
    
    /**
     * Gets the "Comfort" element
     */
    public java.lang.String getComfort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMFORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comfort" element
     */
    public org.apache.xmlbeans.XmlString xgetComfort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMFORT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Comfort" element
     */
    public void setComfort(java.lang.String comfort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMFORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMFORT$0);
            }
            target.setStringValue(comfort);
        }
    }
    
    /**
     * Sets (as xml) the "Comfort" element
     */
    public void xsetComfort(org.apache.xmlbeans.XmlString comfort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMFORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMFORT$0);
            }
            target.set(comfort);
        }
    }
}
