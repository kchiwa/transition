/*
 * An XML document type.
 * Localname: Position
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.PositionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Position(@) element.
 *
 * This is a complex type.
 */
public class PositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.PositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("", "Position");
    
    
    /**
     * Gets the "Position" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().add_element_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
    /**
     * An XML Position(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.webcruiter.PositionDocument$Position.
     */
    public static class PositionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position
    {
        private static final long serialVersionUID = 1L;
        
        public PositionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PositionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "Title");
        private static final javax.xml.namespace.QName FORMAT$2 = 
            new javax.xml.namespace.QName("", "Format");
        
        
        /**
         * Gets the "Title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$0);
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
                return get_store().find_attribute_user(TITLE$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$0);
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
                get_store().remove_attribute(TITLE$0);
            }
        }
        
        /**
         * Gets the "Format" attribute
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
         * Gets (as xml) the "Format" attribute
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
         * True if has "Format" attribute
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
         * Sets the "Format" attribute
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
         * Sets (as xml) the "Format" attribute
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
         * Unsets the "Format" attribute
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
