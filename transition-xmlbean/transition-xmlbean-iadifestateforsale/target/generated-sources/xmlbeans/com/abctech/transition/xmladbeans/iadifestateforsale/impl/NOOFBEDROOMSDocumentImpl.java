/*
 * An XML document type.
 * Localname: NO_OF_BEDROOMS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFBEDROOMSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_BEDROOMS(@) element.
 *
 * This is a complex type.
 */
public class NOOFBEDROOMSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFBEDROOMSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFBEDROOMSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFBEDROOMS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_BEDROOMS");
    
    
    /**
     * Gets the "NO_OF_BEDROOMS" element
     */
    public java.lang.String getNOOFBEDROOMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_BEDROOMS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFBEDROOMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_BEDROOMS" element
     */
    public void setNOOFBEDROOMS(java.lang.String noofbedrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFBEDROOMS$0);
            }
            target.setStringValue(noofbedrooms);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_BEDROOMS" element
     */
    public void xsetNOOFBEDROOMS(org.apache.xmlbeans.XmlString noofbedrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFBEDROOMS$0);
            }
            target.set(noofbedrooms);
        }
    }
}
