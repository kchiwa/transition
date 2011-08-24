/*
 * An XML document type.
 * Localname: Catalogue
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CatalogueDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Catalogue(@) element.
 *
 * This is a complex type.
 */
public class CatalogueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CatalogueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatalogueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUE$0 = 
        new javax.xml.namespace.QName("", "Catalogue");
    
    
    /**
     * Gets the "Catalogue" element
     */
    public com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue getCatalogue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue)get_store().find_element_user(CATALOGUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Catalogue" element
     */
    public void setCatalogue(com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue catalogue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue)get_store().find_element_user(CATALOGUE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue)get_store().add_element_user(CATALOGUE$0);
            }
            target.set(catalogue);
        }
    }
    
    /**
     * Appends and returns a new empty "Catalogue" element
     */
    public com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue addNewCatalogue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue)get_store().add_element_user(CATALOGUE$0);
            return target;
        }
    }
    /**
     * An XML Catalogue(@).
     *
     * This is a complex type.
     */
    public static class CatalogueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CatalogueDocument.Catalogue
    {
        private static final long serialVersionUID = 1L;
        
        public CatalogueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATALOGUEID$0 = 
            new javax.xml.namespace.QName("", "CatalogueID");
        private static final javax.xml.namespace.QName CATALOGUEPAGENUMBER$2 = 
            new javax.xml.namespace.QName("", "CataloguePagenumber");
        private static final javax.xml.namespace.QName CATALOGUENAME$4 = 
            new javax.xml.namespace.QName("", "CatalogueName");
        
        
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
        
        /**
         * Gets the "CataloguePagenumber" element
         */
        public java.math.BigInteger getCataloguePagenumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGENUMBER$2, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEPAGENUMBER$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGENUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUEPAGENUMBER$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CATALOGUEPAGENUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CATALOGUEPAGENUMBER$2);
                }
                target.set(cataloguePagenumber);
            }
        }
        
        /**
         * Gets the "CatalogueName" element
         */
        public java.lang.String getCatalogueName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUENAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUENAME$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUENAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATALOGUENAME$4);
                }
                target.set(catalogueName);
            }
        }
    }
}
