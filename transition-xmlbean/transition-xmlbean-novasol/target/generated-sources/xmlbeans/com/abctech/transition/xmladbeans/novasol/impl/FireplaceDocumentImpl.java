/*
 * An XML document type.
 * Localname: Fireplace
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FireplaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Fireplace(@) element.
 *
 * This is a complex type.
 */
public class FireplaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FireplaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public FireplaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIREPLACE$0 = 
        new javax.xml.namespace.QName("", "Fireplace");
    
    
    /**
     * Gets the "Fireplace" element
     */
    public java.lang.String getFireplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIREPLACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fireplace" element
     */
    public org.apache.xmlbeans.XmlString xgetFireplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIREPLACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Fireplace" element
     */
    public void setFireplace(java.lang.String fireplace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIREPLACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIREPLACE$0);
            }
            target.setStringValue(fireplace);
        }
    }
    
    /**
     * Sets (as xml) the "Fireplace" element
     */
    public void xsetFireplace(org.apache.xmlbeans.XmlString fireplace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIREPLACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIREPLACE$0);
            }
            target.set(fireplace);
        }
    }
}
