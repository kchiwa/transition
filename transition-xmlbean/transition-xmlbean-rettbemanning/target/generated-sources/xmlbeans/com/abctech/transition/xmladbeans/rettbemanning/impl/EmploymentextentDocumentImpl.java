/*
 * An XML document type.
 * Localname: employmentextent
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.EmploymentextentDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one employmentextent(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class EmploymentextentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.EmploymentextentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmploymentextentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYMENTEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "employmentextent");
    
    
    /**
     * Gets the "employmentextent" element
     */
    public java.lang.String getEmploymentextent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "employmentextent" element
     */
    public org.apache.xmlbeans.XmlString xgetEmploymentextent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "employmentextent" element
     */
    public void setEmploymentextent(java.lang.String employmentextent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTEXTENT$0);
            }
            target.setStringValue(employmentextent);
        }
    }
    
    /**
     * Sets (as xml) the "employmentextent" element
     */
    public void xsetEmploymentextent(org.apache.xmlbeans.XmlString employmentextent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTEXTENT$0);
            }
            target.set(employmentextent);
        }
    }
}
