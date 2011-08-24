/*
 * An XML document type.
 * Localname: TOMTEBESKRIVELSE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.TOMTEBESKRIVELSEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one TOMTEBESKRIVELSE(@) element.
 *
 * This is a complex type.
 */
public class TOMTEBESKRIVELSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.TOMTEBESKRIVELSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public TOMTEBESKRIVELSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOMTEBESKRIVELSE$0 = 
        new javax.xml.namespace.QName("", "TOMTEBESKRIVELSE");
    
    
    /**
     * Gets the "TOMTEBESKRIVELSE" element
     */
    public java.lang.String getTOMTEBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTEBESKRIVELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TOMTEBESKRIVELSE" element
     */
    public org.apache.xmlbeans.XmlString xgetTOMTEBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMTEBESKRIVELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TOMTEBESKRIVELSE" element
     */
    public void setTOMTEBESKRIVELSE(java.lang.String tomtebeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTEBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMTEBESKRIVELSE$0);
            }
            target.setStringValue(tomtebeskrivelse);
        }
    }
    
    /**
     * Sets (as xml) the "TOMTEBESKRIVELSE" element
     */
    public void xsetTOMTEBESKRIVELSE(org.apache.xmlbeans.XmlString tomtebeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMTEBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOMTEBESKRIVELSE$0);
            }
            target.set(tomtebeskrivelse);
        }
    }
}
