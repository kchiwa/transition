/*
 * An XML document type.
 * Localname: Kjoretoygruppe
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KjoretoygruppeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kjoretoygruppe(@) element.
 *
 * This is a complex type.
 */
public class KjoretoygruppeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KjoretoygruppeDocument
{
    private static final long serialVersionUID = 1L;
    
    public KjoretoygruppeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KJORETOYGRUPPE$0 = 
        new javax.xml.namespace.QName("", "Kjoretoygruppe");
    
    
    /**
     * Gets the "Kjoretoygruppe" element
     */
    public java.lang.String getKjoretoygruppe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kjoretoygruppe" element
     */
    public org.apache.xmlbeans.XmlString xgetKjoretoygruppe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kjoretoygruppe" element
     */
    public void setKjoretoygruppe(java.lang.String kjoretoygruppe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KJORETOYGRUPPE$0);
            }
            target.setStringValue(kjoretoygruppe);
        }
    }
    
    /**
     * Sets (as xml) the "Kjoretoygruppe" element
     */
    public void xsetKjoretoygruppe(org.apache.xmlbeans.XmlString kjoretoygruppe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KJORETOYGRUPPE$0);
            }
            target.set(kjoretoygruppe);
        }
    }
}
