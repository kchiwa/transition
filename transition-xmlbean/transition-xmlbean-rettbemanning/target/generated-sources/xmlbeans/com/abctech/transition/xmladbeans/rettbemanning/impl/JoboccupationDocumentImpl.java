/*
 * An XML document type.
 * Localname: joboccupation
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoboccupationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joboccupation(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoboccupationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoboccupationDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoboccupationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBOCCUPATION$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joboccupation");
    
    
    /**
     * Gets the "joboccupation" element
     */
    public java.lang.String getJoboccupation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joboccupation" element
     */
    public org.apache.xmlbeans.XmlString xgetJoboccupation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joboccupation" element
     */
    public void setJoboccupation(java.lang.String joboccupation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBOCCUPATION$0);
            }
            target.setStringValue(joboccupation);
        }
    }
    
    /**
     * Sets (as xml) the "joboccupation" element
     */
    public void xsetJoboccupation(org.apache.xmlbeans.XmlString joboccupation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBOCCUPATION$0);
            }
            target.set(joboccupation);
        }
    }
}
