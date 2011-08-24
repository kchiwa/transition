/*
 * An XML document type.
 * Localname: companylogourl
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.CompanylogourlDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one companylogourl(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class CompanylogourlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.CompanylogourlDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompanylogourlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYLOGOURL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "companylogourl");
    
    
    /**
     * Gets the "companylogourl" element
     */
    public java.lang.String getCompanylogourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYLOGOURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "companylogourl" element
     */
    public org.apache.xmlbeans.XmlString xgetCompanylogourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYLOGOURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "companylogourl" element
     */
    public void setCompanylogourl(java.lang.String companylogourl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYLOGOURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYLOGOURL$0);
            }
            target.setStringValue(companylogourl);
        }
    }
    
    /**
     * Sets (as xml) the "companylogourl" element
     */
    public void xsetCompanylogourl(org.apache.xmlbeans.XmlString companylogourl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYLOGOURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYLOGOURL$0);
            }
            target.set(companylogourl);
        }
    }
}
