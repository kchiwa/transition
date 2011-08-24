/*
 * An XML document type.
 * Localname: CatalogueID
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CatalogueIDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CatalogueID(@) element.
 *
 * This is a complex type.
 */
public class CatalogueIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CatalogueIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatalogueIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUEID$0 = 
        new javax.xml.namespace.QName("", "CatalogueID");
    
    
    /**
     * Gets the "CatalogueID" element
     */
    public java.math.BigInteger getCatalogueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CatalogueID" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCatalogueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CatalogueID" element
     */
    public void setCatalogueID(java.math.BigInteger catalogueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUEID$0);
            }
            target.setBigIntegerValue(catalogueID);
        }
    }
    
    /**
     * Sets (as xml) the "CatalogueID" element
     */
    public void xsetCatalogueID(org.apache.xmlbeans.XmlInteger catalogueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CATALOGUEID$0);
            }
            target.set(catalogueID);
        }
    }
}
