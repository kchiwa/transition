/*
 * An XML document type.
 * Localname: Radio
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RadioDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Radio(@) element.
 *
 * This is a complex type.
 */
public class RadioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RadioDocument
{
    private static final long serialVersionUID = 1L;
    
    public RadioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RADIO$0 = 
        new javax.xml.namespace.QName("", "Radio");
    
    
    /**
     * Gets the "Radio" element
     */
    public java.lang.String getRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Radio" element
     */
    public org.apache.xmlbeans.XmlString xgetRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Radio" element
     */
    public void setRadio(java.lang.String radio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIO$0);
            }
            target.setStringValue(radio);
        }
    }
    
    /**
     * Sets (as xml) the "Radio" element
     */
    public void xsetRadio(org.apache.xmlbeans.XmlString radio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RADIO$0);
            }
            target.set(radio);
        }
    }
}
