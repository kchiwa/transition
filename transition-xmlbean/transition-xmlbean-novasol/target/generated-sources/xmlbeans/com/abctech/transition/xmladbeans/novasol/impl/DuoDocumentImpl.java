/*
 * An XML document type.
 * Localname: Duo
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DuoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Duo(@) element.
 *
 * This is a complex type.
 */
public class DuoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DuoDocument
{
    private static final long serialVersionUID = 1L;
    
    public DuoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUO$0 = 
        new javax.xml.namespace.QName("", "Duo");
    
    
    /**
     * Gets the "Duo" element
     */
    public java.lang.String getDuo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Duo" element
     */
    public org.apache.xmlbeans.XmlString xgetDuo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DUO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Duo" element
     */
    public void setDuo(java.lang.String duo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUO$0);
            }
            target.setStringValue(duo);
        }
    }
    
    /**
     * Sets (as xml) the "Duo" element
     */
    public void xsetDuo(org.apache.xmlbeans.XmlString duo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DUO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DUO$0);
            }
            target.set(duo);
        }
    }
}
