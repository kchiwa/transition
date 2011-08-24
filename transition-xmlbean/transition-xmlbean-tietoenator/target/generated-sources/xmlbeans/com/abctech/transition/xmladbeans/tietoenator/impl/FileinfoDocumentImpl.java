/*
 * An XML document type.
 * Localname: fileinfo
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one fileinfo(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class FileinfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileinfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEINFO$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "fileinfo");
    
    
    /**
     * Gets the "fileinfo" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo getFileinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().find_element_user(FILEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fileinfo" element
     */
    public void setFileinfo(com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo fileinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().find_element_user(FILEINFO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().add_element_user(FILEINFO$0);
            }
            target.set(fileinfo);
        }
    }
    
    /**
     * Appends and returns a new empty "fileinfo" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo addNewFileinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().add_element_user(FILEINFO$0);
            return target;
        }
    }
    /**
     * An XML fileinfo(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class FileinfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo
    {
        private static final long serialVersionUID = 1L;
        
        public FileinfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENDATE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "gendate");
        private static final javax.xml.namespace.QName GENTIME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "gentime");
        private static final javax.xml.namespace.QName USER$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "user");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "description");
        
        
        /**
         * Gets the "gendate" element
         */
        public java.lang.String getGendate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gendate" element
         */
        public org.apache.xmlbeans.XmlString xgetGendate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "gendate" element
         */
        public void setGendate(java.lang.String gendate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDATE$0);
                }
                target.setStringValue(gendate);
            }
        }
        
        /**
         * Sets (as xml) the "gendate" element
         */
        public void xsetGendate(org.apache.xmlbeans.XmlString gendate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENDATE$0);
                }
                target.set(gendate);
            }
        }
        
        /**
         * Gets the "gentime" element
         */
        public java.lang.String getGentime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gentime" element
         */
        public org.apache.xmlbeans.XmlString xgetGentime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENTIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "gentime" element
         */
        public void setGentime(java.lang.String gentime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENTIME$2);
                }
                target.setStringValue(gentime);
            }
        }
        
        /**
         * Sets (as xml) the "gentime" element
         */
        public void xsetGentime(org.apache.xmlbeans.XmlString gentime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENTIME$2);
                }
                target.set(gentime);
            }
        }
        
        /**
         * Gets the "user" element
         */
        public java.lang.String getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "user" element
         */
        public org.apache.xmlbeans.XmlString xgetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(java.lang.String user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$4);
                }
                target.setStringValue(user);
            }
        }
        
        /**
         * Sets (as xml) the "user" element
         */
        public void xsetUser(org.apache.xmlbeans.XmlString user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USER$4);
                }
                target.set(user);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
                }
                target.set(description);
            }
        }
    }
}
