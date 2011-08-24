/*
 * An XML document type.
 * Localname: Status
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.StatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Status(@) element.
 *
 * This is a complex type.
 */
public class StatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.StatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("", "Status");
    
    
    /**
     * Gets the "Status" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().find_element_user(STATUS$0, 0);
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
    public void setStatus(com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "Status" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().add_element_user(STATUS$0);
            return target;
        }
    }
    /**
     * An XML Status(@).
     *
     * This is a complex type.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
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
         * True if has "Code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$0) != null;
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
        
        /**
         * Unsets the "Code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$0);
            }
        }
    }
}
