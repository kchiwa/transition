/*
 * An XML document type.
 * Localname: ANTALL_SOVEROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ANTALLSOVEROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ANTALL_SOVEROM(@) element.
 *
 * This is a complex type.
 */
public class ANTALLSOVEROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ANTALLSOVEROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public ANTALLSOVEROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANTALLSOVEROM$0 = 
        new javax.xml.namespace.QName("", "ANTALL_SOVEROM");
    
    
    /**
     * Gets the "ANTALL_SOVEROM" element
     */
    public java.math.BigInteger getANTALLSOVEROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSOVEROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ANTALL_SOVEROM" element
     */
    public org.apache.xmlbeans.XmlInteger xgetANTALLSOVEROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANTALLSOVEROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ANTALL_SOVEROM" element
     */
    public void setANTALLSOVEROM(java.math.BigInteger antallsoverom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSOVEROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTALLSOVEROM$0);
            }
            target.setBigIntegerValue(antallsoverom);
        }
    }
    
    /**
     * Sets (as xml) the "ANTALL_SOVEROM" element
     */
    public void xsetANTALLSOVEROM(org.apache.xmlbeans.XmlInteger antallsoverom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANTALLSOVEROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ANTALLSOVEROM$0);
            }
            target.set(antallsoverom);
        }
    }
}
