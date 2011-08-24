/*
 * An XML document type.
 * Localname: ESTATE_DEVELOPMENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one ESTATE_DEVELOPMENT(@) element.
 *
 * This is a complex type.
 */
public interface ESTATEDEVELOPMENTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEDEVELOPMENTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estatedevelopment68e1doctype");
    
    /**
     * Gets the "ESTATE_DEVELOPMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT getESTATEDEVELOPMENT();
    
    /**
     * Sets the "ESTATE_DEVELOPMENT" element
     */
    void setESTATEDEVELOPMENT(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT estatedevelopment);
    
    /**
     * Appends and returns a new empty "ESTATE_DEVELOPMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT addNewESTATEDEVELOPMENT();
    
    /**
     * An XML ESTATE_DEVELOPMENT(@).
     *
     * This is a complex type.
     */
    public interface ESTATEDEVELOPMENT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEDEVELOPMENT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estatedevelopmentcc2delemtype");
        
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
         * Gets the "AREA_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE getAREARANGE();
        
        /**
         * True if has "AREA_RANGE" element
         */
        boolean isSetAREARANGE();
        
        /**
         * Sets the "AREA_RANGE" element
         */
        void setAREARANGE(com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE arearange);
        
        /**
         * Appends and returns a new empty "AREA_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE addNewAREARANGE();
        
        /**
         * Unsets the "AREA_RANGE" element
         */
        void unsetAREARANGE();
        
        /**
         * Gets the "PRICE_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE getPRICERANGE();
        
        /**
         * True if has "PRICE_RANGE" element
         */
        boolean isSetPRICERANGE();
        
        /**
         * Sets the "PRICE_RANGE" element
         */
        void setPRICERANGE(com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE pricerange);
        
        /**
         * Appends and returns a new empty "PRICE_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE addNewPRICERANGE();
        
        /**
         * Unsets the "PRICE_RANGE" element
         */
        void unsetPRICERANGE();
        
        /**
         * Gets the "ESTATE_COLLECTIVE_DEBT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT getESTATECOLLECTIVEDEBT();
        
        /**
         * True if has "ESTATE_COLLECTIVE_DEBT" element
         */
        boolean isSetESTATECOLLECTIVEDEBT();
        
        /**
         * Sets the "ESTATE_COLLECTIVE_DEBT" element
         */
        void setESTATECOLLECTIVEDEBT(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT estatecollectivedebt);
        
        /**
         * Appends and returns a new empty "ESTATE_COLLECTIVE_DEBT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT addNewESTATECOLLECTIVEDEBT();
        
        /**
         * Unsets the "ESTATE_COLLECTIVE_DEBT" element
         */
        void unsetESTATECOLLECTIVEDEBT();
        
        /**
         * Gets the "RENT_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE getRENTRANGE();
        
        /**
         * True if has "RENT_RANGE" element
         */
        boolean isSetRENTRANGE();
        
        /**
         * Sets the "RENT_RANGE" element
         */
        void setRENTRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE rentrange);
        
        /**
         * Appends and returns a new empty "RENT_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE addNewRENTRANGE();
        
        /**
         * Unsets the "RENT_RANGE" element
         */
        void unsetRENTRANGE();
        
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
         * Gets the "PROGRESS" element
         */
        java.lang.String getPROGRESS();
        
        /**
         * Gets (as xml) the "PROGRESS" element
         */
        org.apache.xmlbeans.XmlString xgetPROGRESS();
        
        /**
         * True if has "PROGRESS" element
         */
        boolean isSetPROGRESS();
        
        /**
         * Sets the "PROGRESS" element
         */
        void setPROGRESS(java.lang.String progress);
        
        /**
         * Sets (as xml) the "PROGRESS" element
         */
        void xsetPROGRESS(org.apache.xmlbeans.XmlString progress);
        
        /**
         * Unsets the "PROGRESS" element
         */
        void unsetPROGRESS();
        
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
         * Gets the "PART_OWNERSHIP" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP getPARTOWNERSHIP();
        
        /**
         * True if has "PART_OWNERSHIP" element
         */
        boolean isSetPARTOWNERSHIP();
        
        /**
         * Sets the "PART_OWNERSHIP" element
         */
        void setPARTOWNERSHIP(com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP partownership);
        
        /**
         * Appends and returns a new empty "PART_OWNERSHIP" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP addNewPARTOWNERSHIP();
        
        /**
         * Unsets the "PART_OWNERSHIP" element
         */
        void unsetPARTOWNERSHIP();
        
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
         * Gets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        java.lang.String getESTATEEXTERNALORDERURL();
        
        /**
         * Gets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        org.apache.xmlbeans.XmlString xgetESTATEEXTERNALORDERURL();
        
        /**
         * True if has "ESTATE_EXTERNAL_ORDER_URL" element
         */
        boolean isSetESTATEEXTERNALORDERURL();
        
        /**
         * Sets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        void setESTATEEXTERNALORDERURL(java.lang.String estateexternalorderurl);
        
        /**
         * Sets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        void xsetESTATEEXTERNALORDERURL(org.apache.xmlbeans.XmlString estateexternalorderurl);
        
        /**
         * Unsets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        void unsetESTATEEXTERNALORDERURL();
        
        /**
         * Gets the "NO_OF_ROOMS_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE getNOOFROOMSRANGE();
        
        /**
         * True if has "NO_OF_ROOMS_RANGE" element
         */
        boolean isSetNOOFROOMSRANGE();
        
        /**
         * Sets the "NO_OF_ROOMS_RANGE" element
         */
        void setNOOFROOMSRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE noofroomsrange);
        
        /**
         * Appends and returns a new empty "NO_OF_ROOMS_RANGE" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE addNewNOOFROOMSRANGE();
        
        /**
         * Unsets the "NO_OF_ROOMS_RANGE" element
         */
        void unsetNOOFROOMSRANGE();
        
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
         * Gets array of all "FINANCIAL_AGENT" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[] getFINANCIALAGENTArray();
        
        /**
         * Gets ith "FINANCIAL_AGENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT getFINANCIALAGENTArray(int i);
        
        /**
         * Returns number of "FINANCIAL_AGENT" element
         */
        int sizeOfFINANCIALAGENTArray();
        
        /**
         * Sets array of all "FINANCIAL_AGENT" element
         */
        void setFINANCIALAGENTArray(com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[] financialagentArray);
        
        /**
         * Sets ith "FINANCIAL_AGENT" element
         */
        void setFINANCIALAGENTArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT financialagent);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FINANCIAL_AGENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT insertNewFINANCIALAGENT(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FINANCIAL_AGENT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT addNewFINANCIALAGENT();
        
        /**
         * Removes the ith "FINANCIAL_AGENT" element
         */
        void removeFINANCIALAGENT(int i);
        
        /**
         * Gets array of all "DEVELOPER" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[] getDEVELOPERArray();
        
        /**
         * Gets ith "DEVELOPER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER getDEVELOPERArray(int i);
        
        /**
         * Returns number of "DEVELOPER" element
         */
        int sizeOfDEVELOPERArray();
        
        /**
         * Sets array of all "DEVELOPER" element
         */
        void setDEVELOPERArray(com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[] developerArray);
        
        /**
         * Sets ith "DEVELOPER" element
         */
        void setDEVELOPERArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER developer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DEVELOPER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER insertNewDEVELOPER(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DEVELOPER" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER addNewDEVELOPER();
        
        /**
         * Removes the ith "DEVELOPER" element
         */
        void removeDEVELOPER(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
