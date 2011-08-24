/*
 * An XML document type.
 * Localname: job_category
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one job_category(@) element.
 *
 * This is a complex type.
 */
public class JobCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBCATEGORY$0 = 
        new javax.xml.namespace.QName("", "job_category");
    
    
    /**
     * Gets the "job_category" element
     */
    public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory getJobCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "job_category" element
     */
    public void setJobCategory(com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory jobCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().add_element_user(JOBCATEGORY$0);
            }
            target.set(jobCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "job_category" element
     */
    public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory addNewJobCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().add_element_user(JOBCATEGORY$0);
            return target;
        }
    }
    /**
     * An XML job_category(@).
     *
     * This is a complex type.
     */
    public static class JobCategoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory
    {
        private static final long serialVersionUID = 1L;
        
        public JobCategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName SUBCATEGORY$2 = 
            new javax.xml.namespace.QName("", "subcategory");
        
        
        /**
         * Gets the "category" element
         */
        public java.lang.String getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" element
         */
        public org.apache.xmlbeans.XmlString xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "category" element
         */
        public void setCategory(java.lang.String category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$0);
                }
                target.setStringValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" element
         */
        public void xsetCategory(org.apache.xmlbeans.XmlString category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$0);
                }
                target.set(category);
            }
        }
        
        /**
         * Gets the "subcategory" element
         */
        public java.lang.String getSubcategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCATEGORY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subcategory" element
         */
        public org.apache.xmlbeans.XmlString xgetSubcategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBCATEGORY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subcategory" element
         */
        public void setSubcategory(java.lang.String subcategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCATEGORY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCATEGORY$2);
                }
                target.setStringValue(subcategory);
            }
        }
        
        /**
         * Sets (as xml) the "subcategory" element
         */
        public void xsetSubcategory(org.apache.xmlbeans.XmlString subcategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBCATEGORY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBCATEGORY$2);
                }
                target.set(subcategory);
            }
        }
    }
}
