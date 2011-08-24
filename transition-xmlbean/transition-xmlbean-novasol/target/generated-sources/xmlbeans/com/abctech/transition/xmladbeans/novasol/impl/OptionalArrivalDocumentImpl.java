/*
 * An XML document type.
 * Localname: OptionalArrival
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.OptionalArrivalDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one OptionalArrival(@) element.
 *
 * This is a complex type.
 */
public class OptionalArrivalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.OptionalArrivalDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionalArrivalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONALARRIVAL$0 = 
        new javax.xml.namespace.QName("", "OptionalArrival");
    
    
    /**
     * Gets the "OptionalArrival" element
     */
    public java.lang.String getOptionalArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALARRIVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OptionalArrival" element
     */
    public org.apache.xmlbeans.XmlString xgetOptionalArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONALARRIVAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OptionalArrival" element
     */
    public void setOptionalArrival(java.lang.String optionalArrival)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALARRIVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONALARRIVAL$0);
            }
            target.setStringValue(optionalArrival);
        }
    }
    
    /**
     * Sets (as xml) the "OptionalArrival" element
     */
    public void xsetOptionalArrival(org.apache.xmlbeans.XmlString optionalArrival)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONALARRIVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPTIONALARRIVAL$0);
            }
            target.set(optionalArrival);
        }
    }
}
