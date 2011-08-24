/*
 * An XML document type.
 * Localname: STANDARD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.STANDARDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one STANDARD(@) element.
 *
 * This is a complex type.
 */
public class STANDARDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.STANDARDDocument
{
    private static final long serialVersionUID = 1L;
    
    public STANDARDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARD$0 = 
        new javax.xml.namespace.QName("", "STANDARD");
    
    
    /**
     * Gets the "STANDARD" element
     */
    public java.lang.String getSTANDARD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STANDARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "STANDARD" element
     */
    public org.apache.xmlbeans.XmlString xgetSTANDARD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STANDARD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "STANDARD" element
     */
    public void setSTANDARD(java.lang.String standard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STANDARD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STANDARD$0);
            }
            target.setStringValue(standard);
        }
    }
    
    /**
     * Sets (as xml) the "STANDARD" element
     */
    public void xsetSTANDARD(org.apache.xmlbeans.XmlString standard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STANDARD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STANDARD$0);
            }
            target.set(standard);
        }
    }
}
