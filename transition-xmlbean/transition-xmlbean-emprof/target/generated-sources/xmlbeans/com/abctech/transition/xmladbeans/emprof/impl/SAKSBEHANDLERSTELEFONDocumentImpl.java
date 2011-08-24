/*
 * An XML document type.
 * Localname: SAKSBEHANDLERS_TELEFON
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERSTELEFONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one SAKSBEHANDLERS_TELEFON(@) element.
 *
 * This is a complex type.
 */
public class SAKSBEHANDLERSTELEFONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERSTELEFONDocument
{
    private static final long serialVersionUID = 1L;
    
    public SAKSBEHANDLERSTELEFONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAKSBEHANDLERSTELEFON$0 = 
        new javax.xml.namespace.QName("", "SAKSBEHANDLERS_TELEFON");
    
    
    /**
     * Gets the "SAKSBEHANDLERS_TELEFON" element
     */
    public java.lang.String getSAKSBEHANDLERSTELEFON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSTELEFON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SAKSBEHANDLERS_TELEFON" element
     */
    public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSTELEFON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSTELEFON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SAKSBEHANDLERS_TELEFON" element
     */
    public void setSAKSBEHANDLERSTELEFON(java.lang.String saksbehandlerstelefon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSTELEFON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERSTELEFON$0);
            }
            target.setStringValue(saksbehandlerstelefon);
        }
    }
    
    /**
     * Sets (as xml) the "SAKSBEHANDLERS_TELEFON" element
     */
    public void xsetSAKSBEHANDLERSTELEFON(org.apache.xmlbeans.XmlString saksbehandlerstelefon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSTELEFON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERSTELEFON$0);
            }
            target.set(saksbehandlerstelefon);
        }
    }
}
