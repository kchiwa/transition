/*
 * An XML document type.
 * Localname: ETASJE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ETASJEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ETASJE(@) element.
 *
 * This is a complex type.
 */
public class ETASJEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ETASJEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ETASJEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ETASJE$0 = 
        new javax.xml.namespace.QName("", "ETASJE");
    
    
    /**
     * Gets the "ETASJE" element
     */
    public java.math.BigInteger getETASJE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETASJE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ETASJE" element
     */
    public org.apache.xmlbeans.XmlInteger xgetETASJE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ETASJE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ETASJE" element
     */
    public void setETASJE(java.math.BigInteger etasje)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETASJE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETASJE$0);
            }
            target.setBigIntegerValue(etasje);
        }
    }
    
    /**
     * Sets (as xml) the "ETASJE" element
     */
    public void xsetETASJE(org.apache.xmlbeans.XmlInteger etasje)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ETASJE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ETASJE$0);
            }
            target.set(etasje);
        }
    }
}
