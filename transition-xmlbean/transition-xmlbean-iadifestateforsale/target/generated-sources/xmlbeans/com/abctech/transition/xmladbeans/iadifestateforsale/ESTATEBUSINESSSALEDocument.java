/*
 * An XML document type.
 * Localname: ESTATE_BUSINESS_SALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one ESTATE_BUSINESS_SALE(@) element.
 *
 * This is a complex type.
 */
public interface ESTATEBUSINESSSALEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEBUSINESSSALEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estatebusinesssalef7acdoctype");
    
    /**
     * Gets the "ESTATE_BUSINESS_SALE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE getESTATEBUSINESSSALE();
    
    /**
     * Sets the "ESTATE_BUSINESS_SALE" element
     */
    void setESTATEBUSINESSSALE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE estatebusinesssale);
    
    /**
     * Appends and returns a new empty "ESTATE_BUSINESS_SALE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE addNewESTATEBUSINESSSALE();
    
    /**
     * An XML ESTATE_BUSINESS_SALE(@).
     *
     * This is a complex type.
     */
    public interface ESTATEBUSINESSSALE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEBUSINESSSALE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estatebusinesssale448delemtype");
        
        /**
         * Gets array of all "ESTATE_PREFERENCE" elements
         */
        java.lang.String[] getESTATEPREFERENCEArray();
        
        /**
         * Gets ith "ESTATE_PREFERENCE" element
         */
        java.lang.String getESTATEPREFERENCEArray(int i);
        
        /**
         * Gets (as xml) array of all "ESTATE_PREFERENCE" elements
         */
        org.apache.xmlbeans.XmlString[] xgetESTATEPREFERENCEArray();
        
        /**
         * Gets (as xml) ith "ESTATE_PREFERENCE" element
         */
        org.apache.xmlbeans.XmlString xgetESTATEPREFERENCEArray(int i);
        
        /**
         * Returns number of "ESTATE_PREFERENCE" element
         */
        int sizeOfESTATEPREFERENCEArray();
        
        /**
         * Sets array of all "ESTATE_PREFERENCE" element
         */
        void setESTATEPREFERENCEArray(java.lang.String[] estatepreferenceArray);
        
        /**
         * Sets ith "ESTATE_PREFERENCE" element
         */
        void setESTATEPREFERENCEArray(int i, java.lang.String estatepreference);
        
        /**
         * Sets (as xml) array of all "ESTATE_PREFERENCE" element
         */
        void xsetESTATEPREFERENCEArray(org.apache.xmlbeans.XmlString[] estatepreferenceArray);
        
        /**
         * Sets (as xml) ith "ESTATE_PREFERENCE" element
         */
        void xsetESTATEPREFERENCEArray(int i, org.apache.xmlbeans.XmlString estatepreference);
        
        /**
         * Inserts the value as the ith "ESTATE_PREFERENCE" element
         */
        void insertESTATEPREFERENCE(int i, java.lang.String estatepreference);
        
        /**
         * Appends the value as the last "ESTATE_PREFERENCE" element
         */
        void addESTATEPREFERENCE(java.lang.String estatepreference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ESTATE_PREFERENCE" element
         */
        org.apache.xmlbeans.XmlString insertNewESTATEPREFERENCE(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ESTATE_PREFERENCE" element
         */
        org.apache.xmlbeans.XmlString addNewESTATEPREFERENCE();
        
        /**
         * Removes the ith "ESTATE_PREFERENCE" element
         */
        void removeESTATEPREFERENCE(int i);
        
        /**
         * Gets array of all "FACILITIES" elements
         */
        java.lang.String[] getFACILITIESArray();
        
        /**
         * Gets ith "FACILITIES" element
         */
        java.lang.String getFACILITIESArray(int i);
        
        /**
         * Gets (as xml) array of all "FACILITIES" elements
         */
        org.apache.xmlbeans.XmlString[] xgetFACILITIESArray();
        
        /**
         * Gets (as xml) ith "FACILITIES" element
         */
        org.apache.xmlbeans.XmlString xgetFACILITIESArray(int i);
        
        /**
         * Returns number of "FACILITIES" element
         */
        int sizeOfFACILITIESArray();
        
        /**
         * Sets array of all "FACILITIES" element
         */
        void setFACILITIESArray(java.lang.String[] facilitiesArray);
        
        /**
         * Sets ith "FACILITIES" element
         */
        void setFACILITIESArray(int i, java.lang.String facilities);
        
        /**
         * Sets (as xml) array of all "FACILITIES" element
         */
        void xsetFACILITIESArray(org.apache.xmlbeans.XmlString[] facilitiesArray);
        
        /**
         * Sets (as xml) ith "FACILITIES" element
         */
        void xsetFACILITIESArray(int i, org.apache.xmlbeans.XmlString facilities);
        
        /**
         * Inserts the value as the ith "FACILITIES" element
         */
        void insertFACILITIES(int i, java.lang.String facilities);
        
        /**
         * Appends the value as the last "FACILITIES" element
         */
        void addFACILITIES(java.lang.String facilities);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FACILITIES" element
         */
        org.apache.xmlbeans.XmlString insertNewFACILITIES(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FACILITIES" element
         */
        org.apache.xmlbeans.XmlString addNewFACILITIES();
        
        /**
         * Removes the ith "FACILITIES" element
         */
        void removeFACILITIES(int i);
        
        /**
         * Gets array of all "MAPMATRIX" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[] getMAPMATRIXArray();
        
        /**
         * Gets ith "MAPMATRIX" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX getMAPMATRIXArray(int i);
        
        /**
         * Returns number of "MAPMATRIX" element
         */
        int sizeOfMAPMATRIXArray();
        
        /**
         * Sets array of all "MAPMATRIX" element
         */
        void setMAPMATRIXArray(com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[] mapmatrixArray);
        
        /**
         * Sets ith "MAPMATRIX" element
         */
        void setMAPMATRIXArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX mapmatrix);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MAPMATRIX" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX insertNewMAPMATRIX(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MAPMATRIX" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX addNewMAPMATRIX();
        
        /**
         * Removes the ith "MAPMATRIX" element
         */
        void removeMAPMATRIX(int i);
        
        /**
         * Gets array of all "BOLIGNUMMER" elements
         */
        java.lang.String[] getBOLIGNUMMERArray();
        
        /**
         * Gets ith "BOLIGNUMMER" element
         */
        java.lang.String getBOLIGNUMMERArray(int i);
        
        /**
         * Gets (as xml) array of all "BOLIGNUMMER" elements
         */
        org.apache.xmlbeans.XmlString[] xgetBOLIGNUMMERArray();
        
        /**
         * Gets (as xml) ith "BOLIGNUMMER" element
         */
        org.apache.xmlbeans.XmlString xgetBOLIGNUMMERArray(int i);
        
        /**
         * Returns number of "BOLIGNUMMER" element
         */
        int sizeOfBOLIGNUMMERArray();
        
        /**
         * Sets array of all "BOLIGNUMMER" element
         */
        void setBOLIGNUMMERArray(java.lang.String[] bolignummerArray);
        
        /**
         * Sets ith "BOLIGNUMMER" element
         */
        void setBOLIGNUMMERArray(int i, java.lang.String bolignummer);
        
        /**
         * Sets (as xml) array of all "BOLIGNUMMER" element
         */
        void xsetBOLIGNUMMERArray(org.apache.xmlbeans.XmlString[] bolignummerArray);
        
        /**
         * Sets (as xml) ith "BOLIGNUMMER" element
         */
        void xsetBOLIGNUMMERArray(int i, org.apache.xmlbeans.XmlString bolignummer);
        
        /**
         * Inserts the value as the ith "BOLIGNUMMER" element
         */
        void insertBOLIGNUMMER(int i, java.lang.String bolignummer);
        
        /**
         * Appends the value as the last "BOLIGNUMMER" element
         */
        void addBOLIGNUMMER(java.lang.String bolignummer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BOLIGNUMMER" element
         */
        org.apache.xmlbeans.XmlString insertNewBOLIGNUMMER(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BOLIGNUMMER" element
         */
        org.apache.xmlbeans.XmlString addNewBOLIGNUMMER();
        
        /**
         * Removes the ith "BOLIGNUMMER" element
         */
        void removeBOLIGNUMMER(int i);
        
        /**
         * Gets array of all "VIEWING" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] getVIEWINGArray();
        
        /**
         * Gets ith "VIEWING" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING getVIEWINGArray(int i);
        
        /**
         * Returns number of "VIEWING" element
         */
        int sizeOfVIEWINGArray();
        
        /**
         * Sets array of all "VIEWING" element
         */
        void setVIEWINGArray(com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] viewingArray);
        
        /**
         * Sets ith "VIEWING" element
         */
        void setVIEWINGArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING viewing);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VIEWING" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING insertNewVIEWING(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VIEWING" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING addNewVIEWING();
        
        /**
         * Removes the ith "VIEWING" element
         */
        void removeVIEWING(int i);
        
        /**
         * Gets array of all "PROPERTY_TYPE" elements
         */
        java.lang.String[] getPROPERTYTYPEArray();
        
        /**
         * Gets ith "PROPERTY_TYPE" element
         */
        java.lang.String getPROPERTYTYPEArray(int i);
        
        /**
         * Gets (as xml) array of all "PROPERTY_TYPE" elements
         */
        org.apache.xmlbeans.XmlString[] xgetPROPERTYTYPEArray();
        
        /**
         * Gets (as xml) ith "PROPERTY_TYPE" element
         */
        org.apache.xmlbeans.XmlString xgetPROPERTYTYPEArray(int i);
        
        /**
         * Returns number of "PROPERTY_TYPE" element
         */
        int sizeOfPROPERTYTYPEArray();
        
        /**
         * Sets array of all "PROPERTY_TYPE" element
         */
        void setPROPERTYTYPEArray(java.lang.String[] propertytypeArray);
        
        /**
         * Sets ith "PROPERTY_TYPE" element
         */
        void setPROPERTYTYPEArray(int i, java.lang.String propertytype);
        
        /**
         * Sets (as xml) array of all "PROPERTY_TYPE" element
         */
        void xsetPROPERTYTYPEArray(org.apache.xmlbeans.XmlString[] propertytypeArray);
        
        /**
         * Sets (as xml) ith "PROPERTY_TYPE" element
         */
        void xsetPROPERTYTYPEArray(int i, org.apache.xmlbeans.XmlString propertytype);
        
        /**
         * Inserts the value as the ith "PROPERTY_TYPE" element
         */
        void insertPROPERTYTYPE(int i, java.lang.String propertytype);
        
        /**
         * Appends the value as the last "PROPERTY_TYPE" element
         */
        void addPROPERTYTYPE(java.lang.String propertytype);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PROPERTY_TYPE" element
         */
        org.apache.xmlbeans.XmlString insertNewPROPERTYTYPE(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PROPERTY_TYPE" element
         */
        org.apache.xmlbeans.XmlString addNewPROPERTYTYPE();
        
        /**
         * Removes the ith "PROPERTY_TYPE" element
         */
        void removePROPERTYTYPE(int i);
        
        /**
         * Gets the "NO_OF_ROOMS" element
         */
        java.lang.String getNOOFROOMS();
        
        /**
         * Gets (as xml) the "NO_OF_ROOMS" element
         */
        org.apache.xmlbeans.XmlString xgetNOOFROOMS();
        
        /**
         * True if has "NO_OF_ROOMS" element
         */
        boolean isSetNOOFROOMS();
        
        /**
         * Sets the "NO_OF_ROOMS" element
         */
        void setNOOFROOMS(java.lang.String noofrooms);
        
        /**
         * Sets (as xml) the "NO_OF_ROOMS" element
         */
        void xsetNOOFROOMS(org.apache.xmlbeans.XmlString noofrooms);
        
        /**
         * Unsets the "NO_OF_ROOMS" element
         */
        void unsetNOOFROOMS();
        
        /**
         * Gets the "NO_OF_PARKING_SPOTS" element
         */
        java.lang.String getNOOFPARKINGSPOTS();
        
        /**
         * Gets (as xml) the "NO_OF_PARKING_SPOTS" element
         */
        org.apache.xmlbeans.XmlString xgetNOOFPARKINGSPOTS();
        
        /**
         * True if has "NO_OF_PARKING_SPOTS" element
         */
        boolean isSetNOOFPARKINGSPOTS();
        
        /**
         * Sets the "NO_OF_PARKING_SPOTS" element
         */
        void setNOOFPARKINGSPOTS(java.lang.String noofparkingspots);
        
        /**
         * Sets (as xml) the "NO_OF_PARKING_SPOTS" element
         */
        void xsetNOOFPARKINGSPOTS(org.apache.xmlbeans.XmlString noofparkingspots);
        
        /**
         * Unsets the "NO_OF_PARKING_SPOTS" element
         */
        void unsetNOOFPARKINGSPOTS();
        
        /**
         * Gets the "ESTATE_SIZE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE getESTATESIZE();
        
        /**
         * Sets the "ESTATE_SIZE" element
         */
        void setESTATESIZE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE estatesize);
        
        /**
         * Appends and returns a new empty "ESTATE_SIZE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE addNewESTATESIZE();
        
        /**
         * Gets the "AREA_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE getAREARANGE();
        
        /**
         * Sets the "AREA_RANGE" element
         */
        void setAREARANGE(com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE arearange);
        
        /**
         * Appends and returns a new empty "AREA_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE addNewAREARANGE();
        
        /**
         * Gets the "FLOOR" element
         */
        java.lang.String getFLOOR();
        
        /**
         * Gets (as xml) the "FLOOR" element
         */
        org.apache.xmlbeans.XmlString xgetFLOOR();
        
        /**
         * True if has "FLOOR" element
         */
        boolean isSetFLOOR();
        
        /**
         * Sets the "FLOOR" element
         */
        void setFLOOR(java.lang.String floor);
        
        /**
         * Sets (as xml) the "FLOOR" element
         */
        void xsetFLOOR(org.apache.xmlbeans.XmlString floor);
        
        /**
         * Unsets the "FLOOR" element
         */
        void unsetFLOOR();
        
        /**
         * Gets the "NO_OF_FLOORS" element
         */
        java.lang.String getNOOFFLOORS();
        
        /**
         * Gets (as xml) the "NO_OF_FLOORS" element
         */
        org.apache.xmlbeans.XmlString xgetNOOFFLOORS();
        
        /**
         * True if has "NO_OF_FLOORS" element
         */
        boolean isSetNOOFFLOORS();
        
        /**
         * Sets the "NO_OF_FLOORS" element
         */
        void setNOOFFLOORS(java.lang.String nooffloors);
        
        /**
         * Sets (as xml) the "NO_OF_FLOORS" element
         */
        void xsetNOOFFLOORS(org.apache.xmlbeans.XmlString nooffloors);
        
        /**
         * Unsets the "NO_OF_FLOORS" element
         */
        void unsetNOOFFLOORS();
        
        /**
         * Gets the "PLOT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT getPLOT();
        
        /**
         * True if has "PLOT" element
         */
        boolean isSetPLOT();
        
        /**
         * Sets the "PLOT" element
         */
        void setPLOT(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT plot);
        
        /**
         * Appends and returns a new empty "PLOT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT addNewPLOT();
        
        /**
         * Unsets the "PLOT" element
         */
        void unsetPLOT();
        
        /**
         * Gets the "OWNERSHIP_TYPE" element
         */
        java.lang.String getOWNERSHIPTYPE();
        
        /**
         * Gets (as xml) the "OWNERSHIP_TYPE" element
         */
        org.apache.xmlbeans.XmlString xgetOWNERSHIPTYPE();
        
        /**
         * Sets the "OWNERSHIP_TYPE" element
         */
        void setOWNERSHIPTYPE(java.lang.String ownershiptype);
        
        /**
         * Sets (as xml) the "OWNERSHIP_TYPE" element
         */
        void xsetOWNERSHIPTYPE(org.apache.xmlbeans.XmlString ownershiptype);
        
        /**
         * Gets the "ESTATE_PRICE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE getESTATEPRICE();
        
        /**
         * True if has "ESTATE_PRICE" element
         */
        boolean isSetESTATEPRICE();
        
        /**
         * Sets the "ESTATE_PRICE" element
         */
        void setESTATEPRICE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE estateprice);
        
        /**
         * Appends and returns a new empty "ESTATE_PRICE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE addNewESTATEPRICE();
        
        /**
         * Unsets the "ESTATE_PRICE" element
         */
        void unsetESTATEPRICE();
        
        /**
         * Gets the "RENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT getRENT();
        
        /**
         * True if has "RENT" element
         */
        boolean isSetRENT();
        
        /**
         * Sets the "RENT" element
         */
        void setRENT(com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT rent);
        
        /**
         * Appends and returns a new empty "RENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT addNewRENT();
        
        /**
         * Unsets the "RENT" element
         */
        void unsetRENT();
        
        /**
         * Gets the "CONSTRUCTION_YEAR" element
         */
        java.lang.String getCONSTRUCTIONYEAR();
        
        /**
         * Gets (as xml) the "CONSTRUCTION_YEAR" element
         */
        org.apache.xmlbeans.XmlString xgetCONSTRUCTIONYEAR();
        
        /**
         * True if has "CONSTRUCTION_YEAR" element
         */
        boolean isSetCONSTRUCTIONYEAR();
        
        /**
         * Sets the "CONSTRUCTION_YEAR" element
         */
        void setCONSTRUCTIONYEAR(java.lang.String constructionyear);
        
        /**
         * Sets (as xml) the "CONSTRUCTION_YEAR" element
         */
        void xsetCONSTRUCTIONYEAR(org.apache.xmlbeans.XmlString constructionyear);
        
        /**
         * Unsets the "CONSTRUCTION_YEAR" element
         */
        void unsetCONSTRUCTIONYEAR();
        
        /**
         * Gets the "RENOVATED_YEAR" element
         */
        java.lang.String getRENOVATEDYEAR();
        
        /**
         * Gets (as xml) the "RENOVATED_YEAR" element
         */
        org.apache.xmlbeans.XmlString xgetRENOVATEDYEAR();
        
        /**
         * True if has "RENOVATED_YEAR" element
         */
        boolean isSetRENOVATEDYEAR();
        
        /**
         * Sets the "RENOVATED_YEAR" element
         */
        void setRENOVATEDYEAR(java.lang.String renovatedyear);
        
        /**
         * Sets (as xml) the "RENOVATED_YEAR" element
         */
        void xsetRENOVATEDYEAR(org.apache.xmlbeans.XmlString renovatedyear);
        
        /**
         * Unsets the "RENOVATED_YEAR" element
         */
        void unsetRENOVATEDYEAR();
        
        /**
         * Gets the "NUMBER_OF_UNITS" element
         */
        java.lang.String getNUMBEROFUNITS();
        
        /**
         * Gets (as xml) the "NUMBER_OF_UNITS" element
         */
        org.apache.xmlbeans.XmlString xgetNUMBEROFUNITS();
        
        /**
         * True if has "NUMBER_OF_UNITS" element
         */
        boolean isSetNUMBEROFUNITS();
        
        /**
         * Sets the "NUMBER_OF_UNITS" element
         */
        void setNUMBEROFUNITS(java.lang.String numberofunits);
        
        /**
         * Sets (as xml) the "NUMBER_OF_UNITS" element
         */
        void xsetNUMBEROFUNITS(org.apache.xmlbeans.XmlString numberofunits);
        
        /**
         * Unsets the "NUMBER_OF_UNITS" element
         */
        void unsetNUMBEROFUNITS();
        
        /**
         * Gets array of all "GENERAL_TEXT_REALESTATE" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] getGENERALTEXTREALESTATEArray();
        
        /**
         * Gets ith "GENERAL_TEXT_REALESTATE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE getGENERALTEXTREALESTATEArray(int i);
        
        /**
         * Returns number of "GENERAL_TEXT_REALESTATE" element
         */
        int sizeOfGENERALTEXTREALESTATEArray();
        
        /**
         * Sets array of all "GENERAL_TEXT_REALESTATE" element
         */
        void setGENERALTEXTREALESTATEArray(com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestateArray);
        
        /**
         * Sets ith "GENERAL_TEXT_REALESTATE" element
         */
        void setGENERALTEXTREALESTATEArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE generaltextrealestate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GENERAL_TEXT_REALESTATE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE insertNewGENERALTEXTREALESTATE(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GENERAL_TEXT_REALESTATE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE addNewGENERALTEXTREALESTATE();
        
        /**
         * Removes the ith "GENERAL_TEXT_REALESTATE" element
         */
        void removeGENERALTEXTREALESTATE(int i);
        
        /**
         * Gets array of all "MOREINFO" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[] getMOREINFOArray();
        
        /**
         * Gets ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO getMOREINFOArray(int i);
        
        /**
         * Returns number of "MOREINFO" element
         */
        int sizeOfMOREINFOArray();
        
        /**
         * Sets array of all "MOREINFO" element
         */
        void setMOREINFOArray(com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[] moreinfoArray);
        
        /**
         * Sets ith "MOREINFO" element
         */
        void setMOREINFOArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO moreinfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO insertNewMOREINFO(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MOREINFO" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO addNewMOREINFO();
        
        /**
         * Removes the ith "MOREINFO" element
         */
        void removeMOREINFO(int i);
        
        /**
         * Gets the "ESTATE_EXTERNAL_URL" element
         */
        java.lang.String getESTATEEXTERNALURL();
        
        /**
         * Gets (as xml) the "ESTATE_EXTERNAL_URL" element
         */
        org.apache.xmlbeans.XmlString xgetESTATEEXTERNALURL();
        
        /**
         * True if has "ESTATE_EXTERNAL_URL" element
         */
        boolean isSetESTATEEXTERNALURL();
        
        /**
         * Sets the "ESTATE_EXTERNAL_URL" element
         */
        void setESTATEEXTERNALURL(java.lang.String estateexternalurl);
        
        /**
         * Sets (as xml) the "ESTATE_EXTERNAL_URL" element
         */
        void xsetESTATEEXTERNALURL(org.apache.xmlbeans.XmlString estateexternalurl);
        
        /**
         * Unsets the "ESTATE_EXTERNAL_URL" element
         */
        void unsetESTATEEXTERNALURL();
        
        /**
         * Gets the "ACQUISITION" element
         */
        java.lang.String getACQUISITION();
        
        /**
         * Gets (as xml) the "ACQUISITION" element
         */
        org.apache.xmlbeans.XmlString xgetACQUISITION();
        
        /**
         * True if has "ACQUISITION" element
         */
        boolean isSetACQUISITION();
        
        /**
         * Sets the "ACQUISITION" element
         */
        void setACQUISITION(java.lang.String acquisition);
        
        /**
         * Sets (as xml) the "ACQUISITION" element
         */
        void xsetACQUISITION(org.apache.xmlbeans.XmlString acquisition);
        
        /**
         * Unsets the "ACQUISITION" element
         */
        void unsetACQUISITION();
        
        /**
         * Gets the "FINANCE" element
         */
        java.lang.String getFINANCE();
        
        /**
         * Gets (as xml) the "FINANCE" element
         */
        org.apache.xmlbeans.XmlString xgetFINANCE();
        
        /**
         * True if has "FINANCE" element
         */
        boolean isSetFINANCE();
        
        /**
         * Sets the "FINANCE" element
         */
        void setFINANCE(java.lang.String finance);
        
        /**
         * Sets (as xml) the "FINANCE" element
         */
        void xsetFINANCE(org.apache.xmlbeans.XmlString finance);
        
        /**
         * Unsets the "FINANCE" element
         */
        void unsetFINANCE();
        
        /**
         * Gets the "REGULATIONS" element
         */
        java.lang.String getREGULATIONS();
        
        /**
         * Gets (as xml) the "REGULATIONS" element
         */
        org.apache.xmlbeans.XmlString xgetREGULATIONS();
        
        /**
         * True if has "REGULATIONS" element
         */
        boolean isSetREGULATIONS();
        
        /**
         * Sets the "REGULATIONS" element
         */
        void setREGULATIONS(java.lang.String regulations);
        
        /**
         * Sets (as xml) the "REGULATIONS" element
         */
        void xsetREGULATIONS(org.apache.xmlbeans.XmlString regulations);
        
        /**
         * Unsets the "REGULATIONS" element
         */
        void unsetREGULATIONS();
        
        /**
         * Gets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        java.lang.String getCHANGEOFOWNERSHIPINSURANCE();
        
        /**
         * Gets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        org.apache.xmlbeans.XmlString xgetCHANGEOFOWNERSHIPINSURANCE();
        
        /**
         * True if has "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        boolean isSetCHANGEOFOWNERSHIPINSURANCE();
        
        /**
         * Sets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        void setCHANGEOFOWNERSHIPINSURANCE(java.lang.String changeofownershipinsurance);
        
        /**
         * Sets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        void xsetCHANGEOFOWNERSHIPINSURANCE(org.apache.xmlbeans.XmlString changeofownershipinsurance);
        
        /**
         * Unsets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        void unsetCHANGEOFOWNERSHIPINSURANCE();
        
        /**
         * Gets the "PREEMPTION" element
         */
        java.lang.String getPREEMPTION();
        
        /**
         * Gets (as xml) the "PREEMPTION" element
         */
        org.apache.xmlbeans.XmlString xgetPREEMPTION();
        
        /**
         * True if has "PREEMPTION" element
         */
        boolean isSetPREEMPTION();
        
        /**
         * Sets the "PREEMPTION" element
         */
        void setPREEMPTION(java.lang.String preemption);
        
        /**
         * Sets (as xml) the "PREEMPTION" element
         */
        void xsetPREEMPTION(org.apache.xmlbeans.XmlString preemption);
        
        /**
         * Unsets the "PREEMPTION" element
         */
        void unsetPREEMPTION();
        
        /**
         * Gets the "ENERGY_LABEL" element
         */
        java.lang.String getENERGYLABEL();
        
        /**
         * Gets (as xml) the "ENERGY_LABEL" element
         */
        org.apache.xmlbeans.XmlString xgetENERGYLABEL();
        
        /**
         * True if has "ENERGY_LABEL" element
         */
        boolean isSetENERGYLABEL();
        
        /**
         * Sets the "ENERGY_LABEL" element
         */
        void setENERGYLABEL(java.lang.String energylabel);
        
        /**
         * Sets (as xml) the "ENERGY_LABEL" element
         */
        void xsetENERGYLABEL(org.apache.xmlbeans.XmlString energylabel);
        
        /**
         * Unsets the "ENERGY_LABEL" element
         */
        void unsetENERGYLABEL();
        
        /**
         * Gets the "ENERGY_LABEL_COLOR_CODE" element
         */
        java.lang.String getENERGYLABELCOLORCODE();
        
        /**
         * Gets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        org.apache.xmlbeans.XmlString xgetENERGYLABELCOLORCODE();
        
        /**
         * True if has "ENERGY_LABEL_COLOR_CODE" element
         */
        boolean isSetENERGYLABELCOLORCODE();
        
        /**
         * Sets the "ENERGY_LABEL_COLOR_CODE" element
         */
        void setENERGYLABELCOLORCODE(java.lang.String energylabelcolorcode);
        
        /**
         * Sets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        void xsetENERGYLABELCOLORCODE(org.apache.xmlbeans.XmlString energylabelcolorcode);
        
        /**
         * Unsets the "ENERGY_LABEL_COLOR_CODE" element
         */
        void unsetENERGYLABELCOLORCODE();
        
        /**
         * Gets array of all "BROKER" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[] getBROKERArray();
        
        /**
         * Gets ith "BROKER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER getBROKERArray(int i);
        
        /**
         * Returns number of "BROKER" element
         */
        int sizeOfBROKERArray();
        
        /**
         * Sets array of all "BROKER" element
         */
        void setBROKERArray(com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[] brokerArray);
        
        /**
         * Sets ith "BROKER" element
         */
        void setBROKERArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER broker);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BROKER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER insertNewBROKER(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BROKER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER addNewBROKER();
        
        /**
         * Removes the ith "BROKER" element
         */
        void removeBROKER(int i);
        
        /**
         * Gets the "DEPARTMENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT getDEPARTMENT();
        
        /**
         * True if has "DEPARTMENT" element
         */
        boolean isSetDEPARTMENT();
        
        /**
         * Sets the "DEPARTMENT" element
         */
        void setDEPARTMENT(com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT department);
        
        /**
         * Appends and returns a new empty "DEPARTMENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT addNewDEPARTMENT();
        
        /**
         * Unsets the "DEPARTMENT" element
         */
        void unsetDEPARTMENT();
        
        /**
         * Gets the "BUSINESS_ENCUMBRANCE" element
         */
        java.lang.String getBUSINESSENCUMBRANCE();
        
        /**
         * Gets (as xml) the "BUSINESS_ENCUMBRANCE" element
         */
        org.apache.xmlbeans.XmlString xgetBUSINESSENCUMBRANCE();
        
        /**
         * True if has "BUSINESS_ENCUMBRANCE" element
         */
        boolean isSetBUSINESSENCUMBRANCE();
        
        /**
         * Sets the "BUSINESS_ENCUMBRANCE" element
         */
        void setBUSINESSENCUMBRANCE(java.lang.String businessencumbrance);
        
        /**
         * Sets (as xml) the "BUSINESS_ENCUMBRANCE" element
         */
        void xsetBUSINESSENCUMBRANCE(org.apache.xmlbeans.XmlString businessencumbrance);
        
        /**
         * Unsets the "BUSINESS_ENCUMBRANCE" element
         */
        void unsetBUSINESSENCUMBRANCE();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument.ESTATEBUSINESSSALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEBUSINESSSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
