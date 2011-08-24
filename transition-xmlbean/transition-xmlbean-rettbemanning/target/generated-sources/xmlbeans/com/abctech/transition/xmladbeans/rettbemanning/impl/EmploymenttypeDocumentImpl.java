/*
 * An XML document type.
 * Localname: employmenttype
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.EmploymenttypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one employmenttype(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class EmploymenttypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.EmploymenttypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmploymenttypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYMENTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "employmenttype");
    
    
    /**
     * Gets the "employmenttype" element
     */
    public java.lang.String getEmploymenttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "employmenttype" element
     */
    public org.apache.xmlbeans.XmlString xgetEmploymenttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "employmenttype" element
     */
    public void setEmploymenttype(java.lang.String employmenttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTTYPE$0);
            }
            target.setStringValue(employmenttype);
        }
    }
    
    /**
     * Sets (as xml) the "employmenttype" element
     */
    public void xsetEmploymenttype(org.apache.xmlbeans.XmlString employmenttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTTYPE$0);
            }
            target.set(employmenttype);
        }
    }
}
