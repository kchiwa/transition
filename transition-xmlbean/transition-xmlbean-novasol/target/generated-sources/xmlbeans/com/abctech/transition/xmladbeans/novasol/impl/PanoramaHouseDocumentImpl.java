/*
 * An XML document type.
 * Localname: PanoramaHouse
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PanoramaHouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PanoramaHouse(@) element.
 *
 * This is a complex type.
 */
public class PanoramaHouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PanoramaHouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PanoramaHouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PANORAMAHOUSE$0 = 
        new javax.xml.namespace.QName("", "PanoramaHouse");
    
    
    /**
     * Gets the "PanoramaHouse" element
     */
    public java.lang.String getPanoramaHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PANORAMAHOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PanoramaHouse" element
     */
    public org.apache.xmlbeans.XmlString xgetPanoramaHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PANORAMAHOUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PanoramaHouse" element
     */
    public void setPanoramaHouse(java.lang.String panoramaHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PANORAMAHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PANORAMAHOUSE$0);
            }
            target.setStringValue(panoramaHouse);
        }
    }
    
    /**
     * Sets (as xml) the "PanoramaHouse" element
     */
    public void xsetPanoramaHouse(org.apache.xmlbeans.XmlString panoramaHouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PANORAMAHOUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PANORAMAHOUSE$0);
            }
            target.set(panoramaHouse);
        }
    }
}
