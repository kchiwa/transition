/*
 * An XML document type.
 * Localname: contact3name
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact3NameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact3name(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact3NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact3NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact3NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT3NAME$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3name");
    
    
    /**
     * Gets the "contact3name" element
     */
    public java.lang.String getContact3Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact3name" element
     */
    public org.apache.xmlbeans.XmlString xgetContact3Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact3name" element
     */
    public void setContact3Name(java.lang.String contact3Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3NAME$0);
            }
            target.setStringValue(contact3Name);
        }
    }
    
    /**
     * Sets (as xml) the "contact3name" element
     */
    public void xsetContact3Name(org.apache.xmlbeans.XmlString contact3Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3NAME$0);
            }
            target.set(contact3Name);
        }
    }
}
