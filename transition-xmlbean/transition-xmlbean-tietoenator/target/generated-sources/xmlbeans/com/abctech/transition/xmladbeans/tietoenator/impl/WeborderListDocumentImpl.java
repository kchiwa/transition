/*
 * An XML document type.
 * Localname: weborder_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one weborder_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class WeborderListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument
{
    private static final long serialVersionUID = 1L;
    
    public WeborderListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBORDERLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "weborder_list");
    
    
    /**
     * Gets the "weborder_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList getWeborderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().find_element_user(WEBORDERLIST$0, 0);
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
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().find_element_user(WEBORDERLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().add_element_user(WEBORDERLIST$0);
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
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList)get_store().add_element_user(WEBORDERLIST$0);
            return target;
        }
    }
    /**
     * An XML weborder_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class WeborderListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.WeborderListDocument.WeborderList
    {
        private static final long serialVersionUID = 1L;
        
        public WeborderListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WEBORDER$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "weborder");
        
        
        /**
         * Gets array of all "weborder" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder[] getWeborderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEBORDER$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder[] result = new com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "weborder" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder getWeborderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().find_element_user(WEBORDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "weborder" element
         */
        public int sizeOfWeborderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBORDER$0);
            }
        }
        
        /**
         * Sets array of all "weborder" element
         */
        public void setWeborderArray(com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder[] weborderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(weborderArray, WEBORDER$0);
            }
        }
        
        /**
         * Sets ith "weborder" element
         */
        public void setWeborderArray(int i, com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder weborder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().find_element_user(WEBORDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(weborder);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "weborder" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder insertNewWeborder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().insert_element_user(WEBORDER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "weborder" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder addNewWeborder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().add_element_user(WEBORDER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "weborder" element
         */
        public void removeWeborder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBORDER$0, i);
            }
        }
    }
}
