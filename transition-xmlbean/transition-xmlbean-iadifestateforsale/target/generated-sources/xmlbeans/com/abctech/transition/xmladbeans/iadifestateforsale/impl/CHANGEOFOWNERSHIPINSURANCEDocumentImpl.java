/*
 * An XML document type.
 * Localname: CHANGE_OF_OWNERSHIP_INSURANCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.CHANGEOFOWNERSHIPINSURANCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one CHANGE_OF_OWNERSHIP_INSURANCE(@) element.
 *
 * This is a complex type.
 */
public class CHANGEOFOWNERSHIPINSURANCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.CHANGEOFOWNERSHIPINSURANCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public CHANGEOFOWNERSHIPINSURANCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGEOFOWNERSHIPINSURANCE$0 = 
        new javax.xml.namespace.QName("", "CHANGE_OF_OWNERSHIP_INSURANCE");
    
    
    /**
     * Gets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
     */
    public java.lang.String getCHANGEOFOWNERSHIPINSURANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
     */
    public org.apache.xmlbeans.XmlString xgetCHANGEOFOWNERSHIPINSURANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
     */
    public void setCHANGEOFOWNERSHIPINSURANCE(java.lang.String changeofownershipinsurance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEOFOWNERSHIPINSURANCE$0);
            }
            target.setStringValue(changeofownershipinsurance);
        }
    }
    
    /**
     * Sets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
     */
    public void xsetCHANGEOFOWNERSHIPINSURANCE(org.apache.xmlbeans.XmlString changeofownershipinsurance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEOFOWNERSHIPINSURANCE$0);
            }
            target.set(changeofownershipinsurance);
        }
    }
}
