/*
 * An XML document type.
 * Localname: OmregAvgift
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.OmregAvgiftDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one OmregAvgift(@) element.
 *
 * This is a complex type.
 */
public class OmregAvgiftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.OmregAvgiftDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmregAvgiftDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMREGAVGIFT$0 = 
        new javax.xml.namespace.QName("", "OmregAvgift");
    
    
    /**
     * Gets the "OmregAvgift" element
     */
    public java.lang.String getOmregAvgift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMREGAVGIFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OmregAvgift" element
     */
    public org.apache.xmlbeans.XmlString xgetOmregAvgift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMREGAVGIFT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OmregAvgift" element
     */
    public void setOmregAvgift(java.lang.String omregAvgift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMREGAVGIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMREGAVGIFT$0);
            }
            target.setStringValue(omregAvgift);
        }
    }
    
    /**
     * Sets (as xml) the "OmregAvgift" element
     */
    public void xsetOmregAvgift(org.apache.xmlbeans.XmlString omregAvgift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMREGAVGIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMREGAVGIFT$0);
            }
            target.set(omregAvgift);
        }
    }
}
