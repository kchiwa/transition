/*
 * An XML document type.
 * Localname: weborder
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.WeborderDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one weborder(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class WeborderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.WeborderDocument
{
    private static final long serialVersionUID = 1L;
    
    public WeborderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBORDER$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "weborder");
    
    
    /**
     * Gets the "weborder" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder getWeborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().find_element_user(WEBORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "weborder" element
     */
    public void setWeborder(com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder weborder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().find_element_user(WEBORDER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().add_element_user(WEBORDER$0);
            }
            target.set(weborder);
        }
    }
    
    /**
     * Appends and returns a new empty "weborder" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder addNewWeborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder)get_store().add_element_user(WEBORDER$0);
            return target;
        }
    }
    /**
     * An XML weborder(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class WeborderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder
    {
        private static final long serialVersionUID = 1L;
        
        public WeborderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "status");
        private static final javax.xml.namespace.QName ORDERNUMBER$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "ordernumber");
        private static final javax.xml.namespace.QName ORDERCREATED$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "order_created");
        private static final javax.xml.namespace.QName ORDERMODIFIED$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "order_modified");
        private static final javax.xml.namespace.QName ORDERPLACEMENTCODE$8 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "orderplacementcode");
        private static final javax.xml.namespace.QName ADRESULTED$10 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "adresulted");
        private static final javax.xml.namespace.QName PRODUCTPAPERLIST$12 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "product_paper_list");
        private static final javax.xml.namespace.QName PRODUCTWEB$14 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "product_web");
        private static final javax.xml.namespace.QName SALESPERSON$16 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "salesperson");
        private static final javax.xml.namespace.QName STARTDATE$18 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "startdate");
        private static final javax.xml.namespace.QName ENDDATE$20 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "enddate");
        private static final javax.xml.namespace.QName CUSTOMERLIST$22 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "customer_list");
        private static final javax.xml.namespace.QName PDFFILENAME$24 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "pdffile_name");
        private static final javax.xml.namespace.QName ADSORIGINALLIST$26 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_list");
        
        
        /**
         * Gets the "status" element
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "ordernumber" element
         */
        public java.lang.String getOrdernumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ordernumber" element
         */
        public org.apache.xmlbeans.XmlString xgetOrdernumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ordernumber" element
         */
        public void setOrdernumber(java.lang.String ordernumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$2);
                }
                target.setStringValue(ordernumber);
            }
        }
        
        /**
         * Sets (as xml) the "ordernumber" element
         */
        public void xsetOrdernumber(org.apache.xmlbeans.XmlString ordernumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$2);
                }
                target.set(ordernumber);
            }
        }
        
        /**
         * Gets the "order_created" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated getOrderCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().find_element_user(ORDERCREATED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "order_created" element
         */
        public boolean isSetOrderCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERCREATED$4) != 0;
            }
        }
        
        /**
         * Sets the "order_created" element
         */
        public void setOrderCreated(com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated orderCreated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().find_element_user(ORDERCREATED$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().add_element_user(ORDERCREATED$4);
                }
                target.set(orderCreated);
            }
        }
        
        /**
         * Appends and returns a new empty "order_created" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated addNewOrderCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().add_element_user(ORDERCREATED$4);
                return target;
            }
        }
        
        /**
         * Unsets the "order_created" element
         */
        public void unsetOrderCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERCREATED$4, 0);
            }
        }
        
        /**
         * Gets the "order_modified" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified getOrderModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().find_element_user(ORDERMODIFIED$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "order_modified" element
         */
        public boolean isSetOrderModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERMODIFIED$6) != 0;
            }
        }
        
        /**
         * Sets the "order_modified" element
         */
        public void setOrderModified(com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified orderModified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().find_element_user(ORDERMODIFIED$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().add_element_user(ORDERMODIFIED$6);
                }
                target.set(orderModified);
            }
        }
        
        /**
         * Appends and returns a new empty "order_modified" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified addNewOrderModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().add_element_user(ORDERMODIFIED$6);
                return target;
            }
        }
        
        /**
         * Unsets the "order_modified" element
         */
        public void unsetOrderModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERMODIFIED$6, 0);
            }
        }
        
        /**
         * Gets the "orderplacementcode" element
         */
        public java.lang.String getOrderplacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPLACEMENTCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orderplacementcode" element
         */
        public org.apache.xmlbeans.XmlString xgetOrderplacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPLACEMENTCODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "orderplacementcode" element
         */
        public boolean isSetOrderplacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERPLACEMENTCODE$8) != 0;
            }
        }
        
        /**
         * Sets the "orderplacementcode" element
         */
        public void setOrderplacementcode(java.lang.String orderplacementcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPLACEMENTCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERPLACEMENTCODE$8);
                }
                target.setStringValue(orderplacementcode);
            }
        }
        
        /**
         * Sets (as xml) the "orderplacementcode" element
         */
        public void xsetOrderplacementcode(org.apache.xmlbeans.XmlString orderplacementcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPLACEMENTCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERPLACEMENTCODE$8);
                }
                target.set(orderplacementcode);
            }
        }
        
        /**
         * Unsets the "orderplacementcode" element
         */
        public void unsetOrderplacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERPLACEMENTCODE$8, 0);
            }
        }
        
        /**
         * Gets the "adresulted" element
         */
        public java.lang.String getAdresulted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRESULTED$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adresulted" element
         */
        public org.apache.xmlbeans.XmlString xgetAdresulted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADRESULTED$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "adresulted" element
         */
        public boolean isSetAdresulted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADRESULTED$10) != 0;
            }
        }
        
        /**
         * Sets the "adresulted" element
         */
        public void setAdresulted(java.lang.String adresulted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRESULTED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADRESULTED$10);
                }
                target.setStringValue(adresulted);
            }
        }
        
        /**
         * Sets (as xml) the "adresulted" element
         */
        public void xsetAdresulted(org.apache.xmlbeans.XmlString adresulted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADRESULTED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADRESULTED$10);
                }
                target.set(adresulted);
            }
        }
        
        /**
         * Unsets the "adresulted" element
         */
        public void unsetAdresulted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADRESULTED$10, 0);
            }
        }
        
        /**
         * Gets the "product_paper_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList getProductPaperList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().find_element_user(PRODUCTPAPERLIST$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "product_paper_list" element
         */
        public boolean isSetProductPaperList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTPAPERLIST$12) != 0;
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
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().find_element_user(PRODUCTPAPERLIST$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().add_element_user(PRODUCTPAPERLIST$12);
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
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList)get_store().add_element_user(PRODUCTPAPERLIST$12);
                return target;
            }
        }
        
        /**
         * Unsets the "product_paper_list" element
         */
        public void unsetProductPaperList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTPAPERLIST$12, 0);
            }
        }
        
        /**
         * Gets the "product_web" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb getProductWeb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().find_element_user(PRODUCTWEB$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "product_web" element
         */
        public boolean isSetProductWeb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTWEB$14) != 0;
            }
        }
        
        /**
         * Sets the "product_web" element
         */
        public void setProductWeb(com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb productWeb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().find_element_user(PRODUCTWEB$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().add_element_user(PRODUCTWEB$14);
                }
                target.set(productWeb);
            }
        }
        
        /**
         * Appends and returns a new empty "product_web" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb addNewProductWeb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().add_element_user(PRODUCTWEB$14);
                return target;
            }
        }
        
        /**
         * Unsets the "product_web" element
         */
        public void unsetProductWeb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTWEB$14, 0);
            }
        }
        
        /**
         * Gets the "salesperson" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson getSalesperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson)get_store().find_element_user(SALESPERSON$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "salesperson" element
         */
        public boolean isSetSalesperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SALESPERSON$16) != 0;
            }
        }
        
        /**
         * Sets the "salesperson" element
         */
        public void setSalesperson(com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson salesperson)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson)get_store().find_element_user(SALESPERSON$16, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson)get_store().add_element_user(SALESPERSON$16);
                }
                target.set(salesperson);
            }
        }
        
        /**
         * Appends and returns a new empty "salesperson" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson addNewSalesperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson)get_store().add_element_user(SALESPERSON$16);
                return target;
            }
        }
        
        /**
         * Unsets the "salesperson" element
         */
        public void unsetSalesperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SALESPERSON$16, 0);
            }
        }
        
        /**
         * Gets the "startdate" element
         */
        public java.lang.String getStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startdate" element
         */
        public org.apache.xmlbeans.XmlString xgetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "startdate" element
         */
        public boolean isSetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$18) != 0;
            }
        }
        
        /**
         * Sets the "startdate" element
         */
        public void setStartdate(java.lang.String startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$18);
                }
                target.setStringValue(startdate);
            }
        }
        
        /**
         * Sets (as xml) the "startdate" element
         */
        public void xsetStartdate(org.apache.xmlbeans.XmlString startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$18);
                }
                target.set(startdate);
            }
        }
        
        /**
         * Unsets the "startdate" element
         */
        public void unsetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$18, 0);
            }
        }
        
        /**
         * Gets the "enddate" element
         */
        public java.lang.String getEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "enddate" element
         */
        public org.apache.xmlbeans.XmlString xgetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "enddate" element
         */
        public boolean isSetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$20) != 0;
            }
        }
        
        /**
         * Sets the "enddate" element
         */
        public void setEnddate(java.lang.String enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$20);
                }
                target.setStringValue(enddate);
            }
        }
        
        /**
         * Sets (as xml) the "enddate" element
         */
        public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$20);
                }
                target.set(enddate);
            }
        }
        
        /**
         * Unsets the "enddate" element
         */
        public void unsetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$20, 0);
            }
        }
        
        /**
         * Gets the "customer_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList getCustomerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().find_element_user(CUSTOMERLIST$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "customer_list" element
         */
        public boolean isSetCustomerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOMERLIST$22) != 0;
            }
        }
        
        /**
         * Sets the "customer_list" element
         */
        public void setCustomerList(com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList customerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().find_element_user(CUSTOMERLIST$22, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().add_element_user(CUSTOMERLIST$22);
                }
                target.set(customerList);
            }
        }
        
        /**
         * Appends and returns a new empty "customer_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList addNewCustomerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().add_element_user(CUSTOMERLIST$22);
                return target;
            }
        }
        
        /**
         * Unsets the "customer_list" element
         */
        public void unsetCustomerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOMERLIST$22, 0);
            }
        }
        
        /**
         * Gets the "pdffile_name" element
         */
        public java.lang.String getPdffileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFFILENAME$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pdffile_name" element
         */
        public org.apache.xmlbeans.XmlString xgetPdffileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFFILENAME$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "pdffile_name" element
         */
        public boolean isSetPdffileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PDFFILENAME$24) != 0;
            }
        }
        
        /**
         * Sets the "pdffile_name" element
         */
        public void setPdffileName(java.lang.String pdffileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFFILENAME$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PDFFILENAME$24);
                }
                target.setStringValue(pdffileName);
            }
        }
        
        /**
         * Sets (as xml) the "pdffile_name" element
         */
        public void xsetPdffileName(org.apache.xmlbeans.XmlString pdffileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFFILENAME$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDFFILENAME$24);
                }
                target.set(pdffileName);
            }
        }
        
        /**
         * Unsets the "pdffile_name" element
         */
        public void unsetPdffileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PDFFILENAME$24, 0);
            }
        }
        
        /**
         * Gets the "adsoriginal_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList getAdsoriginalList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().find_element_user(ADSORIGINALLIST$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "adsoriginal_list" element
         */
        public boolean isSetAdsoriginalList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADSORIGINALLIST$26) != 0;
            }
        }
        
        /**
         * Sets the "adsoriginal_list" element
         */
        public void setAdsoriginalList(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList adsoriginalList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().find_element_user(ADSORIGINALLIST$26, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().add_element_user(ADSORIGINALLIST$26);
                }
                target.set(adsoriginalList);
            }
        }
        
        /**
         * Appends and returns a new empty "adsoriginal_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList addNewAdsoriginalList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().add_element_user(ADSORIGINALLIST$26);
                return target;
            }
        }
        
        /**
         * Unsets the "adsoriginal_list" element
         */
        public void unsetAdsoriginalList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADSORIGINALLIST$26, 0);
            }
        }
    }
}
