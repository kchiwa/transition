/*
 * An XML document type.
 * Localname: product_paper_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one product_paper_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class ProductPaperListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductPaperListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTPAPERLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "product_paper_list");
    
    
    /**
     * Gets the "product_paper_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList getProductPaperList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().find_element_user(PRODUCTPAPERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "product_paper_list" element
     */
    public void setProductPaperList(com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList productPaperList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().find_element_user(PRODUCTPAPERLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().add_element_user(PRODUCTPAPERLIST$0);
            }
            target.set(productPaperList);
        }
    }
    
    /**
     * Appends and returns a new empty "product_paper_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList addNewProductPaperList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().add_element_user(PRODUCTPAPERLIST$0);
            return target;
        }
    }
    /**
     * An XML product_paper_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class ProductPaperListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList
    {
        private static final long serialVersionUID = 1L;
        
        public ProductPaperListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTPAPER$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "product_paper");
        
        
        /**
         * Gets array of all "product_paper" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper[] getProductPaperArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRODUCTPAPER$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper[] result = new com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "product_paper" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper getProductPaperArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().find_element_user(PRODUCTPAPER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "product_paper" element
         */
        public int sizeOfProductPaperArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTPAPER$0);
            }
        }
        
        /**
         * Sets array of all "product_paper" element
         */
        public void setProductPaperArray(com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper[] productPaperArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(productPaperArray, PRODUCTPAPER$0);
            }
        }
        
        /**
         * Sets ith "product_paper" element
         */
        public void setProductPaperArray(int i, com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper productPaper)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().find_element_user(PRODUCTPAPER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(productPaper);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "product_paper" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper insertNewProductPaper(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperDocument.ProductPaper)get_store().insert_element_user(PRODUCTPAPER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "product_paper" element
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
         * Removes the ith "product_paper" element
         */
        public void removeProductPaper(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTPAPER$0, i);
            }
        }
    }
}
