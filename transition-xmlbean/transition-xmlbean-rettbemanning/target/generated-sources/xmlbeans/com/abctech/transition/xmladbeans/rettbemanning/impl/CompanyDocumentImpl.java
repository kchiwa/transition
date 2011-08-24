/*
 * An XML document type.
 * Localname: company
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.CompanyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one company(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class CompanyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.CompanyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompanyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANY$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "company");
    
    
    /**
     * Gets the "company" element
     */
    public java.lang.String getCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "company" element
     */
    public org.apache.xmlbeans.XmlString xgetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "company" element
     */
    public void setCompany(java.lang.String company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANY$0);
            }
            target.setStringValue(company);
        }
    }
    
    /**
     * Sets (as xml) the "company" element
     */
    public void xsetCompany(org.apache.xmlbeans.XmlString company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANY$0);
            }
            target.set(company);
        }
    }
}
