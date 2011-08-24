/*
 * An XML document type.
 * Localname: media_object_type
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object_type(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_type");
    
    
    /**
     * Gets the "media_object_type" element
     */
    public java.lang.String getMediaObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media_object_type" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "media_object_type" element
     */
    public void setMediaObjectType(java.lang.String mediaObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTTYPE$0);
            }
            target.setStringValue(mediaObjectType);
        }
    }
    
    /**
     * Sets (as xml) the "media_object_type" element
     */
    public void xsetMediaObjectType(org.apache.xmlbeans.XmlString mediaObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTTYPE$0);
            }
            target.set(mediaObjectType);
        }
    }
}
