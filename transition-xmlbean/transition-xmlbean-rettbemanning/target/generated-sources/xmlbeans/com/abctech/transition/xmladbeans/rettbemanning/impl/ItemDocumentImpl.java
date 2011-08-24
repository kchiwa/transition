/*
 * An XML document type.
 * Localname: item
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.ItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one item(@) element.
 *
 * This is a complex type.
 */
public class ItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.ItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("", "item");
    
    
    /**
     * Gets the "item" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().find_element_user(ITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "item" element
     */
    public void setItem(com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().find_element_user(ITEM$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().add_element_user(ITEM$0);
            }
            target.set(item);
        }
    }
    
    /**
     * Appends and returns a new empty "item" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    /**
     * An XML item(@).
     *
     * This is a complex type.
     */
    public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item
    {
        private static final long serialVersionUID = 1L;
        
        public ItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LINK$2 = 
            new javax.xml.namespace.QName("", "link");
        private static final javax.xml.namespace.QName GUID$4 = 
            new javax.xml.namespace.QName("", "guid");
        private static final javax.xml.namespace.QName PUBDATE$6 = 
            new javax.xml.namespace.QName("", "pubdate");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName CATEGORY$10 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName DESCRIPTIONS$12 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptions");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "id");
        private static final javax.xml.namespace.QName NUMBEROFPOSITIONSTOFILL$16 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "numberofpositionstofill");
        private static final javax.xml.namespace.QName TYPE$18 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "type");
        private static final javax.xml.namespace.QName JOBPOSITIONTITLE$20 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositiontitle");
        private static final javax.xml.namespace.QName JOBPOSITIONTITLEID$22 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositiontitleid");
        private static final javax.xml.namespace.QName JOBPOSITIONCATEGORYID$24 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "jobpositioncategoryid");
        private static final javax.xml.namespace.QName JOBLOCATION$26 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joblocation");
        private static final javax.xml.namespace.QName JOBLOCATIONID$28 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joblocationid");
        private static final javax.xml.namespace.QName JOBOCCUPATION$30 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joboccupation");
        private static final javax.xml.namespace.QName JOBOCCUPATIONID$32 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joboccupationid");
        private static final javax.xml.namespace.QName JOBCATEGORY$34 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "jobcategory");
        private static final javax.xml.namespace.QName JOBCATEGORYID$36 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "jobcategoryid");
        private static final javax.xml.namespace.QName SERVICE$38 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "service");
        private static final javax.xml.namespace.QName SERVICECATEGORY$40 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "servicecategory");
        private static final javax.xml.namespace.QName COUNTRY$42 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "country");
        private static final javax.xml.namespace.QName COUNTRYID$44 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "countryid");
        private static final javax.xml.namespace.QName STATE$46 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "state");
        private static final javax.xml.namespace.QName STATEID$48 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "stateid");
        private static final javax.xml.namespace.QName MUNICIPALITY$50 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "municipality");
        private static final javax.xml.namespace.QName MUNICIPALITYID$52 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "municipalityid");
        private static final javax.xml.namespace.QName COMPANY$54 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "company");
        private static final javax.xml.namespace.QName COMPANYLOGOURL$56 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "companylogourl");
        private static final javax.xml.namespace.QName EMPLOYMENTEXTENT$58 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "employmentextent");
        private static final javax.xml.namespace.QName EMPLOYMENTEXTENTID$60 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "employmentextentid");
        private static final javax.xml.namespace.QName EMPLOYMENTTYPE$62 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "employmenttype");
        private static final javax.xml.namespace.QName EMPLOYMENTTYPEID$64 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "employmenttypeid");
        private static final javax.xml.namespace.QName JOBLEVEL$66 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joblevel");
        private static final javax.xml.namespace.QName JOBLEVELID$68 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "joblevelid");
        private static final javax.xml.namespace.QName CONTACT1NAME$70 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1name");
        private static final javax.xml.namespace.QName CONTACT1EMAIL$72 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1email");
        private static final javax.xml.namespace.QName CONTACT1PHONE$74 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact1phone");
        private static final javax.xml.namespace.QName CONTACT2NAME$76 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2name");
        private static final javax.xml.namespace.QName CONTACT2EMAIL$78 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2email");
        private static final javax.xml.namespace.QName CONTACT2PHONE$80 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact2phone");
        private static final javax.xml.namespace.QName CONTACT3NAME$82 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3name");
        private static final javax.xml.namespace.QName CONTACT3EMAIL$84 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3email");
        private static final javax.xml.namespace.QName CONTACT3PHONE$86 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "contact3phone");
        private static final javax.xml.namespace.QName PUBDATETO$88 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "pubdateto");
        private static final javax.xml.namespace.QName LASTUPDATED$90 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "lastupdated");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "link" element
         */
        public java.lang.String getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "link" element
         */
        public org.apache.xmlbeans.XmlString xgetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "link" element
         */
        public void setLink(java.lang.String link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINK$2);
                }
                target.setStringValue(link);
            }
        }
        
        /**
         * Sets (as xml) the "link" element
         */
        public void xsetLink(org.apache.xmlbeans.XmlString link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINK$2);
                }
                target.set(link);
            }
        }
        
        /**
         * Gets the "guid" element
         */
        public java.lang.String getGuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "guid" element
         */
        public org.apache.xmlbeans.XmlString xgetGuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GUID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "guid" element
         */
        public void setGuid(java.lang.String guid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUID$4);
                }
                target.setStringValue(guid);
            }
        }
        
        /**
         * Sets (as xml) the "guid" element
         */
        public void xsetGuid(org.apache.xmlbeans.XmlString guid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GUID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GUID$4);
                }
                target.set(guid);
            }
        }
        
        /**
         * Gets the "pubdate" element
         */
        public java.lang.String getPubdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pubdate" element
         */
        public org.apache.xmlbeans.XmlString xgetPubdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pubdate" element
         */
        public void setPubdate(java.lang.String pubdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBDATE$6);
                }
                target.setStringValue(pubdate);
            }
        }
        
        /**
         * Sets (as xml) the "pubdate" element
         */
        public void xsetPubdate(org.apache.xmlbeans.XmlString pubdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBDATE$6);
                }
                target.set(pubdate);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "category" element
         */
        public java.lang.String getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" element
         */
        public org.apache.xmlbeans.XmlString xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "category" element
         */
        public void setCategory(java.lang.String category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$10);
                }
                target.setStringValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" element
         */
        public void xsetCategory(org.apache.xmlbeans.XmlString category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$10);
                }
                target.set(category);
            }
        }
        
        /**
         * Gets the "descriptions" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions getDescriptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().find_element_user(DESCRIPTIONS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "descriptions" element
         */
        public void setDescriptions(com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions descriptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().find_element_user(DESCRIPTIONS$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().add_element_user(DESCRIPTIONS$12);
                }
                target.set(descriptions);
            }
        }
        
        /**
         * Appends and returns a new empty "descriptions" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions addNewDescriptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().add_element_user(DESCRIPTIONS$12);
                return target;
            }
        }
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$14);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$14);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "numberofpositionstofill" element
         */
        public java.lang.String getNumberofpositionstofill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberofpositionstofill" element
         */
        public org.apache.xmlbeans.XmlString xgetNumberofpositionstofill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numberofpositionstofill" element
         */
        public void setNumberofpositionstofill(java.lang.String numberofpositionstofill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPOSITIONSTOFILL$16);
                }
                target.setStringValue(numberofpositionstofill);
            }
        }
        
        /**
         * Sets (as xml) the "numberofpositionstofill" element
         */
        public void xsetNumberofpositionstofill(org.apache.xmlbeans.XmlString numberofpositionstofill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFPOSITIONSTOFILL$16);
                }
                target.set(numberofpositionstofill);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$18);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$18);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "jobpositiontitle" element
         */
        public java.lang.String getJobpositiontitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jobpositiontitle" element
         */
        public org.apache.xmlbeans.XmlString xgetJobpositiontitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "jobpositiontitle" element
         */
        public void setJobpositiontitle(java.lang.String jobpositiontitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONTITLE$20);
                }
                target.setStringValue(jobpositiontitle);
            }
        }
        
        /**
         * Sets (as xml) the "jobpositiontitle" element
         */
        public void xsetJobpositiontitle(org.apache.xmlbeans.XmlString jobpositiontitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONTITLE$20);
                }
                target.set(jobpositiontitle);
            }
        }
        
        /**
         * Gets the "jobpositiontitleid" element
         */
        public java.lang.String getJobpositiontitleid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLEID$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jobpositiontitleid" element
         */
        public org.apache.xmlbeans.XmlString xgetJobpositiontitleid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLEID$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "jobpositiontitleid" element
         */
        public void setJobpositiontitleid(java.lang.String jobpositiontitleid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONTITLEID$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONTITLEID$22);
                }
                target.setStringValue(jobpositiontitleid);
            }
        }
        
        /**
         * Sets (as xml) the "jobpositiontitleid" element
         */
        public void xsetJobpositiontitleid(org.apache.xmlbeans.XmlString jobpositiontitleid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONTITLEID$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONTITLEID$22);
                }
                target.set(jobpositiontitleid);
            }
        }
        
        /**
         * Gets the "jobpositioncategoryid" element
         */
        public java.lang.String getJobpositioncategoryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONCATEGORYID$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jobpositioncategoryid" element
         */
        public org.apache.xmlbeans.XmlString xgetJobpositioncategoryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONCATEGORYID$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "jobpositioncategoryid" element
         */
        public void setJobpositioncategoryid(java.lang.String jobpositioncategoryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBPOSITIONCATEGORYID$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBPOSITIONCATEGORYID$24);
                }
                target.setStringValue(jobpositioncategoryid);
            }
        }
        
        /**
         * Sets (as xml) the "jobpositioncategoryid" element
         */
        public void xsetJobpositioncategoryid(org.apache.xmlbeans.XmlString jobpositioncategoryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBPOSITIONCATEGORYID$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBPOSITIONCATEGORYID$24);
                }
                target.set(jobpositioncategoryid);
            }
        }
        
        /**
         * Gets the "joblocation" element
         */
        public java.lang.String getJoblocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATION$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joblocation" element
         */
        public org.apache.xmlbeans.XmlString xgetJoblocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATION$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joblocation" element
         */
        public void setJoblocation(java.lang.String joblocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLOCATION$26);
                }
                target.setStringValue(joblocation);
            }
        }
        
        /**
         * Sets (as xml) the "joblocation" element
         */
        public void xsetJoblocation(org.apache.xmlbeans.XmlString joblocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLOCATION$26);
                }
                target.set(joblocation);
            }
        }
        
        /**
         * Gets the "joblocationid" element
         */
        public java.lang.String getJoblocationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATIONID$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joblocationid" element
         */
        public org.apache.xmlbeans.XmlString xgetJoblocationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATIONID$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joblocationid" element
         */
        public void setJoblocationid(java.lang.String joblocationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATIONID$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLOCATIONID$28);
                }
                target.setStringValue(joblocationid);
            }
        }
        
        /**
         * Sets (as xml) the "joblocationid" element
         */
        public void xsetJoblocationid(org.apache.xmlbeans.XmlString joblocationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATIONID$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLOCATIONID$28);
                }
                target.set(joblocationid);
            }
        }
        
        /**
         * Gets the "joboccupation" element
         */
        public java.lang.String getJoboccupation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATION$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joboccupation" element
         */
        public org.apache.xmlbeans.XmlString xgetJoboccupation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATION$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joboccupation" element
         */
        public void setJoboccupation(java.lang.String joboccupation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATION$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBOCCUPATION$30);
                }
                target.setStringValue(joboccupation);
            }
        }
        
        /**
         * Sets (as xml) the "joboccupation" element
         */
        public void xsetJoboccupation(org.apache.xmlbeans.XmlString joboccupation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATION$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBOCCUPATION$30);
                }
                target.set(joboccupation);
            }
        }
        
        /**
         * Gets the "joboccupationid" element
         */
        public java.lang.String getJoboccupationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATIONID$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joboccupationid" element
         */
        public org.apache.xmlbeans.XmlString xgetJoboccupationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATIONID$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joboccupationid" element
         */
        public void setJoboccupationid(java.lang.String joboccupationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBOCCUPATIONID$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBOCCUPATIONID$32);
                }
                target.setStringValue(joboccupationid);
            }
        }
        
        /**
         * Sets (as xml) the "joboccupationid" element
         */
        public void xsetJoboccupationid(org.apache.xmlbeans.XmlString joboccupationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBOCCUPATIONID$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBOCCUPATIONID$32);
                }
                target.set(joboccupationid);
            }
        }
        
        /**
         * Gets the "jobcategory" element
         */
        public java.lang.String getJobcategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORY$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jobcategory" element
         */
        public org.apache.xmlbeans.XmlString xgetJobcategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORY$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "jobcategory" element
         */
        public void setJobcategory(java.lang.String jobcategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORY$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBCATEGORY$34);
                }
                target.setStringValue(jobcategory);
            }
        }
        
        /**
         * Sets (as xml) the "jobcategory" element
         */
        public void xsetJobcategory(org.apache.xmlbeans.XmlString jobcategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORY$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBCATEGORY$34);
                }
                target.set(jobcategory);
            }
        }
        
        /**
         * Gets the "jobcategoryid" element
         */
        public java.lang.String getJobcategoryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORYID$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jobcategoryid" element
         */
        public org.apache.xmlbeans.XmlString xgetJobcategoryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORYID$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "jobcategoryid" element
         */
        public void setJobcategoryid(java.lang.String jobcategoryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBCATEGORYID$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBCATEGORYID$36);
                }
                target.setStringValue(jobcategoryid);
            }
        }
        
        /**
         * Sets (as xml) the "jobcategoryid" element
         */
        public void xsetJobcategoryid(org.apache.xmlbeans.XmlString jobcategoryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBCATEGORYID$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBCATEGORYID$36);
                }
                target.set(jobcategoryid);
            }
        }
        
        /**
         * Gets the "service" element
         */
        public java.lang.String getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlString xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(java.lang.String service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$38);
                }
                target.setStringValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlString service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICE$38);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "servicecategory" element
         */
        public java.lang.String getServicecategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECATEGORY$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "servicecategory" element
         */
        public org.apache.xmlbeans.XmlString xgetServicecategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECATEGORY$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "servicecategory" element
         */
        public void setServicecategory(java.lang.String servicecategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECATEGORY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECATEGORY$40);
                }
                target.setStringValue(servicecategory);
            }
        }
        
        /**
         * Sets (as xml) the "servicecategory" element
         */
        public void xsetServicecategory(org.apache.xmlbeans.XmlString servicecategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECATEGORY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECATEGORY$40);
                }
                target.set(servicecategory);
            }
        }
        
        /**
         * Gets the "country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$42);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$42);
                }
                target.set(country);
            }
        }
        
        /**
         * Gets the "countryid" element
         */
        public java.lang.String getCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYID$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "countryid" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYID$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "countryid" element
         */
        public void setCountryid(java.lang.String countryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYID$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYID$44);
                }
                target.setStringValue(countryid);
            }
        }
        
        /**
         * Sets (as xml) the "countryid" element
         */
        public void xsetCountryid(org.apache.xmlbeans.XmlString countryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYID$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYID$44);
                }
                target.set(countryid);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$46);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$46);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "stateid" element
         */
        public java.lang.String getStateid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEID$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stateid" element
         */
        public org.apache.xmlbeans.XmlString xgetStateid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEID$48, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stateid" element
         */
        public void setStateid(java.lang.String stateid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEID$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATEID$48);
                }
                target.setStringValue(stateid);
            }
        }
        
        /**
         * Sets (as xml) the "stateid" element
         */
        public void xsetStateid(org.apache.xmlbeans.XmlString stateid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEID$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATEID$48);
                }
                target.set(stateid);
            }
        }
        
        /**
         * Gets the "municipality" element
         */
        public java.lang.String getMunicipality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITY$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "municipality" element
         */
        public org.apache.xmlbeans.XmlString xgetMunicipality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITY$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "municipality" element
         */
        public void setMunicipality(java.lang.String municipality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITY$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUNICIPALITY$50);
                }
                target.setStringValue(municipality);
            }
        }
        
        /**
         * Sets (as xml) the "municipality" element
         */
        public void xsetMunicipality(org.apache.xmlbeans.XmlString municipality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITY$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MUNICIPALITY$50);
                }
                target.set(municipality);
            }
        }
        
        /**
         * Gets the "municipalityid" element
         */
        public java.lang.String getMunicipalityid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITYID$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "municipalityid" element
         */
        public org.apache.xmlbeans.XmlString xgetMunicipalityid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITYID$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "municipalityid" element
         */
        public void setMunicipalityid(java.lang.String municipalityid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPALITYID$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUNICIPALITYID$52);
                }
                target.setStringValue(municipalityid);
            }
        }
        
        /**
         * Sets (as xml) the "municipalityid" element
         */
        public void xsetMunicipalityid(org.apache.xmlbeans.XmlString municipalityid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPALITYID$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MUNICIPALITYID$52);
                }
                target.set(municipalityid);
            }
        }
        
        /**
         * Gets the "company" element
         */
        public java.lang.String getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "company" element
         */
        public org.apache.xmlbeans.XmlString xgetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "company" element
         */
        public void setCompany(java.lang.String company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANY$54);
                }
                target.setStringValue(company);
            }
        }
        
        /**
         * Sets (as xml) the "company" element
         */
        public void xsetCompany(org.apache.xmlbeans.XmlString company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANY$54);
                }
                target.set(company);
            }
        }
        
        /**
         * Gets the "companylogourl" element
         */
        public java.lang.String getCompanylogourl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYLOGOURL$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "companylogourl" element
         */
        public org.apache.xmlbeans.XmlString xgetCompanylogourl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYLOGOURL$56, 0);
                return target;
            }
        }
        
        /**
         * True if has "companylogourl" element
         */
        public boolean isSetCompanylogourl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPANYLOGOURL$56) != 0;
            }
        }
        
        /**
         * Sets the "companylogourl" element
         */
        public void setCompanylogourl(java.lang.String companylogourl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYLOGOURL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYLOGOURL$56);
                }
                target.setStringValue(companylogourl);
            }
        }
        
        /**
         * Sets (as xml) the "companylogourl" element
         */
        public void xsetCompanylogourl(org.apache.xmlbeans.XmlString companylogourl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYLOGOURL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYLOGOURL$56);
                }
                target.set(companylogourl);
            }
        }
        
        /**
         * Unsets the "companylogourl" element
         */
        public void unsetCompanylogourl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPANYLOGOURL$56, 0);
            }
        }
        
        /**
         * Gets the "employmentextent" element
         */
        public java.lang.String getEmploymentextent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENT$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "employmentextent" element
         */
        public org.apache.xmlbeans.XmlString xgetEmploymentextent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENT$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "employmentextent" element
         */
        public void setEmploymentextent(java.lang.String employmentextent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENT$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTEXTENT$58);
                }
                target.setStringValue(employmentextent);
            }
        }
        
        /**
         * Sets (as xml) the "employmentextent" element
         */
        public void xsetEmploymentextent(org.apache.xmlbeans.XmlString employmentextent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENT$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTEXTENT$58);
                }
                target.set(employmentextent);
            }
        }
        
        /**
         * Gets the "employmentextentid" element
         */
        public java.lang.String getEmploymentextentid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENTID$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "employmentextentid" element
         */
        public org.apache.xmlbeans.XmlString xgetEmploymentextentid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENTID$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "employmentextentid" element
         */
        public void setEmploymentextentid(java.lang.String employmentextentid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTEXTENTID$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTEXTENTID$60);
                }
                target.setStringValue(employmentextentid);
            }
        }
        
        /**
         * Sets (as xml) the "employmentextentid" element
         */
        public void xsetEmploymentextentid(org.apache.xmlbeans.XmlString employmentextentid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTEXTENTID$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTEXTENTID$60);
                }
                target.set(employmentextentid);
            }
        }
        
        /**
         * Gets the "employmenttype" element
         */
        public java.lang.String getEmploymenttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPE$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "employmenttype" element
         */
        public org.apache.xmlbeans.XmlString xgetEmploymenttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPE$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "employmenttype" element
         */
        public void setEmploymenttype(java.lang.String employmenttype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPE$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTTYPE$62);
                }
                target.setStringValue(employmenttype);
            }
        }
        
        /**
         * Sets (as xml) the "employmenttype" element
         */
        public void xsetEmploymenttype(org.apache.xmlbeans.XmlString employmenttype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPE$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTTYPE$62);
                }
                target.set(employmenttype);
            }
        }
        
        /**
         * Gets the "employmenttypeid" element
         */
        public java.lang.String getEmploymenttypeid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPEID$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "employmenttypeid" element
         */
        public org.apache.xmlbeans.XmlString xgetEmploymenttypeid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPEID$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "employmenttypeid" element
         */
        public void setEmploymenttypeid(java.lang.String employmenttypeid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPEID$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTTYPEID$64);
                }
                target.setStringValue(employmenttypeid);
            }
        }
        
        /**
         * Sets (as xml) the "employmenttypeid" element
         */
        public void xsetEmploymenttypeid(org.apache.xmlbeans.XmlString employmenttypeid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPEID$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTTYPEID$64);
                }
                target.set(employmenttypeid);
            }
        }
        
        /**
         * Gets the "joblevel" element
         */
        public java.lang.String getJoblevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVEL$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joblevel" element
         */
        public org.apache.xmlbeans.XmlString xgetJoblevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVEL$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joblevel" element
         */
        public void setJoblevel(java.lang.String joblevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVEL$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLEVEL$66);
                }
                target.setStringValue(joblevel);
            }
        }
        
        /**
         * Sets (as xml) the "joblevel" element
         */
        public void xsetJoblevel(org.apache.xmlbeans.XmlString joblevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVEL$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLEVEL$66);
                }
                target.set(joblevel);
            }
        }
        
        /**
         * Gets the "joblevelid" element
         */
        public java.lang.String getJoblevelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVELID$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joblevelid" element
         */
        public org.apache.xmlbeans.XmlString xgetJoblevelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVELID$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "joblevelid" element
         */
        public void setJoblevelid(java.lang.String joblevelid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVELID$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLEVELID$68);
                }
                target.setStringValue(joblevelid);
            }
        }
        
        /**
         * Sets (as xml) the "joblevelid" element
         */
        public void xsetJoblevelid(org.apache.xmlbeans.XmlString joblevelid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVELID$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLEVELID$68);
                }
                target.set(joblevelid);
            }
        }
        
        /**
         * Gets the "contact1name" element
         */
        public java.lang.String getContact1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1NAME$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact1name" element
         */
        public org.apache.xmlbeans.XmlString xgetContact1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1NAME$70, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact1name" element
         */
        public boolean isSetContact1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT1NAME$70) != 0;
            }
        }
        
        /**
         * Sets the "contact1name" element
         */
        public void setContact1Name(java.lang.String contact1Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1NAME$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1NAME$70);
                }
                target.setStringValue(contact1Name);
            }
        }
        
        /**
         * Sets (as xml) the "contact1name" element
         */
        public void xsetContact1Name(org.apache.xmlbeans.XmlString contact1Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1NAME$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1NAME$70);
                }
                target.set(contact1Name);
            }
        }
        
        /**
         * Unsets the "contact1name" element
         */
        public void unsetContact1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT1NAME$70, 0);
            }
        }
        
        /**
         * Gets the "contact1email" element
         */
        public java.lang.String getContact1Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1EMAIL$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact1email" element
         */
        public org.apache.xmlbeans.XmlString xgetContact1Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1EMAIL$72, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact1email" element
         */
        public boolean isSetContact1Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT1EMAIL$72) != 0;
            }
        }
        
        /**
         * Sets the "contact1email" element
         */
        public void setContact1Email(java.lang.String contact1Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1EMAIL$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1EMAIL$72);
                }
                target.setStringValue(contact1Email);
            }
        }
        
        /**
         * Sets (as xml) the "contact1email" element
         */
        public void xsetContact1Email(org.apache.xmlbeans.XmlString contact1Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1EMAIL$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1EMAIL$72);
                }
                target.set(contact1Email);
            }
        }
        
        /**
         * Unsets the "contact1email" element
         */
        public void unsetContact1Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT1EMAIL$72, 0);
            }
        }
        
        /**
         * Gets the "contact1phone" element
         */
        public java.lang.String getContact1Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1PHONE$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact1phone" element
         */
        public org.apache.xmlbeans.XmlString xgetContact1Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1PHONE$74, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact1phone" element
         */
        public boolean isSetContact1Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT1PHONE$74) != 0;
            }
        }
        
        /**
         * Sets the "contact1phone" element
         */
        public void setContact1Phone(java.lang.String contact1Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT1PHONE$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT1PHONE$74);
                }
                target.setStringValue(contact1Phone);
            }
        }
        
        /**
         * Sets (as xml) the "contact1phone" element
         */
        public void xsetContact1Phone(org.apache.xmlbeans.XmlString contact1Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT1PHONE$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT1PHONE$74);
                }
                target.set(contact1Phone);
            }
        }
        
        /**
         * Unsets the "contact1phone" element
         */
        public void unsetContact1Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT1PHONE$74, 0);
            }
        }
        
        /**
         * Gets the "contact2name" element
         */
        public java.lang.String getContact2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2NAME$76, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact2name" element
         */
        public org.apache.xmlbeans.XmlString xgetContact2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2NAME$76, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact2name" element
         */
        public boolean isSetContact2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT2NAME$76) != 0;
            }
        }
        
        /**
         * Sets the "contact2name" element
         */
        public void setContact2Name(java.lang.String contact2Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2NAME$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2NAME$76);
                }
                target.setStringValue(contact2Name);
            }
        }
        
        /**
         * Sets (as xml) the "contact2name" element
         */
        public void xsetContact2Name(org.apache.xmlbeans.XmlString contact2Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2NAME$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2NAME$76);
                }
                target.set(contact2Name);
            }
        }
        
        /**
         * Unsets the "contact2name" element
         */
        public void unsetContact2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT2NAME$76, 0);
            }
        }
        
        /**
         * Gets the "contact2email" element
         */
        public java.lang.String getContact2Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2EMAIL$78, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact2email" element
         */
        public org.apache.xmlbeans.XmlString xgetContact2Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2EMAIL$78, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact2email" element
         */
        public boolean isSetContact2Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT2EMAIL$78) != 0;
            }
        }
        
        /**
         * Sets the "contact2email" element
         */
        public void setContact2Email(java.lang.String contact2Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2EMAIL$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2EMAIL$78);
                }
                target.setStringValue(contact2Email);
            }
        }
        
        /**
         * Sets (as xml) the "contact2email" element
         */
        public void xsetContact2Email(org.apache.xmlbeans.XmlString contact2Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2EMAIL$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2EMAIL$78);
                }
                target.set(contact2Email);
            }
        }
        
        /**
         * Unsets the "contact2email" element
         */
        public void unsetContact2Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT2EMAIL$78, 0);
            }
        }
        
        /**
         * Gets the "contact2phone" element
         */
        public java.lang.String getContact2Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2PHONE$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact2phone" element
         */
        public org.apache.xmlbeans.XmlString xgetContact2Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2PHONE$80, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact2phone" element
         */
        public boolean isSetContact2Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT2PHONE$80) != 0;
            }
        }
        
        /**
         * Sets the "contact2phone" element
         */
        public void setContact2Phone(java.lang.String contact2Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT2PHONE$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT2PHONE$80);
                }
                target.setStringValue(contact2Phone);
            }
        }
        
        /**
         * Sets (as xml) the "contact2phone" element
         */
        public void xsetContact2Phone(org.apache.xmlbeans.XmlString contact2Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT2PHONE$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT2PHONE$80);
                }
                target.set(contact2Phone);
            }
        }
        
        /**
         * Unsets the "contact2phone" element
         */
        public void unsetContact2Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT2PHONE$80, 0);
            }
        }
        
        /**
         * Gets the "contact3name" element
         */
        public java.lang.String getContact3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3NAME$82, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact3name" element
         */
        public org.apache.xmlbeans.XmlString xgetContact3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3NAME$82, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact3name" element
         */
        public boolean isSetContact3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT3NAME$82) != 0;
            }
        }
        
        /**
         * Sets the "contact3name" element
         */
        public void setContact3Name(java.lang.String contact3Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3NAME$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3NAME$82);
                }
                target.setStringValue(contact3Name);
            }
        }
        
        /**
         * Sets (as xml) the "contact3name" element
         */
        public void xsetContact3Name(org.apache.xmlbeans.XmlString contact3Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3NAME$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3NAME$82);
                }
                target.set(contact3Name);
            }
        }
        
        /**
         * Unsets the "contact3name" element
         */
        public void unsetContact3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT3NAME$82, 0);
            }
        }
        
        /**
         * Gets the "contact3email" element
         */
        public java.lang.String getContact3Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3EMAIL$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact3email" element
         */
        public org.apache.xmlbeans.XmlString xgetContact3Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3EMAIL$84, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact3email" element
         */
        public boolean isSetContact3Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT3EMAIL$84) != 0;
            }
        }
        
        /**
         * Sets the "contact3email" element
         */
        public void setContact3Email(java.lang.String contact3Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3EMAIL$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3EMAIL$84);
                }
                target.setStringValue(contact3Email);
            }
        }
        
        /**
         * Sets (as xml) the "contact3email" element
         */
        public void xsetContact3Email(org.apache.xmlbeans.XmlString contact3Email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3EMAIL$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3EMAIL$84);
                }
                target.set(contact3Email);
            }
        }
        
        /**
         * Unsets the "contact3email" element
         */
        public void unsetContact3Email()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT3EMAIL$84, 0);
            }
        }
        
        /**
         * Gets the "contact3phone" element
         */
        public java.lang.String getContact3Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3PHONE$86, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact3phone" element
         */
        public org.apache.xmlbeans.XmlString xgetContact3Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3PHONE$86, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact3phone" element
         */
        public boolean isSetContact3Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT3PHONE$86) != 0;
            }
        }
        
        /**
         * Sets the "contact3phone" element
         */
        public void setContact3Phone(java.lang.String contact3Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT3PHONE$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT3PHONE$86);
                }
                target.setStringValue(contact3Phone);
            }
        }
        
        /**
         * Sets (as xml) the "contact3phone" element
         */
        public void xsetContact3Phone(org.apache.xmlbeans.XmlString contact3Phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT3PHONE$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT3PHONE$86);
                }
                target.set(contact3Phone);
            }
        }
        
        /**
         * Unsets the "contact3phone" element
         */
        public void unsetContact3Phone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT3PHONE$86, 0);
            }
        }
        
        /**
         * Gets the "pubdateto" element
         */
        public java.lang.String getPubdateto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATETO$88, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pubdateto" element
         */
        public org.apache.xmlbeans.XmlString xgetPubdateto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATETO$88, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pubdateto" element
         */
        public void setPubdateto(java.lang.String pubdateto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBDATETO$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBDATETO$88);
                }
                target.setStringValue(pubdateto);
            }
        }
        
        /**
         * Sets (as xml) the "pubdateto" element
         */
        public void xsetPubdateto(org.apache.xmlbeans.XmlString pubdateto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBDATETO$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBDATETO$88);
                }
                target.set(pubdateto);
            }
        }
        
        /**
         * Gets the "lastupdated" element
         */
        public java.lang.String getLastupdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$90, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastupdated" element
         */
        public org.apache.xmlbeans.XmlString xgetLastupdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$90, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lastupdated" element
         */
        public void setLastupdated(java.lang.String lastupdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$90);
                }
                target.setStringValue(lastupdated);
            }
        }
        
        /**
         * Sets (as xml) the "lastupdated" element
         */
        public void xsetLastupdated(org.apache.xmlbeans.XmlString lastupdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATED$90);
                }
                target.set(lastupdated);
            }
        }
    }
}
