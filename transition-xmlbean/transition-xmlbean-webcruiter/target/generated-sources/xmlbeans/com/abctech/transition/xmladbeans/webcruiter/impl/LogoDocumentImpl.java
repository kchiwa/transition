/*
 * An XML document type.
 * Localname: Logo
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.LogoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Logo(@) element.
 *
 * This is a complex type.
 */
public class LogoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.LogoDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Logo(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.webcruiter.LogoDocument$Logo.
     */
    public static class LogoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.webcruiter.LogoDocument.Logo
    {
        private static final long serialVersionUID = 1L;
        
        public LogoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LogoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("", "Title");
        
        
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
    }
}
