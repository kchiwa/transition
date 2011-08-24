/*
 * An XML document type.
 * Localname: search_notion
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTION$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion");
    
    
    /**
     * Gets the "search_notion" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion getSearchNotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().find_element_user(SEARCHNOTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "search_notion" element
     */
    public void setSearchNotion(com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion searchNotion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().find_element_user(SEARCHNOTION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().add_element_user(SEARCHNOTION$0);
            }
            target.set(searchNotion);
        }
    }
    
    /**
     * Appends and returns a new empty "search_notion" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion addNewSearchNotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().add_element_user(SEARCHNOTION$0);
            return target;
        }
    }
    /**
     * An XML search_notion(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class SearchNotionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion
    {
        private static final long serialVersionUID = 1L;
        
        public SearchNotionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEARCHNOTIONID$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_id");
        private static final javax.xml.namespace.QName SEARCHNOTIONNAME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_name");
        private static final javax.xml.namespace.QName SEARCHNOTIONDISPLAYNAME$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_display_name");
        private static final javax.xml.namespace.QName SEARCHNOTIONVALUE$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_value");
        
        
        /**
         * Gets the "search_notion_id" element
         */
        public java.math.BigInteger getSearchNotionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "search_notion_id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSearchNotionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEARCHNOTIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "search_notion_id" element
         */
        public void setSearchNotionId(java.math.BigInteger searchNotionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONID$0);
                }
                target.setBigIntegerValue(searchNotionId);
            }
        }
        
        /**
         * Sets (as xml) the "search_notion_id" element
         */
        public void xsetSearchNotionId(org.apache.xmlbeans.XmlInteger searchNotionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEARCHNOTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SEARCHNOTIONID$0);
                }
                target.set(searchNotionId);
            }
        }
        
        /**
         * Gets the "search_notion_name" element
         */
        public java.lang.String getSearchNotionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "search_notion_name" element
         */
        public org.apache.xmlbeans.XmlString xgetSearchNotionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONNAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "search_notion_name" element
         */
        public void setSearchNotionName(java.lang.String searchNotionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONNAME$2);
                }
                target.setStringValue(searchNotionName);
            }
        }
        
        /**
         * Sets (as xml) the "search_notion_name" element
         */
        public void xsetSearchNotionName(org.apache.xmlbeans.XmlString searchNotionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONNAME$2);
                }
                target.set(searchNotionName);
            }
        }
        
        /**
         * Gets the "search_notion_display_name" element
         */
        public java.lang.String getSearchNotionDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "search_notion_display_name" element
         */
        public org.apache.xmlbeans.XmlString xgetSearchNotionDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "search_notion_display_name" element
         */
        public void setSearchNotionDisplayName(java.lang.String searchNotionDisplayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONDISPLAYNAME$4);
                }
                target.setStringValue(searchNotionDisplayName);
            }
        }
        
        /**
         * Sets (as xml) the "search_notion_display_name" element
         */
        public void xsetSearchNotionDisplayName(org.apache.xmlbeans.XmlString searchNotionDisplayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONDISPLAYNAME$4);
                }
                target.set(searchNotionDisplayName);
            }
        }
        
        /**
         * Gets the "search_notion_value" element
         */
        public java.lang.String getSearchNotionValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONVALUE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "search_notion_value" element
         */
        public org.apache.xmlbeans.XmlString xgetSearchNotionValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONVALUE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "search_notion_value" element
         */
        public boolean isSetSearchNotionValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEARCHNOTIONVALUE$6) != 0;
            }
        }
        
        /**
         * Sets the "search_notion_value" element
         */
        public void setSearchNotionValue(java.lang.String searchNotionValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONVALUE$6);
                }
                target.setStringValue(searchNotionValue);
            }
        }
        
        /**
         * Sets (as xml) the "search_notion_value" element
         */
        public void xsetSearchNotionValue(org.apache.xmlbeans.XmlString searchNotionValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONVALUE$6);
                }
                target.set(searchNotionValue);
            }
        }
        
        /**
         * Unsets the "search_notion_value" element
         */
        public void unsetSearchNotionValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEARCHNOTIONVALUE$6, 0);
            }
        }
    }
}
