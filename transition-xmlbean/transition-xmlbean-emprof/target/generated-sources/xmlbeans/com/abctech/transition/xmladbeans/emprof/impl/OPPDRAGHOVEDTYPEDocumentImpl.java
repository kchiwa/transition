/*
 * An XML document type.
 * Localname: OPPDRAGHOVEDTYPE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.OPPDRAGHOVEDTYPEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one OPPDRAGHOVEDTYPE(@) element.
 *
 * This is a complex type.
 */
public class OPPDRAGHOVEDTYPEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.OPPDRAGHOVEDTYPEDocument
{
    private static final long serialVersionUID = 1L;
    
    public OPPDRAGHOVEDTYPEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPDRAGHOVEDTYPE$0 = 
        new javax.xml.namespace.QName("", "OPPDRAGHOVEDTYPE");
    
    
    /**
     * Gets the "OPPDRAGHOVEDTYPE" element
     */
    public java.math.BigInteger getOPPDRAGHOVEDTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGHOVEDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "OPPDRAGHOVEDTYPE" element
     */
    public org.apache.xmlbeans.XmlInteger xgetOPPDRAGHOVEDTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPPDRAGHOVEDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OPPDRAGHOVEDTYPE" element
     */
    public void setOPPDRAGHOVEDTYPE(java.math.BigInteger oppdraghovedtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGHOVEDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPDRAGHOVEDTYPE$0);
            }
            target.setBigIntegerValue(oppdraghovedtype);
        }
    }
    
    /**
     * Sets (as xml) the "OPPDRAGHOVEDTYPE" element
     */
    public void xsetOPPDRAGHOVEDTYPE(org.apache.xmlbeans.XmlInteger oppdraghovedtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPPDRAGHOVEDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(OPPDRAGHOVEDTYPE$0);
            }
            target.set(oppdraghovedtype);
        }
    }
}
