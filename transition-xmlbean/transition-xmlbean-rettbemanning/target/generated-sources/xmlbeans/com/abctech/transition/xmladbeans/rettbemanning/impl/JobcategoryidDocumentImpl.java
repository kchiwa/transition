/*
 * An XML document type.
 * Localname: jobcategoryid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JobcategoryidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one jobcategoryid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JobcategoryidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JobcategoryidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobcategoryidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBCATEGORYID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "jobcategoryid");
    
    
    /**
     * Gets the "jobcategoryid" element
     */
    public java.lang.String getJobcategoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobcategoryid" element
     */
    public org.apache.xmlbeans.XmlString xgetJobcategoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobcategoryid" element
     */
    public void setJobcategoryid(java.lang.String jobcategoryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBCATEGORYID$0);
            }
            target.setStringValue(jobcategoryid);
        }
    }
    
    /**
     * Sets (as xml) the "jobcategoryid" element
     */
    public void xsetJobcategoryid(org.apache.xmlbeans.XmlString jobcategoryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBCATEGORYID$0);
            }
            target.set(jobcategoryid);
        }
    }
}
