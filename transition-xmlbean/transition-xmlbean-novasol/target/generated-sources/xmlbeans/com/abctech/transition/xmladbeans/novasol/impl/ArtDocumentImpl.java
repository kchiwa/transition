/*
 * An XML document type.
 * Localname: Art
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ArtDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Art(@) element.
 *
 * This is a complex type.
 */
public class ArtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ArtDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ART$0 = 
        new javax.xml.namespace.QName("", "Art");
    
    
    /**
     * Gets the "Art" element
     */
    public java.lang.String getArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Art" element
     */
    public org.apache.xmlbeans.XmlString xgetArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ART$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Art" element
     */
    public void setArt(java.lang.String art)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ART$0);
            }
            target.setStringValue(art);
        }
    }
    
    /**
     * Sets (as xml) the "Art" element
     */
    public void xsetArt(org.apache.xmlbeans.XmlString art)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ART$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ART$0);
            }
            target.set(art);
        }
    }
}
