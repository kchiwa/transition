/*
 * An XML document type.
 * Localname: adsoriginal_deleted
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one adsoriginal_deleted(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdsoriginalDeletedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdsoriginalDeletedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSORIGINALDELETED$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_deleted");
    
    
    /**
     * Gets the "adsoriginal_deleted" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted getAdsoriginalDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().find_element_user(ADSORIGINALDELETED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "adsoriginal_deleted" element
     */
    public void setAdsoriginalDeleted(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted adsoriginalDeleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().find_element_user(ADSORIGINALDELETED$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().add_element_user(ADSORIGINALDELETED$0);
            }
            target.set(adsoriginalDeleted);
        }
    }
    
    /**
     * Appends and returns a new empty "adsoriginal_deleted" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted addNewAdsoriginalDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().add_element_user(ADSORIGINALDELETED$0);
            return target;
        }
    }
    /**
     * An XML adsoriginal_deleted(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class AdsoriginalDeletedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted
    {
        private static final long serialVersionUID = 1L;
        
        public AdsoriginalDeletedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "date");
        private static final javax.xml.namespace.QName TIME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "time");
        
        
        /**
         * Gets the "date" element
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" element
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Gets the "time" element
         */
        public java.lang.String getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "time" element
         */
        public org.apache.xmlbeans.XmlString xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "time" element
         */
        public void setTime(java.lang.String time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$2);
                }
                target.setStringValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "time" element
         */
        public void xsetTime(org.apache.xmlbeans.XmlString time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIME$2);
                }
                target.set(time);
            }
        }
    }
}
