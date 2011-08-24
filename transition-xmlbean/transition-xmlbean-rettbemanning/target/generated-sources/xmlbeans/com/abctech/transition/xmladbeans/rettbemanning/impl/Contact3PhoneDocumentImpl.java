/*
 * An XML document type.
 * Localname: contact3phone
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact3PhoneDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact3phone(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact3PhoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact3PhoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact3PhoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT3PHONE$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3phone");
    
    
    /**
     * Gets the "contact3phone" element
     */
    public java.lang.String getContact3Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3PHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact3phone" element
     */
    public org.apache.xmlbeans.XmlString xgetContact3Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3PHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact3phone" element
     */
    public void setContact3Phone(java.lang.String contact3Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3PHONE$0);
            }
            target.setStringValue(contact3Phone);
        }
    }
    
    /**
     * Sets (as xml) the "contact3phone" element
     */
    public void xsetContact3Phone(org.apache.xmlbeans.XmlString contact3Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3PHONE$0);
            }
            target.set(contact3Phone);
        }
    }
}
