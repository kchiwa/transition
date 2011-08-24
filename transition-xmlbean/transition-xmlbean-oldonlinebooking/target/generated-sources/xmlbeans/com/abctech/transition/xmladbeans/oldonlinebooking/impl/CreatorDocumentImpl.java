/*
 * An XML document type.
 * Localname: creator
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one creator(@) element.
 *
 * This is a complex type.
 */
public class CreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATOR$0 = 
        new javax.xml.namespace.QName("", "creator");
    
    
    /**
     * Gets the "creator" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    public void setCreator(com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().add_element_user(CREATOR$0);
            }
            target.set(creator);
        }
    }
    
    /**
     * Appends and returns a new empty "creator" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator addNewCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().add_element_user(CREATOR$0);
            return target;
        }
    }
    /**
     * An XML creator(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument$Creator.
     */
    public static class CreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator
    {
        private static final long serialVersionUID = 1L;
        
        public CreatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CreatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LOGIN$0 = 
            new javax.xml.namespace.QName("", "login");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "login" attribute
         */
        public java.lang.String getLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGIN$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "login" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOGIN$0);
                return target;
            }
        }
        
        /**
         * True if has "login" attribute
         */
        public boolean isSetLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOGIN$0) != null;
            }
        }
        
        /**
         * Sets the "login" attribute
         */
        public void setLogin(java.lang.String login)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGIN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOGIN$0);
                }
                target.setStringValue(login);
            }
        }
        
        /**
         * Sets (as xml) the "login" attribute
         */
        public void xsetLogin(org.apache.xmlbeans.XmlString login)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOGIN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOGIN$0);
                }
                target.set(login);
            }
        }
        
        /**
         * Unsets the "login" attribute
         */
        public void unsetLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOGIN$0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
            }
        }
    }
}
