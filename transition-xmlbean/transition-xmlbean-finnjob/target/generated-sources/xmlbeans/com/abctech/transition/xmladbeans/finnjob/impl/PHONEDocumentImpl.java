/*
 * An XML document type.
 * Localname: PHONE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.PHONEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one PHONE(@) element.
 *
 * This is a complex type.
 */
public class PHONEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.PHONEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PHONEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONE$0 = 
        new javax.xml.namespace.QName("", "PHONE");
    
    
    /**
     * Gets the "PHONE" element
     */
    public java.lang.String getPHONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PHONE" element
     */
    public org.apache.xmlbeans.XmlString xgetPHONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PHONE" element
     */
    public void setPHONE(java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$0);
            }
            target.setStringValue(phone);
        }
    }
    
    /**
     * Sets (as xml) the "PHONE" element
     */
    public void xsetPHONE(org.apache.xmlbeans.XmlString phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$0);
            }
            target.set(phone);
        }
    }
}
