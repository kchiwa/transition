/*
 * An XML document type.
 * Localname: MediaElement
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.MediaElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one MediaElement(@) element.
 *
 * This is a complex type.
 */
public class MediaElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.MediaElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAELEMENT$0 = 
        new javax.xml.namespace.QName("", "MediaElement");
    
    
    /**
     * Gets the "MediaElement" element
     */
    public com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement getMediaElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().find_element_user(MEDIAELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MediaElement" element
     */
    public void setMediaElement(com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement mediaElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().find_element_user(MEDIAELEMENT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement)get_store().add_element_user(MEDIAELEMENT$0);
            }
            target.set(mediaElement);
        }
    }
    
    /**
     * Appends and returns a new empty "MediaElement" element
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
     * An XML MediaElement(@).
     *
     * This is a complex type.
     */
    public static class MediaElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement
    {
        private static final long serialVersionUID = 1L;
        
        public MediaElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ELEMENTTITLE$0 = 
            new javax.xml.namespace.QName("", "ElementTitle");
        private static final javax.xml.namespace.QName ORDER$2 = 
            new javax.xml.namespace.QName("", "Order");
        private static final javax.xml.namespace.QName REFERENCE$4 = 
            new javax.xml.namespace.QName("", "Reference");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName MD5$8 = 
            new javax.xml.namespace.QName("", "md5");
        
        
        /**
         * Gets the "ElementTitle" element
         */
        public java.lang.String getElementTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTTITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElementTitle" element
         */
        public org.apache.xmlbeans.XmlString xgetElementTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENTTITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ElementTitle" element
         */
        public void setElementTitle(java.lang.String elementTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTTITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENTTITLE$0);
                }
                target.setStringValue(elementTitle);
            }
        }
        
        /**
         * Sets (as xml) the "ElementTitle" element
         */
        public void xsetElementTitle(org.apache.xmlbeans.XmlString elementTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENTTITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ELEMENTTITLE$0);
                }
                target.set(elementTitle);
            }
        }
        
        /**
         * Gets the "Order" attribute
         */
        public java.lang.String getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$2);
                return target;
            }
        }
        
        /**
         * True if has "Order" attribute
         */
        public boolean isSetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORDER$2) != null;
            }
        }
        
        /**
         * Sets the "Order" attribute
         */
        public void setOrder(java.lang.String order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$2);
                }
                target.setStringValue(order);
            }
        }
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        public void xsetOrder(org.apache.xmlbeans.XmlString order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDER$2);
                }
                target.set(order);
            }
        }
        
        /**
         * Unsets the "Order" attribute
         */
        public void unsetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORDER$2);
            }
        }
        
        /**
         * Gets the "Reference" attribute
         */
        public java.lang.String getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reference" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REFERENCE$4);
                return target;
            }
        }
        
        /**
         * Sets the "Reference" attribute
         */
        public void setReference(java.lang.String reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFERENCE$4);
                }
                target.setStringValue(reference);
            }
        }
        
        /**
         * Sets (as xml) the "Reference" attribute
         */
        public void xsetReference(org.apache.xmlbeans.XmlString reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REFERENCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REFERENCE$4);
                }
                target.set(reference);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "md5" attribute
         */
        public java.lang.String getMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "md5" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$8);
                return target;
            }
        }
        
        /**
         * True if has "md5" attribute
         */
        public boolean isSetMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MD5$8) != null;
            }
        }
        
        /**
         * Sets the "md5" attribute
         */
        public void setMd5(java.lang.String md5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MD5$8);
                }
                target.setStringValue(md5);
            }
        }
        
        /**
         * Sets (as xml) the "md5" attribute
         */
        public void xsetMd5(org.apache.xmlbeans.XmlString md5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MD5$8);
                }
                target.set(md5);
            }
        }
        
        /**
         * Unsets the "md5" attribute
         */
        public void unsetMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MD5$8);
            }
        }
    }
}
