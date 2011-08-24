/*
 * An XML document type.
 * Localname: NO_OF_BEDS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFBEDSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_BEDS(@) element.
 *
 * This is a complex type.
 */
public class NOOFBEDSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFBEDSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFBEDSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFBEDS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_BEDS");
    
    
    /**
     * Gets the "NO_OF_BEDS" element
     */
    public java.lang.String getNOOFBEDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_BEDS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFBEDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_BEDS" element
     */
    public void setNOOFBEDS(java.lang.String noofbeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFBEDS$0);
            }
            target.setStringValue(noofbeds);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_BEDS" element
     */
    public void xsetNOOFBEDS(org.apache.xmlbeans.XmlString noofbeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFBEDS$0);
            }
            target.set(noofbeds);
        }
    }
}
