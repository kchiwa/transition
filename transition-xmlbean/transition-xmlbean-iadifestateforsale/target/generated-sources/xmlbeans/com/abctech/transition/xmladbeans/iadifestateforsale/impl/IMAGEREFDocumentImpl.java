/*
 * An XML document type.
 * Localname: IMAGE_REF
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.IMAGEREFDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one IMAGE_REF(@) element.
 *
 * This is a complex type.
 */
public class IMAGEREFDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.IMAGEREFDocument
{
    private static final long serialVersionUID = 1L;
    
    public IMAGEREFDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEREF$0 = 
        new javax.xml.namespace.QName("", "IMAGE_REF");
    
    
    /**
     * Gets the "IMAGE_REF" element
     */
    public java.lang.String getIMAGEREF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IMAGE_REF" element
     */
    public org.apache.xmlbeans.XmlString xgetIMAGEREF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IMAGE_REF" element
     */
    public void setIMAGEREF(java.lang.String imageref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEREF$0);
            }
            target.setStringValue(imageref);
        }
    }
    
    /**
     * Sets (as xml) the "IMAGE_REF" element
     */
    public void xsetIMAGEREF(org.apache.xmlbeans.XmlString imageref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEREF$0);
            }
            target.set(imageref);
        }
    }
}
