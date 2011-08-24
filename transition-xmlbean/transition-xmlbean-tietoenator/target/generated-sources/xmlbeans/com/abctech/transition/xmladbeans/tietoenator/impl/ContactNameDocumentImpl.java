/*
 * An XML document type.
 * Localname: contact_name
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ContactNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one contact_name(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class ContactNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ContactNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTNAME$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "contact_name");
    
    
    /**
     * Gets the "contact_name" element
     */
    public java.lang.String getContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contact_name" element
     */
    public org.apache.xmlbeans.XmlString xgetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contact_name" element
     */
    public void setContactName(java.lang.String contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTNAME$0);
            }
            target.setStringValue(contactName);
        }
    }
    
    /**
     * Sets (as xml) the "contact_name" element
     */
    public void xsetContactName(org.apache.xmlbeans.XmlString contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTNAME$0);
            }
            target.set(contactName);
        }
    }
}
