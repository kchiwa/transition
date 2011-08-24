/*
 * An XML document type.
 * Localname: felt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.FeltDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one felt(@) element.
 *
 * This is a complex type.
 */
public class FeltDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.FeltDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeltDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FELT$0 = 
        new javax.xml.namespace.QName("", "felt");
    
    
    /**
     * Gets the "felt" element
     */
    public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt getFelt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "felt" element
     */
    public void setFelt(com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt felt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().add_element_user(FELT$0);
            }
            target.set(felt);
        }
    }
    
    /**
     * Appends and returns a new empty "felt" element
     */
    public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt addNewFelt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().add_element_user(FELT$0);
            return target;
        }
    }
    /**
     * An XML felt(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.webmegler.FeltDocument$Felt.
     */
    public static class FeltImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt
    {
        private static final long serialVersionUID = 1L;
        
        public FeltImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected FeltImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAVN$0 = 
            new javax.xml.namespace.QName("", "navn");
        private static final javax.xml.namespace.QName FORMAT$2 = 
            new javax.xml.namespace.QName("", "format");
        private static final javax.xml.namespace.QName MAXLEN$4 = 
            new javax.xml.namespace.QName("", "maxlen");
        
        
        /**
         * Gets the "navn" attribute
         */
        public java.lang.String getNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navn" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$0);
                return target;
            }
        }
        
        /**
         * True if has "navn" attribute
         */
        public boolean isSetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAVN$0) != null;
            }
        }
        
        /**
         * Sets the "navn" attribute
         */
        public void setNavn(java.lang.String navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVN$0);
                }
                target.setStringValue(navn);
            }
        }
        
        /**
         * Sets (as xml) the "navn" attribute
         */
        public void xsetNavn(org.apache.xmlbeans.XmlString navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVN$0);
                }
                target.set(navn);
            }
        }
        
        /**
         * Unsets the "navn" attribute
         */
        public void unsetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAVN$0);
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
        
        /**
         * Gets the "maxlen" attribute
         */
        public java.lang.String getMaxlen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLEN$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxlen" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMaxlen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXLEN$4);
                return target;
            }
        }
        
        /**
         * True if has "maxlen" attribute
         */
        public boolean isSetMaxlen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAXLEN$4) != null;
            }
        }
        
        /**
         * Sets the "maxlen" attribute
         */
        public void setMaxlen(java.lang.String maxlen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLEN$4);
                }
                target.setStringValue(maxlen);
            }
        }
        
        /**
         * Sets (as xml) the "maxlen" attribute
         */
        public void xsetMaxlen(org.apache.xmlbeans.XmlString maxlen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXLEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAXLEN$4);
                }
                target.set(maxlen);
            }
        }
        
        /**
         * Unsets the "maxlen" attribute
         */
        public void unsetMaxlen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAXLEN$4);
            }
        }
    }
}
