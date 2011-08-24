/*
 * An XML document type.
 * Localname: Fridge
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FridgeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Fridge(@) element.
 *
 * This is a complex type.
 */
public class FridgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FridgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FridgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRIDGE$0 = 
        new javax.xml.namespace.QName("", "Fridge");
    
    
    /**
     * Gets the "Fridge" element
     */
    public java.lang.String getFridge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fridge" element
     */
    public org.apache.xmlbeans.XmlString xgetFridge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIDGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Fridge" element
     */
    public void setFridge(java.lang.String fridge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIDGE$0);
            }
            target.setStringValue(fridge);
        }
    }
    
    /**
     * Sets (as xml) the "Fridge" element
     */
    public void xsetFridge(org.apache.xmlbeans.XmlString fridge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIDGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIDGE$0);
            }
            target.set(fridge);
        }
    }
}
