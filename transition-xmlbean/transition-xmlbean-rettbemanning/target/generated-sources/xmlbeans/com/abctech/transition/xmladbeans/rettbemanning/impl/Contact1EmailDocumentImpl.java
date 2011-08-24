/*
 * An XML document type.
 * Localname: contact1email
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact1EmailDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact1email(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact1EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact1EmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact1EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT1EMAIL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1email");
    
    
    /**
     * Gets the "contact1email" element
     */
    public java.lang.String getContact1Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact1email" element
     */
    public org.apache.xmlbeans.XmlString xgetContact1Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1EMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact1email" element
     */
    public void setContact1Email(java.lang.String contact1Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1EMAIL$0);
            }
            target.setStringValue(contact1Email);
        }
    }
    
    /**
     * Sets (as xml) the "contact1email" element
     */
    public void xsetContact1Email(org.apache.xmlbeans.XmlString contact1Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1EMAIL$0);
            }
            target.set(contact1Email);
        }
    }
}
