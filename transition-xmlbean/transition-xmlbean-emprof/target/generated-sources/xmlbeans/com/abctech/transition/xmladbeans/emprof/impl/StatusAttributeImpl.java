/*
 * An XML document type.
 * Localname: Status
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.StatusAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one Status(@) element.
 *
 * This is a complex type.
 */
public class StatusAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.StatusAttribute
{
    private static final long serialVersionUID = 1L;
    
    public StatusAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "Status");
    
    
    /**
     * Gets the "Status" element
     */
    public com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 getStatusAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
            target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$0, 0);
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
            target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$0);
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
            target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$0);
            return target;
        }
    }
    /**
     * An XML Status(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.emprof.StatusAttribute$StatusAttribute2.
     */
    public static class StatusAttributeImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2
    {
        private static final long serialVersionUID = 1L;
        
        public StatusAttributeImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected StatusAttributeImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "Code");
        
        
        /**
         * Gets the "Code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$0);
                return target;
            }
        }
        
        /**
         * Sets the "Code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "Code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$0);
                }
                target.set(code);
            }
        }
    }
}
