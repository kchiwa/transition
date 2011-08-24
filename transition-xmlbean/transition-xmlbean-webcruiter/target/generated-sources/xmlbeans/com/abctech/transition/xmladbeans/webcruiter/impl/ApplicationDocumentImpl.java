/*
 * An XML document type.
 * Localname: Application
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Application(@) element.
 *
 * This is a complex type.
 */
public class ApplicationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApplicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATION$0 = 
        new javax.xml.namespace.QName("", "Application");
    
    
    /**
     * Gets the "Application" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Application" element
     */
    public void setApplication(com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            }
            target.set(application);
        }
    }
    
    /**
     * Appends and returns a new empty "Application" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application addNewApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            return target;
        }
    }
    /**
     * An XML Application(@).
     *
     * This is a complex type.
     */
    public static class ApplicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application
    {
        private static final long serialVersionUID = 1L;
        
        public ApplicationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("", "Date");
        private static final javax.xml.namespace.QName EMAIL$2 = 
            new javax.xml.namespace.QName("", "Email");
        private static final javax.xml.namespace.QName SENDTOADDRESS$4 = 
            new javax.xml.namespace.QName("", "SendToAddress");
        private static final javax.xml.namespace.QName LINK$6 = 
            new javax.xml.namespace.QName("", "Link");
        
        
        /**
         * Gets the "Date" element
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Date" element
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Date" element
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "Date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Gets the "Email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$2) != 0;
            }
        }
        
        /**
         * Sets the "Email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$2);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$2);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "Email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$2, 0);
            }
        }
        
        /**
         * Gets the "SendToAddress" element
         */
        public java.lang.String getSendToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOADDRESS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SendToAddress" element
         */
        public org.apache.xmlbeans.XmlString xgetSendToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDTOADDRESS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SendToAddress" element
         */
        public boolean isSetSendToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDTOADDRESS$4) != 0;
            }
        }
        
        /**
         * Sets the "SendToAddress" element
         */
        public void setSendToAddress(java.lang.String sendToAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDTOADDRESS$4);
                }
                target.setStringValue(sendToAddress);
            }
        }
        
        /**
         * Sets (as xml) the "SendToAddress" element
         */
        public void xsetSendToAddress(org.apache.xmlbeans.XmlString sendToAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDTOADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDTOADDRESS$4);
                }
                target.set(sendToAddress);
            }
        }
        
        /**
         * Unsets the "SendToAddress" element
         */
        public void unsetSendToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDTOADDRESS$4, 0);
            }
        }
        
        /**
         * Gets the "Link" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().find_element_user(LINK$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Link" element
         */
        public boolean isSetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$6) != 0;
            }
        }
        
        /**
         * Sets the "Link" element
         */
        public void setLink(com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().find_element_user(LINK$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().add_element_user(LINK$6);
                }
                target.set(link);
            }
        }
        
        /**
         * Appends and returns a new empty "Link" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().add_element_user(LINK$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Link" element
         */
        public void unsetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$6, 0);
            }
        }
    }
}
