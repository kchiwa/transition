/*
 * An XML document type.
 * Localname: POSTNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.POSTNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one POSTNR(@) element.
 *
 * This is a complex type.
 */
public class POSTNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.POSTNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public POSTNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTNR$0 = 
        new javax.xml.namespace.QName("", "POSTNR");
    
    
    /**
     * Gets the "POSTNR" element
     */
    public java.lang.String getPOSTNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "POSTNR" element
     */
    public org.apache.xmlbeans.XmlString xgetPOSTNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "POSTNR" element
     */
    public void setPOSTNR(java.lang.String postnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTNR$0);
            }
            target.setStringValue(postnr);
        }
    }
    
    /**
     * Sets (as xml) the "POSTNR" element
     */
    public void xsetPOSTNR(org.apache.xmlbeans.XmlString postnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTNR$0);
            }
            target.set(postnr);
        }
    }
}
