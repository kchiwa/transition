/*
 * An XML document type.
 * Localname: municipalityid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.MunicipalityidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one municipalityid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class MunicipalityidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.MunicipalityidDocument
{
    private static final long serialVersionUID = 1L;
    
    public MunicipalityidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUNICIPALITYID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "municipalityid");
    
    
    /**
     * Gets the "municipalityid" element
     */
    public java.lang.String getMunicipalityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "municipalityid" element
     */
    public org.apache.xmlbeans.XmlString xgetMunicipalityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "municipalityid" element
     */
    public void setMunicipalityid(java.lang.String municipalityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUNICIPALITYID$0);
            }
            target.setStringValue(municipalityid);
        }
    }
    
    /**
     * Sets (as xml) the "municipalityid" element
     */
    public void xsetMunicipalityid(org.apache.xmlbeans.XmlString municipalityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MUNICIPALITYID$0);
            }
            target.set(municipalityid);
        }
    }
}
