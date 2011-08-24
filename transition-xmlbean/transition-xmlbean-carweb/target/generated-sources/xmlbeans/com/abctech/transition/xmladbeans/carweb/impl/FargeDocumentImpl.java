/*
 * An XML document type.
 * Localname: Farge
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.FargeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Farge(@) element.
 *
 * This is a complex type.
 */
public class FargeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.FargeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FargeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FARGE$0 = 
        new javax.xml.namespace.QName("", "Farge");
    
    
    /**
     * Gets the "Farge" element
     */
    public java.lang.String getFarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Farge" element
     */
    public org.apache.xmlbeans.XmlString xgetFarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Farge" element
     */
    public void setFarge(java.lang.String farge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FARGE$0);
            }
            target.setStringValue(farge);
        }
    }
    
    /**
     * Sets (as xml) the "Farge" element
     */
    public void xsetFarge(org.apache.xmlbeans.XmlString farge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FARGE$0);
            }
            target.set(farge);
        }
    }
}
