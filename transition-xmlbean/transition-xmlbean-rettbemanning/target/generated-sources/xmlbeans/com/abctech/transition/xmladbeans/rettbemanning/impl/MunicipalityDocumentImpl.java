/*
 * An XML document type.
 * Localname: municipality
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.MunicipalityDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one municipality(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class MunicipalityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.MunicipalityDocument
{
    private static final long serialVersionUID = 1L;
    
    public MunicipalityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUNICIPALITY$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "municipality");
    
    
    /**
     * Gets the "municipality" element
     */
    public java.lang.String getMunicipality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "municipality" element
     */
    public org.apache.xmlbeans.XmlString xgetMunicipality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "municipality" element
     */
    public void setMunicipality(java.lang.String municipality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUNICIPALITY$0);
            }
            target.setStringValue(municipality);
        }
    }
    
    /**
     * Sets (as xml) the "municipality" element
     */
    public void xsetMunicipality(org.apache.xmlbeans.XmlString municipality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MUNICIPALITY$0);
            }
            target.set(municipality);
        }
    }
}
