/*
 * An XML document type.
 * Localname: ORDERNO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ORDERNO(@) element.
 *
 * This is a complex type.
 */
public class ORDERNODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument
{
    private static final long serialVersionUID = 1L;
    
    public ORDERNODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNO$0 = 
        new javax.xml.namespace.QName("", "ORDERNO");
    
    
    /**
     * Gets the "ORDERNO" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO getORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ORDERNO" element
     */
    public void setORDERNO(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO orderno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO)get_store().add_element_user(ORDERNO$0);
            }
            target.set(orderno);
        }
    }
    
    /**
     * Appends and returns a new empty "ORDERNO" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO addNewORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO)get_store().add_element_user(ORDERNO$0);
            return target;
        }
    }
    /**
     * An XML ORDERNO(@).
     *
     * This is a complex type.
     */
    public static class ORDERNOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO
    {
        private static final long serialVersionUID = 1L;
        
        public ORDERNOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREVIEW$0 = 
            new javax.xml.namespace.QName("", "PREVIEW");
        
        
        /**
         * Gets the "PREVIEW" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW.Enum getPREVIEW()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIEW$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREVIEW$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PREVIEW" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW xgetPREVIEW()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW)get_store().find_attribute_user(PREVIEW$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW)get_default_attribute_value(PREVIEW$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "PREVIEW" attribute
         */
        public boolean isSetPREVIEW()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREVIEW$0) != null;
            }
        }
        
        /**
         * Sets the "PREVIEW" attribute
         */
        public void setPREVIEW(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW.Enum preview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIEW$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREVIEW$0);
                }
                target.setEnumValue(preview);
            }
        }
        
        /**
         * Sets (as xml) the "PREVIEW" attribute
         */
        public void xsetPREVIEW(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW preview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW)get_store().find_attribute_user(PREVIEW$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW)get_store().add_attribute_user(PREVIEW$0);
                }
                target.set(preview);
            }
        }
        
        /**
         * Unsets the "PREVIEW" attribute
         */
        public void unsetPREVIEW()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREVIEW$0);
            }
        }
        /**
         * An XML PREVIEW(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument$ORDERNO$PREVIEW.
         */
        public static class PREVIEWImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW
        {
            private static final long serialVersionUID = 1L;
            
            public PREVIEWImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PREVIEWImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
