/*
 * An XML attribute type.
 * Localname: job
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.JobAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one job(@) attribute.
 *
 * This is a complex type.
 */
public class JobAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.JobAttribute
{
    private static final long serialVersionUID = 1L;
    
    public JobAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOB$0 = 
        new javax.xml.namespace.QName("", "job");
    
    
    /**
     * Gets the "job" attribute
     */
    public java.lang.String getJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOB$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "job" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOB$0);
            return target;
        }
    }
    
    /**
     * True if has "job" attribute
     */
    public boolean isSetJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JOB$0) != null;
        }
    }
    
    /**
     * Sets the "job" attribute
     */
    public void setJob(java.lang.String job)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOB$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOB$0);
            }
            target.setStringValue(job);
        }
    }
    
    /**
     * Sets (as xml) the "job" attribute
     */
    public void xsetJob(org.apache.xmlbeans.XmlString job)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOB$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JOB$0);
            }
            target.set(job);
        }
    }
    
    /**
     * Unsets the "job" attribute
     */
    public void unsetJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JOB$0);
        }
    }
}
