/*
 * An XML document type.
 * Localname: FLOOR_AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FLOORAREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FLOOR_AREA(@) element.
 *
 * This is a complex type.
 */
public class FLOORAREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FLOORAREADocument
{
    private static final long serialVersionUID = 1L;
    
    public FLOORAREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOORAREA$0 = 
        new javax.xml.namespace.QName("", "FLOOR_AREA");
    
    
    /**
     * Gets the "FLOOR_AREA" element
     */
    public java.lang.String getFLOORAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FLOOR_AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetFLOORAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FLOOR_AREA" element
     */
    public void setFLOORAREA(java.lang.String floorarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOORAREA$0);
            }
            target.setStringValue(floorarea);
        }
    }
    
    /**
     * Sets (as xml) the "FLOOR_AREA" element
     */
    public void xsetFLOORAREA(org.apache.xmlbeans.XmlString floorarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOORAREA$0);
            }
            target.set(floorarea);
        }
    }
}
