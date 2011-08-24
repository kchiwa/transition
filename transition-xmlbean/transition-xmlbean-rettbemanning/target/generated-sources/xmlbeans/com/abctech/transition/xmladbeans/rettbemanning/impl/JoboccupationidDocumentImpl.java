/*
 * An XML document type.
 * Localname: joboccupationid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoboccupationidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joboccupationid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoboccupationidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoboccupationidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoboccupationidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBOCCUPATIONID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joboccupationid");
    
    
    /**
     * Gets the "joboccupationid" element
     */
    public java.lang.String getJoboccupationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joboccupationid" element
     */
    public org.apache.xmlbeans.XmlString xgetJoboccupationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joboccupationid" element
     */
    public void setJoboccupationid(java.lang.String joboccupationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBOCCUPATIONID$0);
            }
            target.setStringValue(joboccupationid);
        }
    }
    
    /**
     * Sets (as xml) the "joboccupationid" element
     */
    public void xsetJoboccupationid(org.apache.xmlbeans.XmlString joboccupationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBOCCUPATIONID$0);
            }
            target.set(joboccupationid);
        }
    }
}
