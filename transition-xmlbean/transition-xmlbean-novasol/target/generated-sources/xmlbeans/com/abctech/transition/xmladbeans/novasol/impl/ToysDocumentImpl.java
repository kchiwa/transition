/*
 * An XML document type.
 * Localname: Toys
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ToysDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Toys(@) element.
 *
 * This is a complex type.
 */
public class ToysDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ToysDocument
{
    private static final long serialVersionUID = 1L;
    
    public ToysDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOYS$0 = 
        new javax.xml.namespace.QName("", "Toys");
    
    
    /**
     * Gets the "Toys" element
     */
    public java.lang.String getToys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOYS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Toys" element
     */
    public org.apache.xmlbeans.XmlString xgetToys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOYS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Toys" element
     */
    public void setToys(java.lang.String toys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOYS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOYS$0);
            }
            target.setStringValue(toys);
        }
    }
    
    /**
     * Sets (as xml) the "Toys" element
     */
    public void xsetToys(org.apache.xmlbeans.XmlString toys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOYS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOYS$0);
            }
            target.set(toys);
        }
    }
}
