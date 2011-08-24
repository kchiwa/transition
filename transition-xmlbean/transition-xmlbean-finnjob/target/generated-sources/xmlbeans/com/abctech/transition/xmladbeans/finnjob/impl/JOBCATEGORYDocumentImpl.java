/*
 * An XML document type.
 * Localname: JOB_CATEGORY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one JOB_CATEGORY(@) element.
 *
 * This is a complex type.
 */
public class JOBCATEGORYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument
{
    private static final long serialVersionUID = 1L;
    
    public JOBCATEGORYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBCATEGORY$0 = 
        new javax.xml.namespace.QName("", "JOB_CATEGORY");
    
    
    /**
     * Gets the "JOB_CATEGORY" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY getJOBCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "JOB_CATEGORY" element
     */
    public void setJOBCATEGORY(com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY jobcategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().add_element_user(JOBCATEGORY$0);
            }
            target.set(jobcategory);
        }
    }
    
    /**
     * Appends and returns a new empty "JOB_CATEGORY" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY addNewJOBCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().add_element_user(JOBCATEGORY$0);
            return target;
        }
    }
    /**
     * An XML JOB_CATEGORY(@).
     *
     * This is a complex type.
     */
    public static class JOBCATEGORYImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY
    {
        private static final long serialVersionUID = 1L;
        
        public JOBCATEGORYImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("", "CATEGORY");
        private static final javax.xml.namespace.QName SUBCATEGORY$2 = 
            new javax.xml.namespace.QName("", "SUBCATEGORY");
        
        
        /**
         * Gets the "CATEGORY" element
         */
        public java.lang.String getCATEGORY()
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
         * Gets (as xml) the "CATEGORY" element
         */
        public org.apache.xmlbeans.XmlString xgetCATEGORY()
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
         * Sets the "CATEGORY" element
         */
        public void setCATEGORY(java.lang.String category)
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
         * Sets (as xml) the "CATEGORY" element
         */
        public void xsetCATEGORY(org.apache.xmlbeans.XmlString category)
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
         * Gets the "SUBCATEGORY" element
         */
        public java.lang.String getSUBCATEGORY()
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
         * Gets (as xml) the "SUBCATEGORY" element
         */
        public org.apache.xmlbeans.XmlString xgetSUBCATEGORY()
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
         * Sets the "SUBCATEGORY" element
         */
        public void setSUBCATEGORY(java.lang.String subcategory)
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
         * Sets (as xml) the "SUBCATEGORY" element
         */
        public void xsetSUBCATEGORY(org.apache.xmlbeans.XmlString subcategory)
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
