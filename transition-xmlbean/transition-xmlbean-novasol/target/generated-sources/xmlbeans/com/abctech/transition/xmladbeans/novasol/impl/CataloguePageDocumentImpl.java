/*
 * An XML document type.
 * Localname: CataloguePage
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CataloguePageDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CataloguePage(@) element.
 *
 * This is a complex type.
 */
public class CataloguePageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CataloguePageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CataloguePageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUEPAGE$0 = 
        new javax.xml.namespace.QName("", "CataloguePage");
    
    
    /**
     * Gets the "CataloguePage" element
     */
    public java.lang.String getCataloguePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CataloguePage" element
     */
    public org.apache.xmlbeans.XmlString xgetCataloguePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUEPAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CataloguePage" element
     */
    public void setCataloguePage(java.lang.String cataloguePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUEPAGE$0);
            }
            target.setStringValue(cataloguePage);
        }
    }
    
    /**
     * Sets (as xml) the "CataloguePage" element
     */
    public void xsetCataloguePage(org.apache.xmlbeans.XmlString cataloguePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUEPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATALOGUEPAGE$0);
            }
            target.set(cataloguePage);
        }
    }
}
