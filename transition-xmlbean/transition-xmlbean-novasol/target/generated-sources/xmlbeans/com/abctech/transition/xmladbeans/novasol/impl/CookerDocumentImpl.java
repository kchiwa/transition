/*
 * An XML document type.
 * Localname: Cooker
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CookerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Cooker(@) element.
 *
 * This is a complex type.
 */
public class CookerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CookerDocument
{
    private static final long serialVersionUID = 1L;
    
    public CookerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COOKER$0 = 
        new javax.xml.namespace.QName("", "Cooker");
    
    
    /**
     * Gets the "Cooker" element
     */
    public java.lang.String getCooker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOKER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cooker" element
     */
    public org.apache.xmlbeans.XmlString xgetCooker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOKER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Cooker" element
     */
    public void setCooker(java.lang.String cooker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOKER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COOKER$0);
            }
            target.setStringValue(cooker);
        }
    }
    
    /**
     * Sets (as xml) the "Cooker" element
     */
    public void xsetCooker(org.apache.xmlbeans.XmlString cooker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOKER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COOKER$0);
            }
            target.set(cooker);
        }
    }
}
