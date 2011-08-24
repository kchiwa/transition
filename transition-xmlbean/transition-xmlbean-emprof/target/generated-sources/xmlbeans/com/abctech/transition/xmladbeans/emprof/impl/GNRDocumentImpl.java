/*
 * An XML document type.
 * Localname: GNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.GNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one GNR(@) element.
 *
 * This is a complex type.
 */
public class GNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.GNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public GNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GNR$0 = 
        new javax.xml.namespace.QName("", "GNR");
    
    
    /**
     * Gets the "GNR" element
     */
    public java.lang.String getGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GNR" element
     */
    public org.apache.xmlbeans.XmlString xgetGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GNR" element
     */
    public void setGNR(java.lang.String gnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GNR$0);
            }
            target.setStringValue(gnr);
        }
    }
    
    /**
     * Sets (as xml) the "GNR" element
     */
    public void xsetGNR(org.apache.xmlbeans.XmlString gnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GNR$0);
            }
            target.set(gnr);
        }
    }
}
