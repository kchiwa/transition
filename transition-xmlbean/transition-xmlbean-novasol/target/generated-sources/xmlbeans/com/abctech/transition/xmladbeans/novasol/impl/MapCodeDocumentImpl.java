/*
 * An XML document type.
 * Localname: MapCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MapCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MapCode(@) element.
 *
 * This is a complex type.
 */
public class MapCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MapCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MapCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPCODE$0 = 
        new javax.xml.namespace.QName("", "MapCode");
    
    
    /**
     * Gets the "MapCode" element
     */
    public java.lang.String getMapCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMapCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapCode" element
     */
    public void setMapCode(java.lang.String mapCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPCODE$0);
            }
            target.setStringValue(mapCode);
        }
    }
    
    /**
     * Sets (as xml) the "MapCode" element
     */
    public void xsetMapCode(org.apache.xmlbeans.XmlString mapCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPCODE$0);
            }
            target.set(mapCode);
        }
    }
}
