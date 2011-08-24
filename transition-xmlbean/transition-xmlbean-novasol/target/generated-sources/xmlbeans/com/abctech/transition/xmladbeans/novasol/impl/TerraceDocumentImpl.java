/*
 * An XML document type.
 * Localname: Terrace
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TerraceDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Terrace(@) element.
 *
 * This is a complex type.
 */
public class TerraceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TerraceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerraceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERRACE$0 = 
        new javax.xml.namespace.QName("", "Terrace");
    
    
    /**
     * Gets the "Terrace" element
     */
    public java.lang.String getTerrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERRACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Terrace" element
     */
    public org.apache.xmlbeans.XmlString xgetTerrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERRACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Terrace" element
     */
    public void setTerrace(java.lang.String terrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERRACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERRACE$0);
            }
            target.setStringValue(terrace);
        }
    }
    
    /**
     * Sets (as xml) the "Terrace" element
     */
    public void xsetTerrace(org.apache.xmlbeans.XmlString terrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERRACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERRACE$0);
            }
            target.set(terrace);
        }
    }
}
