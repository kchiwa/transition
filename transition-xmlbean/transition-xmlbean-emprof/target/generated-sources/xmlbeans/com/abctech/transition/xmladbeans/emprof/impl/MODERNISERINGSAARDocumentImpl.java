/*
 * An XML document type.
 * Localname: MODERNISERINGSAAR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MODERNISERINGSAAR(@) element.
 *
 * This is a complex type.
 */
public class MODERNISERINGSAARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARDocument
{
    private static final long serialVersionUID = 1L;
    
    public MODERNISERINGSAARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODERNISERINGSAAR$0 = 
        new javax.xml.namespace.QName("", "MODERNISERINGSAAR");
    
    
    /**
     * Gets the "MODERNISERINGSAAR" element
     */
    public java.math.BigInteger getMODERNISERINGSAAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MODERNISERINGSAAR" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MODERNISERINGSAAR" element
     */
    public void setMODERNISERINGSAAR(java.math.BigInteger moderniseringsaar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAAR$0);
            }
            target.setBigIntegerValue(moderniseringsaar);
        }
    }
    
    /**
     * Sets (as xml) the "MODERNISERINGSAAR" element
     */
    public void xsetMODERNISERINGSAAR(org.apache.xmlbeans.XmlInteger moderniseringsaar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAAR$0);
            }
            target.set(moderniseringsaar);
        }
    }
}
