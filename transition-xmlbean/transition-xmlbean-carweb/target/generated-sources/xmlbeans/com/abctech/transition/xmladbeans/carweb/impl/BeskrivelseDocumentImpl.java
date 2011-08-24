/*
 * An XML document type.
 * Localname: Beskrivelse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BeskrivelseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Beskrivelse(@) element.
 *
 * This is a complex type.
 */
public class BeskrivelseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BeskrivelseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BeskrivelseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BESKRIVELSE$0 = 
        new javax.xml.namespace.QName("", "Beskrivelse");
    
    
    /**
     * Gets the "Beskrivelse" element
     */
    public java.lang.String getBeskrivelse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESKRIVELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Beskrivelse" element
     */
    public org.apache.xmlbeans.XmlString xgetBeskrivelse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BESKRIVELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Beskrivelse" element
     */
    public void setBeskrivelse(java.lang.String beskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BESKRIVELSE$0);
            }
            target.setStringValue(beskrivelse);
        }
    }
    
    /**
     * Sets (as xml) the "Beskrivelse" element
     */
    public void xsetBeskrivelse(org.apache.xmlbeans.XmlString beskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BESKRIVELSE$0);
            }
            target.set(beskrivelse);
        }
    }
}
