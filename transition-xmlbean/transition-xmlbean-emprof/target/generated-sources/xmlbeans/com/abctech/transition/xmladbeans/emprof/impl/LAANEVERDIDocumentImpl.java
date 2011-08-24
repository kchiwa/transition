/*
 * An XML document type.
 * Localname: LAANEVERDI
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.LAANEVERDIDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one LAANEVERDI(@) element.
 *
 * This is a complex type.
 */
public class LAANEVERDIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.LAANEVERDIDocument
{
    private static final long serialVersionUID = 1L;
    
    public LAANEVERDIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAANEVERDI$0 = 
        new javax.xml.namespace.QName("", "LAANEVERDI");
    
    
    /**
     * Gets the "LAANEVERDI" element
     */
    public java.math.BigInteger getLAANEVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVERDI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "LAANEVERDI" element
     */
    public org.apache.xmlbeans.XmlInteger xgetLAANEVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LAANEVERDI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LAANEVERDI" element
     */
    public void setLAANEVERDI(java.math.BigInteger laaneverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAANEVERDI$0);
            }
            target.setBigIntegerValue(laaneverdi);
        }
    }
    
    /**
     * Sets (as xml) the "LAANEVERDI" element
     */
    public void xsetLAANEVERDI(org.apache.xmlbeans.XmlInteger laaneverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LAANEVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LAANEVERDI$0);
            }
            target.set(laaneverdi);
        }
    }
}
