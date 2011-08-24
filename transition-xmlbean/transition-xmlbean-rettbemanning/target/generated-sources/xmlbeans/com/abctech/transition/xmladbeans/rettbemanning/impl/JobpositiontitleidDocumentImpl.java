/*
 * An XML document type.
 * Localname: jobpositiontitleid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JobpositiontitleidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one jobpositiontitleid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JobpositiontitleidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JobpositiontitleidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobpositiontitleidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBPOSITIONTITLEID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositiontitleid");
    
    
    /**
     * Gets the "jobpositiontitleid" element
     */
    public java.lang.String getJobpositiontitleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobpositiontitleid" element
     */
    public org.apache.xmlbeans.XmlString xgetJobpositiontitleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobpositiontitleid" element
     */
    public void setJobpositiontitleid(java.lang.String jobpositiontitleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONTITLEID$0);
            }
            target.setStringValue(jobpositiontitleid);
        }
    }
    
    /**
     * Sets (as xml) the "jobpositiontitleid" element
     */
    public void xsetJobpositiontitleid(org.apache.xmlbeans.XmlString jobpositiontitleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONTITLEID$0);
            }
            target.set(jobpositiontitleid);
        }
    }
}
