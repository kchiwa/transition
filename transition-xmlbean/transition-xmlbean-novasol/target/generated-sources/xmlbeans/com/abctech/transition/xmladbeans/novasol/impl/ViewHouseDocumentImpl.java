/*
 * An XML document type.
 * Localname: ViewHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ViewHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ViewHouse(@) element.
 *
 * This is a complex type.
 */
public class ViewHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ViewHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWHOUSE$0 = 
        new javax.xml.namespace.QName("", "ViewHouse");
    
    
    /**
     * Gets the "ViewHouse" element
     */
    public java.lang.String getViewHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ViewHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetViewHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ViewHouse" element
     */
    public void setViewHouse(java.lang.String viewHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWHOUSE$0);
            }
            target.setStringValue(viewHouse);
        }
    }
    
    /**
     * Sets (as xml) the "ViewHouse" element
     */
    public void xsetViewHouse(org.apache.xmlbeans.XmlString viewHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWHOUSE$0);
            }
            target.set(viewHouse);
        }
    }
}
