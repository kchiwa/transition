/*
 * An XML document type.
 * Localname: Media
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.MediaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Media(@) element.
 *
 * This is a complex type.
 */
public class MediaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.MediaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIA$0 = 
        new javax.xml.namespace.QName("", "Media");
    
    
    /**
     * Gets the "Media" element
     */
    public com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Media" element
     */
    public void setMedia(com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            }
            target.set(media);
        }
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            return target;
        }
    }
    /**
     * An XML Media(@).
     *
     * This is a complex type.
     */
    public static class MediaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media
    {
        private static final long serialVersionUID = 1L;
        
        public MediaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEDIAELEMENT$0 = 
            new javax.xml.namespace.QName("", "MediaElement");
        
        
        /**
         * Gets array of all "MediaElement" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement[] getMediaElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEDIAELEMENT$0, targetList);
                com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement[] result = new com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MediaElement" element
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement getMediaElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().find_element_user(MEDIAELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MediaElement" element
         */
        public int sizeOfMediaElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIAELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "MediaElement" element
         */
        public void setMediaElementArray(com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement[] mediaElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mediaElementArray, MEDIAELEMENT$0);
            }
        }
        
        /**
         * Sets ith "MediaElement" element
         */
        public void setMediaElementArray(int i, com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement mediaElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().find_element_user(MEDIAELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mediaElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MediaElement" element
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement insertNewMediaElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().insert_element_user(MEDIAELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MediaElement" element
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement addNewMediaElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().add_element_user(MEDIAELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "MediaElement" element
         */
        public void removeMediaElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIAELEMENT$0, i);
            }
        }
    }
}
