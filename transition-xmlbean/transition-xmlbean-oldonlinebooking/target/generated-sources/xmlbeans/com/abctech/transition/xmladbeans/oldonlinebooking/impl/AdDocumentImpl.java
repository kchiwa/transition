/*
 * An XML document type.
 * Localname: ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one ad(@) element.
 *
 * This is a complex type.
 */
public class AdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AD$0 = 
        new javax.xml.namespace.QName("", "ad");
    
    
    /**
     * Gets the "ad" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad getAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ad" element
     */
    public void setAd(com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad ad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().add_element_user(AD$0);
            }
            target.set(ad);
        }
    }
    
    /**
     * Appends and returns a new empty "ad" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad addNewAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().add_element_user(AD$0);
            return target;
        }
    }
    /**
     * An XML ad(@).
     *
     * This is a complex type.
     */
    public static class AdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad
    {
        private static final long serialVersionUID = 1L;
        
        public AdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATOR$0 = 
            new javax.xml.namespace.QName("", "creator");
        private static final javax.xml.namespace.QName PAPERPRODUCT$2 = 
            new javax.xml.namespace.QName("", "paper_product");
        private static final javax.xml.namespace.QName CUSTOMER$4 = 
            new javax.xml.namespace.QName("", "customer");
        private static final javax.xml.namespace.QName OBJECT$6 = 
            new javax.xml.namespace.QName("", "object");
        private static final javax.xml.namespace.QName IDSOURCE$8 = 
            new javax.xml.namespace.QName("", "id_source");
        private static final javax.xml.namespace.QName ADID$10 = 
            new javax.xml.namespace.QName("", "ad_id");
        private static final javax.xml.namespace.QName CREATED$12 = 
            new javax.xml.namespace.QName("", "created");
        private static final javax.xml.namespace.QName MODIFIED$14 = 
            new javax.xml.namespace.QName("", "modified");
        private static final javax.xml.namespace.QName DELETED$16 = 
            new javax.xml.namespace.QName("", "deleted");
        
        
        /**
         * Gets the "creator" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator getCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creator" element
         */
        public void setCreator(com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator creator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().add_element_user(CREATOR$0);
                }
                target.set(creator);
            }
        }
        
        /**
         * Appends and returns a new empty "creator" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator addNewCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator)get_store().add_element_user(CREATOR$0);
                return target;
            }
        }
        
        /**
         * Gets the "paper_product" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct getPaperProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct)get_store().find_element_user(PAPERPRODUCT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "paper_product" element
         */
        public void setPaperProduct(com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct paperProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct)get_store().find_element_user(PAPERPRODUCT$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct)get_store().add_element_user(PAPERPRODUCT$2);
                }
                target.set(paperProduct);
            }
        }
        
        /**
         * Appends and returns a new empty "paper_product" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct addNewPaperProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct)get_store().add_element_user(PAPERPRODUCT$2);
                return target;
            }
        }
        
        /**
         * Gets the "customer" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer getCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "customer" element
         */
        public void setCustomer(com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer customer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$4);
                }
                target.set(customer);
            }
        }
        
        /**
         * Appends and returns a new empty "customer" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer addNewCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$4);
                return target;
            }
        }
        
        /**
         * Gets the "object" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object getObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().find_element_user(OBJECT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "object" element
         */
        public void setObject(com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().find_element_user(OBJECT$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().add_element_user(OBJECT$6);
                }
                target.set(object);
            }
        }
        
        /**
         * Appends and returns a new empty "object" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object addNewObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().add_element_user(OBJECT$6);
                return target;
            }
        }
        
        /**
         * Gets the "id_source" attribute
         */
        public java.lang.String getIdSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSOURCE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id_source" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSOURCE$8);
                return target;
            }
        }
        
        /**
         * True if has "id_source" attribute
         */
        public boolean isSetIdSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDSOURCE$8) != null;
            }
        }
        
        /**
         * Sets the "id_source" attribute
         */
        public void setIdSource(java.lang.String idSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSOURCE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSOURCE$8);
                }
                target.setStringValue(idSource);
            }
        }
        
        /**
         * Sets (as xml) the "id_source" attribute
         */
        public void xsetIdSource(org.apache.xmlbeans.XmlString idSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSOURCE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDSOURCE$8);
                }
                target.set(idSource);
            }
        }
        
        /**
         * Unsets the "id_source" attribute
         */
        public void unsetIdSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDSOURCE$8);
            }
        }
        
        /**
         * Gets the "ad_id" attribute
         */
        public java.lang.String getAdId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADID$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ad_id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADID$10);
                return target;
            }
        }
        
        /**
         * True if has "ad_id" attribute
         */
        public boolean isSetAdId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADID$10) != null;
            }
        }
        
        /**
         * Sets the "ad_id" attribute
         */
        public void setAdId(java.lang.String adId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADID$10);
                }
                target.setStringValue(adId);
            }
        }
        
        /**
         * Sets (as xml) the "ad_id" attribute
         */
        public void xsetAdId(org.apache.xmlbeans.XmlString adId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADID$10);
                }
                target.set(adId);
            }
        }
        
        /**
         * Unsets the "ad_id" attribute
         */
        public void unsetAdId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADID$10);
            }
        }
        
        /**
         * Gets the "created" attribute
         */
        public java.lang.String getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "created" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATED$12);
                return target;
            }
        }
        
        /**
         * True if has "created" attribute
         */
        public boolean isSetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATED$12) != null;
            }
        }
        
        /**
         * Sets the "created" attribute
         */
        public void setCreated(java.lang.String created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATED$12);
                }
                target.setStringValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "created" attribute
         */
        public void xsetCreated(org.apache.xmlbeans.XmlString created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATED$12);
                }
                target.set(created);
            }
        }
        
        /**
         * Unsets the "created" attribute
         */
        public void unsetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATED$12);
            }
        }
        
        /**
         * Gets the "modified" attribute
         */
        public java.lang.String getModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "modified" attribute
         */
        public org.apache.xmlbeans.XmlString xgetModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODIFIED$14);
                return target;
            }
        }
        
        /**
         * True if has "modified" attribute
         */
        public boolean isSetModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODIFIED$14) != null;
            }
        }
        
        /**
         * Sets the "modified" attribute
         */
        public void setModified(java.lang.String modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODIFIED$14);
                }
                target.setStringValue(modified);
            }
        }
        
        /**
         * Sets (as xml) the "modified" attribute
         */
        public void xsetModified(org.apache.xmlbeans.XmlString modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODIFIED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODIFIED$14);
                }
                target.set(modified);
            }
        }
        
        /**
         * Unsets the "modified" attribute
         */
        public void unsetModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODIFIED$14);
            }
        }
        
        /**
         * Gets the "deleted" attribute
         */
        public java.lang.String getDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deleted" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELETED$16);
                return target;
            }
        }
        
        /**
         * True if has "deleted" attribute
         */
        public boolean isSetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELETED$16) != null;
            }
        }
        
        /**
         * Sets the "deleted" attribute
         */
        public void setDeleted(java.lang.String deleted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETED$16);
                }
                target.setStringValue(deleted);
            }
        }
        
        /**
         * Sets (as xml) the "deleted" attribute
         */
        public void xsetDeleted(org.apache.xmlbeans.XmlString deleted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELETED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELETED$16);
                }
                target.set(deleted);
            }
        }
        
        /**
         * Unsets the "deleted" attribute
         */
        public void unsetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELETED$16);
            }
        }
    }
}
