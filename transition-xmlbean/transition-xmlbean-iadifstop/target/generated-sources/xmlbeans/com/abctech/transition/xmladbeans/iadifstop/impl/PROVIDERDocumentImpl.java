/*
 * An XML document type.
 * Localname: PROVIDER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.PROVIDERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop.impl;
/**
 * A document containing one PROVIDER(@) element.
 *
 * This is a complex type.
 */
public class PROVIDERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.PROVIDERDocument
{
    private static final long serialVersionUID = 1L;
    
    public PROVIDERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVIDER$0 = 
        new javax.xml.namespace.QName("", "PROVIDER");
    
    
    /**
     * Gets the "PROVIDER" element
     */
    public java.lang.String getPROVIDER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PROVIDER" element
     */
    public org.apache.xmlbeans.XmlString xgetPROVIDER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PROVIDER" element
     */
    public void setPROVIDER(java.lang.String provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDER$0);
            }
            target.setStringValue(provider);
        }
    }
    
    /**
     * Sets (as xml) the "PROVIDER" element
     */
    public void xsetPROVIDER(org.apache.xmlbeans.XmlString provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDER$0);
            }
            target.set(provider);
        }
    }
}
