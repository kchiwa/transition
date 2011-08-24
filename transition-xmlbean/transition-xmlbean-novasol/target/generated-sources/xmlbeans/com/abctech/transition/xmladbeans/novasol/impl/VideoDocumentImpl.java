/*
 * An XML document type.
 * Localname: Video
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.VideoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Video(@) element.
 *
 * This is a complex type.
 */
public class VideoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.VideoDocument
{
    private static final long serialVersionUID = 1L;
    
    public VideoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIDEO$0 = 
        new javax.xml.namespace.QName("", "Video");
    
    
    /**
     * Gets the "Video" element
     */
    public java.lang.String getVideo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIDEO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Video" element
     */
    public org.apache.xmlbeans.XmlString xgetVideo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIDEO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Video" element
     */
    public void setVideo(java.lang.String video)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIDEO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIDEO$0);
            }
            target.setStringValue(video);
        }
    }
    
    /**
     * Sets (as xml) the "Video" element
     */
    public void xsetVideo(org.apache.xmlbeans.XmlString video)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIDEO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIDEO$0);
            }
            target.set(video);
        }
    }
}
