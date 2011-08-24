/*
 * An XML document type.
 * Localname: PROVIDER_REFERENCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PROVIDERREFERENCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PROVIDER_REFERENCE(@) element.
 *
 * This is a complex type.
 */
public class PROVIDERREFERENCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PROVIDERREFERENCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PROVIDERREFERENCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVIDERREFERENCE$0 = 
        new javax.xml.namespace.QName("", "PROVIDER_REFERENCE");
    
    
    /**
     * Gets the "PROVIDER_REFERENCE" element
     */
    public java.lang.String getPROVIDERREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PROVIDER_REFERENCE" element
     */
    public org.apache.xmlbeans.XmlString xgetPROVIDERREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PROVIDER_REFERENCE" element
     */
    public void setPROVIDERREFERENCE(java.lang.String providerreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERREFERENCE$0);
            }
            target.setStringValue(providerreference);
        }
    }
    
    /**
     * Sets (as xml) the "PROVIDER_REFERENCE" element
     */
    public void xsetPROVIDERREFERENCE(org.apache.xmlbeans.XmlString providerreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDERREFERENCE$0);
            }
            target.set(providerreference);
        }
    }
}
