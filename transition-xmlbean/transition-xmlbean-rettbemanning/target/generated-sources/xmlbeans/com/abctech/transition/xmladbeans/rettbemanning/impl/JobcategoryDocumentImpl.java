/*
 * An XML document type.
 * Localname: jobcategory
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JobcategoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one jobcategory(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JobcategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JobcategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobcategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBCATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "jobcategory");
    
    
    /**
     * Gets the "jobcategory" element
     */
    public java.lang.String getJobcategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobcategory" element
     */
    public org.apache.xmlbeans.XmlString xgetJobcategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobcategory" element
     */
    public void setJobcategory(java.lang.String jobcategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBCATEGORY$0);
            }
            target.setStringValue(jobcategory);
        }
    }
    
    /**
     * Sets (as xml) the "jobcategory" element
     */
    public void xsetJobcategory(org.apache.xmlbeans.XmlString jobcategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBCATEGORY$0);
            }
            target.set(jobcategory);
        }
    }
}
