/*
 * An XML document type.
 * Localname: photo
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.PhotoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one photo(@) element.
 *
 * This is a complex type.
 */
public class PhotoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PhotoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhotoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHOTO$0 = 
        new javax.xml.namespace.QName("", "photo");
    
    
    /**
     * Gets the "photo" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo getPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().find_element_user(PHOTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "photo" element
     */
    public void setPhoto(com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo photo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().find_element_user(PHOTO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo)get_store().add_element_user(PHOTO$0);
            }
            target.set(photo);
        }
    }
    
    /**
     * Appends and returns a new empty "photo" element
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
     * An XML photo(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.sologstrand.PhotoDocument$Photo.
     */
    public static class PhotoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.sologstrand.PhotoDocument.Photo
    {
        private static final long serialVersionUID = 1L;
        
        public PhotoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PhotoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LARGE$0 = 
            new javax.xml.namespace.QName("", "large");
        
        
        /**
         * Gets the "large" attribute
         */
        public java.lang.String getLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "large" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LARGE$0);
                return target;
            }
        }
        
        /**
         * True if has "large" attribute
         */
        public boolean isSetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LARGE$0) != null;
            }
        }
        
        /**
         * Sets the "large" attribute
         */
        public void setLarge(java.lang.String large)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LARGE$0);
                }
                target.setStringValue(large);
            }
        }
        
        /**
         * Sets (as xml) the "large" attribute
         */
        public void xsetLarge(org.apache.xmlbeans.XmlString large)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LARGE$0);
                }
                target.set(large);
            }
        }
        
        /**
         * Unsets the "large" attribute
         */
        public void unsetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LARGE$0);
            }
        }
    }
}
