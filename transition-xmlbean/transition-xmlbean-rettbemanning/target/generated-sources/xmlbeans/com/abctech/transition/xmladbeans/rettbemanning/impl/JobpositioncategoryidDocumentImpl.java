/*
 * An XML document type.
 * Localname: jobpositioncategoryid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JobpositioncategoryidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one jobpositioncategoryid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JobpositioncategoryidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JobpositioncategoryidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobpositioncategoryidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBPOSITIONCATEGORYID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositioncategoryid");
    
    
    /**
     * Gets the "jobpositioncategoryid" element
     */
    public java.lang.String getJobpositioncategoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONCATEGORYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobpositioncategoryid" element
     */
    public org.apache.xmlbeans.XmlString xgetJobpositioncategoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONCATEGORYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobpositioncategoryid" element
     */
    public void setJobpositioncategoryid(java.lang.String jobpositioncategoryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONCATEGORYID$0);
            }
            target.setStringValue(jobpositioncategoryid);
        }
    }
    
    /**
     * Sets (as xml) the "jobpositioncategoryid" element
     */
    public void xsetJobpositioncategoryid(org.apache.xmlbeans.XmlString jobpositioncategoryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONCATEGORYID$0);
            }
            target.set(jobpositioncategoryid);
        }
    }
}
