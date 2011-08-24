/*
 * An XML document type.
 * Localname: PRIMAEREROM_LEDERTEKST
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.PRIMAEREROMLEDERTEKSTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one PRIMAEREROM_LEDERTEKST(@) element.
 *
 * This is a complex type.
 */
public class PRIMAEREROMLEDERTEKSTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.PRIMAEREROMLEDERTEKSTDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMAEREROMLEDERTEKSTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMAEREROMLEDERTEKST$0 = 
        new javax.xml.namespace.QName("", "PRIMAEREROM_LEDERTEKST");
    
    
    /**
     * Gets the "PRIMAEREROM_LEDERTEKST" element
     */
    public java.lang.String getPRIMAEREROMLEDERTEKST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAEREROMLEDERTEKST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMAEREROM_LEDERTEKST" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMAEREROMLEDERTEKST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAEREROMLEDERTEKST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMAEREROM_LEDERTEKST" element
     */
    public void setPRIMAEREROMLEDERTEKST(java.lang.String primaereromledertekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAEREROMLEDERTEKST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMAEREROMLEDERTEKST$0);
            }
            target.setStringValue(primaereromledertekst);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMAEREROM_LEDERTEKST" element
     */
    public void xsetPRIMAEREROMLEDERTEKST(org.apache.xmlbeans.XmlString primaereromledertekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAEREROMLEDERTEKST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMAEREROMLEDERTEKST$0);
            }
            target.set(primaereromledertekst);
        }
    }
}
