/*
 * An XML document type.
 * Localname: SendToAddress
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.SendToAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one SendToAddress(@) element.
 *
 * This is a complex type.
 */
public class SendToAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.SendToAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendToAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDTOADDRESS$0 = 
        new javax.xml.namespace.QName("", "SendToAddress");
    
    
    /**
     * Gets the "SendToAddress" element
     */
    public java.lang.String getSendToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendToAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetSendToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDTOADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SendToAddress" element
     */
    public void setSendToAddress(java.lang.String sendToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDTOADDRESS$0);
            }
            target.setStringValue(sendToAddress);
        }
    }
    
    /**
     * Sets (as xml) the "SendToAddress" element
     */
    public void xsetSendToAddress(org.apache.xmlbeans.XmlString sendToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDTOADDRESS$0);
            }
            target.set(sendToAddress);
        }
    }
}
