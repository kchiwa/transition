/*
 * An XML document type.
 * Localname: SAKSBEHANDLER_NAVN
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERNAVNDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one SAKSBEHANDLER_NAVN(@) element.
 *
 * This is a complex type.
 */
public class SAKSBEHANDLERNAVNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERNAVNDocument
{
    private static final long serialVersionUID = 1L;
    
    public SAKSBEHANDLERNAVNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAKSBEHANDLERNAVN$0 = 
        new javax.xml.namespace.QName("", "SAKSBEHANDLER_NAVN");
    
    
    /**
     * Gets the "SAKSBEHANDLER_NAVN" element
     */
    public java.lang.String getSAKSBEHANDLERNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERNAVN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SAKSBEHANDLER_NAVN" element
     */
    public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERNAVN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SAKSBEHANDLER_NAVN" element
     */
    public void setSAKSBEHANDLERNAVN(java.lang.String saksbehandlernavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERNAVN$0);
            }
            target.setStringValue(saksbehandlernavn);
        }
    }
    
    /**
     * Sets (as xml) the "SAKSBEHANDLER_NAVN" element
     */
    public void xsetSAKSBEHANDLERNAVN(org.apache.xmlbeans.XmlString saksbehandlernavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERNAVN$0);
            }
            target.set(saksbehandlernavn);
        }
    }
}
