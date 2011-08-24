/*
 * An XML document type.
 * Localname: ADKOMST
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ADKOMSTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ADKOMST(@) element.
 *
 * This is a complex type.
 */
public class ADKOMSTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ADKOMSTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ADKOMSTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADKOMST$0 = 
        new javax.xml.namespace.QName("", "ADKOMST");
    
    
    /**
     * Gets the "ADKOMST" element
     */
    public java.lang.String getADKOMST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADKOMST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADKOMST" element
     */
    public org.apache.xmlbeans.XmlString xgetADKOMST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADKOMST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ADKOMST" element
     */
    public void setADKOMST(java.lang.String adkomst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADKOMST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADKOMST$0);
            }
            target.setStringValue(adkomst);
        }
    }
    
    /**
     * Sets (as xml) the "ADKOMST" element
     */
    public void xsetADKOMST(org.apache.xmlbeans.XmlString adkomst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADKOMST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADKOMST$0);
            }
            target.set(adkomst);
        }
    }
}
