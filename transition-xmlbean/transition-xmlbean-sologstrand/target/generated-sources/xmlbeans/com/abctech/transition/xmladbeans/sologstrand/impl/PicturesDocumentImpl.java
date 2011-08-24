/*
 * An XML document type.
 * Localname: pictures
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.PicturesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one pictures(@) element.
 *
 * This is a complex type.
 */
public class PicturesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PicturesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PicturesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICTURES$0 = 
        new javax.xml.namespace.QName("", "pictures");
    
    
    /**
     * Gets the "pictures" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures getPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().find_element_user(PICTURES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pictures" element
     */
    public void setPictures(com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures pictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().find_element_user(PICTURES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().add_element_user(PICTURES$0);
            }
            target.set(pictures);
        }
    }
    
    /**
     * Appends and returns a new empty "pictures" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures addNewPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().add_element_user(PICTURES$0);
            return target;
        }
    }
    /**
     * An XML pictures(@).
     *
     * This is a complex type.
     */
    public static class PicturesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures
    {
        private static final long serialVersionUID = 1L;
        
        public PicturesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PHOTO$0 = 
            new javax.xml.namespace.QName("", "photo");
        private static final javax.xml.namespace.QName PLAN$2 = 
            new javax.xml.namespace.QName("", "plan");
        
        
        /**
         * Gets array of all "photo" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo[] getPhotoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PHOTO$0, targetList);
                com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo[] result = new com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "photo" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo getPhotoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().find_element_user(PHOTO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "photo" element
         */
        public int sizeOfPhotoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHOTO$0);
            }
        }
        
        /**
         * Sets array of all "photo" element
         */
        public void setPhotoArray(com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo[] photoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(photoArray, PHOTO$0);
            }
        }
        
        /**
         * Sets ith "photo" element
         */
        public void setPhotoArray(int i, com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo photo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().find_element_user(PHOTO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(photo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "photo" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo insertNewPhoto(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().insert_element_user(PHOTO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "photo" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo addNewPhoto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().add_element_user(PHOTO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "photo" element
         */
        public void removePhoto(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHOTO$0, i);
            }
        }
        
        /**
         * Gets the "plan" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan getPlan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().find_element_user(PLAN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "plan" element
         */
        public void setPlan(com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan plan)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().find_element_user(PLAN$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().add_element_user(PLAN$2);
                }
                target.set(plan);
            }
        }
        
        /**
         * Appends and returns a new empty "plan" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan addNewPlan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().add_element_user(PLAN$2);
                return target;
            }
        }
    }
}
