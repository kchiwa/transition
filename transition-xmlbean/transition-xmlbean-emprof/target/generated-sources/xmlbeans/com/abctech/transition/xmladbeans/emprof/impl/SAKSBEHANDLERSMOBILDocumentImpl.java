/*
 * An XML document type.
 * Localname: SAKSBEHANDLERS_MOBIL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERSMOBILDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one SAKSBEHANDLERS_MOBIL(@) element.
 *
 * This is a complex type.
 */
public class SAKSBEHANDLERSMOBILDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLERSMOBILDocument
{
    private static final long serialVersionUID = 1L;
    
    public SAKSBEHANDLERSMOBILDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAKSBEHANDLERSMOBIL$0 = 
        new javax.xml.namespace.QName("", "SAKSBEHANDLERS_MOBIL");
    
    
    /**
     * Gets the "SAKSBEHANDLERS_MOBIL" element
     */
    public java.lang.String getSAKSBEHANDLERSMOBIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSMOBIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SAKSBEHANDLERS_MOBIL" element
     */
    public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSMOBIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSMOBIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SAKSBEHANDLERS_MOBIL" element
     */
    public void setSAKSBEHANDLERSMOBIL(java.lang.String saksbehandlersmobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSMOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERSMOBIL$0);
            }
            target.setStringValue(saksbehandlersmobil);
        }
    }
    
    /**
     * Sets (as xml) the "SAKSBEHANDLERS_MOBIL" element
     */
    public void xsetSAKSBEHANDLERSMOBIL(org.apache.xmlbeans.XmlString saksbehandlersmobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSMOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERSMOBIL$0);
            }
            target.set(saksbehandlersmobil);
        }
    }
}
