/*
 * An XML document type.
 * Localname: OutdoorFurniture
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.OutdoorFurnitureDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one OutdoorFurniture(@) element.
 *
 * This is a complex type.
 */
public class OutdoorFurnitureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.OutdoorFurnitureDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutdoorFurnitureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTDOORFURNITURE$0 = 
        new javax.xml.namespace.QName("", "OutdoorFurniture");
    
    
    /**
     * Gets the "OutdoorFurniture" element
     */
    public java.lang.String getOutdoorFurniture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDOORFURNITURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OutdoorFurniture" element
     */
    public org.apache.xmlbeans.XmlString xgetOutdoorFurniture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTDOORFURNITURE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OutdoorFurniture" element
     */
    public void setOutdoorFurniture(java.lang.String outdoorFurniture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDOORFURNITURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTDOORFURNITURE$0);
            }
            target.setStringValue(outdoorFurniture);
        }
    }
    
    /**
     * Sets (as xml) the "OutdoorFurniture" element
     */
    public void xsetOutdoorFurniture(org.apache.xmlbeans.XmlString outdoorFurniture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTDOORFURNITURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTDOORFURNITURE$0);
            }
            target.set(outdoorFurniture);
        }
    }
}
