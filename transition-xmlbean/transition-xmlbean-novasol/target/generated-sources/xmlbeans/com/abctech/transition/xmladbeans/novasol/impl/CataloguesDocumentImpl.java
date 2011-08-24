/*
 * An XML document type.
 * Localname: Catalogues
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CataloguesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Catalogues(@) element.
 *
 * This is a complex type.
 */
public class CataloguesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CataloguesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CataloguesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGUES$0 = 
        new javax.xml.namespace.QName("", "Catalogues");
    
    
    /**
     * Gets the "Catalogues" element
     */
    public com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues getCatalogues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().find_element_user(CATALOGUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Catalogues" element
     */
    public void setCatalogues(com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues catalogues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().find_element_user(CATALOGUES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().add_element_user(CATALOGUES$0);
            }
            target.set(catalogues);
        }
    }
    
    /**
     * Appends and returns a new empty "Catalogues" element
     */
    public com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues addNewCatalogues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
            target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().add_element_user(CATALOGUES$0);
            return target;
        }
    }
    /**
     * An XML Catalogues(@).
     *
     * This is a complex type.
     */
    public static class CataloguesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues
    {
        private static final long serialVersionUID = 1L;
        
        public CataloguesImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
