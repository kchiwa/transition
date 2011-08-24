/*
 * An XML document type.
 * Localname: contact2phone
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact2PhoneDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact2phone(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact2PhoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact2PhoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact2PhoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT2PHONE$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2phone");
    
    
    /**
     * Gets the "contact2phone" element
     */
    public java.lang.String getContact2Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2PHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact2phone" element
     */
    public org.apache.xmlbeans.XmlString xgetContact2Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2PHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact2phone" element
     */
    public void setContact2Phone(java.lang.String contact2Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2PHONE$0);
            }
            target.setStringValue(contact2Phone);
        }
    }
    
    /**
     * Sets (as xml) the "contact2phone" element
     */
    public void xsetContact2Phone(org.apache.xmlbeans.XmlString contact2Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2PHONE$0);
            }
            target.set(contact2Phone);
        }
    }
}
