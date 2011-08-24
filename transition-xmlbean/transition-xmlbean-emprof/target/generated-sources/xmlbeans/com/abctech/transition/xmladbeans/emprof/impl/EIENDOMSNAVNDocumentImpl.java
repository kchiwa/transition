/*
 * An XML document type.
 * Localname: EIENDOMSNAVN
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.EIENDOMSNAVNDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one EIENDOMSNAVN(@) element.
 *
 * This is a complex type.
 */
public class EIENDOMSNAVNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.EIENDOMSNAVNDocument
{
    private static final long serialVersionUID = 1L;
    
    public EIENDOMSNAVNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EIENDOMSNAVN$0 = 
        new javax.xml.namespace.QName("", "EIENDOMSNAVN");
    
    
    /**
     * Gets the "EIENDOMSNAVN" element
     */
    public java.lang.String getEIENDOMSNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIENDOMSNAVN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EIENDOMSNAVN" element
     */
    public org.apache.xmlbeans.XmlString xgetEIENDOMSNAVN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIENDOMSNAVN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EIENDOMSNAVN" element
     */
    public void setEIENDOMSNAVN(java.lang.String eiendomsnavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIENDOMSNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIENDOMSNAVN$0);
            }
            target.setStringValue(eiendomsnavn);
        }
    }
    
    /**
     * Sets (as xml) the "EIENDOMSNAVN" element
     */
    public void xsetEIENDOMSNAVN(org.apache.xmlbeans.XmlString eiendomsnavn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIENDOMSNAVN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIENDOMSNAVN$0);
            }
            target.set(eiendomsnavn);
        }
    }
}
