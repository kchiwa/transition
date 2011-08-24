/*
 * An XML document type.
 * Localname: COMPANY_NAME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.COMPANYNAMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one COMPANY_NAME(@) element.
 *
 * This is a complex type.
 */
public class COMPANYNAMEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.COMPANYNAMEDocument
{
    private static final long serialVersionUID = 1L;
    
    public COMPANYNAMEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYNAME$0 = 
        new javax.xml.namespace.QName("", "COMPANY_NAME");
    
    
    /**
     * Gets the "COMPANY_NAME" element
     */
    public java.lang.String getCOMPANYNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COMPANY_NAME" element
     */
    public org.apache.xmlbeans.XmlString xgetCOMPANYNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COMPANY_NAME" element
     */
    public void setCOMPANYNAME(java.lang.String companyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$0);
            }
            target.setStringValue(companyname);
        }
    }
    
    /**
     * Sets (as xml) the "COMPANY_NAME" element
     */
    public void xsetCOMPANYNAME(org.apache.xmlbeans.XmlString companyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYNAME$0);
            }
            target.set(companyname);
        }
    }
}
