/*
 * An XML document type.
 * Localname: JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.JOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob;


/**
 * A document containing one JOB(@) element.
 *
 * This is a complex type.
 */
public interface JOBDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOBDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("job1884doctype");
    
    /**
     * Gets the "JOB" element
     */
    com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB getJOB();
    
    /**
     * Sets the "JOB" element
     */
    void setJOB(com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB job);
    
    /**
     * Appends and returns a new empty "JOB" element
     */
    com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB addNewJOB();
    
    /**
     * An XML JOB(@).
     *
     * This is a complex type.
     */
    public interface JOB extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOB.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("job89ddelemtype");
        
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
        com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[] getJOBCATEGORYArray();
        
        /**
         * Gets ith "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY getJOBCATEGORYArray(int i);
        
        /**
         * Returns number of "JOB_CATEGORY" element
         */
        int sizeOfJOBCATEGORYArray();
        
        /**
         * Sets array of all "JOB_CATEGORY" element
         */
        void setJOBCATEGORYArray(com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[] jobcategoryArray);
        
        /**
         * Sets ith "JOB_CATEGORY" element
         */
        void setJOBCATEGORYArray(int i, com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY jobcategory);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY insertNewJOBCATEGORY(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CATEGORY" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY addNewJOBCATEGORY();
        
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
        com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] getAPPLICATIONADDRESSArray();
        
        /**
         * Gets ith "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESSArray(int i);
        
        /**
         * Returns number of "APPLICATION_ADDRESS" element
         */
        int sizeOfAPPLICATIONADDRESSArray();
        
        /**
         * Sets array of all "APPLICATION_ADDRESS" element
         */
        void setAPPLICATIONADDRESSArray(com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] applicationaddressArray);
        
        /**
         * Sets ith "APPLICATION_ADDRESS" element
         */
        void setAPPLICATIONADDRESSArray(int i, com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS insertNewAPPLICATIONADDRESS(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "APPLICATION_ADDRESS" element
         */
        com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS();
        
        /**
         * Removes the ith "APPLICATION_ADDRESS" element
         */
        void removeAPPLICATIONADDRESS(int i);
        
        /**
         * Gets array of all "COMPANY" elements
         */
        com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[] getCOMPANYArray();
        
        /**
         * Gets ith "COMPANY" element
         */
        com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY getCOMPANYArray(int i);
        
        /**
         * Returns number of "COMPANY" element
         */
        int sizeOfCOMPANYArray();
        
        /**
         * Sets array of all "COMPANY" element
         */
        void setCOMPANYArray(com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[] companyArray);
        
        /**
         * Sets ith "COMPANY" element
         */
        void setCOMPANYArray(int i, com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY company);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "COMPANY" element
         */
        com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY insertNewCOMPANY(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "COMPANY" element
         */
        com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY addNewCOMPANY();
        
        /**
         * Removes the ith "COMPANY" element
         */
        void removeCOMPANY(int i);
        
        /**
         * Gets array of all "GENERAL_TEXT_JOB" elements
         */
        com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] getGENERALTEXTJOBArray();
        
        /**
         * Gets ith "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB getGENERALTEXTJOBArray(int i);
        
        /**
         * Returns number of "GENERAL_TEXT_JOB" element
         */
        int sizeOfGENERALTEXTJOBArray();
        
        /**
         * Sets array of all "GENERAL_TEXT_JOB" element
         */
        void setGENERALTEXTJOBArray(com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] generaltextjobArray);
        
        /**
         * Sets ith "GENERAL_TEXT_JOB" element
         */
        void setGENERALTEXTJOBArray(int i, com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB generaltextjob);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB insertNewGENERALTEXTJOB(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GENERAL_TEXT_JOB" element
         */
        com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB addNewGENERALTEXTJOB();
        
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
        com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[] getJOBCONTACTArray();
        
        /**
         * Gets ith "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT getJOBCONTACTArray(int i);
        
        /**
         * Returns number of "JOB_CONTACT" element
         */
        int sizeOfJOBCONTACTArray();
        
        /**
         * Sets array of all "JOB_CONTACT" element
         */
        void setJOBCONTACTArray(com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[] jobcontactArray);
        
        /**
         * Sets ith "JOB_CONTACT" element
         */
        void setJOBCONTACTArray(int i, com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT jobcontact);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT insertNewJOBCONTACT(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CONTACT" element
         */
        com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT addNewJOBCONTACT();
        
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
         * True if has "APPLICATION_LABEL" element
         */
        boolean isSetAPPLICATIONLABEL();
        
        /**
         * Sets the "APPLICATION_LABEL" element
         */
        void setAPPLICATIONLABEL(java.lang.String applicationlabel);
        
        /**
         * Sets (as xml) the "APPLICATION_LABEL" element
         */
        void xsetAPPLICATIONLABEL(org.apache.xmlbeans.XmlString applicationlabel);
        
        /**
         * Unsets the "APPLICATION_LABEL" element
         */
        void unsetAPPLICATIONLABEL();
        
        /**
         * Gets the "ELECTRONIC_APPLICATION" element
         */
        com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION();
        
        /**
         * True if has "ELECTRONIC_APPLICATION" element
         */
        boolean isSetELECTRONICAPPLICATION();
        
        /**
         * Sets the "ELECTRONIC_APPLICATION" element
         */
        void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication);
        
        /**
         * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
         */
        com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION();
        
        /**
         * Unsets the "ELECTRONIC_APPLICATION" element
         */
        void unsetELECTRONICAPPLICATION();
        
        /**
         * Gets array of all "MOREINFO" elements
         */
        com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[] getMOREINFOArray();
        
        /**
         * Gets ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO getMOREINFOArray(int i);
        
        /**
         * Returns number of "MOREINFO" element
         */
        int sizeOfMOREINFOArray();
        
        /**
         * Sets array of all "MOREINFO" element
         */
        void setMOREINFOArray(com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[] moreinfoArray);
        
        /**
         * Sets ith "MOREINFO" element
         */
        void setMOREINFOArray(int i, com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO moreinfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO insertNewMOREINFO(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO addNewMOREINFO();
        
        /**
         * Removes the ith "MOREINFO" element
         */
        void removeMOREINFO(int i);
        
        /**
         * Gets the "NO_OF_POSITIONS" element
         */
        java.math.BigInteger getNOOFPOSITIONS();
        
        /**
         * Gets (as xml) the "NO_OF_POSITIONS" element
         */
        org.apache.xmlbeans.XmlInteger xgetNOOFPOSITIONS();
        
        /**
         * Sets the "NO_OF_POSITIONS" element
         */
        void setNOOFPOSITIONS(java.math.BigInteger noofpositions);
        
        /**
         * Sets (as xml) the "NO_OF_POSITIONS" element
         */
        void xsetNOOFPOSITIONS(org.apache.xmlbeans.XmlInteger noofpositions);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB newInstance() {
              return (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument newInstance() {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.JOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.JOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
