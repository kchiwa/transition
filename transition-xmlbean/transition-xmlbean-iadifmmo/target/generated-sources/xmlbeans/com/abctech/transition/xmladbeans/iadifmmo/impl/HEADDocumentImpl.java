/*
 * An XML document type.
 * Localname: HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.HEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one HEAD(@) element.
 *
 * This is a complex type.
 */
public class HEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.HEADDocument
{
    private static final long serialVersionUID = 1L;
    
    public HEADDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("", "HEAD");
    
    
    /**
     * Gets the "HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD getHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HEAD" element
     */
    public void setHEAD(com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
            }
            target.set(head);
        }
    }
    
    /**
     * Appends and returns a new empty "HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD addNewHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    /**
     * An XML HEAD(@).
     *
     * This is a complex type.
     */
    public static class HEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD
    {
        private static final long serialVersionUID = 1L;
        
        public HEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTNER$0 = 
            new javax.xml.namespace.QName("", "PARTNER");
        
        
        /**
         * Gets the "PARTNER" element
         */
        public java.lang.String getPARTNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PARTNER" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PARTNER" element
         */
        public void setPARTNER(java.lang.String partner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNER$0);
                }
                target.setStringValue(partner);
            }
        }
        
        /**
         * Sets (as xml) the "PARTNER" element
         */
        public void xsetPARTNER(org.apache.xmlbeans.XmlString partner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNER$0);
                }
                target.set(partner);
            }
        }
    }
}
