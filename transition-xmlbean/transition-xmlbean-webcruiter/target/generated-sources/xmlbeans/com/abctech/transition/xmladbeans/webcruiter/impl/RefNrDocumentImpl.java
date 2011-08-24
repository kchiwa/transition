/*
 * An XML document type.
 * Localname: RefNr
 * Namespace: http://webcruiter.no/xml/
 * Java type: com.abctech.transition.xmladbeans.webcruiter.RefNrDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one RefNr(@http://webcruiter.no/xml/) element.
 *
 * This is a complex type.
 */
public class RefNrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.RefNrDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefNrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFNR$0 = 
        new javax.xml.namespace.QName("http://webcruiter.no/xml/", "RefNr");
    
    
    /**
     * Gets the "RefNr" element
     */
    public java.lang.String getRefNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefNr" element
     */
    public org.apache.xmlbeans.XmlString xgetRefNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RefNr" element
     */
    public void setRefNr(java.lang.String refNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNR$0);
            }
            target.setStringValue(refNr);
        }
    }
    
    /**
     * Sets (as xml) the "RefNr" element
     */
    public void xsetRefNr(org.apache.xmlbeans.XmlString refNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNR$0);
            }
            target.set(refNr);
        }
    }
}
