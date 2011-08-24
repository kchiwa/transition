/*
 * An XML document type.
 * Localname: product_paper
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one product_paper(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class ProductPaperDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductPaperDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTPAPER$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "product_paper");
    
    
    /**
     * Gets the "product_paper" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper getProductPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().find_element_user(PRODUCTPAPER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "product_paper" element
     */
    public void setProductPaper(com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper productPaper)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().find_element_user(PRODUCTPAPER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().add_element_user(PRODUCTPAPER$0);
            }
            target.set(productPaper);
        }
    }
    
    /**
     * Appends and returns a new empty "product_paper" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper addNewProductPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().add_element_user(PRODUCTPAPER$0);
            return target;
        }
    }
    /**
     * An XML product_paper(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class ProductPaperImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper
    {
        private static final long serialVersionUID = 1L;
        
        public ProductPaperImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "code");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "name");
        
        
        /**
         * Gets the "code" element
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" element
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
                }
                target.set(code);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
