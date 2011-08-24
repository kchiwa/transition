/*
 * An XML document type.
 * Localname: Tilstandsrapport
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.TilstandsrapportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Tilstandsrapport(@) element.
 *
 * This is a complex type.
 */
public class TilstandsrapportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.TilstandsrapportDocument
{
    private static final long serialVersionUID = 1L;
    
    public TilstandsrapportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TILSTANDSRAPPORT$0 = 
        new javax.xml.namespace.QName("", "Tilstandsrapport");
    
    
    /**
     * Gets the "Tilstandsrapport" element
     */
    public java.lang.String getTilstandsrapport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILSTANDSRAPPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tilstandsrapport" element
     */
    public org.apache.xmlbeans.XmlString xgetTilstandsrapport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILSTANDSRAPPORT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Tilstandsrapport" element
     */
    public void setTilstandsrapport(java.lang.String tilstandsrapport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILSTANDSRAPPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TILSTANDSRAPPORT$0);
            }
            target.setStringValue(tilstandsrapport);
        }
    }
    
    /**
     * Sets (as xml) the "Tilstandsrapport" element
     */
    public void xsetTilstandsrapport(org.apache.xmlbeans.XmlString tilstandsrapport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILSTANDSRAPPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TILSTANDSRAPPORT$0);
            }
            target.set(tilstandsrapport);
        }
    }
}
