/*
 * An XML document type.
 * Localname: contact1name
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact1NameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact1name(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact1NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact1NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact1NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT1NAME$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1name");
    
    
    /**
     * Gets the "contact1name" element
     */
    public java.lang.String getContact1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact1name" element
     */
    public org.apache.xmlbeans.XmlString xgetContact1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact1name" element
     */
    public void setContact1Name(java.lang.String contact1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1NAME$0);
            }
            target.setStringValue(contact1Name);
        }
    }
    
    /**
     * Sets (as xml) the "contact1name" element
     */
    public void xsetContact1Name(org.apache.xmlbeans.XmlString contact1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1NAME$0);
            }
            target.set(contact1Name);
        }
    }
}
