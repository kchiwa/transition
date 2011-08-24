/*
 * An XML document type.
 * Localname: ImageRef
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ImageRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ImageRef(@) element.
 *
 * This is a complex type.
 */
public class ImageRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ImageRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEREF$0 = 
        new javax.xml.namespace.QName("", "ImageRef");
    
    
    /**
     * Gets the "ImageRef" element
     */
    public java.lang.String getImageRef()
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
     * Gets (as xml) the "ImageRef" element
     */
    public org.apache.xmlbeans.XmlString xgetImageRef()
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
     * Sets the "ImageRef" element
     */
    public void setImageRef(java.lang.String imageRef)
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
            target.setStringValue(imageRef);
        }
    }
    
    /**
     * Sets (as xml) the "ImageRef" element
     */
    public void xsetImageRef(org.apache.xmlbeans.XmlString imageRef)
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
            target.set(imageRef);
        }
    }
}
