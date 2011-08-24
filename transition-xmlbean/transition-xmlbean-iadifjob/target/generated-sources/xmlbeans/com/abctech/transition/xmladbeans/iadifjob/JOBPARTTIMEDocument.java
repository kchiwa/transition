/*
 * An XML document type.
 * Localname: JOB_PARTTIME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one JOB_PARTTIME(@) element.
 *
 * This is a complex type.
 */
public interface JOBPARTTIMEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOBPARTTIMEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("jobparttimee29bdoctype");
    
    /**
     * Gets the "JOB_PARTTIME" element
     */
    com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME getJOBPARTTIME();
    
    /**
     * Sets the "JOB_PARTTIME" element
     */
    void setJOBPARTTIME(com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME jobparttime);
    
    /**
     * Appends and returns a new empty "JOB_PARTTIME" element
     */
    com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME addNewJOBPARTTIME();
    
    /**
     * An XML JOB_PARTTIME(@).
     *
     * This is a complex type.
     */
    public interface JOBPARTTIME extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOBPARTTIME.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("jobparttimebaadelemtype");
        
        /**
         * Gets the "JOB_TITLE" element
         */
        java.lang.String getJOBTITLE();
        
        /**
         * Gets (as xml) the "JOB_TITLE" element
         */
        org.apache.xmlbeans.XmlString xgetJOBTITLE();
        
        /**
         * Sets the "JOB_TITLE" element
         */
        void setJOBTITLE(java.lang.String jobtitle);
        
        /**
         * Sets (as xml) the "JOB_TITLE" element
         */
        void xsetJOBTITLE(org.apache.xmlbeans.XmlString jobtitle);
        
        /**
         * Gets the "SITUATION" element
         */
        java.lang.String getSITUATION();
        
        /**
         * Gets (as xml) the "SITUATION" element
         */
        org.apache.xmlbeans.XmlString xgetSITUATION();
        
        /**
         * Sets the "SITUATION" element
         */
        void setSITUATION(java.lang.String situation);
        
        /**
         * Sets (as xml) the "SITUATION" element
         */
        void xsetSITUATION(org.apache.xmlbeans.XmlString situation);
        
        /**
         * Gets the "SECTOR" element
         */
        java.lang.String getSECTOR();
        
        /**
         * Gets (as xml) the "SECTOR" element
         */
        org.apache.xmlbeans.XmlString xgetSECTOR();
        
        /**
         * Sets the "SECTOR" element
         */
        void setSECTOR(java.lang.String sector);
        
        /**
         * Sets (as xml) the "SECTOR" element
         */
        void xsetSECTOR(org.apache.xmlbeans.XmlString sector);
        
        /**
         * Gets array of all "JOB_CATEGORY" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY[] getJOBCATEGORYArray();
        
        /**
         * Gets ith "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY getJOBCATEGORYArray(int i);
        
        /**
         * Returns number of "JOB_CATEGORY" element
         */
        int sizeOfJOBCATEGORYArray();
        
        /**
         * Sets array of all "JOB_CATEGORY" element
         */
        void setJOBCATEGORYArray(com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY[] jobcategoryArray);
        
        /**
         * Sets ith "JOB_CATEGORY" element
         */
        void setJOBCATEGORYArray(int i, com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY jobcategory);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY insertNewJOBCATEGORY(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCATEGORYDocument.JOBCATEGORY addNewJOBCATEGORY();
        
        /**
         * Removes the ith "JOB_CATEGORY" element
         */
        void removeJOBCATEGORY(int i);
        
        /**
         * Gets the "DURATION" element
         */
        java.lang.String getDURATION();
        
        /**
         * Gets (as xml) the "DURATION" element
         */
        org.apache.xmlbeans.XmlString xgetDURATION();
        
        /**
         * True if has "DURATION" element
         */
        boolean isSetDURATION();
        
        /**
         * Sets the "DURATION" element
         */
        void setDURATION(java.lang.String duration);
        
        /**
         * Sets (as xml) the "DURATION" element
         */
        void xsetDURATION(org.apache.xmlbeans.XmlString duration);
        
        /**
         * Unsets the "DURATION" element
         */
        void unsetDURATION();
        
        /**
         * Gets the "ROLE" element
         */
        java.lang.String getROLE();
        
        /**
         * Gets (as xml) the "ROLE" element
         */
        org.apache.xmlbeans.XmlString xgetROLE();
        
        /**
         * True if has "ROLE" element
         */
        boolean isSetROLE();
        
        /**
         * Sets the "ROLE" element
         */
        void setROLE(java.lang.String role);
        
        /**
         * Sets (as xml) the "ROLE" element
         */
        void xsetROLE(org.apache.xmlbeans.XmlString role);
        
        /**
         * Unsets the "ROLE" element
         */
        void unsetROLE();
        
        /**
         * Gets the "SALARY" element
         */
        java.lang.String getSALARY();
        
        /**
         * Gets (as xml) the "SALARY" element
         */
        org.apache.xmlbeans.XmlString xgetSALARY();
        
        /**
         * True if has "SALARY" element
         */
        boolean isSetSALARY();
        
        /**
         * Sets the "SALARY" element
         */
        void setSALARY(java.lang.String salary);
        
        /**
         * Sets (as xml) the "SALARY" element
         */
        void xsetSALARY(org.apache.xmlbeans.XmlString salary);
        
        /**
         * Unsets the "SALARY" element
         */
        void unsetSALARY();
        
        /**
         * Gets the "EXTENT" element
         */
        java.lang.String getEXTENT();
        
        /**
         * Gets (as xml) the "EXTENT" element
         */
        org.apache.xmlbeans.XmlString xgetEXTENT();
        
        /**
         * True if has "EXTENT" element
         */
        boolean isSetEXTENT();
        
        /**
         * Sets the "EXTENT" element
         */
        void setEXTENT(java.lang.String extent);
        
        /**
         * Sets (as xml) the "EXTENT" element
         */
        void xsetEXTENT(org.apache.xmlbeans.XmlString extent);
        
        /**
         * Unsets the "EXTENT" element
         */
        void unsetEXTENT();
        
        /**
         * Gets the "EDUCATION" element
         */
        java.lang.String getEDUCATION();
        
        /**
         * Gets (as xml) the "EDUCATION" element
         */
        org.apache.xmlbeans.XmlString xgetEDUCATION();
        
        /**
         * True if has "EDUCATION" element
         */
        boolean isSetEDUCATION();
        
        /**
         * Sets the "EDUCATION" element
         */
        void setEDUCATION(java.lang.String education);
        
        /**
         * Sets (as xml) the "EDUCATION" element
         */
        void xsetEDUCATION(org.apache.xmlbeans.XmlString education);
        
        /**
         * Unsets the "EDUCATION" element
         */
        void unsetEDUCATION();
        
        /**
         * Gets array of all "APPLICATION_ADDRESS" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] getAPPLICATIONADDRESSArray();
        
        /**
         * Gets ith "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESSArray(int i);
        
        /**
         * Returns number of "APPLICATION_ADDRESS" element
         */
        int sizeOfAPPLICATIONADDRESSArray();
        
        /**
         * Sets array of all "APPLICATION_ADDRESS" element
         */
        void setAPPLICATIONADDRESSArray(com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] applicationaddressArray);
        
        /**
         * Sets ith "APPLICATION_ADDRESS" element
         */
        void setAPPLICATIONADDRESSArray(int i, com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS insertNewAPPLICATIONADDRESS(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS();
        
        /**
         * Removes the ith "APPLICATION_ADDRESS" element
         */
        void removeAPPLICATIONADDRESS(int i);
        
        /**
         * Gets array of all "COMPANY" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY[] getCOMPANYArray();
        
        /**
         * Gets ith "COMPANY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY getCOMPANYArray(int i);
        
        /**
         * Returns number of "COMPANY" element
         */
        int sizeOfCOMPANYArray();
        
        /**
         * Sets array of all "COMPANY" element
         */
        void setCOMPANYArray(com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY[] companyArray);
        
        /**
         * Sets ith "COMPANY" element
         */
        void setCOMPANYArray(int i, com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY company);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "COMPANY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY insertNewCOMPANY(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "COMPANY" element
         */
        com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY addNewCOMPANY();
        
        /**
         * Removes the ith "COMPANY" element
         */
        void removeCOMPANY(int i);
        
        /**
         * Gets array of all "GENERAL_TEXT_JOB" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] getGENERALTEXTJOBArray();
        
        /**
         * Gets ith "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB getGENERALTEXTJOBArray(int i);
        
        /**
         * Returns number of "GENERAL_TEXT_JOB" element
         */
        int sizeOfGENERALTEXTJOBArray();
        
        /**
         * Sets array of all "GENERAL_TEXT_JOB" element
         */
        void setGENERALTEXTJOBArray(com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] generaltextjobArray);
        
        /**
         * Sets ith "GENERAL_TEXT_JOB" element
         */
        void setGENERALTEXTJOBArray(int i, com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB generaltextjob);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB insertNewGENERALTEXTJOB(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB addNewGENERALTEXTJOB();
        
        /**
         * Removes the ith "GENERAL_TEXT_JOB" element
         */
        void removeGENERALTEXTJOB(int i);
        
        /**
         * Gets the "APPLICATION_DEADLINE" element
         */
        java.lang.String getAPPLICATIONDEADLINE();
        
        /**
         * Gets (as xml) the "APPLICATION_DEADLINE" element
         */
        org.apache.xmlbeans.XmlString xgetAPPLICATIONDEADLINE();
        
        /**
         * True if has "APPLICATION_DEADLINE" element
         */
        boolean isSetAPPLICATIONDEADLINE();
        
        /**
         * Sets the "APPLICATION_DEADLINE" element
         */
        void setAPPLICATIONDEADLINE(java.lang.String applicationdeadline);
        
        /**
         * Sets (as xml) the "APPLICATION_DEADLINE" element
         */
        void xsetAPPLICATIONDEADLINE(org.apache.xmlbeans.XmlString applicationdeadline);
        
        /**
         * Unsets the "APPLICATION_DEADLINE" element
         */
        void unsetAPPLICATIONDEADLINE();
        
        /**
         * Gets the "APPLICATION_EMAIL" element
         */
        java.lang.String getAPPLICATIONEMAIL();
        
        /**
         * Gets (as xml) the "APPLICATION_EMAIL" element
         */
        org.apache.xmlbeans.XmlString xgetAPPLICATIONEMAIL();
        
        /**
         * True if has "APPLICATION_EMAIL" element
         */
        boolean isSetAPPLICATIONEMAIL();
        
        /**
         * Sets the "APPLICATION_EMAIL" element
         */
        void setAPPLICATIONEMAIL(java.lang.String applicationemail);
        
        /**
         * Sets (as xml) the "APPLICATION_EMAIL" element
         */
        void xsetAPPLICATIONEMAIL(org.apache.xmlbeans.XmlString applicationemail);
        
        /**
         * Unsets the "APPLICATION_EMAIL" element
         */
        void unsetAPPLICATIONEMAIL();
        
        /**
         * Gets the "START_DATE" element
         */
        java.lang.String getSTARTDATE();
        
        /**
         * Gets (as xml) the "START_DATE" element
         */
        org.apache.xmlbeans.XmlString xgetSTARTDATE();
        
        /**
         * True if has "START_DATE" element
         */
        boolean isSetSTARTDATE();
        
        /**
         * Sets the "START_DATE" element
         */
        void setSTARTDATE(java.lang.String startdate);
        
        /**
         * Sets (as xml) the "START_DATE" element
         */
        void xsetSTARTDATE(org.apache.xmlbeans.XmlString startdate);
        
        /**
         * Unsets the "START_DATE" element
         */
        void unsetSTARTDATE();
        
        /**
         * Gets array of all "JOB_CONTACT" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT[] getJOBCONTACTArray();
        
        /**
         * Gets ith "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT getJOBCONTACTArray(int i);
        
        /**
         * Returns number of "JOB_CONTACT" element
         */
        int sizeOfJOBCONTACTArray();
        
        /**
         * Sets array of all "JOB_CONTACT" element
         */
        void setJOBCONTACTArray(com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT[] jobcontactArray);
        
        /**
         * Sets ith "JOB_CONTACT" element
         */
        void setJOBCONTACTArray(int i, com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT jobcontact);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT insertNewJOBCONTACT(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT addNewJOBCONTACT();
        
        /**
         * Removes the ith "JOB_CONTACT" element
         */
        void removeJOBCONTACT(int i);
        
        /**
         * Gets the "APPLICATION_LABEL" element
         */
        java.lang.String getAPPLICATIONLABEL();
        
        /**
         * Gets (as xml) the "APPLICATION_LABEL" element
         */
        org.apache.xmlbeans.XmlString xgetAPPLICATIONLABEL();
        
        /**
         * Sets the "APPLICATION_LABEL" element
         */
        void setAPPLICATIONLABEL(java.lang.String applicationlabel);
        
        /**
         * Sets (as xml) the "APPLICATION_LABEL" element
         */
        void xsetAPPLICATIONLABEL(org.apache.xmlbeans.XmlString applicationlabel);
        
        /**
         * Gets the "ELECTRONIC_APPLICATION" element
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION();
        
        /**
         * True if has "ELECTRONIC_APPLICATION" element
         */
        boolean isSetELECTRONICAPPLICATION();
        
        /**
         * Sets the "ELECTRONIC_APPLICATION" element
         */
        void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication);
        
        /**
         * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION();
        
        /**
         * Unsets the "ELECTRONIC_APPLICATION" element
         */
        void unsetELECTRONICAPPLICATION();
        
        /**
         * Gets array of all "MOREINFO" elements
         */
        com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO[] getMOREINFOArray();
        
        /**
         * Gets ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO getMOREINFOArray(int i);
        
        /**
         * Returns number of "MOREINFO" element
         */
        int sizeOfMOREINFOArray();
        
        /**
         * Sets array of all "MOREINFO" element
         */
        void setMOREINFOArray(com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO[] moreinfoArray);
        
        /**
         * Sets ith "MOREINFO" element
         */
        void setMOREINFOArray(int i, com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO moreinfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO insertNewMOREINFO(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO addNewMOREINFO();
        
        /**
         * Removes the ith "MOREINFO" element
         */
        void removeMOREINFO(int i);
        
        /**
         * Gets the "NO_OF_POSITIONS" element
         */
        java.lang.String getNOOFPOSITIONS();
        
        /**
         * Gets (as xml) the "NO_OF_POSITIONS" element
         */
        org.apache.xmlbeans.XmlString xgetNOOFPOSITIONS();
        
        /**
         * Sets the "NO_OF_POSITIONS" element
         */
        void setNOOFPOSITIONS(java.lang.String noofpositions);
        
        /**
         * Sets (as xml) the "NO_OF_POSITIONS" element
         */
        void xsetNOOFPOSITIONS(org.apache.xmlbeans.XmlString noofpositions);
        
        /**
         * Gets the "ENTERPRICE_NUMBER" element
         */
        java.lang.String getENTERPRICENUMBER();
        
        /**
         * Gets (as xml) the "ENTERPRICE_NUMBER" element
         */
        org.apache.xmlbeans.XmlString xgetENTERPRICENUMBER();
        
        /**
         * True if has "ENTERPRICE_NUMBER" element
         */
        boolean isSetENTERPRICENUMBER();
        
        /**
         * Sets the "ENTERPRICE_NUMBER" element
         */
        void setENTERPRICENUMBER(java.lang.String enterpricenumber);
        
        /**
         * Sets (as xml) the "ENTERPRICE_NUMBER" element
         */
        void xsetENTERPRICENUMBER(org.apache.xmlbeans.XmlString enterpricenumber);
        
        /**
         * Unsets the "ENTERPRICE_NUMBER" element
         */
        void unsetENTERPRICENUMBER();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
