/*
 * An XML document type.
 * Localname: contact1phone
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact1PhoneDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact1phone(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact1PhoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact1PhoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact1PhoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT1PHONE$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1phone");
    
    
    /**
     * Gets the "contact1phone" element
     */
    public java.lang.String getContact1Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1PHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact1phone" element
     */
    public org.apache.xmlbeans.XmlString xgetContact1Phone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1PHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact1phone" element
     */
    public void setContact1Phone(java.lang.String contact1Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1PHONE$0);
            }
            target.setStringValue(contact1Phone);
        }
    }
    
    /**
     * Sets (as xml) the "contact1phone" element
     */
    public void xsetContact1Phone(org.apache.xmlbeans.XmlString contact1Phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1PHONE$0);
            }
            target.set(contact1Phone);
        }
    }
}
