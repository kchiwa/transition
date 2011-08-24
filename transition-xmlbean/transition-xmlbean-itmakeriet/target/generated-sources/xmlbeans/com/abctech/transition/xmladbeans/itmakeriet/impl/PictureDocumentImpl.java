/*
 * An XML document type.
 * Localname: Picture
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PictureDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Picture(@) element.
 *
 * This is a complex type.
 */
public class PictureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PictureDocument
{
    private static final long serialVersionUID = 1L;
    
    public PictureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICTURE$0 = 
        new javax.xml.namespace.QName("", "Picture");
    
    
    /**
     * Gets the "Picture" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture getPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().find_element_user(PICTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Picture" element
     */
    public void setPicture(com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().find_element_user(PICTURE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().add_element_user(PICTURE$0);
            }
            target.set(picture);
        }
    }
    
    /**
     * Appends and returns a new empty "Picture" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture addNewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().add_element_user(PICTURE$0);
            return target;
        }
    }
    /**
     * An XML Picture(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.itmakeriet.PictureDocument$Picture.
     */
    public static class PictureImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture
    {
        private static final long serialVersionUID = 1L;
        
        public PictureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PictureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("", "Title");
        private static final javax.xml.namespace.QName LASTMODIFIED$4 = 
            new javax.xml.namespace.QName("", "LastModified");
        
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
        
        /**
         * Gets the "Title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
                return target;
            }
        }
        
        /**
         * True if has "Title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$2) != null;
            }
        }
        
        /**
         * Sets the "Title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$2);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "Title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$2);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "Title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$2);
            }
        }
        
        /**
         * Gets the "LastModified" attribute
         */
        public java.lang.String getLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastModified" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$4);
                return target;
            }
        }
        
        /**
         * True if has "LastModified" attribute
         */
        public boolean isSetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTMODIFIED$4) != null;
            }
        }
        
        /**
         * Sets the "LastModified" attribute
         */
        public void setLastModified(java.lang.String lastModified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTMODIFIED$4);
                }
                target.setStringValue(lastModified);
            }
        }
        
        /**
         * Sets (as xml) the "LastModified" attribute
         */
        public void xsetLastModified(org.apache.xmlbeans.XmlString lastModified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTMODIFIED$4);
                }
                target.set(lastModified);
            }
        }
        
        /**
         * Unsets the "LastModified" attribute
         */
        public void unsetLastModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTMODIFIED$4);
            }
        }
    }
}
