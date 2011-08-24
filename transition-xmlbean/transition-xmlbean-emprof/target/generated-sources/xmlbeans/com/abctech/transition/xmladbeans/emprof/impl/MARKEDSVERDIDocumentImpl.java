/*
 * An XML document type.
 * Localname: MARKEDSVERDI
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MARKEDSVERDIDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MARKEDSVERDI(@) element.
 *
 * This is a complex type.
 */
public class MARKEDSVERDIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MARKEDSVERDIDocument
{
    private static final long serialVersionUID = 1L;
    
    public MARKEDSVERDIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKEDSVERDI$0 = 
        new javax.xml.namespace.QName("", "MARKEDSVERDI");
    
    
    /**
     * Gets the "MARKEDSVERDI" element
     */
    public java.math.BigInteger getMARKEDSVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKEDSVERDI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MARKEDSVERDI" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMARKEDSVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MARKEDSVERDI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MARKEDSVERDI" element
     */
    public void setMARKEDSVERDI(java.math.BigInteger markedsverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKEDSVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKEDSVERDI$0);
            }
            target.setBigIntegerValue(markedsverdi);
        }
    }
    
    /**
     * Sets (as xml) the "MARKEDSVERDI" element
     */
    public void xsetMARKEDSVERDI(org.apache.xmlbeans.XmlInteger markedsverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MARKEDSVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MARKEDSVERDI$0);
            }
            target.set(markedsverdi);
        }
    }
}
