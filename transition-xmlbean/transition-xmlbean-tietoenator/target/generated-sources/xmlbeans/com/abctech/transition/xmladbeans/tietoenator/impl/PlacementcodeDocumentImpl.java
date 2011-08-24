/*
 * An XML document type.
 * Localname: placementcode
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.PlacementcodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one placementcode(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class PlacementcodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.PlacementcodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlacementcodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLACEMENTCODE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "placementcode");
    
    
    /**
     * Gets the "placementcode" element
     */
    public java.lang.String getPlacementcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "placementcode" element
     */
    public org.apache.xmlbeans.XmlString xgetPlacementcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "placementcode" element
     */
    public void setPlacementcode(java.lang.String placementcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEMENTCODE$0);
            }
            target.setStringValue(placementcode);
        }
    }
    
    /**
     * Sets (as xml) the "placementcode" element
     */
    public void xsetPlacementcode(org.apache.xmlbeans.XmlString placementcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACEMENTCODE$0);
            }
            target.set(placementcode);
        }
    }
}
