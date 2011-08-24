/*
 * An XML document type.
 * Localname: publish
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one publish(@) element.
 *
 * This is a complex type.
 */
public class PublishDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISH$0 = 
        new javax.xml.namespace.QName("", "publish");
    
    
    /**
     * Gets the "publish" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish getPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().find_element_user(PUBLISH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "publish" element
     */
    public void setPublish(com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish publish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().find_element_user(PUBLISH$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().add_element_user(PUBLISH$0);
            }
            target.set(publish);
        }
    }
    
    /**
     * Appends and returns a new empty "publish" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish addNewPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().add_element_user(PUBLISH$0);
            return target;
        }
    }
    /**
     * An XML publish(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument$Publish.
     */
    public static class PublishImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish
    {
        private static final long serialVersionUID = 1L;
        
        public PublishImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PublishImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("", "start");
        private static final javax.xml.namespace.QName END$2 = 
            new javax.xml.namespace.QName("", "end");
        
        
        /**
         * Gets the "start" attribute
         */
        public java.lang.String getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "start" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$0);
                return target;
            }
        }
        
        /**
         * True if has "start" attribute
         */
        public boolean isSetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(START$0) != null;
            }
        }
        
        /**
         * Sets the "start" attribute
         */
        public void setStart(java.lang.String start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$0);
                }
                target.setStringValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "start" attribute
         */
        public void xsetStart(org.apache.xmlbeans.XmlString start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Unsets the "start" attribute
         */
        public void unsetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(START$0);
            }
        }
        
        /**
         * Gets the "end" attribute
         */
        public java.lang.String getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "end" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$2);
                return target;
            }
        }
        
        /**
         * True if has "end" attribute
         */
        public boolean isSetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(END$2) != null;
            }
        }
        
        /**
         * Sets the "end" attribute
         */
        public void setEnd(java.lang.String end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$2);
                }
                target.setStringValue(end);
            }
        }
        
        /**
         * Sets (as xml) the "end" attribute
         */
        public void xsetEnd(org.apache.xmlbeans.XmlString end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(END$2);
                }
                target.set(end);
            }
        }
        
        /**
         * Unsets the "end" attribute
         */
        public void unsetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(END$2);
            }
        }
    }
}
