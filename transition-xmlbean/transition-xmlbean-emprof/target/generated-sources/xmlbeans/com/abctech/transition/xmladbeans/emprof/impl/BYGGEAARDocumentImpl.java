/*
 * An XML document type.
 * Localname: BYGGEAAR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BYGGEAARDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BYGGEAAR(@) element.
 *
 * This is a complex type.
 */
public class BYGGEAARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BYGGEAARDocument
{
    private static final long serialVersionUID = 1L;
    
    public BYGGEAARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BYGGEAAR$0 = 
        new javax.xml.namespace.QName("", "BYGGEAAR");
    
    
    /**
     * Gets the "BYGGEAAR" element
     */
    public java.math.BigInteger getBYGGEAAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYGGEAAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BYGGEAAR" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBYGGEAAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BYGGEAAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BYGGEAAR" element
     */
    public void setBYGGEAAR(java.math.BigInteger byggeaar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYGGEAAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYGGEAAR$0);
            }
            target.setBigIntegerValue(byggeaar);
        }
    }
    
    /**
     * Sets (as xml) the "BYGGEAAR" element
     */
    public void xsetBYGGEAAR(org.apache.xmlbeans.XmlInteger byggeaar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BYGGEAAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BYGGEAAR$0);
            }
            target.set(byggeaar);
        }
    }
}
