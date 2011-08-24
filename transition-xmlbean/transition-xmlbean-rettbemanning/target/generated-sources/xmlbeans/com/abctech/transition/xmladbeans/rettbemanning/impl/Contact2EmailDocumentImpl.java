/*
 * An XML document type.
 * Localname: contact2email
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.Contact2EmailDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one contact2email(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class Contact2EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.Contact2EmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public Contact2EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT2EMAIL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2email");
    
    
    /**
     * Gets the "contact2email" element
     */
    public java.lang.String getContact2Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact2email" element
     */
    public org.apache.xmlbeans.XmlString xgetContact2Email()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2EMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact2email" element
     */
    public void setContact2Email(java.lang.String contact2Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2EMAIL$0);
            }
            target.setStringValue(contact2Email);
        }
    }
    
    /**
     * Sets (as xml) the "contact2email" element
     */
    public void xsetContact2Email(org.apache.xmlbeans.XmlString contact2Email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2EMAIL$0);
            }
            target.set(contact2Email);
        }
    }
}
