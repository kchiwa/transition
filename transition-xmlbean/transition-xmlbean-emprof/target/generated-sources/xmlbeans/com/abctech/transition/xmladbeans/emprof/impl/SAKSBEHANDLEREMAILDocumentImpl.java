/*
 * An XML document type.
 * Localname: SAKSBEHANDLER_EMAIL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLEREMAILDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one SAKSBEHANDLER_EMAIL(@) element.
 *
 * This is a complex type.
 */
public class SAKSBEHANDLEREMAILDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.SAKSBEHANDLEREMAILDocument
{
    private static final long serialVersionUID = 1L;
    
    public SAKSBEHANDLEREMAILDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAKSBEHANDLEREMAIL$0 = 
        new javax.xml.namespace.QName("", "SAKSBEHANDLER_EMAIL");
    
    
    /**
     * Gets the "SAKSBEHANDLER_EMAIL" element
     */
    public java.lang.String getSAKSBEHANDLEREMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLEREMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SAKSBEHANDLER_EMAIL" element
     */
    public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLEREMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLEREMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SAKSBEHANDLER_EMAIL" element
     */
    public void setSAKSBEHANDLEREMAIL(java.lang.String saksbehandleremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLEREMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLEREMAIL$0);
            }
            target.setStringValue(saksbehandleremail);
        }
    }
    
    /**
     * Sets (as xml) the "SAKSBEHANDLER_EMAIL" element
     */
    public void xsetSAKSBEHANDLEREMAIL(org.apache.xmlbeans.XmlString saksbehandleremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLEREMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLEREMAIL$0);
            }
            target.set(saksbehandleremail);
        }
    }
}
