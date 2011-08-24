/*
 * An XML document type.
 * Localname: PropertyNumber
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyNumber(@) element.
 *
 * This is a complex type.
 */
public class PropertyNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYNUMBER$0 = 
        new javax.xml.namespace.QName("", "PropertyNumber");
    
    
    /**
     * Gets the "PropertyNumber" element
     */
    public java.lang.String getPropertyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyNumber" element
     */
    public void setPropertyNumber(java.lang.String propertyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNUMBER$0);
            }
            target.setStringValue(propertyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyNumber" element
     */
    public void xsetPropertyNumber(org.apache.xmlbeans.XmlString propertyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNUMBER$0);
            }
            target.set(propertyNumber);
        }
    }
}
