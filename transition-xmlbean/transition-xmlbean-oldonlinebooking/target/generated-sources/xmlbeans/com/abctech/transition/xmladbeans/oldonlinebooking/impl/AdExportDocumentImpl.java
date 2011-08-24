/*
 * An XML document type.
 * Localname: ad_export
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one ad_export(@) element.
 *
 * This is a complex type.
 */
public class AdExportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdExportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADEXPORT$0 = 
        new javax.xml.namespace.QName("", "ad_export");
    
    
    /**
     * Gets the "ad_export" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport getAdExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport)get_store().find_element_user(ADEXPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ad_export" element
     */
    public void setAdExport(com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport adExport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport)get_store().find_element_user(ADEXPORT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport)get_store().add_element_user(ADEXPORT$0);
            }
            target.set(adExport);
        }
    }
    
    /**
     * Appends and returns a new empty "ad_export" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport addNewAdExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport)get_store().add_element_user(ADEXPORT$0);
            return target;
        }
    }
    /**
     * An XML ad_export(@).
     *
     * This is a complex type.
     */
    public static class AdExportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport
    {
        private static final long serialVersionUID = 1L;
        
        public AdExportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AD$0 = 
            new javax.xml.namespace.QName("", "ad");
        private static final javax.xml.namespace.QName TIMESTAMP$2 = 
            new javax.xml.namespace.QName("", "timestamp");
        private static final javax.xml.namespace.QName SOURCE$4 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName JOB$6 = 
            new javax.xml.namespace.QName("", "job");
        private static final javax.xml.namespace.QName USERLOGIN$8 = 
            new javax.xml.namespace.QName("", "user_login");
        
        
        /**
         * Gets array of all "ad" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[] getAdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AD$0, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ad" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad getAdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().find_element_user(AD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ad" element
         */
        public int sizeOfAdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AD$0);
            }
        }
        
        /**
         * Sets array of all "ad" element
         */
        public void setAdArray(com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[] adArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(adArray, AD$0);
            }
        }
        
        /**
         * Sets ith "ad" element
         */
        public void setAdArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad ad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().find_element_user(AD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ad);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ad" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad insertNewAd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad)get_store().insert_element_user(AD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ad" element
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
         * Removes the ith "ad" element
         */
        public void removeAd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AD$0, i);
            }
        }
        
        /**
         * Gets the "timestamp" attribute
         */
        public java.lang.String getTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "timestamp" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$2);
                return target;
            }
        }
        
        /**
         * True if has "timestamp" attribute
         */
        public boolean isSetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$2) != null;
            }
        }
        
        /**
         * Sets the "timestamp" attribute
         */
        public void setTimestamp(java.lang.String timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
                }
                target.setStringValue(timestamp);
            }
        }
        
        /**
         * Sets (as xml) the "timestamp" attribute
         */
        public void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMESTAMP$2);
                }
                target.set(timestamp);
            }
        }
        
        /**
         * Unsets the "timestamp" attribute
         */
        public void unsetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$2);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$4);
                return target;
            }
        }
        
        /**
         * True if has "source" attribute
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCE$4) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$4);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCE$4);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" attribute
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCE$4);
            }
        }
        
        /**
         * Gets the "job" attribute
         */
        public java.lang.String getJob()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOB$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "job" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJob()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOB$6);
                return target;
            }
        }
        
        /**
         * True if has "job" attribute
         */
        public boolean isSetJob()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JOB$6) != null;
            }
        }
        
        /**
         * Sets the "job" attribute
         */
        public void setJob(java.lang.String job)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOB$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOB$6);
                }
                target.setStringValue(job);
            }
        }
        
        /**
         * Sets (as xml) the "job" attribute
         */
        public void xsetJob(org.apache.xmlbeans.XmlString job)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOB$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JOB$6);
                }
                target.set(job);
            }
        }
        
        /**
         * Unsets the "job" attribute
         */
        public void unsetJob()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JOB$6);
            }
        }
        
        /**
         * Gets the "user_login" attribute
         */
        public java.lang.String getUserLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERLOGIN$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "user_login" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUserLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERLOGIN$8);
                return target;
            }
        }
        
        /**
         * True if has "user_login" attribute
         */
        public boolean isSetUserLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USERLOGIN$8) != null;
            }
        }
        
        /**
         * Sets the "user_login" attribute
         */
        public void setUserLogin(java.lang.String userLogin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERLOGIN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERLOGIN$8);
                }
                target.setStringValue(userLogin);
            }
        }
        
        /**
         * Sets (as xml) the "user_login" attribute
         */
        public void xsetUserLogin(org.apache.xmlbeans.XmlString userLogin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERLOGIN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERLOGIN$8);
                }
                target.set(userLogin);
            }
        }
        
        /**
         * Unsets the "user_login" attribute
         */
        public void unsetUserLogin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USERLOGIN$8);
            }
        }
    }
}
