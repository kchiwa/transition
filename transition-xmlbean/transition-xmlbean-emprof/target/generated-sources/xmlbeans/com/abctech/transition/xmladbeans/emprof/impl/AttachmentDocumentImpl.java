/*
 * An XML document type.
 * Localname: Attachment
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one Attachment(@) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.AttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("", "Attachment");
    
    
    /**
     * Gets the "Attachment" element
     */
    public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attachment" element
     */
    public void setAttachment(com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$0);
            }
            target.set(attachment);
        }
    }
    
    /**
     * Appends and returns a new empty "Attachment" element
     */
    public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
    /**
     * An XML Attachment(@).
     *
     * This is a complex type.
     */
    public static class AttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment
    {
        private static final long serialVersionUID = 1L;
        
        public AttachmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MIDASADREF$0 = 
            new javax.xml.namespace.QName("", "MidasAdRef");
        private static final javax.xml.namespace.QName IMAGEURL$2 = 
            new javax.xml.namespace.QName("", "ImageURL");
        private static final javax.xml.namespace.QName IMAGEREF$4 = 
            new javax.xml.namespace.QName("", "ImageRef");
        private static final javax.xml.namespace.QName STATUSATTRIBUTE$6 = 
            new javax.xml.namespace.QName("", "Status");
        
        
        /**
         * Gets the "MidasAdRef" element
         */
        public java.lang.String getMidasAdRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MidasAdRef" element
         */
        public org.apache.xmlbeans.XmlString xgetMidasAdRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MidasAdRef" element
         */
        public void setMidasAdRef(java.lang.String midasAdRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDASADREF$0);
                }
                target.setStringValue(midasAdRef);
            }
        }
        
        /**
         * Sets (as xml) the "MidasAdRef" element
         */
        public void xsetMidasAdRef(org.apache.xmlbeans.XmlString midasAdRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDASADREF$0);
                }
                target.set(midasAdRef);
            }
        }
        
        /**
         * Gets the "ImageURL" element
         */
        public java.lang.String getImageURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ImageURL" element
         */
        public org.apache.xmlbeans.XmlString xgetImageURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ImageURL" element
         */
        public void setImageURL(java.lang.String imageURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEURL$2);
                }
                target.setStringValue(imageURL);
            }
        }
        
        /**
         * Sets (as xml) the "ImageURL" element
         */
        public void xsetImageURL(org.apache.xmlbeans.XmlString imageURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEURL$2);
                }
                target.set(imageURL);
            }
        }
        
        /**
         * Gets the "ImageRef" element
         */
        public java.lang.String getImageRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ImageRef" element
         */
        public org.apache.xmlbeans.XmlString xgetImageRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ImageRef" element
         */
        public void setImageRef(java.lang.String imageRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEREF$4);
                }
                target.setStringValue(imageRef);
            }
        }
        
        /**
         * Sets (as xml) the "ImageRef" element
         */
        public void xsetImageRef(org.apache.xmlbeans.XmlString imageRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEREF$4);
                }
                target.set(imageRef);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 getStatusAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatusAttribute(com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 statusAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$6);
                }
                target.set(statusAttribute);
            }
        }
        
        /**
         * Appends and returns a new empty "Status" element
         */
        public com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 addNewStatusAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$6);
                return target;
            }
        }
    }
}
