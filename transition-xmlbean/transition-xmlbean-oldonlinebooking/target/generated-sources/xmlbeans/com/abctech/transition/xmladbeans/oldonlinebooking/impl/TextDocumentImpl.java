/*
 * An XML document type.
 * Localname: text
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one text(@) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("", "text");
    
    
    /**
     * Gets the "text" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    /**
     * An XML text(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument$Text.
     */
    public static class TextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text
    {
        private static final long serialVersionUID = 1L;
        
        public TextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName HEADING$0 = 
            new javax.xml.namespace.QName("", "heading");
        private static final javax.xml.namespace.QName FORMAT$2 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "heading" attribute
         */
        public java.lang.String getHeading()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "heading" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeading()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADING$0);
                return target;
            }
        }
        
        /**
         * True if has "heading" attribute
         */
        public boolean isSetHeading()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADING$0) != null;
            }
        }
        
        /**
         * Sets the "heading" attribute
         */
        public void setHeading(java.lang.String heading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADING$0);
                }
                target.setStringValue(heading);
            }
        }
        
        /**
         * Sets (as xml) the "heading" attribute
         */
        public void xsetHeading(org.apache.xmlbeans.XmlString heading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADING$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADING$0);
                }
                target.set(heading);
            }
        }
        
        /**
         * Unsets the "heading" attribute
         */
        public void unsetHeading()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADING$0);
            }
        }
        
        /**
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$2);
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
                return get_store().find_attribute_user(FORMAT$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$2);
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
                get_store().remove_attribute(FORMAT$2);
            }
        }
    }
}
