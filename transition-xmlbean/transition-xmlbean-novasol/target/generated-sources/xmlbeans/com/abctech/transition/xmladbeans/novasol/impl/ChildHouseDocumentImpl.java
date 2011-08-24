/*
 * An XML document type.
 * Localname: ChildHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ChildHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ChildHouse(@) element.
 *
 * This is a complex type.
 */
public class ChildHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ChildHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChildHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILDHOUSE$0 = 
        new javax.xml.namespace.QName("", "ChildHouse");
    
    
    /**
     * Gets the "ChildHouse" element
     */
    public java.lang.String getChildHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChildHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetChildHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ChildHouse" element
     */
    public void setChildHouse(java.lang.String childHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDHOUSE$0);
            }
            target.setStringValue(childHouse);
        }
    }
    
    /**
     * Sets (as xml) the "ChildHouse" element
     */
    public void xsetChildHouse(org.apache.xmlbeans.XmlString childHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHILDHOUSE$0);
            }
            target.set(childHouse);
        }
    }
}
