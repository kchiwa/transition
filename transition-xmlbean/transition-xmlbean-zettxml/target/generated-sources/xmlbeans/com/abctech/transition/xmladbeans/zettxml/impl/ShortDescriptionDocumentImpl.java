/*
 * An XML document type.
 * Localname: ShortDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ShortDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ShortDescription(@) element.
 *
 * This is a complex type.
 */
public class ShortDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ShortDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShortDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ShortDescription");
    
    
    /**
     * Gets the "ShortDescription" element
     */
    public java.lang.String getShortDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShortDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetShortDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ShortDescription" element
     */
    public void setShortDescription(java.lang.String shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTDESCRIPTION$0);
            }
            target.setStringValue(shortDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ShortDescription" element
     */
    public void xsetShortDescription(org.apache.xmlbeans.XmlString shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTDESCRIPTION$0);
            }
            target.set(shortDescription);
        }
    }
}
