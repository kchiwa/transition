/*
 * An XML document type.
 * Localname: ExtraCostsExcl
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraCostsExclDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraCostsExcl(@) element.
 *
 * This is a complex type.
 */
public class ExtraCostsExclDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraCostsExclDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraCostsExclDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACOSTSEXCL$0 = 
        new javax.xml.namespace.QName("", "ExtraCostsExcl");
    
    
    /**
     * Gets the "ExtraCostsExcl" element
     */
    public java.lang.String getExtraCostsExcl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSEXCL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraCostsExcl" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraCostsExcl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSEXCL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraCostsExcl" element
     */
    public void setExtraCostsExcl(java.lang.String extraCostsExcl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSEXCL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTSEXCL$0);
            }
            target.setStringValue(extraCostsExcl);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraCostsExcl" element
     */
    public void xsetExtraCostsExcl(org.apache.xmlbeans.XmlString extraCostsExcl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSEXCL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTSEXCL$0);
            }
            target.set(extraCostsExcl);
        }
    }
}
