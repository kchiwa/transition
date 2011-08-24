/*
 * An XML document type.
 * Localname: ClientID
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ClientIDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ClientID(@) element.
 *
 * This is a complex type.
 */
public class ClientIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ClientIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTID$0 = 
        new javax.xml.namespace.QName("", "ClientID");
    
    
    /**
     * Gets the "ClientID" element
     */
    public java.lang.String getClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClientID" element
     */
    public org.apache.xmlbeans.XmlString xgetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClientID" element
     */
    public void setClientID(java.lang.String clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTID$0);
            }
            target.setStringValue(clientID);
        }
    }
    
    /**
     * Sets (as xml) the "ClientID" element
     */
    public void xsetClientID(org.apache.xmlbeans.XmlString clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTID$0);
            }
            target.set(clientID);
        }
    }
}
