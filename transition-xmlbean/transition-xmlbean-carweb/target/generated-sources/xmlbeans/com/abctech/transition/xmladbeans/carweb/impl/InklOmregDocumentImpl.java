/*
 * An XML document type.
 * Localname: InklOmreg
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.InklOmregDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one InklOmreg(@) element.
 *
 * This is a complex type.
 */
public class InklOmregDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.InklOmregDocument
{
    private static final long serialVersionUID = 1L;
    
    public InklOmregDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INKLOMREG$0 = 
        new javax.xml.namespace.QName("", "InklOmreg");
    
    
    /**
     * Gets the "InklOmreg" element
     */
    public java.lang.String getInklOmreg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLOMREG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InklOmreg" element
     */
    public org.apache.xmlbeans.XmlString xgetInklOmreg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLOMREG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InklOmreg" element
     */
    public void setInklOmreg(java.lang.String inklOmreg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLOMREG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INKLOMREG$0);
            }
            target.setStringValue(inklOmreg);
        }
    }
    
    /**
     * Sets (as xml) the "InklOmreg" element
     */
    public void xsetInklOmreg(org.apache.xmlbeans.XmlString inklOmreg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLOMREG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INKLOMREG$0);
            }
            target.set(inklOmreg);
        }
    }
}
