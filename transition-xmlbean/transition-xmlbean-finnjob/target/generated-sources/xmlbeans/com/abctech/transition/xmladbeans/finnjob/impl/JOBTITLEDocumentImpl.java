/*
 * An XML document type.
 * Localname: JOB_TITLE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.JOBTITLEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one JOB_TITLE(@) element.
 *
 * This is a complex type.
 */
public class JOBTITLEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBTITLEDocument
{
    private static final long serialVersionUID = 1L;
    
    public JOBTITLEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBTITLE$0 = 
        new javax.xml.namespace.QName("", "JOB_TITLE");
    
    
    /**
     * Gets the "JOB_TITLE" element
     */
    public java.lang.String getJOBTITLE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JOB_TITLE" element
     */
    public org.apache.xmlbeans.XmlString xgetJOBTITLE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "JOB_TITLE" element
     */
    public void setJOBTITLE(java.lang.String jobtitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBTITLE$0);
            }
            target.setStringValue(jobtitle);
        }
    }
    
    /**
     * Sets (as xml) the "JOB_TITLE" element
     */
    public void xsetJOBTITLE(org.apache.xmlbeans.XmlString jobtitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBTITLE$0);
            }
            target.set(jobtitle);
        }
    }
}
