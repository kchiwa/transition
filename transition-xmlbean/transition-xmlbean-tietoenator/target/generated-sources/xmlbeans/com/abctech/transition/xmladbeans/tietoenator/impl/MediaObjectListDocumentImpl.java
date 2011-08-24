/*
 * An XML document type.
 * Localname: media_object_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECTLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_list");
    
    
    /**
     * Gets the "media_object_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList getMediaObjectList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().find_element_user(MEDIAOBJECTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "media_object_list" element
     */
    public void setMediaObjectList(com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList mediaObjectList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().find_element_user(MEDIAOBJECTLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().add_element_user(MEDIAOBJECTLIST$0);
            }
            target.set(mediaObjectList);
        }
    }
    
    /**
     * Appends and returns a new empty "media_object_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList addNewMediaObjectList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().add_element_user(MEDIAOBJECTLIST$0);
            return target;
        }
    }
    /**
     * An XML media_object_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class MediaObjectListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList
    {
        private static final long serialVersionUID = 1L;
        
        public MediaObjectListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEDIAOBJECT$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object");
        
        
        /**
         * Gets array of all "media_object" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject[] getMediaObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEDIAOBJECT$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject[] result = new com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "media_object" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject getMediaObjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "media_object" element
         */
        public int sizeOfMediaObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIAOBJECT$0);
            }
        }
        
        /**
         * Sets array of all "media_object" element
         */
        public void setMediaObjectArray(com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject[] mediaObjectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mediaObjectArray, MEDIAOBJECT$0);
            }
        }
        
        /**
         * Sets ith "media_object" element
         */
        public void setMediaObjectArray(int i, com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject mediaObject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mediaObject);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "media_object" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject insertNewMediaObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject)get_store().insert_element_user(MEDIAOBJECT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "media_object" element
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
         * Removes the ith "media_object" element
         */
        public void removeMediaObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIAOBJECT$0, i);
            }
        }
    }
}
