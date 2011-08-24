/*
 * An XML document type.
 * Localname: Bilde
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BildeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Bilde(@) element.
 *
 * This is a complex type.
 */
public class BildeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BildeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BildeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILDE$0 = 
        new javax.xml.namespace.QName("", "Bilde");
    
    
    /**
     * Gets the "Bilde" element
     */
    public com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde getBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde)get_store().find_element_user(BILDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bilde" element
     */
    public void setBilde(com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde bilde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde)get_store().find_element_user(BILDE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde)get_store().add_element_user(BILDE$0);
            }
            target.set(bilde);
        }
    }
    
    /**
     * Appends and returns a new empty "Bilde" element
     */
    public com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde addNewBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde)get_store().add_element_user(BILDE$0);
            return target;
        }
    }
    /**
     * An XML Bilde(@).
     *
     * This is a complex type.
     */
    public static class BildeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BildeDocument.Bilde
    {
        private static final long serialVersionUID = 1L;
        
        public BildeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BILDE$0 = 
            new javax.xml.namespace.QName("", "bilde");
        private static final javax.xml.namespace.QName PRIORITET$2 = 
            new javax.xml.namespace.QName("", "prioritet");
        private static final javax.xml.namespace.QName MD5$4 = 
            new javax.xml.namespace.QName("", "md5");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        
        
        /**
         * Gets the "bilde" attribute
         */
        public java.lang.String getBilde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BILDE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bilde" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBilde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BILDE$0);
                return target;
            }
        }
        
        /**
         * Sets the "bilde" attribute
         */
        public void setBilde(java.lang.String bilde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BILDE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BILDE$0);
                }
                target.setStringValue(bilde);
            }
        }
        
        /**
         * Sets (as xml) the "bilde" attribute
         */
        public void xsetBilde(org.apache.xmlbeans.XmlString bilde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BILDE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BILDE$0);
                }
                target.set(bilde);
            }
        }
        
        /**
         * Gets the "prioritet" attribute
         */
        public java.lang.String getPrioritet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITET$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prioritet" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPrioritet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITET$2);
                return target;
            }
        }
        
        /**
         * Sets the "prioritet" attribute
         */
        public void setPrioritet(java.lang.String prioritet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITET$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITET$2);
                }
                target.setStringValue(prioritet);
            }
        }
        
        /**
         * Sets (as xml) the "prioritet" attribute
         */
        public void xsetPrioritet(org.apache.xmlbeans.XmlString prioritet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITET$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIORITET$2);
                }
                target.set(prioritet);
            }
        }
        
        /**
         * Gets the "md5" attribute
         */
        public java.lang.String getMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "md5" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMd5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$4);
                return target;
            }
        }
        
        /**
         * Sets the "md5" attribute
         */
        public void setMd5(java.lang.String md5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MD5$4);
                }
                target.setStringValue(md5);
            }
        }
        
        /**
         * Sets (as xml) the "md5" attribute
         */
        public void xsetMd5(org.apache.xmlbeans.XmlString md5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MD5$4);
                }
                target.set(md5);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                return target;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
                }
                target.set(desc);
            }
        }
    }
}
