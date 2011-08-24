/*
 * An XML document type.
 * Localname: Media
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.MediaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Media(@) element.
 *
 * This is a complex type.
 */
public class MediaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.MediaDocument
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
    public com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
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
    public void setMedia(com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            }
            target.set(media);
        }
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            return target;
        }
    }
    /**
     * An XML Media(@).
     *
     * This is a complex type.
     */
    public static class MediaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media
    {
        private static final long serialVersionUID = 1L;
        
        public MediaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOGO$0 = 
            new javax.xml.namespace.QName("", "Logo");
        
        
        /**
         * Gets the "Logo" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo getLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo)get_store().find_element_user(LOGO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Logo" element
         */
        public void setLogo(com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo logo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo)get_store().find_element_user(LOGO$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo)get_store().add_element_user(LOGO$0);
                }
                target.set(logo);
            }
        }
        
        /**
         * Appends and returns a new empty "Logo" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo addNewLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo)get_store().add_element_user(LOGO$0);
                return target;
            }
        }
    }
}
