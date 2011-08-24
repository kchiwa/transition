/*
 * An XML document type.
 * Localname: media_object
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one media_object(@) element.
 *
 * This is a complex type.
 */
public class MediaObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECT$0 = 
        new javax.xml.namespace.QName("", "media_object");
    
    
    /**
     * Gets the "media_object" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject getMediaObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, 0);
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
    public void setMediaObject(com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject mediaObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().add_element_user(MEDIAOBJECT$0);
            }
            target.set(mediaObject);
        }
    }
    
    /**
     * Appends and returns a new empty "media_object" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject addNewMediaObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().add_element_user(MEDIAOBJECT$0);
            return target;
        }
    }
    /**
     * An XML media_object(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument$MediaObject.
     */
    public static class MediaObjectImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject
    {
        private static final long serialVersionUID = 1L;
        
        public MediaObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected MediaObjectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName MIMETYPE$0 = 
            new javax.xml.namespace.QName("", "mimetype");
        private static final javax.xml.namespace.QName FILENAME$2 = 
            new javax.xml.namespace.QName("", "filename");
        
        
        /**
         * Gets the "mimetype" attribute
         */
        public java.lang.String getMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mimetype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "mimetype" attribute
         */
        public boolean isSetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIMETYPE$0) != null;
            }
        }
        
        /**
         * Sets the "mimetype" attribute
         */
        public void setMimetype(java.lang.String mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIMETYPE$0);
                }
                target.setStringValue(mimetype);
            }
        }
        
        /**
         * Sets (as xml) the "mimetype" attribute
         */
        public void xsetMimetype(org.apache.xmlbeans.XmlString mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIMETYPE$0);
                }
                target.set(mimetype);
            }
        }
        
        /**
         * Unsets the "mimetype" attribute
         */
        public void unsetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIMETYPE$0);
            }
        }
        
        /**
         * Gets the "filename" attribute
         */
        public java.lang.String getFilename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "filename" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFilename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$2);
                return target;
            }
        }
        
        /**
         * True if has "filename" attribute
         */
        public boolean isSetFilename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILENAME$2) != null;
            }
        }
        
        /**
         * Sets the "filename" attribute
         */
        public void setFilename(java.lang.String filename)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$2);
                }
                target.setStringValue(filename);
            }
        }
        
        /**
         * Sets (as xml) the "filename" attribute
         */
        public void xsetFilename(org.apache.xmlbeans.XmlString filename)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILENAME$2);
                }
                target.set(filename);
            }
        }
        
        /**
         * Unsets the "filename" attribute
         */
        public void unsetFilename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILENAME$2);
            }
        }
    }
}
