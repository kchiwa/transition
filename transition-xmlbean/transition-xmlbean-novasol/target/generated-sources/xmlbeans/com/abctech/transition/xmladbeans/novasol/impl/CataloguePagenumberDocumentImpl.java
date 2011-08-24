/*
 * An XML document type.
 * Localname: CataloguePagenumber
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CataloguePagenumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CataloguePagenumber(@) element.
 *
 * This is a complex type.
 */
public class CataloguePagenumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CataloguePagenumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public CataloguePagenumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUEPAGENUMBER$0 = 
        new javax.xml.namespace.QName("", "CataloguePagenumber");
    
    
    /**
     * Gets the "CataloguePagenumber" element
     */
    public java.math.BigInteger getCataloguePagenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CataloguePagenumber" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCataloguePagenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEPAGENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CataloguePagenumber" element
     */
    public void setCataloguePagenumber(java.math.BigInteger cataloguePagenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUEPAGENUMBER$0);
            }
            target.setBigIntegerValue(cataloguePagenumber);
        }
    }
    
    /**
     * Sets (as xml) the "CataloguePagenumber" element
     */
    public void xsetCataloguePagenumber(org.apache.xmlbeans.XmlInteger cataloguePagenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CATALOGUEPAGENUMBER$0);
            }
            target.set(cataloguePagenumber);
        }
    }
}
