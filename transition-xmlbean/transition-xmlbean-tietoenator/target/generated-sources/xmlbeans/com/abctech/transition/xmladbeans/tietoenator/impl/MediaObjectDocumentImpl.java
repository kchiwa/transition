/*
 * An XML document type.
 * Localname: media_object
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object");
    
    
    /**
     * Gets the "media_object" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject getMediaObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "media_object" element
     */
    public void setMediaObject(com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject mediaObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().add_element_user(MEDIAOBJECT$0);
            }
            target.set(mediaObject);
        }
    }
    
    /**
     * Appends and returns a new empty "media_object" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject addNewMediaObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().add_element_user(MEDIAOBJECT$0);
            return target;
        }
    }
    /**
     * An XML media_object(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class MediaObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject
    {
        private static final long serialVersionUID = 1L;
        
        public MediaObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEDIAOBJECTTYPE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_type");
        private static final javax.xml.namespace.QName MEDIAOBJECTTITLE$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_title");
        private static final javax.xml.namespace.QName MEDIAOBJECTADDRESS$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_address");
        private static final javax.xml.namespace.QName MEDIAOBJECTINLINE$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_inline");
        
        
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
        
        /**
         * Gets the "media_object_title" element
         */
        public java.lang.String getMediaObjectTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTITLE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTITLE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTTITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTTITLE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTTITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTTITLE$2);
                }
                target.set(mediaObjectTitle);
            }
        }
        
        /**
         * Gets the "media_object_address" element
         */
        public java.lang.String getMediaObjectAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTADDRESS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "media_object_address" element
         */
        public org.apache.xmlbeans.XmlString xgetMediaObjectAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTADDRESS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "media_object_address" element
         */
        public void setMediaObjectAddress(java.lang.String mediaObjectAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTADDRESS$4);
                }
                target.setStringValue(mediaObjectAddress);
            }
        }
        
        /**
         * Sets (as xml) the "media_object_address" element
         */
        public void xsetMediaObjectAddress(org.apache.xmlbeans.XmlString mediaObjectAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTADDRESS$4);
                }
                target.set(mediaObjectAddress);
            }
        }
        
        /**
         * Gets the "media_object_inline" element
         */
        public java.lang.String getMediaObjectInline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTINLINE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTINLINE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTINLINE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTINLINE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTINLINE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTINLINE$6);
                }
                target.set(mediaObjectInline);
            }
        }
    }
}
