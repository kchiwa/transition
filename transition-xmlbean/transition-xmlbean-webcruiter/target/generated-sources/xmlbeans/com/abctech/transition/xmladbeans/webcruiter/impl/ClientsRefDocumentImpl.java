/*
 * An XML document type.
 * Localname: ClientsRef
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.ClientsRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one ClientsRef(@) element.
 *
 * This is a complex type.
 */
public class ClientsRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.ClientsRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientsRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTSREF$0 = 
        new javax.xml.namespace.QName("", "ClientsRef");
    
    
    /**
     * Gets the "ClientsRef" element
     */
    public java.lang.String getClientsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClientsRef" element
     */
    public org.apache.xmlbeans.XmlString xgetClientsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClientsRef" element
     */
    public void setClientsRef(java.lang.String clientsRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTSREF$0);
            }
            target.setStringValue(clientsRef);
        }
    }
    
    /**
     * Sets (as xml) the "ClientsRef" element
     */
    public void xsetClientsRef(org.apache.xmlbeans.XmlString clientsRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTSREF$0);
            }
            target.set(clientsRef);
        }
    }
}
