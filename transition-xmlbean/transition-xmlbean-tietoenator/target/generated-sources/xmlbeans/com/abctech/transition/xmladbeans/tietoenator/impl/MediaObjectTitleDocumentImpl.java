/*
 * An XML document type.
 * Localname: media_object_title
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object_title(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectTitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECTTITLE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_title");
    
    
    /**
     * Gets the "media_object_title" element
     */
    public java.lang.String getMediaObjectTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media_object_title" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaObjectTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "media_object_title" element
     */
    public void setMediaObjectTitle(java.lang.String mediaObjectTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTTITLE$0);
            }
            target.setStringValue(mediaObjectTitle);
        }
    }
    
    /**
     * Sets (as xml) the "media_object_title" element
     */
    public void xsetMediaObjectTitle(org.apache.xmlbeans.XmlString mediaObjectTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTTITLE$0);
            }
            target.set(mediaObjectTitle);
        }
    }
}
