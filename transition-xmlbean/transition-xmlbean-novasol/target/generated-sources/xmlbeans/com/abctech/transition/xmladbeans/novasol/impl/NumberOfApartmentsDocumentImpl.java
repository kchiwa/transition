/*
 * An XML document type.
 * Localname: NumberOfApartments
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.NumberOfApartmentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one NumberOfApartments(@) element.
 *
 * This is a complex type.
 */
public class NumberOfApartmentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.NumberOfApartmentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumberOfApartmentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFAPARTMENTS$0 = 
        new javax.xml.namespace.QName("", "NumberOfApartments");
    
    
    /**
     * Gets the "NumberOfApartments" element
     */
    public java.lang.String getNumberOfApartments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFAPARTMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfApartments" element
     */
    public org.apache.xmlbeans.XmlString xgetNumberOfApartments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFAPARTMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfApartments" element
     */
    public void setNumberOfApartments(java.lang.String numberOfApartments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFAPARTMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFAPARTMENTS$0);
            }
            target.setStringValue(numberOfApartments);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfApartments" element
     */
    public void xsetNumberOfApartments(org.apache.xmlbeans.XmlString numberOfApartments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFAPARTMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFAPARTMENTS$0);
            }
            target.set(numberOfApartments);
        }
    }
}
