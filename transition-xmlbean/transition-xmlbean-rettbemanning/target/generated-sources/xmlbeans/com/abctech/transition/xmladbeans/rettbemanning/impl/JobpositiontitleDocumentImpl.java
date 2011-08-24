/*
 * An XML document type.
 * Localname: jobpositiontitle
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JobpositiontitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one jobpositiontitle(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JobpositiontitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JobpositiontitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobpositiontitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBPOSITIONTITLE$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositiontitle");
    
    
    /**
     * Gets the "jobpositiontitle" element
     */
    public java.lang.String getJobpositiontitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobpositiontitle" element
     */
    public org.apache.xmlbeans.XmlString xgetJobpositiontitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobpositiontitle" element
     */
    public void setJobpositiontitle(java.lang.String jobpositiontitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONTITLE$0);
            }
            target.setStringValue(jobpositiontitle);
        }
    }
    
    /**
     * Sets (as xml) the "jobpositiontitle" element
     */
    public void xsetJobpositiontitle(org.apache.xmlbeans.XmlString jobpositiontitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONTITLE$0);
            }
            target.set(jobpositiontitle);
        }
    }
}
