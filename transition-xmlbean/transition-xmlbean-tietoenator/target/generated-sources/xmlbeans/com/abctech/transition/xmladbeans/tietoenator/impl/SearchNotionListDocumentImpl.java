/*
 * An XML document type.
 * Localname: search_notion_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_list");
    
    
    /**
     * Gets the "search_notion_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList getSearchNotionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().find_element_user(SEARCHNOTIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "search_notion_list" element
     */
    public void setSearchNotionList(com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList searchNotionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().find_element_user(SEARCHNOTIONLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().add_element_user(SEARCHNOTIONLIST$0);
            }
            target.set(searchNotionList);
        }
    }
    
    /**
     * Appends and returns a new empty "search_notion_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList addNewSearchNotionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().add_element_user(SEARCHNOTIONLIST$0);
            return target;
        }
    }
    /**
     * An XML search_notion_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class SearchNotionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList
    {
        private static final long serialVersionUID = 1L;
        
        public SearchNotionListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEARCHNOTION$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion");
        
        
        /**
         * Gets array of all "search_notion" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[] getSearchNotionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEARCHNOTION$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[] result = new com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "search_notion" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion getSearchNotionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().find_element_user(SEARCHNOTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "search_notion" element
         */
        public int sizeOfSearchNotionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEARCHNOTION$0);
            }
        }
        
        /**
         * Sets array of all "search_notion" element
         */
        public void setSearchNotionArray(com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[] searchNotionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(searchNotionArray, SEARCHNOTION$0);
            }
        }
        
        /**
         * Sets ith "search_notion" element
         */
        public void setSearchNotionArray(int i, com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion searchNotion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().find_element_user(SEARCHNOTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(searchNotion);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "search_notion" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion insertNewSearchNotion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion)get_store().insert_element_user(SEARCHNOTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "search_notion" element
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
         * Removes the ith "search_notion" element
         */
        public void removeSearchNotion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEARCHNOTION$0, i);
            }
        }
    }
}
