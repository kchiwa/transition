/*
 * An XML document type.
 * Localname: Client
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ClientDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Client(@) element.
 *
 * This is a complex type.
 */
public class ClientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ClientDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("", "Client");
    
    
    /**
     * Gets the "Client" element
     */
    public java.lang.String getClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Client" element
     */
    public org.apache.xmlbeans.XmlString xgetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Client" element
     */
    public void setClient(java.lang.String client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENT$0);
            }
            target.setStringValue(client);
        }
    }
    
    /**
     * Sets (as xml) the "Client" element
     */
    public void xsetClient(org.apache.xmlbeans.XmlString client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENT$0);
            }
            target.set(client);
        }
    }
}
