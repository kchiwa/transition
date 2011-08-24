/*
 * An XML document type.
 * Localname: media_object_inline
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectInlineDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object_inline(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectInlineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectInlineDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectInlineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECTINLINE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_inline");
    
    
    /**
     * Gets the "media_object_inline" element
     */
    public java.lang.String getMediaObjectInline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTINLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media_object_inline" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaObjectInline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTINLINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "media_object_inline" element
     */
    public void setMediaObjectInline(java.lang.String mediaObjectInline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTINLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTINLINE$0);
            }
            target.setStringValue(mediaObjectInline);
        }
    }
    
    /**
     * Sets (as xml) the "media_object_inline" element
     */
    public void xsetMediaObjectInline(org.apache.xmlbeans.XmlString mediaObjectInline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTINLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTINLINE$0);
            }
            target.set(mediaObjectInline);
        }
    }
}
