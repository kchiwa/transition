/*
 * An XML document type.
 * Localname: Demobil
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.DemobilDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Demobil(@) element.
 *
 * This is a complex type.
 */
public class DemobilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.DemobilDocument
{
    private static final long serialVersionUID = 1L;
    
    public DemobilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEMOBIL$0 = 
        new javax.xml.namespace.QName("", "Demobil");
    
    
    /**
     * Gets the "Demobil" element
     */
    public java.lang.String getDemobil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Demobil" element
     */
    public org.apache.xmlbeans.XmlString xgetDemobil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Demobil" element
     */
    public void setDemobil(java.lang.String demobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEMOBIL$0);
            }
            target.setStringValue(demobil);
        }
    }
    
    /**
     * Sets (as xml) the "Demobil" element
     */
    public void xsetDemobil(org.apache.xmlbeans.XmlString demobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEMOBIL$0);
            }
            target.set(demobil);
        }
    }
}
