/*
 * An XML document type.
 * Localname: employmentextentid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.EmploymentextentidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one employmentextentid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class EmploymentextentidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.EmploymentextentidDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmploymentextentidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYMENTEXTENTID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "employmentextentid");
    
    
    /**
     * Gets the "employmentextentid" element
     */
    public java.lang.String getEmploymentextentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "employmentextentid" element
     */
    public org.apache.xmlbeans.XmlString xgetEmploymentextentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "employmentextentid" element
     */
    public void setEmploymentextentid(java.lang.String employmentextentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTEXTENTID$0);
            }
            target.setStringValue(employmentextentid);
        }
    }
    
    /**
     * Sets (as xml) the "employmentextentid" element
     */
    public void xsetEmploymentextentid(org.apache.xmlbeans.XmlString employmentextentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTEXTENTID$0);
            }
            target.set(employmentextentid);
        }
    }
}
