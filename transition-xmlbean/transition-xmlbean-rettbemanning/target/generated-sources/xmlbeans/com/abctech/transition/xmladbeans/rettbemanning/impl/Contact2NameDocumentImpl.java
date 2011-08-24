/*
 * An XML document type.
 * Localname: contact2name
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact2NameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact2name(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact2NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact2NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact2NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT2NAME$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2name");
    
    
    /**
     * Gets the "contact2name" element
     */
    public java.lang.String getContact2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact2name" element
     */
    public org.apache.xmlbeans.XmlString xgetContact2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact2name" element
     */
    public void setContact2Name(java.lang.String contact2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2NAME$0);
            }
            target.setStringValue(contact2Name);
        }
    }
    
    /**
     * Sets (as xml) the "contact2name" element
     */
    public void xsetContact2Name(org.apache.xmlbeans.XmlString contact2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2NAME$0);
            }
            target.set(contact2Name);
        }
    }
}
