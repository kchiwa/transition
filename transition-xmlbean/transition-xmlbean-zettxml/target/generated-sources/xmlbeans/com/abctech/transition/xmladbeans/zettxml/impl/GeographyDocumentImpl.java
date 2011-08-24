/*
 * An XML document type.
 * Localname: Geography
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.GeographyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Geography(@) element.
 *
 * This is a complex type.
 */
public class GeographyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.GeographyDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHY$0 = 
        new javax.xml.namespace.QName("", "Geography");
    
    
    /**
     * Gets the "Geography" element
     */
    public java.lang.String getGeography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOGRAPHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Geography" element
     */
    public org.apache.xmlbeans.XmlString xgetGeography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOGRAPHY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Geography" element
     */
    public void setGeography(java.lang.String geography)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOGRAPHY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOGRAPHY$0);
            }
            target.setStringValue(geography);
        }
    }
    
    /**
     * Sets (as xml) the "Geography" element
     */
    public void xsetGeography(org.apache.xmlbeans.XmlString geography)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOGRAPHY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOGRAPHY$0);
            }
            target.set(geography);
        }
    }
}
