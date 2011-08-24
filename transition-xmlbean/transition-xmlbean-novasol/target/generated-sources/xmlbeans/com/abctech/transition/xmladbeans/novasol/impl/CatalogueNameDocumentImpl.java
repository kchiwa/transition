/*
 * An XML document type.
 * Localname: CatalogueName
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CatalogueNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CatalogueName(@) element.
 *
 * This is a complex type.
 */
public class CatalogueNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CatalogueNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatalogueNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUENAME$0 = 
        new javax.xml.namespace.QName("", "CatalogueName");
    
    
    /**
     * Gets the "CatalogueName" element
     */
    public java.lang.String getCatalogueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CatalogueName" element
     */
    public org.apache.xmlbeans.XmlString xgetCatalogueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CatalogueName" element
     */
    public void setCatalogueName(java.lang.String catalogueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUENAME$0);
            }
            target.setStringValue(catalogueName);
        }
    }
    
    /**
     * Sets (as xml) the "CatalogueName" element
     */
    public void xsetCatalogueName(org.apache.xmlbeans.XmlString catalogueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATALOGUENAME$0);
            }
            target.set(catalogueName);
        }
    }
}
