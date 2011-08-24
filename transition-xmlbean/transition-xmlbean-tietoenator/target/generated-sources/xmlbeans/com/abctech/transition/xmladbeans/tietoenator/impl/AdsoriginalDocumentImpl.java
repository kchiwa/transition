/*
 * An XML document type.
 * Localname: adsoriginal
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one adsoriginal(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdsoriginalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdsoriginalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSORIGINAL$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal");
    
    
    /**
     * Gets the "adsoriginal" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal getAdsoriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().find_element_user(ADSORIGINAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "adsoriginal" element
     */
    public void setAdsoriginal(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal adsoriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().find_element_user(ADSORIGINAL$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().add_element_user(ADSORIGINAL$0);
            }
            target.set(adsoriginal);
        }
    }
    
    /**
     * Appends and returns a new empty "adsoriginal" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal addNewAdsoriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().add_element_user(ADSORIGINAL$0);
            return target;
        }
    }
    /**
     * An XML adsoriginal(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class AdsoriginalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal
    {
        private static final long serialVersionUID = 1L;
        
        public AdsoriginalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADSORIGINALID$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_id");
        private static final javax.xml.namespace.QName ADSORIGINALDELETED$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_deleted");
        private static final javax.xml.namespace.QName PLACEMENTCODE$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "placementcode");
        private static final javax.xml.namespace.QName DEVIANTZIPCODE$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "deviant_zipcode");
        private static final javax.xml.namespace.QName QUANTITYCHARSTITLE$8 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "quantity_chars_title");
        private static final javax.xml.namespace.QName ADTITLE$10 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "ad_title");
        private static final javax.xml.namespace.QName QUANTITYCHARSTEXT$12 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "quantity_chars_text");
        private static final javax.xml.namespace.QName ADTEXT$14 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "ad_text");
        private static final javax.xml.namespace.QName SEARCHNOTIONLIST$16 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_list");
        private static final javax.xml.namespace.QName MEDIAOBJECTLIST$18 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_list");
        
        
        /**
         * Gets the "adsoriginal_id" element
         */
        public java.math.BigInteger getAdsoriginalId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSORIGINALID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "adsoriginal_id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAdsoriginalId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADSORIGINALID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "adsoriginal_id" element
         */
        public void setAdsoriginalId(java.math.BigInteger adsoriginalId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSORIGINALID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADSORIGINALID$0);
                }
                target.setBigIntegerValue(adsoriginalId);
            }
        }
        
        /**
         * Sets (as xml) the "adsoriginal_id" element
         */
        public void xsetAdsoriginalId(org.apache.xmlbeans.XmlInteger adsoriginalId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADSORIGINALID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADSORIGINALID$0);
                }
                target.set(adsoriginalId);
            }
        }
        
        /**
         * Gets the "adsoriginal_deleted" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted getAdsoriginalDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().find_element_user(ADSORIGINALDELETED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "adsoriginal_deleted" element
         */
        public boolean isSetAdsoriginalDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADSORIGINALDELETED$2) != 0;
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
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().find_element_user(ADSORIGINALDELETED$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().add_element_user(ADSORIGINALDELETED$2);
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
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted)get_store().add_element_user(ADSORIGINALDELETED$2);
                return target;
            }
        }
        
        /**
         * Unsets the "adsoriginal_deleted" element
         */
        public void unsetAdsoriginalDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADSORIGINALDELETED$2, 0);
            }
        }
        
        /**
         * Gets the "placementcode" element
         */
        public java.lang.String getPlacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENTCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "placementcode" element
         */
        public org.apache.xmlbeans.XmlString xgetPlacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENTCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "placementcode" element
         */
        public boolean isSetPlacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLACEMENTCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "placementcode" element
         */
        public void setPlacementcode(java.lang.String placementcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENTCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEMENTCODE$4);
                }
                target.setStringValue(placementcode);
            }
        }
        
        /**
         * Sets (as xml) the "placementcode" element
         */
        public void xsetPlacementcode(org.apache.xmlbeans.XmlString placementcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENTCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACEMENTCODE$4);
                }
                target.set(placementcode);
            }
        }
        
        /**
         * Unsets the "placementcode" element
         */
        public void unsetPlacementcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLACEMENTCODE$4, 0);
            }
        }
        
        /**
         * Gets the "deviant_zipcode" element
         */
        public java.lang.String getDeviantZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVIANTZIPCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deviant_zipcode" element
         */
        public org.apache.xmlbeans.XmlString xgetDeviantZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVIANTZIPCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "deviant_zipcode" element
         */
        public boolean isSetDeviantZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEVIANTZIPCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "deviant_zipcode" element
         */
        public void setDeviantZipcode(java.lang.String deviantZipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVIANTZIPCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEVIANTZIPCODE$6);
                }
                target.setStringValue(deviantZipcode);
            }
        }
        
        /**
         * Sets (as xml) the "deviant_zipcode" element
         */
        public void xsetDeviantZipcode(org.apache.xmlbeans.XmlString deviantZipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVIANTZIPCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEVIANTZIPCODE$6);
                }
                target.set(deviantZipcode);
            }
        }
        
        /**
         * Unsets the "deviant_zipcode" element
         */
        public void unsetDeviantZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEVIANTZIPCODE$6, 0);
            }
        }
        
        /**
         * Gets the "quantity_chars_title" element
         */
        public java.lang.String getQuantityCharsTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTITLE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "quantity_chars_title" element
         */
        public org.apache.xmlbeans.XmlString xgetQuantityCharsTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTITLE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "quantity_chars_title" element
         */
        public boolean isSetQuantityCharsTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUANTITYCHARSTITLE$8) != 0;
            }
        }
        
        /**
         * Sets the "quantity_chars_title" element
         */
        public void setQuantityCharsTitle(java.lang.String quantityCharsTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTITLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYCHARSTITLE$8);
                }
                target.setStringValue(quantityCharsTitle);
            }
        }
        
        /**
         * Sets (as xml) the "quantity_chars_title" element
         */
        public void xsetQuantityCharsTitle(org.apache.xmlbeans.XmlString quantityCharsTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTITLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITYCHARSTITLE$8);
                }
                target.set(quantityCharsTitle);
            }
        }
        
        /**
         * Unsets the "quantity_chars_title" element
         */
        public void unsetQuantityCharsTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUANTITYCHARSTITLE$8, 0);
            }
        }
        
        /**
         * Gets the "ad_title" element
         */
        public java.lang.String getAdTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTITLE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ad_title" element
         */
        public org.apache.xmlbeans.XmlString xgetAdTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTITLE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "ad_title" element
         */
        public boolean isSetAdTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADTITLE$10) != 0;
            }
        }
        
        /**
         * Sets the "ad_title" element
         */
        public void setAdTitle(java.lang.String adTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTITLE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTITLE$10);
                }
                target.setStringValue(adTitle);
            }
        }
        
        /**
         * Sets (as xml) the "ad_title" element
         */
        public void xsetAdTitle(org.apache.xmlbeans.XmlString adTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTITLE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTITLE$10);
                }
                target.set(adTitle);
            }
        }
        
        /**
         * Unsets the "ad_title" element
         */
        public void unsetAdTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADTITLE$10, 0);
            }
        }
        
        /**
         * Gets the "quantity_chars_text" element
         */
        public java.lang.String getQuantityCharsText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTEXT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "quantity_chars_text" element
         */
        public org.apache.xmlbeans.XmlString xgetQuantityCharsText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTEXT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "quantity_chars_text" element
         */
        public boolean isSetQuantityCharsText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUANTITYCHARSTEXT$12) != 0;
            }
        }
        
        /**
         * Sets the "quantity_chars_text" element
         */
        public void setQuantityCharsText(java.lang.String quantityCharsText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTEXT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYCHARSTEXT$12);
                }
                target.setStringValue(quantityCharsText);
            }
        }
        
        /**
         * Sets (as xml) the "quantity_chars_text" element
         */
        public void xsetQuantityCharsText(org.apache.xmlbeans.XmlString quantityCharsText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTEXT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITYCHARSTEXT$12);
                }
                target.set(quantityCharsText);
            }
        }
        
        /**
         * Unsets the "quantity_chars_text" element
         */
        public void unsetQuantityCharsText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUANTITYCHARSTEXT$12, 0);
            }
        }
        
        /**
         * Gets the "ad_text" element
         */
        public java.lang.String getAdText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTEXT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ad_text" element
         */
        public org.apache.xmlbeans.XmlString xgetAdText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTEXT$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "ad_text" element
         */
        public boolean isSetAdText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADTEXT$14) != 0;
            }
        }
        
        /**
         * Sets the "ad_text" element
         */
        public void setAdText(java.lang.String adText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTEXT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTEXT$14);
                }
                target.setStringValue(adText);
            }
        }
        
        /**
         * Sets (as xml) the "ad_text" element
         */
        public void xsetAdText(org.apache.xmlbeans.XmlString adText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTEXT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTEXT$14);
                }
                target.set(adText);
            }
        }
        
        /**
         * Unsets the "ad_text" element
         */
        public void unsetAdText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADTEXT$14, 0);
            }
        }
        
        /**
         * Gets the "search_notion_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList getSearchNotionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().find_element_user(SEARCHNOTIONLIST$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "search_notion_list" element
         */
        public boolean isSetSearchNotionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEARCHNOTIONLIST$16) != 0;
            }
        }
        
        /**
         * Sets the "search_notion_list" element
         */
        public void setSearchNotionList(com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList searchNotionList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().find_element_user(SEARCHNOTIONLIST$16, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().add_element_user(SEARCHNOTIONLIST$16);
                }
                target.set(searchNotionList);
            }
        }
        
        /**
         * Appends and returns a new empty "search_notion_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList addNewSearchNotionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList)get_store().add_element_user(SEARCHNOTIONLIST$16);
                return target;
            }
        }
        
        /**
         * Unsets the "search_notion_list" element
         */
        public void unsetSearchNotionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEARCHNOTIONLIST$16, 0);
            }
        }
        
        /**
         * Gets the "media_object_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList getMediaObjectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().find_element_user(MEDIAOBJECTLIST$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "media_object_list" element
         */
        public boolean isSetMediaObjectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIAOBJECTLIST$18) != 0;
            }
        }
        
        /**
         * Sets the "media_object_list" element
         */
        public void setMediaObjectList(com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList mediaObjectList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().find_element_user(MEDIAOBJECTLIST$18, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().add_element_user(MEDIAOBJECTLIST$18);
                }
                target.set(mediaObjectList);
            }
        }
        
        /**
         * Appends and returns a new empty "media_object_list" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList addNewMediaObjectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList)get_store().add_element_user(MEDIAOBJECTLIST$18);
                return target;
            }
        }
        
        /**
         * Unsets the "media_object_list" element
         */
        public void unsetMediaObjectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIAOBJECTLIST$18, 0);
            }
        }
    }
}
