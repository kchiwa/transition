/*
 * An XML document type.
 * Localname: field
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one field(@) element.
 *
 * This is a complex type.
 */
public class FieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("", "field");
    
    
    /**
     * Gets the "field" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().find_element_user(FIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field" element
     */
    public void setField(com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().find_element_user(FIELD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().add_element_user(FIELD$0);
            }
            target.set(field);
        }
    }
    
    /**
     * Appends and returns a new empty "field" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    /**
     * An XML field(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument$Field.
     */
    public static class FieldImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field
    {
        private static final long serialVersionUID = 1L;
        
        public FieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected FieldImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName FIELDNAME$0 = 
            new javax.xml.namespace.QName("", "fieldname");
        private static final javax.xml.namespace.QName FIELDCODE$2 = 
            new javax.xml.namespace.QName("", "fieldcode");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName CODE$6 = 
            new javax.xml.namespace.QName("", "code");
        
        
        /**
         * Gets the "fieldname" attribute
         */
        public java.lang.String getFieldname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fieldname" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                return target;
            }
        }
        
        /**
         * True if has "fieldname" attribute
         */
        public boolean isSetFieldname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDNAME$0) != null;
            }
        }
        
        /**
         * Sets the "fieldname" attribute
         */
        public void setFieldname(java.lang.String fieldname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.setStringValue(fieldname);
            }
        }
        
        /**
         * Sets (as xml) the "fieldname" attribute
         */
        public void xsetFieldname(org.apache.xmlbeans.XmlString fieldname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.set(fieldname);
            }
        }
        
        /**
         * Unsets the "fieldname" attribute
         */
        public void unsetFieldname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDNAME$0);
            }
        }
        
        /**
         * Gets the "fieldcode" attribute
         */
        public java.lang.String getFieldcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDCODE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fieldcode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDCODE$2);
                return target;
            }
        }
        
        /**
         * True if has "fieldcode" attribute
         */
        public boolean isSetFieldcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDCODE$2) != null;
            }
        }
        
        /**
         * Sets the "fieldcode" attribute
         */
        public void setFieldcode(java.lang.String fieldcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDCODE$2);
                }
                target.setStringValue(fieldcode);
            }
        }
        
        /**
         * Sets (as xml) the "fieldcode" attribute
         */
        public void xsetFieldcode(org.apache.xmlbeans.XmlString fieldcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDCODE$2);
                }
                target.set(fieldcode);
            }
        }
        
        /**
         * Unsets the "fieldcode" attribute
         */
        public void unsetFieldcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDCODE$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$6);
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$6) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$6);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$6);
            }
        }
    }
}
