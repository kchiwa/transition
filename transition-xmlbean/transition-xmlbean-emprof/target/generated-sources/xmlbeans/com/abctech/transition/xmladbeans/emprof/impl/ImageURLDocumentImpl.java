/*
 * An XML document type.
 * Localname: ImageURL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ImageURLDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ImageURL(@) element.
 *
 * This is a complex type.
 */
public class ImageURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ImageURLDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEURL$0 = 
        new javax.xml.namespace.QName("", "ImageURL");
    
    
    /**
     * Gets the "ImageURL" element
     */
    public java.lang.String getImageURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImageURL" element
     */
    public org.apache.xmlbeans.XmlString xgetImageURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImageURL" element
     */
    public void setImageURL(java.lang.String imageURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEURL$0);
            }
            target.setStringValue(imageURL);
        }
    }
    
    /**
     * Sets (as xml) the "ImageURL" element
     */
    public void xsetImageURL(org.apache.xmlbeans.XmlString imageURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEURL$0);
            }
            target.set(imageURL);
        }
    }
}
