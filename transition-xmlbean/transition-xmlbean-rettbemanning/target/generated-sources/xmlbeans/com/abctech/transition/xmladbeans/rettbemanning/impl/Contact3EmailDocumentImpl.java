/*
 * An XML document type.
 * Localname: contact3email
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact3EmailDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact3email(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact3EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact3EmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact3EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT3EMAIL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3email");
    
    
    /**
     * Gets the "contact3email" element
     */
    public java.lang.String getContact3Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact3email" element
     */
    public org.apache.xmlbeans.XmlString xgetContact3Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3EMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact3email" element
     */
    public void setContact3Email(java.lang.String contact3Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3EMAIL$0);
            }
            target.setStringValue(contact3Email);
        }
    }
    
    /**
     * Sets (as xml) the "contact3email" element
     */
    public void xsetContact3Email(org.apache.xmlbeans.XmlString contact3Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3EMAIL$0);
            }
            target.set(contact3Email);
        }
    }
}
