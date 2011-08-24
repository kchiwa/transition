/*
 * An XML document type.
 * Localname: P-ROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.PROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one P-ROM(@) element.
 *
 * This is a complex type.
 */
public class PROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.PROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public PROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROM$0 = 
        new javax.xml.namespace.QName("", "P-ROM");
    
    
    /**
     * Gets the "P-ROM" element
     */
    public java.math.BigInteger getPROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "P-ROM" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "P-ROM" element
     */
    public void setPROM(java.math.BigInteger prom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROM$0);
            }
            target.setBigIntegerValue(prom);
        }
    }
    
    /**
     * Sets (as xml) the "P-ROM" element
     */
    public void xsetPROM(org.apache.xmlbeans.XmlInteger prom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROM$0);
            }
            target.set(prom);
        }
    }
}
