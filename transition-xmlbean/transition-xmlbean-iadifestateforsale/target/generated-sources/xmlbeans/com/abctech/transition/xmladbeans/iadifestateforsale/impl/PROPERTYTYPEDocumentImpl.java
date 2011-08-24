/*
 * An XML document type.
 * Localname: PROPERTY_TYPE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PROPERTYTYPEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PROPERTY_TYPE(@) element.
 *
 * This is a complex type.
 */
public class PROPERTYTYPEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PROPERTYTYPEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PROPERTYTYPEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYTYPE$0 = 
        new javax.xml.namespace.QName("", "PROPERTY_TYPE");
    
    
    /**
     * Gets the "PROPERTY_TYPE" element
     */
    public java.lang.String getPROPERTYTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PROPERTY_TYPE" element
     */
    public org.apache.xmlbeans.XmlString xgetPROPERTYTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PROPERTY_TYPE" element
     */
    public void setPROPERTYTYPE(java.lang.String propertytype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$0);
            }
            target.setStringValue(propertytype);
        }
    }
    
    /**
     * Sets (as xml) the "PROPERTY_TYPE" element
     */
    public void xsetPROPERTYTYPE(org.apache.xmlbeans.XmlString propertytype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$0);
            }
            target.set(propertytype);
        }
    }
}
