/*
 * An XML document type.
 * Localname: Ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one Ad(@) element.
 *
 * This is a complex type.
 */
public class AdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.AdDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AD$0 = 
        new javax.xml.namespace.QName("", "Ad");
    
    
    /**
     * Gets the "Ad" element
     */
    public com.abctech.transition.xmladbeans.emprof.AdDocument.Ad getAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ad" element
     */
    public void setAd(com.abctech.transition.xmladbeans.emprof.AdDocument.Ad ad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().add_element_user(AD$0);
            }
            target.set(ad);
        }
    }
    
    /**
     * Appends and returns a new empty "Ad" element
     */
    public com.abctech.transition.xmladbeans.emprof.AdDocument.Ad addNewAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().add_element_user(AD$0);
            return target;
        }
    }
    /**
     * An XML Ad(@).
     *
     * This is a complex type.
     */
    public static class AdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.AdDocument.Ad
    {
        private static final long serialVersionUID = 1L;
        
        public AdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENTID$0 = 
            new javax.xml.namespace.QName("", "ClientID");
        private static final javax.xml.namespace.QName MIDASADREF$2 = 
            new javax.xml.namespace.QName("", "MidasAdRef");
        private static final javax.xml.namespace.QName ZETTID$4 = 
            new javax.xml.namespace.QName("", "ZettID");
        private static final javax.xml.namespace.QName ZETTCODE$6 = 
            new javax.xml.namespace.QName("", "ZettCode");
        private static final javax.xml.namespace.QName URL$8 = 
            new javax.xml.namespace.QName("", "URL");
        private static final javax.xml.namespace.QName STATUSATTRIBUTE$10 = 
            new javax.xml.namespace.QName("", "Status");
        
        
        /**
         * Gets the "ClientID" element
         */
        public java.lang.String getClientID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClientID" element
         */
        public org.apache.xmlbeans.XmlString xgetClientID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ClientID" element
         */
        public void setClientID(java.lang.String clientID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTID$0);
                }
                target.setStringValue(clientID);
            }
        }
        
        /**
         * Sets (as xml) the "ClientID" element
         */
        public void xsetClientID(org.apache.xmlbeans.XmlString clientID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTID$0);
                }
                target.set(clientID);
            }
        }
        
        /**
         * Gets the "MidasAdRef" element
         */
        public java.lang.String getMidasAdRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MidasAdRef" element
         */
        public org.apache.xmlbeans.XmlString xgetMidasAdRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MidasAdRef" element
         */
        public void setMidasAdRef(java.lang.String midasAdRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDASADREF$2);
                }
                target.setStringValue(midasAdRef);
            }
        }
        
        /**
         * Sets (as xml) the "MidasAdRef" element
         */
        public void xsetMidasAdRef(org.apache.xmlbeans.XmlString midasAdRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDASADREF$2);
                }
                target.set(midasAdRef);
            }
        }
        
        /**
         * Gets the "ZettID" element
         */
        public java.lang.String getZettID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZettID" element
         */
        public org.apache.xmlbeans.XmlString xgetZettID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ZettID" element
         */
        public void setZettID(java.lang.String zettID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZETTID$4);
                }
                target.setStringValue(zettID);
            }
        }
        
        /**
         * Sets (as xml) the "ZettID" element
         */
        public void xsetZettID(org.apache.xmlbeans.XmlString zettID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZETTID$4);
                }
                target.set(zettID);
            }
        }
        
        /**
         * Gets the "ZettCode" element
         */
        public java.lang.String getZettCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZettCode" element
         */
        public org.apache.xmlbeans.XmlString xgetZettCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ZettCode" element
         */
        public boolean isSetZettCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZETTCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "ZettCode" element
         */
        public void setZettCode(java.lang.String zettCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZETTCODE$6);
                }
                target.setStringValue(zettCode);
            }
        }
        
        /**
         * Sets (as xml) the "ZettCode" element
         */
        public void xsetZettCode(org.apache.xmlbeans.XmlString zettCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZETTCODE$6);
                }
                target.set(zettCode);
            }
        }
        
        /**
         * Unsets the "ZettCode" element
         */
        public void unsetZettCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZETTCODE$6, 0);
            }
        }
        
        /**
         * Gets the "URL" element
         */
        public java.lang.String getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URL" element
         */
        public org.apache.xmlbeans.XmlString xgetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "URL" element
         */
        public boolean isSetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$8) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$8);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "URL" element
         */
        public void xsetURL(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$8);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "URL" element
         */
        public void unsetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$8, 0);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 getStatusAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatusAttribute(com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 statusAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().find_element_user(STATUSATTRIBUTE$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$10);
                }
                target.set(statusAttribute);
            }
        }
        
        /**
         * Appends and returns a new empty "Status" element
         */
        public com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 addNewStatusAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 target = null;
                target = (com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2)get_store().add_element_user(STATUSATTRIBUTE$10);
                return target;
            }
        }
    }
}
