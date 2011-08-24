/*
 * An XML document type.
 * Localname: ExtraCostsIncl
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraCostsInclDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraCostsIncl(@) element.
 *
 * This is a complex type.
 */
public class ExtraCostsInclDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraCostsInclDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraCostsInclDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACOSTSINCL$0 = 
        new javax.xml.namespace.QName("", "ExtraCostsIncl");
    
    
    /**
     * Gets the "ExtraCostsIncl" element
     */
    public java.lang.String getExtraCostsIncl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSINCL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraCostsIncl" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraCostsIncl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSINCL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraCostsIncl" element
     */
    public void setExtraCostsIncl(java.lang.String extraCostsIncl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSINCL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTSINCL$0);
            }
            target.setStringValue(extraCostsIncl);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraCostsIncl" element
     */
    public void xsetExtraCostsIncl(org.apache.xmlbeans.XmlString extraCostsIncl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSINCL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTSINCL$0);
            }
            target.set(extraCostsIncl);
        }
    }
}
