/*
 * An XML document type.
 * Localname: AreaName
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AreaNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one AreaName(@) element.
 *
 * This is a complex type.
 */
public class AreaNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AreaNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREANAME$0 = 
        new javax.xml.namespace.QName("", "AreaName");
    
    
    /**
     * Gets the "AreaName" element
     */
    public java.lang.String getAreaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREANAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AreaName" element
     */
    public org.apache.xmlbeans.XmlString xgetAreaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREANAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AreaName" element
     */
    public void setAreaName(java.lang.String areaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREANAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREANAME$0);
            }
            target.setStringValue(areaName);
        }
    }
    
    /**
     * Sets (as xml) the "AreaName" element
     */
    public void xsetAreaName(org.apache.xmlbeans.XmlString areaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREANAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREANAME$0);
            }
            target.set(areaName);
        }
    }
}
