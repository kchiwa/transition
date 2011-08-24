/*
 * An XML document type.
 * Localname: mpresswebmarket
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one mpresswebmarket(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MpresswebmarketDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument
{
    private static final long serialVersionUID = 1L;
    
    public MpresswebmarketDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MPRESSWEBMARKET$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "mpresswebmarket");
    
    
    /**
     * Gets the "mpresswebmarket" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket getMpresswebmarket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket)get_store().find_element_user(MPRESSWEBMARKET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mpresswebmarket" element
     */
    public void setMpresswebmarket(com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket mpresswebmarket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket)get_store().find_element_user(MPRESSWEBMARKET$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket)get_store().add_element_user(MPRESSWEBMARKET$0);
            }
            target.set(mpresswebmarket);
        }
    }
    
    /**
     * Appends and returns a new empty "mpresswebmarket" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket addNewMpresswebmarket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket)get_store().add_element_user(MPRESSWEBMARKET$0);
            return target;
        }
    }
    /**
     * An XML mpresswebmarket(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class MpresswebmarketImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument.Mpresswebmarket
    {
        private static final long serialVersionUID = 1L;
        
        public MpresswebmarketImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERSION$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "version");
        private static final javax.xml.namespace.QName FILEINFO$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "fileinfo");
        private static final javax.xml.namespace.QName WEBORDERLIST$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "weborder_list");
        
        
        /**
         * Gets the "version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$0);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "fileinfo" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo getFileinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().find_element_user(FILEINFO$2, 0);
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
                target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().find_element_user(FILEINFO$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().add_element_user(FILEINFO$2);
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
                target = (com.abctech.transition.xmladbeans.tietoenator.FileinfoDocument.Fileinfo)get_store().add_element_user(FILEINFO$2);
                return target;
            }
        }
        
        /**
         * Gets the "weborder_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList getWeborderList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().find_element_user(WEBORDERLIST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "weborder_list" element
         */
        public void setWeborderList(com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList weborderList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().find_element_user(WEBORDERLIST$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().add_element_user(WEBORDERLIST$4);
                }
                target.set(weborderList);
            }
        }
        
        /**
         * Appends and returns a new empty "weborder_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList addNewWeborderList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().add_element_user(WEBORDERLIST$4);
                return target;
            }
        }
    }
}
