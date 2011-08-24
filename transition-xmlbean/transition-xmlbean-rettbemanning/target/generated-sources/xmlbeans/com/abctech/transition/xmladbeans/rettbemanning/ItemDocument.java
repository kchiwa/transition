/*
 * An XML document type.
 * Localname: item
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.ItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning;


/**
 * A document containing one item(@) element.
 *
 * This is a complex type.
 */
public interface ItemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA32A588EC1F277D955B800EA6FE6C73F").resolveHandle("item9f0cdoctype");
    
    /**
     * Gets the "item" element
     */
    com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item getItem();
    
    /**
     * Sets the "item" element
     */
    void setItem(com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item item);
    
    /**
     * Appends and returns a new empty "item" element
     */
    com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item addNewItem();
    
    /**
     * An XML item(@).
     *
     * This is a complex type.
     */
    public interface Item extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA32A588EC1F277D955B800EA6FE6C73F").resolveHandle("item5c8delemtype");
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "link" element
         */
        java.lang.String getLink();
        
        /**
         * Gets (as xml) the "link" element
         */
        org.apache.xmlbeans.XmlString xgetLink();
        
        /**
         * Sets the "link" element
         */
        void setLink(java.lang.String link);
        
        /**
         * Sets (as xml) the "link" element
         */
        void xsetLink(org.apache.xmlbeans.XmlString link);
        
        /**
         * Gets the "guid" element
         */
        java.lang.String getGuid();
        
        /**
         * Gets (as xml) the "guid" element
         */
        org.apache.xmlbeans.XmlString xgetGuid();
        
        /**
         * Sets the "guid" element
         */
        void setGuid(java.lang.String guid);
        
        /**
         * Sets (as xml) the "guid" element
         */
        void xsetGuid(org.apache.xmlbeans.XmlString guid);
        
        /**
         * Gets the "pubdate" element
         */
        java.lang.String getPubdate();
        
        /**
         * Gets (as xml) the "pubdate" element
         */
        org.apache.xmlbeans.XmlString xgetPubdate();
        
        /**
         * Sets the "pubdate" element
         */
        void setPubdate(java.lang.String pubdate);
        
        /**
         * Sets (as xml) the "pubdate" element
         */
        void xsetPubdate(org.apache.xmlbeans.XmlString pubdate);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "category" element
         */
        java.lang.String getCategory();
        
        /**
         * Gets (as xml) the "category" element
         */
        org.apache.xmlbeans.XmlString xgetCategory();
        
        /**
         * Sets the "category" element
         */
        void setCategory(java.lang.String category);
        
        /**
         * Sets (as xml) the "category" element
         */
        void xsetCategory(org.apache.xmlbeans.XmlString category);
        
        /**
         * Gets the "descriptions" element
         */
        com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions getDescriptions();
        
        /**
         * Sets the "descriptions" element
         */
        void setDescriptions(com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions descriptions);
        
        /**
         * Appends and returns a new empty "descriptions" element
         */
        com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions addNewDescriptions();
        
        /**
         * Gets the "id" element
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Gets the "numberofpositionstofill" element
         */
        java.lang.String getNumberofpositionstofill();
        
        /**
         * Gets (as xml) the "numberofpositionstofill" element
         */
        org.apache.xmlbeans.XmlString xgetNumberofpositionstofill();
        
        /**
         * Sets the "numberofpositionstofill" element
         */
        void setNumberofpositionstofill(java.lang.String numberofpositionstofill);
        
        /**
         * Sets (as xml) the "numberofpositionstofill" element
         */
        void xsetNumberofpositionstofill(org.apache.xmlbeans.XmlString numberofpositionstofill);
        
        /**
         * Gets the "type" element
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" element
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "type" element
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" element
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Gets the "jobpositiontitle" element
         */
        java.lang.String getJobpositiontitle();
        
        /**
         * Gets (as xml) the "jobpositiontitle" element
         */
        org.apache.xmlbeans.XmlString xgetJobpositiontitle();
        
        /**
         * Sets the "jobpositiontitle" element
         */
        void setJobpositiontitle(java.lang.String jobpositiontitle);
        
        /**
         * Sets (as xml) the "jobpositiontitle" element
         */
        void xsetJobpositiontitle(org.apache.xmlbeans.XmlString jobpositiontitle);
        
        /**
         * Gets the "jobpositiontitleid" element
         */
        java.lang.String getJobpositiontitleid();
        
        /**
         * Gets (as xml) the "jobpositiontitleid" element
         */
        org.apache.xmlbeans.XmlString xgetJobpositiontitleid();
        
        /**
         * Sets the "jobpositiontitleid" element
         */
        void setJobpositiontitleid(java.lang.String jobpositiontitleid);
        
        /**
         * Sets (as xml) the "jobpositiontitleid" element
         */
        void xsetJobpositiontitleid(org.apache.xmlbeans.XmlString jobpositiontitleid);
        
        /**
         * Gets the "jobpositioncategoryid" element
         */
        java.lang.String getJobpositioncategoryid();
        
        /**
         * Gets (as xml) the "jobpositioncategoryid" element
         */
        org.apache.xmlbeans.XmlString xgetJobpositioncategoryid();
        
        /**
         * Sets the "jobpositioncategoryid" element
         */
        void setJobpositioncategoryid(java.lang.String jobpositioncategoryid);
        
        /**
         * Sets (as xml) the "jobpositioncategoryid" element
         */
        void xsetJobpositioncategoryid(org.apache.xmlbeans.XmlString jobpositioncategoryid);
        
        /**
         * Gets the "joblocation" element
         */
        java.lang.String getJoblocation();
        
        /**
         * Gets (as xml) the "joblocation" element
         */
        org.apache.xmlbeans.XmlString xgetJoblocation();
        
        /**
         * Sets the "joblocation" element
         */
        void setJoblocation(java.lang.String joblocation);
        
        /**
         * Sets (as xml) the "joblocation" element
         */
        void xsetJoblocation(org.apache.xmlbeans.XmlString joblocation);
        
        /**
         * Gets the "joblocationid" element
         */
        java.lang.String getJoblocationid();
        
        /**
         * Gets (as xml) the "joblocationid" element
         */
        org.apache.xmlbeans.XmlString xgetJoblocationid();
        
        /**
         * Sets the "joblocationid" element
         */
        void setJoblocationid(java.lang.String joblocationid);
        
        /**
         * Sets (as xml) the "joblocationid" element
         */
        void xsetJoblocationid(org.apache.xmlbeans.XmlString joblocationid);
        
        /**
         * Gets the "joboccupation" element
         */
        java.lang.String getJoboccupation();
        
        /**
         * Gets (as xml) the "joboccupation" element
         */
        org.apache.xmlbeans.XmlString xgetJoboccupation();
        
        /**
         * Sets the "joboccupation" element
         */
        void setJoboccupation(java.lang.String joboccupation);
        
        /**
         * Sets (as xml) the "joboccupation" element
         */
        void xsetJoboccupation(org.apache.xmlbeans.XmlString joboccupation);
        
        /**
         * Gets the "joboccupationid" element
         */
        java.lang.String getJoboccupationid();
        
        /**
         * Gets (as xml) the "joboccupationid" element
         */
        org.apache.xmlbeans.XmlString xgetJoboccupationid();
        
        /**
         * Sets the "joboccupationid" element
         */
        void setJoboccupationid(java.lang.String joboccupationid);
        
        /**
         * Sets (as xml) the "joboccupationid" element
         */
        void xsetJoboccupationid(org.apache.xmlbeans.XmlString joboccupationid);
        
        /**
         * Gets the "jobcategory" element
         */
        java.lang.String getJobcategory();
        
        /**
         * Gets (as xml) the "jobcategory" element
         */
        org.apache.xmlbeans.XmlString xgetJobcategory();
        
        /**
         * Sets the "jobcategory" element
         */
        void setJobcategory(java.lang.String jobcategory);
        
        /**
         * Sets (as xml) the "jobcategory" element
         */
        void xsetJobcategory(org.apache.xmlbeans.XmlString jobcategory);
        
        /**
         * Gets the "jobcategoryid" element
         */
        java.lang.String getJobcategoryid();
        
        /**
         * Gets (as xml) the "jobcategoryid" element
         */
        org.apache.xmlbeans.XmlString xgetJobcategoryid();
        
        /**
         * Sets the "jobcategoryid" element
         */
        void setJobcategoryid(java.lang.String jobcategoryid);
        
        /**
         * Sets (as xml) the "jobcategoryid" element
         */
        void xsetJobcategoryid(org.apache.xmlbeans.XmlString jobcategoryid);
        
        /**
         * Gets the "service" element
         */
        java.lang.String getService();
        
        /**
         * Gets (as xml) the "service" element
         */
        org.apache.xmlbeans.XmlString xgetService();
        
        /**
         * Sets the "service" element
         */
        void setService(java.lang.String service);
        
        /**
         * Sets (as xml) the "service" element
         */
        void xsetService(org.apache.xmlbeans.XmlString service);
        
        /**
         * Gets the "servicecategory" element
         */
        java.lang.String getServicecategory();
        
        /**
         * Gets (as xml) the "servicecategory" element
         */
        org.apache.xmlbeans.XmlString xgetServicecategory();
        
        /**
         * Sets the "servicecategory" element
         */
        void setServicecategory(java.lang.String servicecategory);
        
        /**
         * Sets (as xml) the "servicecategory" element
         */
        void xsetServicecategory(org.apache.xmlbeans.XmlString servicecategory);
        
        /**
         * Gets the "country" element
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "country" element
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * Sets the "country" element
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "country" element
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Gets the "countryid" element
         */
        java.lang.String getCountryid();
        
        /**
         * Gets (as xml) the "countryid" element
         */
        org.apache.xmlbeans.XmlString xgetCountryid();
        
        /**
         * Sets the "countryid" element
         */
        void setCountryid(java.lang.String countryid);
        
        /**
         * Sets (as xml) the "countryid" element
         */
        void xsetCountryid(org.apache.xmlbeans.XmlString countryid);
        
        /**
         * Gets the "state" element
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * Sets the "state" element
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Gets the "stateid" element
         */
        java.lang.String getStateid();
        
        /**
         * Gets (as xml) the "stateid" element
         */
        org.apache.xmlbeans.XmlString xgetStateid();
        
        /**
         * Sets the "stateid" element
         */
        void setStateid(java.lang.String stateid);
        
        /**
         * Sets (as xml) the "stateid" element
         */
        void xsetStateid(org.apache.xmlbeans.XmlString stateid);
        
        /**
         * Gets the "municipality" element
         */
        java.lang.String getMunicipality();
        
        /**
         * Gets (as xml) the "municipality" element
         */
        org.apache.xmlbeans.XmlString xgetMunicipality();
        
        /**
         * Sets the "municipality" element
         */
        void setMunicipality(java.lang.String municipality);
        
        /**
         * Sets (as xml) the "municipality" element
         */
        void xsetMunicipality(org.apache.xmlbeans.XmlString municipality);
        
        /**
         * Gets the "municipalityid" element
         */
        java.lang.String getMunicipalityid();
        
        /**
         * Gets (as xml) the "municipalityid" element
         */
        org.apache.xmlbeans.XmlString xgetMunicipalityid();
        
        /**
         * Sets the "municipalityid" element
         */
        void setMunicipalityid(java.lang.String municipalityid);
        
        /**
         * Sets (as xml) the "municipalityid" element
         */
        void xsetMunicipalityid(org.apache.xmlbeans.XmlString municipalityid);
        
        /**
         * Gets the "company" element
         */
        java.lang.String getCompany();
        
        /**
         * Gets (as xml) the "company" element
         */
        org.apache.xmlbeans.XmlString xgetCompany();
        
        /**
         * Sets the "company" element
         */
        void setCompany(java.lang.String company);
        
        /**
         * Sets (as xml) the "company" element
         */
        void xsetCompany(org.apache.xmlbeans.XmlString company);
        
        /**
         * Gets the "companylogourl" element
         */
        java.lang.String getCompanylogourl();
        
        /**
         * Gets (as xml) the "companylogourl" element
         */
        org.apache.xmlbeans.XmlString xgetCompanylogourl();
        
        /**
         * True if has "companylogourl" element
         */
        boolean isSetCompanylogourl();
        
        /**
         * Sets the "companylogourl" element
         */
        void setCompanylogourl(java.lang.String companylogourl);
        
        /**
         * Sets (as xml) the "companylogourl" element
         */
        void xsetCompanylogourl(org.apache.xmlbeans.XmlString companylogourl);
        
        /**
         * Unsets the "companylogourl" element
         */
        void unsetCompanylogourl();
        
        /**
         * Gets the "employmentextent" element
         */
        java.lang.String getEmploymentextent();
        
        /**
         * Gets (as xml) the "employmentextent" element
         */
        org.apache.xmlbeans.XmlString xgetEmploymentextent();
        
        /**
         * Sets the "employmentextent" element
         */
        void setEmploymentextent(java.lang.String employmentextent);
        
        /**
         * Sets (as xml) the "employmentextent" element
         */
        void xsetEmploymentextent(org.apache.xmlbeans.XmlString employmentextent);
        
        /**
         * Gets the "employmentextentid" element
         */
        java.lang.String getEmploymentextentid();
        
        /**
         * Gets (as xml) the "employmentextentid" element
         */
        org.apache.xmlbeans.XmlString xgetEmploymentextentid();
        
        /**
         * Sets the "employmentextentid" element
         */
        void setEmploymentextentid(java.lang.String employmentextentid);
        
        /**
         * Sets (as xml) the "employmentextentid" element
         */
        void xsetEmploymentextentid(org.apache.xmlbeans.XmlString employmentextentid);
        
        /**
         * Gets the "employmenttype" element
         */
        java.lang.String getEmploymenttype();
        
        /**
         * Gets (as xml) the "employmenttype" element
         */
        org.apache.xmlbeans.XmlString xgetEmploymenttype();
        
        /**
         * Sets the "employmenttype" element
         */
        void setEmploymenttype(java.lang.String employmenttype);
        
        /**
         * Sets (as xml) the "employmenttype" element
         */
        void xsetEmploymenttype(org.apache.xmlbeans.XmlString employmenttype);
        
        /**
         * Gets the "employmenttypeid" element
         */
        java.lang.String getEmploymenttypeid();
        
        /**
         * Gets (as xml) the "employmenttypeid" element
         */
        org.apache.xmlbeans.XmlString xgetEmploymenttypeid();
        
        /**
         * Sets the "employmenttypeid" element
         */
        void setEmploymenttypeid(java.lang.String employmenttypeid);
        
        /**
         * Sets (as xml) the "employmenttypeid" element
         */
        void xsetEmploymenttypeid(org.apache.xmlbeans.XmlString employmenttypeid);
        
        /**
         * Gets the "joblevel" element
         */
        java.lang.String getJoblevel();
        
        /**
         * Gets (as xml) the "joblevel" element
         */
        org.apache.xmlbeans.XmlString xgetJoblevel();
        
        /**
         * Sets the "joblevel" element
         */
        void setJoblevel(java.lang.String joblevel);
        
        /**
         * Sets (as xml) the "joblevel" element
         */
        void xsetJoblevel(org.apache.xmlbeans.XmlString joblevel);
        
        /**
         * Gets the "joblevelid" element
         */
        java.lang.String getJoblevelid();
        
        /**
         * Gets (as xml) the "joblevelid" element
         */
        org.apache.xmlbeans.XmlString xgetJoblevelid();
        
        /**
         * Sets the "joblevelid" element
         */
        void setJoblevelid(java.lang.String joblevelid);
        
        /**
         * Sets (as xml) the "joblevelid" element
         */
        void xsetJoblevelid(org.apache.xmlbeans.XmlString joblevelid);
        
        /**
         * Gets the "contact1name" element
         */
        java.lang.String getContact1Name();
        
        /**
         * Gets (as xml) the "contact1name" element
         */
        org.apache.xmlbeans.XmlString xgetContact1Name();
        
        /**
         * True if has "contact1name" element
         */
        boolean isSetContact1Name();
        
        /**
         * Sets the "contact1name" element
         */
        void setContact1Name(java.lang.String contact1Name);
        
        /**
         * Sets (as xml) the "contact1name" element
         */
        void xsetContact1Name(org.apache.xmlbeans.XmlString contact1Name);
        
        /**
         * Unsets the "contact1name" element
         */
        void unsetContact1Name();
        
        /**
         * Gets the "contact1email" element
         */
        java.lang.String getContact1Email();
        
        /**
         * Gets (as xml) the "contact1email" element
         */
        org.apache.xmlbeans.XmlString xgetContact1Email();
        
        /**
         * True if has "contact1email" element
         */
        boolean isSetContact1Email();
        
        /**
         * Sets the "contact1email" element
         */
        void setContact1Email(java.lang.String contact1Email);
        
        /**
         * Sets (as xml) the "contact1email" element
         */
        void xsetContact1Email(org.apache.xmlbeans.XmlString contact1Email);
        
        /**
         * Unsets the "contact1email" element
         */
        void unsetContact1Email();
        
        /**
         * Gets the "contact1phone" element
         */
        java.lang.String getContact1Phone();
        
        /**
         * Gets (as xml) the "contact1phone" element
         */
        org.apache.xmlbeans.XmlString xgetContact1Phone();
        
        /**
         * True if has "contact1phone" element
         */
        boolean isSetContact1Phone();
        
        /**
         * Sets the "contact1phone" element
         */
        void setContact1Phone(java.lang.String contact1Phone);
        
        /**
         * Sets (as xml) the "contact1phone" element
         */
        void xsetContact1Phone(org.apache.xmlbeans.XmlString contact1Phone);
        
        /**
         * Unsets the "contact1phone" element
         */
        void unsetContact1Phone();
        
        /**
         * Gets the "contact2name" element
         */
        java.lang.String getContact2Name();
        
        /**
         * Gets (as xml) the "contact2name" element
         */
        org.apache.xmlbeans.XmlString xgetContact2Name();
        
        /**
         * True if has "contact2name" element
         */
        boolean isSetContact2Name();
        
        /**
         * Sets the "contact2name" element
         */
        void setContact2Name(java.lang.String contact2Name);
        
        /**
         * Sets (as xml) the "contact2name" element
         */
        void xsetContact2Name(org.apache.xmlbeans.XmlString contact2Name);
        
        /**
         * Unsets the "contact2name" element
         */
        void unsetContact2Name();
        
        /**
         * Gets the "contact2email" element
         */
        java.lang.String getContact2Email();
        
        /**
         * Gets (as xml) the "contact2email" element
         */
        org.apache.xmlbeans.XmlString xgetContact2Email();
        
        /**
         * True if has "contact2email" element
         */
        boolean isSetContact2Email();
        
        /**
         * Sets the "contact2email" element
         */
        void setContact2Email(java.lang.String contact2Email);
        
        /**
         * Sets (as xml) the "contact2email" element
         */
        void xsetContact2Email(org.apache.xmlbeans.XmlString contact2Email);
        
        /**
         * Unsets the "contact2email" element
         */
        void unsetContact2Email();
        
        /**
         * Gets the "contact2phone" element
         */
        java.lang.String getContact2Phone();
        
        /**
         * Gets (as xml) the "contact2phone" element
         */
        org.apache.xmlbeans.XmlString xgetContact2Phone();
        
        /**
         * True if has "contact2phone" element
         */
        boolean isSetContact2Phone();
        
        /**
         * Sets the "contact2phone" element
         */
        void setContact2Phone(java.lang.String contact2Phone);
        
        /**
         * Sets (as xml) the "contact2phone" element
         */
        void xsetContact2Phone(org.apache.xmlbeans.XmlString contact2Phone);
        
        /**
         * Unsets the "contact2phone" element
         */
        void unsetContact2Phone();
        
        /**
         * Gets the "contact3name" element
         */
        java.lang.String getContact3Name();
        
        /**
         * Gets (as xml) the "contact3name" element
         */
        org.apache.xmlbeans.XmlString xgetContact3Name();
        
        /**
         * True if has "contact3name" element
         */
        boolean isSetContact3Name();
        
        /**
         * Sets the "contact3name" element
         */
        void setContact3Name(java.lang.String contact3Name);
        
        /**
         * Sets (as xml) the "contact3name" element
         */
        void xsetContact3Name(org.apache.xmlbeans.XmlString contact3Name);
        
        /**
         * Unsets the "contact3name" element
         */
        void unsetContact3Name();
        
        /**
         * Gets the "contact3email" element
         */
        java.lang.String getContact3Email();
        
        /**
         * Gets (as xml) the "contact3email" element
         */
        org.apache.xmlbeans.XmlString xgetContact3Email();
        
        /**
         * True if has "contact3email" element
         */
        boolean isSetContact3Email();
        
        /**
         * Sets the "contact3email" element
         */
        void setContact3Email(java.lang.String contact3Email);
        
        /**
         * Sets (as xml) the "contact3email" element
         */
        void xsetContact3Email(org.apache.xmlbeans.XmlString contact3Email);
        
        /**
         * Unsets the "contact3email" element
         */
        void unsetContact3Email();
        
        /**
         * Gets the "contact3phone" element
         */
        java.lang.String getContact3Phone();
        
        /**
         * Gets (as xml) the "contact3phone" element
         */
        org.apache.xmlbeans.XmlString xgetContact3Phone();
        
        /**
         * True if has "contact3phone" element
         */
        boolean isSetContact3Phone();
        
        /**
         * Sets the "contact3phone" element
         */
        void setContact3Phone(java.lang.String contact3Phone);
        
        /**
         * Sets (as xml) the "contact3phone" element
         */
        void xsetContact3Phone(org.apache.xmlbeans.XmlString contact3Phone);
        
        /**
         * Unsets the "contact3phone" element
         */
        void unsetContact3Phone();
        
        /**
         * Gets the "pubdateto" element
         */
        java.lang.String getPubdateto();
        
        /**
         * Gets (as xml) the "pubdateto" element
         */
        org.apache.xmlbeans.XmlString xgetPubdateto();
        
        /**
         * Sets the "pubdateto" element
         */
        void setPubdateto(java.lang.String pubdateto);
        
        /**
         * Sets (as xml) the "pubdateto" element
         */
        void xsetPubdateto(org.apache.xmlbeans.XmlString pubdateto);
        
        /**
         * Gets the "lastupdated" element
         */
        java.lang.String getLastupdated();
        
        /**
         * Gets (as xml) the "lastupdated" element
         */
        org.apache.xmlbeans.XmlString xgetLastupdated();
        
        /**
         * Sets the "lastupdated" element
         */
        void setLastupdated(java.lang.String lastupdated);
        
        /**
         * Sets (as xml) the "lastupdated" element
         */
        void xsetLastupdated(org.apache.xmlbeans.XmlString lastupdated);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item newInstance() {
              return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument newInstance() {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.rettbemanning.ItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
