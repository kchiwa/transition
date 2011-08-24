/*
 * An XML document type.
 * Localname: GEO_ACCURACY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GEOACCURACYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GEO_ACCURACY(@) element.
 *
 * This is a complex type.
 */
public class GEOACCURACYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GEOACCURACYDocument
{
    private static final long serialVersionUID = 1L;
    
    public GEOACCURACYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOACCURACY$0 = 
        new javax.xml.namespace.QName("", "GEO_ACCURACY");
    
    
    /**
     * Gets the "GEO_ACCURACY" element
     */
    public java.lang.String getGEOACCURACY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GEO_ACCURACY" element
     */
    public org.apache.xmlbeans.XmlString xgetGEOACCURACY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOACCURACY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GEO_ACCURACY" element
     */
    public void setGEOACCURACY(java.lang.String geoaccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOACCURACY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOACCURACY$0);
            }
            target.setStringValue(geoaccuracy);
        }
    }
    
    /**
     * Sets (as xml) the "GEO_ACCURACY" element
     */
    public void xsetGEOACCURACY(org.apache.xmlbeans.XmlString geoaccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOACCURACY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOACCURACY$0);
            }
            target.set(geoaccuracy);
        }
    }
}
