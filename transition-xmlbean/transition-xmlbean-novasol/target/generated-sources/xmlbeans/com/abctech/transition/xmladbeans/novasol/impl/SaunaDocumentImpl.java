/*
 * An XML document type.
 * Localname: Sauna
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SaunaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Sauna(@) element.
 *
 * This is a complex type.
 */
public class SaunaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SaunaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SaunaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAUNA$0 = 
        new javax.xml.namespace.QName("", "Sauna");
    
    
    /**
     * Gets the "Sauna" element
     */
    public java.lang.String getSauna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAUNA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sauna" element
     */
    public org.apache.xmlbeans.XmlString xgetSauna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAUNA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Sauna" element
     */
    public void setSauna(java.lang.String sauna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAUNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAUNA$0);
            }
            target.setStringValue(sauna);
        }
    }
    
    /**
     * Sets (as xml) the "Sauna" element
     */
    public void xsetSauna(org.apache.xmlbeans.XmlString sauna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAUNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAUNA$0);
            }
            target.set(sauna);
        }
    }
}
