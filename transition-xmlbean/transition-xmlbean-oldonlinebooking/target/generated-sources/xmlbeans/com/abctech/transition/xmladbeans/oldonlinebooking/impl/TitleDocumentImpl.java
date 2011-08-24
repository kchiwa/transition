/*
 * An XML document type.
 * Localname: title
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one title(@) element.
 *
 * This is a complex type.
 */
public class TitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("", "title");
    
    
    /**
     * Gets the "title" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    /**
     * An XML title(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument$Title.
     */
    public static class TitleImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title
    {
        private static final long serialVersionUID = 1L;
        
        public TitleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TitleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName FORMAT$0 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "format" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
                return target;
            }
        }
        
        /**
         * True if has "format" attribute
         */
        public boolean isSetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMAT$0) != null;
            }
        }
        
        /**
         * Sets the "format" attribute
         */
        public void setFormat(java.lang.String format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$0);
                }
                target.setStringValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "format" attribute
         */
        public void xsetFormat(org.apache.xmlbeans.XmlString format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$0);
                }
                target.set(format);
            }
        }
        
        /**
         * Unsets the "format" attribute
         */
        public void unsetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMAT$0);
            }
        }
    }
}
