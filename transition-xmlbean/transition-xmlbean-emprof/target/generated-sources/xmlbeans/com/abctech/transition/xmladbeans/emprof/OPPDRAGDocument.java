/*
 * An XML document type.
 * Localname: OPPDRAG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one OPPDRAG(@) element.
 *
 * This is a complex type.
 */
public interface OPPDRAGDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OPPDRAGDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("oppdraga5aadoctype");
    
    /**
     * Gets the "OPPDRAG" element
     */
    com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG getOPPDRAG();
    
    /**
     * Sets the "OPPDRAG" element
     */
    void setOPPDRAG(com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG oppdrag);
    
    /**
     * Appends and returns a new empty "OPPDRAG" element
     */
    com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG addNewOPPDRAG();
    
    /**
     * An XML OPPDRAG(@).
     *
     * This is a complex type.
     */
    public interface OPPDRAG extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OPPDRAG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("oppdrag07a9elemtype");
        
        /**
         * Gets the "STATUS" element
         */
        java.lang.String getSTATUS();
        
        /**
         * Gets (as xml) the "STATUS" element
         */
        org.apache.xmlbeans.XmlString xgetSTATUS();
        
        /**
         * Sets the "STATUS" element
         */
        void setSTATUS(java.lang.String status);
        
        /**
         * Sets (as xml) the "STATUS" element
         */
        void xsetSTATUS(org.apache.xmlbeans.XmlString status);
        
        /**
         * Gets the "OPPDRAGSNR" element
         */
        java.lang.String getOPPDRAGSNR();
        
        /**
         * Gets (as xml) the "OPPDRAGSNR" element
         */
        org.apache.xmlbeans.XmlString xgetOPPDRAGSNR();
        
        /**
         * Sets the "OPPDRAGSNR" element
         */
        void setOPPDRAGSNR(java.lang.String oppdragsnr);
        
        /**
         * Sets (as xml) the "OPPDRAGSNR" element
         */
        void xsetOPPDRAGSNR(org.apache.xmlbeans.XmlString oppdragsnr);
        
        /**
         * Gets the "EIENDOMSNAVN" element
         */
        java.lang.String getEIENDOMSNAVN();
        
        /**
         * Gets (as xml) the "EIENDOMSNAVN" element
         */
        org.apache.xmlbeans.XmlString xgetEIENDOMSNAVN();
        
        /**
         * Sets the "EIENDOMSNAVN" element
         */
        void setEIENDOMSNAVN(java.lang.String eiendomsnavn);
        
        /**
         * Sets (as xml) the "EIENDOMSNAVN" element
         */
        void xsetEIENDOMSNAVN(org.apache.xmlbeans.XmlString eiendomsnavn);
        
        /**
         * Gets the "OVERSKRIFT1" element
         */
        java.lang.String getOVERSKRIFT1();
        
        /**
         * Gets (as xml) the "OVERSKRIFT1" element
         */
        org.apache.xmlbeans.XmlString xgetOVERSKRIFT1();
        
        /**
         * Sets the "OVERSKRIFT1" element
         */
        void setOVERSKRIFT1(java.lang.String overskrift1);
        
        /**
         * Sets (as xml) the "OVERSKRIFT1" element
         */
        void xsetOVERSKRIFT1(org.apache.xmlbeans.XmlString overskrift1);
        
        /**
         * Gets the "BOLIGTYPE" element
         */
        java.lang.String getBOLIGTYPE();
        
        /**
         * Gets (as xml) the "BOLIGTYPE" element
         */
        org.apache.xmlbeans.XmlString xgetBOLIGTYPE();
        
        /**
         * Sets the "BOLIGTYPE" element
         */
        void setBOLIGTYPE(java.lang.String boligtype);
        
        /**
         * Sets (as xml) the "BOLIGTYPE" element
         */
        void xsetBOLIGTYPE(org.apache.xmlbeans.XmlString boligtype);
        
        /**
         * Gets the "OPPDRAGHOVEDTYPE" element
         */
        java.math.BigInteger getOPPDRAGHOVEDTYPE();
        
        /**
         * Gets (as xml) the "OPPDRAGHOVEDTYPE" element
         */
        org.apache.xmlbeans.XmlInteger xgetOPPDRAGHOVEDTYPE();
        
        /**
         * Sets the "OPPDRAGHOVEDTYPE" element
         */
        void setOPPDRAGHOVEDTYPE(java.math.BigInteger oppdraghovedtype);
        
        /**
         * Sets (as xml) the "OPPDRAGHOVEDTYPE" element
         */
        void xsetOPPDRAGHOVEDTYPE(org.apache.xmlbeans.XmlInteger oppdraghovedtype);
        
        /**
         * Gets the "KOMMUNENR" element
         */
        java.lang.String getKOMMUNENR();
        
        /**
         * Gets (as xml) the "KOMMUNENR" element
         */
        org.apache.xmlbeans.XmlString xgetKOMMUNENR();
        
        /**
         * Sets the "KOMMUNENR" element
         */
        void setKOMMUNENR(java.lang.String kommunenr);
        
        /**
         * Sets (as xml) the "KOMMUNENR" element
         */
        void xsetKOMMUNENR(org.apache.xmlbeans.XmlString kommunenr);
        
        /**
         * Gets the "TOMTESTORRELSE" element
         */
        java.math.BigInteger getTOMTESTORRELSE();
        
        /**
         * Gets (as xml) the "TOMTESTORRELSE" element
         */
        org.apache.xmlbeans.XmlInteger xgetTOMTESTORRELSE();
        
        /**
         * Sets the "TOMTESTORRELSE" element
         */
        void setTOMTESTORRELSE(java.math.BigInteger tomtestorrelse);
        
        /**
         * Sets (as xml) the "TOMTESTORRELSE" element
         */
        void xsetTOMTESTORRELSE(org.apache.xmlbeans.XmlInteger tomtestorrelse);
        
        /**
         * Gets the "PRISANTYDNING_LEDETEKST" element
         */
        java.lang.String getPRISANTYDNINGLEDETEKST();
        
        /**
         * Gets (as xml) the "PRISANTYDNING_LEDETEKST" element
         */
        org.apache.xmlbeans.XmlString xgetPRISANTYDNINGLEDETEKST();
        
        /**
         * Sets the "PRISANTYDNING_LEDETEKST" element
         */
        void setPRISANTYDNINGLEDETEKST(java.lang.String prisantydningledetekst);
        
        /**
         * Sets (as xml) the "PRISANTYDNING_LEDETEKST" element
         */
        void xsetPRISANTYDNINGLEDETEKST(org.apache.xmlbeans.XmlString prisantydningledetekst);
        
        /**
         * Gets the "PRISANTYDNING_VERDI" element
         */
        java.math.BigInteger getPRISANTYDNINGVERDI();
        
        /**
         * Gets (as xml) the "PRISANTYDNING_VERDI" element
         */
        org.apache.xmlbeans.XmlInteger xgetPRISANTYDNINGVERDI();
        
        /**
         * Sets the "PRISANTYDNING_VERDI" element
         */
        void setPRISANTYDNINGVERDI(java.math.BigInteger prisantydningverdi);
        
        /**
         * Sets (as xml) the "PRISANTYDNING_VERDI" element
         */
        void xsetPRISANTYDNINGVERDI(org.apache.xmlbeans.XmlInteger prisantydningverdi);
        
        /**
         * Gets the "GNR" element
         */
        java.lang.String getGNR();
        
        /**
         * Gets (as xml) the "GNR" element
         */
        org.apache.xmlbeans.XmlString xgetGNR();
        
        /**
         * Sets the "GNR" element
         */
        void setGNR(java.lang.String gnr);
        
        /**
         * Sets (as xml) the "GNR" element
         */
        void xsetGNR(org.apache.xmlbeans.XmlString gnr);
        
        /**
         * Gets the "BNR" element
         */
        java.lang.String getBNR();
        
        /**
         * Gets (as xml) the "BNR" element
         */
        org.apache.xmlbeans.XmlString xgetBNR();
        
        /**
         * Sets the "BNR" element
         */
        void setBNR(java.lang.String bnr);
        
        /**
         * Sets (as xml) the "BNR" element
         */
        void xsetBNR(org.apache.xmlbeans.XmlString bnr);
        
        /**
         * Gets the "SNR" element
         */
        java.lang.String getSNR();
        
        /**
         * Gets (as xml) the "SNR" element
         */
        org.apache.xmlbeans.XmlString xgetSNR();
        
        /**
         * Sets the "SNR" element
         */
        void setSNR(java.lang.String snr);
        
        /**
         * Sets (as xml) the "SNR" element
         */
        void xsetSNR(org.apache.xmlbeans.XmlString snr);
        
        /**
         * Gets the "FNR" element
         */
        java.lang.String getFNR();
        
        /**
         * Gets (as xml) the "FNR" element
         */
        org.apache.xmlbeans.XmlString xgetFNR();
        
        /**
         * True if has "FNR" element
         */
        boolean isSetFNR();
        
        /**
         * Sets the "FNR" element
         */
        void setFNR(java.lang.String fnr);
        
        /**
         * Sets (as xml) the "FNR" element
         */
        void xsetFNR(org.apache.xmlbeans.XmlString fnr);
        
        /**
         * Unsets the "FNR" element
         */
        void unsetFNR();
        
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
         * Gets the "BRUTTOAREAL" element
         */
        java.math.BigInteger getBRUTTOAREAL();
        
        /**
         * Gets (as xml) the "BRUTTOAREAL" element
         */
        org.apache.xmlbeans.XmlInteger xgetBRUTTOAREAL();
        
        /**
         * Sets the "BRUTTOAREAL" element
         */
        void setBRUTTOAREAL(java.math.BigInteger bruttoareal);
        
        /**
         * Sets (as xml) the "BRUTTOAREAL" element
         */
        void xsetBRUTTOAREAL(org.apache.xmlbeans.XmlInteger bruttoareal);
        
        /**
         * Gets the "BOAREAL" element
         */
        java.math.BigInteger getBOAREAL();
        
        /**
         * Gets (as xml) the "BOAREAL" element
         */
        org.apache.xmlbeans.XmlInteger xgetBOAREAL();
        
        /**
         * Sets the "BOAREAL" element
         */
        void setBOAREAL(java.math.BigInteger boareal);
        
        /**
         * Sets (as xml) the "BOAREAL" element
         */
        void xsetBOAREAL(org.apache.xmlbeans.XmlInteger boareal);
        
        /**
         * Gets the "HUSLEIEINKLUDERER" element
         */
        java.lang.String getHUSLEIEINKLUDERER();
        
        /**
         * Gets (as xml) the "HUSLEIEINKLUDERER" element
         */
        org.apache.xmlbeans.XmlString xgetHUSLEIEINKLUDERER();
        
        /**
         * True if has "HUSLEIEINKLUDERER" element
         */
        boolean isSetHUSLEIEINKLUDERER();
        
        /**
         * Sets the "HUSLEIEINKLUDERER" element
         */
        void setHUSLEIEINKLUDERER(java.lang.String husleieinkluderer);
        
        /**
         * Sets (as xml) the "HUSLEIEINKLUDERER" element
         */
        void xsetHUSLEIEINKLUDERER(org.apache.xmlbeans.XmlString husleieinkluderer);
        
        /**
         * Unsets the "HUSLEIEINKLUDERER" element
         */
        void unsetHUSLEIEINKLUDERER();
        
        /**
         * Gets the "OMKOSTNINGER" element
         */
        java.lang.String getOMKOSTNINGER();
        
        /**
         * Gets (as xml) the "OMKOSTNINGER" element
         */
        org.apache.xmlbeans.XmlString xgetOMKOSTNINGER();
        
        /**
         * True if has "OMKOSTNINGER" element
         */
        boolean isSetOMKOSTNINGER();
        
        /**
         * Sets the "OMKOSTNINGER" element
         */
        void setOMKOSTNINGER(java.lang.String omkostninger);
        
        /**
         * Sets (as xml) the "OMKOSTNINGER" element
         */
        void xsetOMKOSTNINGER(org.apache.xmlbeans.XmlString omkostninger);
        
        /**
         * Unsets the "OMKOSTNINGER" element
         */
        void unsetOMKOSTNINGER();
        
        /**
         * Gets the "LAANEVILKAARFELLESGJELD" element
         */
        java.lang.String getLAANEVILKAARFELLESGJELD();
        
        /**
         * Gets (as xml) the "LAANEVILKAARFELLESGJELD" element
         */
        org.apache.xmlbeans.XmlString xgetLAANEVILKAARFELLESGJELD();
        
        /**
         * True if has "LAANEVILKAARFELLESGJELD" element
         */
        boolean isSetLAANEVILKAARFELLESGJELD();
        
        /**
         * Sets the "LAANEVILKAARFELLESGJELD" element
         */
        void setLAANEVILKAARFELLESGJELD(java.lang.String laanevilkaarfellesgjeld);
        
        /**
         * Sets (as xml) the "LAANEVILKAARFELLESGJELD" element
         */
        void xsetLAANEVILKAARFELLESGJELD(org.apache.xmlbeans.XmlString laanevilkaarfellesgjeld);
        
        /**
         * Unsets the "LAANEVILKAARFELLESGJELD" element
         */
        void unsetLAANEVILKAARFELLESGJELD();
        
        /**
         * Gets the "P-ROM" element
         */
        java.math.BigInteger getPROM();
        
        /**
         * Gets (as xml) the "P-ROM" element
         */
        org.apache.xmlbeans.XmlInteger xgetPROM();
        
        /**
         * Sets the "P-ROM" element
         */
        void setPROM(java.math.BigInteger prom);
        
        /**
         * Sets (as xml) the "P-ROM" element
         */
        void xsetPROM(org.apache.xmlbeans.XmlInteger prom);
        
        /**
         * Gets the "PRIMAERROM_BESKRIVELSE" element
         */
        java.lang.String getPRIMAERROMBESKRIVELSE();
        
        /**
         * Gets (as xml) the "PRIMAERROM_BESKRIVELSE" element
         */
        org.apache.xmlbeans.XmlString xgetPRIMAERROMBESKRIVELSE();
        
        /**
         * True if has "PRIMAERROM_BESKRIVELSE" element
         */
        boolean isSetPRIMAERROMBESKRIVELSE();
        
        /**
         * Sets the "PRIMAERROM_BESKRIVELSE" element
         */
        void setPRIMAERROMBESKRIVELSE(java.lang.String primaerrombeskrivelse);
        
        /**
         * Sets (as xml) the "PRIMAERROM_BESKRIVELSE" element
         */
        void xsetPRIMAERROMBESKRIVELSE(org.apache.xmlbeans.XmlString primaerrombeskrivelse);
        
        /**
         * Unsets the "PRIMAERROM_BESKRIVELSE" element
         */
        void unsetPRIMAERROMBESKRIVELSE();
        
        /**
         * Gets the "PRIMAEREROM_LEDERTEKST" element
         */
        java.lang.String getPRIMAEREROMLEDERTEKST();
        
        /**
         * Gets (as xml) the "PRIMAEREROM_LEDERTEKST" element
         */
        org.apache.xmlbeans.XmlString xgetPRIMAEREROMLEDERTEKST();
        
        /**
         * Sets the "PRIMAEREROM_LEDERTEKST" element
         */
        void setPRIMAEREROMLEDERTEKST(java.lang.String primaereromledertekst);
        
        /**
         * Sets (as xml) the "PRIMAEREROM_LEDERTEKST" element
         */
        void xsetPRIMAEREROMLEDERTEKST(org.apache.xmlbeans.XmlString primaereromledertekst);
        
        /**
         * Gets the "AREALBESKRIVELSE" element
         */
        java.lang.String getAREALBESKRIVELSE();
        
        /**
         * Gets (as xml) the "AREALBESKRIVELSE" element
         */
        org.apache.xmlbeans.XmlString xgetAREALBESKRIVELSE();
        
        /**
         * True if has "AREALBESKRIVELSE" element
         */
        boolean isSetAREALBESKRIVELSE();
        
        /**
         * Sets the "AREALBESKRIVELSE" element
         */
        void setAREALBESKRIVELSE(java.lang.String arealbeskrivelse);
        
        /**
         * Sets (as xml) the "AREALBESKRIVELSE" element
         */
        void xsetAREALBESKRIVELSE(org.apache.xmlbeans.XmlString arealbeskrivelse);
        
        /**
         * Unsets the "AREALBESKRIVELSE" element
         */
        void unsetAREALBESKRIVELSE();
        
        /**
         * Gets the "EIERFORM" element
         */
        java.lang.String getEIERFORM();
        
        /**
         * Gets (as xml) the "EIERFORM" element
         */
        org.apache.xmlbeans.XmlString xgetEIERFORM();
        
        /**
         * Sets the "EIERFORM" element
         */
        void setEIERFORM(java.lang.String eierform);
        
        /**
         * Sets (as xml) the "EIERFORM" element
         */
        void xsetEIERFORM(org.apache.xmlbeans.XmlString eierform);
        
        /**
         * Gets the "EIERFORMTOMT" element
         */
        java.lang.String getEIERFORMTOMT();
        
        /**
         * Gets (as xml) the "EIERFORMTOMT" element
         */
        org.apache.xmlbeans.XmlString xgetEIERFORMTOMT();
        
        /**
         * Sets the "EIERFORMTOMT" element
         */
        void setEIERFORMTOMT(java.lang.String eierformtomt);
        
        /**
         * Sets (as xml) the "EIERFORMTOMT" element
         */
        void xsetEIERFORMTOMT(org.apache.xmlbeans.XmlString eierformtomt);
        
        /**
         * Gets the "TOMTEBESKRIVELSE" element
         */
        java.lang.String getTOMTEBESKRIVELSE();
        
        /**
         * Gets (as xml) the "TOMTEBESKRIVELSE" element
         */
        org.apache.xmlbeans.XmlString xgetTOMTEBESKRIVELSE();
        
        /**
         * Sets the "TOMTEBESKRIVELSE" element
         */
        void setTOMTEBESKRIVELSE(java.lang.String tomtebeskrivelse);
        
        /**
         * Sets (as xml) the "TOMTEBESKRIVELSE" element
         */
        void xsetTOMTEBESKRIVELSE(org.apache.xmlbeans.XmlString tomtebeskrivelse);
        
        /**
         * Gets the "INNHOLD" element
         */
        java.lang.String getINNHOLD();
        
        /**
         * Gets (as xml) the "INNHOLD" element
         */
        org.apache.xmlbeans.XmlString xgetINNHOLD();
        
        /**
         * True if has "INNHOLD" element
         */
        boolean isSetINNHOLD();
        
        /**
         * Sets the "INNHOLD" element
         */
        void setINNHOLD(java.lang.String innhold);
        
        /**
         * Sets (as xml) the "INNHOLD" element
         */
        void xsetINNHOLD(org.apache.xmlbeans.XmlString innhold);
        
        /**
         * Unsets the "INNHOLD" element
         */
        void unsetINNHOLD();
        
        /**
         * Gets the "STANDARD" element
         */
        java.lang.String getSTANDARD();
        
        /**
         * Gets (as xml) the "STANDARD" element
         */
        org.apache.xmlbeans.XmlString xgetSTANDARD();
        
        /**
         * True if has "STANDARD" element
         */
        boolean isSetSTANDARD();
        
        /**
         * Sets the "STANDARD" element
         */
        void setSTANDARD(java.lang.String standard);
        
        /**
         * Sets (as xml) the "STANDARD" element
         */
        void xsetSTANDARD(org.apache.xmlbeans.XmlString standard);
        
        /**
         * Unsets the "STANDARD" element
         */
        void unsetSTANDARD();
        
        /**
         * Gets the "BELIGGENHET" element
         */
        java.lang.String getBELIGGENHET();
        
        /**
         * Gets (as xml) the "BELIGGENHET" element
         */
        org.apache.xmlbeans.XmlString xgetBELIGGENHET();
        
        /**
         * Sets the "BELIGGENHET" element
         */
        void setBELIGGENHET(java.lang.String beliggenhet);
        
        /**
         * Sets (as xml) the "BELIGGENHET" element
         */
        void xsetBELIGGENHET(org.apache.xmlbeans.XmlString beliggenhet);
        
        /**
         * Gets the "ADKOMST" element
         */
        java.lang.String getADKOMST();
        
        /**
         * Gets (as xml) the "ADKOMST" element
         */
        org.apache.xmlbeans.XmlString xgetADKOMST();
        
        /**
         * Sets the "ADKOMST" element
         */
        void setADKOMST(java.lang.String adkomst);
        
        /**
         * Sets (as xml) the "ADKOMST" element
         */
        void xsetADKOMST(org.apache.xmlbeans.XmlString adkomst);
        
        /**
         * Gets the "ANTALL_SOVEROM" element
         */
        java.math.BigInteger getANTALLSOVEROM();
        
        /**
         * Gets (as xml) the "ANTALL_SOVEROM" element
         */
        org.apache.xmlbeans.XmlInteger xgetANTALLSOVEROM();
        
        /**
         * Sets the "ANTALL_SOVEROM" element
         */
        void setANTALLSOVEROM(java.math.BigInteger antallsoverom);
        
        /**
         * Sets (as xml) the "ANTALL_SOVEROM" element
         */
        void xsetANTALLSOVEROM(org.apache.xmlbeans.XmlInteger antallsoverom);
        
        /**
         * Gets the "BYGGEAAR" element
         */
        java.math.BigInteger getBYGGEAAR();
        
        /**
         * Gets (as xml) the "BYGGEAAR" element
         */
        org.apache.xmlbeans.XmlInteger xgetBYGGEAAR();
        
        /**
         * Sets the "BYGGEAAR" element
         */
        void setBYGGEAAR(java.math.BigInteger byggeaar);
        
        /**
         * Sets (as xml) the "BYGGEAAR" element
         */
        void xsetBYGGEAAR(org.apache.xmlbeans.XmlInteger byggeaar);
        
        /**
         * Gets the "MODERNISERINGSAAR" element
         */
        java.math.BigInteger getMODERNISERINGSAAR();
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR" element
         */
        org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAAR();
        
        /**
         * Sets the "MODERNISERINGSAAR" element
         */
        void setMODERNISERINGSAAR(java.math.BigInteger moderniseringsaar);
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR" element
         */
        void xsetMODERNISERINGSAAR(org.apache.xmlbeans.XmlInteger moderniseringsaar);
        
        /**
         * Gets the "MODERNISERINGSAAR_INNVENDIG" element
         */
        java.math.BigInteger getMODERNISERINGSAARINNVENDIG();
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
         */
        org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARINNVENDIG();
        
        /**
         * Sets the "MODERNISERINGSAAR_INNVENDIG" element
         */
        void setMODERNISERINGSAARINNVENDIG(java.math.BigInteger moderniseringsaarinnvendig);
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
         */
        void xsetMODERNISERINGSAARINNVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarinnvendig);
        
        /**
         * Gets the "MODERNISERINGSAAR_UTVENDIG" element
         */
        java.math.BigInteger getMODERNISERINGSAARUTVENDIG();
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
         */
        org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARUTVENDIG();
        
        /**
         * Sets the "MODERNISERINGSAAR_UTVENDIG" element
         */
        void setMODERNISERINGSAARUTVENDIG(java.math.BigInteger moderniseringsaarutvendig);
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
         */
        void xsetMODERNISERINGSAARUTVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarutvendig);
        
        /**
         * Gets the "POSTNR" element
         */
        java.lang.String getPOSTNR();
        
        /**
         * Gets (as xml) the "POSTNR" element
         */
        org.apache.xmlbeans.XmlString xgetPOSTNR();
        
        /**
         * Sets the "POSTNR" element
         */
        void setPOSTNR(java.lang.String postnr);
        
        /**
         * Sets (as xml) the "POSTNR" element
         */
        void xsetPOSTNR(org.apache.xmlbeans.XmlString postnr);
        
        /**
         * Gets the "POSTSTED" element
         */
        java.lang.String getPOSTSTED();
        
        /**
         * Gets (as xml) the "POSTSTED" element
         */
        org.apache.xmlbeans.XmlString xgetPOSTSTED();
        
        /**
         * Sets the "POSTSTED" element
         */
        void setPOSTSTED(java.lang.String poststed);
        
        /**
         * Sets (as xml) the "POSTSTED" element
         */
        void xsetPOSTSTED(org.apache.xmlbeans.XmlString poststed);
        
        /**
         * Gets the "ETASJE" element
         */
        java.math.BigInteger getETASJE();
        
        /**
         * Gets (as xml) the "ETASJE" element
         */
        org.apache.xmlbeans.XmlInteger xgetETASJE();
        
        /**
         * Sets the "ETASJE" element
         */
        void setETASJE(java.math.BigInteger etasje);
        
        /**
         * Sets (as xml) the "ETASJE" element
         */
        void xsetETASJE(org.apache.xmlbeans.XmlInteger etasje);
        
        /**
         * Gets the "VEI_VANN_KLOAKK" element
         */
        java.lang.String getVEIVANNKLOAKK();
        
        /**
         * Gets (as xml) the "VEI_VANN_KLOAKK" element
         */
        org.apache.xmlbeans.XmlString xgetVEIVANNKLOAKK();
        
        /**
         * Sets the "VEI_VANN_KLOAKK" element
         */
        void setVEIVANNKLOAKK(java.lang.String veivannkloakk);
        
        /**
         * Sets (as xml) the "VEI_VANN_KLOAKK" element
         */
        void xsetVEIVANNKLOAKK(org.apache.xmlbeans.XmlString veivannkloakk);
        
        /**
         * Gets the "FELLESUTGIFTER" element
         */
        java.lang.String getFELLESUTGIFTER();
        
        /**
         * Gets (as xml) the "FELLESUTGIFTER" element
         */
        org.apache.xmlbeans.XmlString xgetFELLESUTGIFTER();
        
        /**
         * True if has "FELLESUTGIFTER" element
         */
        boolean isSetFELLESUTGIFTER();
        
        /**
         * Sets the "FELLESUTGIFTER" element
         */
        void setFELLESUTGIFTER(java.lang.String fellesutgifter);
        
        /**
         * Sets (as xml) the "FELLESUTGIFTER" element
         */
        void xsetFELLESUTGIFTER(org.apache.xmlbeans.XmlString fellesutgifter);
        
        /**
         * Unsets the "FELLESUTGIFTER" element
         */
        void unsetFELLESUTGIFTER();
        
        /**
         * Gets the "FELLESGJELD" element
         */
        java.lang.String getFELLESGJELD();
        
        /**
         * Gets (as xml) the "FELLESGJELD" element
         */
        org.apache.xmlbeans.XmlString xgetFELLESGJELD();
        
        /**
         * True if has "FELLESGJELD" element
         */
        boolean isSetFELLESGJELD();
        
        /**
         * Sets the "FELLESGJELD" element
         */
        void setFELLESGJELD(java.lang.String fellesgjeld);
        
        /**
         * Sets (as xml) the "FELLESGJELD" element
         */
        void xsetFELLESGJELD(org.apache.xmlbeans.XmlString fellesgjeld);
        
        /**
         * Unsets the "FELLESGJELD" element
         */
        void unsetFELLESGJELD();
        
        /**
         * Gets the "FESTEAVGIFT" element
         */
        java.lang.String getFESTEAVGIFT();
        
        /**
         * Gets (as xml) the "FESTEAVGIFT" element
         */
        org.apache.xmlbeans.XmlString xgetFESTEAVGIFT();
        
        /**
         * True if has "FESTEAVGIFT" element
         */
        boolean isSetFESTEAVGIFT();
        
        /**
         * Sets the "FESTEAVGIFT" element
         */
        void setFESTEAVGIFT(java.lang.String festeavgift);
        
        /**
         * Sets (as xml) the "FESTEAVGIFT" element
         */
        void xsetFESTEAVGIFT(org.apache.xmlbeans.XmlString festeavgift);
        
        /**
         * Unsets the "FESTEAVGIFT" element
         */
        void unsetFESTEAVGIFT();
        
        /**
         * Gets the "MARKEDSVERDI" element
         */
        java.math.BigInteger getMARKEDSVERDI();
        
        /**
         * Gets (as xml) the "MARKEDSVERDI" element
         */
        org.apache.xmlbeans.XmlInteger xgetMARKEDSVERDI();
        
        /**
         * Sets the "MARKEDSVERDI" element
         */
        void setMARKEDSVERDI(java.math.BigInteger markedsverdi);
        
        /**
         * Sets (as xml) the "MARKEDSVERDI" element
         */
        void xsetMARKEDSVERDI(org.apache.xmlbeans.XmlInteger markedsverdi);
        
        /**
         * Gets the "LAANEVERDI" element
         */
        java.math.BigInteger getLAANEVERDI();
        
        /**
         * Gets (as xml) the "LAANEVERDI" element
         */
        org.apache.xmlbeans.XmlInteger xgetLAANEVERDI();
        
        /**
         * Sets the "LAANEVERDI" element
         */
        void setLAANEVERDI(java.math.BigInteger laaneverdi);
        
        /**
         * Sets (as xml) the "LAANEVERDI" element
         */
        void xsetLAANEVERDI(org.apache.xmlbeans.XmlInteger laaneverdi);
        
        /**
         * Gets the "SAKSBEHANDLER_NAVN" element
         */
        java.lang.String getSAKSBEHANDLERNAVN();
        
        /**
         * Gets (as xml) the "SAKSBEHANDLER_NAVN" element
         */
        org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERNAVN();
        
        /**
         * Sets the "SAKSBEHANDLER_NAVN" element
         */
        void setSAKSBEHANDLERNAVN(java.lang.String saksbehandlernavn);
        
        /**
         * Sets (as xml) the "SAKSBEHANDLER_NAVN" element
         */
        void xsetSAKSBEHANDLERNAVN(org.apache.xmlbeans.XmlString saksbehandlernavn);
        
        /**
         * Gets the "SAKSBEHANDLER_EMAIL" element
         */
        java.lang.String getSAKSBEHANDLEREMAIL();
        
        /**
         * Gets (as xml) the "SAKSBEHANDLER_EMAIL" element
         */
        org.apache.xmlbeans.XmlString xgetSAKSBEHANDLEREMAIL();
        
        /**
         * Sets the "SAKSBEHANDLER_EMAIL" element
         */
        void setSAKSBEHANDLEREMAIL(java.lang.String saksbehandleremail);
        
        /**
         * Sets (as xml) the "SAKSBEHANDLER_EMAIL" element
         */
        void xsetSAKSBEHANDLEREMAIL(org.apache.xmlbeans.XmlString saksbehandleremail);
        
        /**
         * Gets the "SAKSBEHANDLERS_TELEFON" element
         */
        java.lang.String getSAKSBEHANDLERSTELEFON();
        
        /**
         * Gets (as xml) the "SAKSBEHANDLERS_TELEFON" element
         */
        org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSTELEFON();
        
        /**
         * Sets the "SAKSBEHANDLERS_TELEFON" element
         */
        void setSAKSBEHANDLERSTELEFON(java.lang.String saksbehandlerstelefon);
        
        /**
         * Sets (as xml) the "SAKSBEHANDLERS_TELEFON" element
         */
        void xsetSAKSBEHANDLERSTELEFON(org.apache.xmlbeans.XmlString saksbehandlerstelefon);
        
        /**
         * Gets the "SAKSBEHANDLERS_MOBIL" element
         */
        java.lang.String getSAKSBEHANDLERSMOBIL();
        
        /**
         * Gets (as xml) the "SAKSBEHANDLERS_MOBIL" element
         */
        org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSMOBIL();
        
        /**
         * Sets the "SAKSBEHANDLERS_MOBIL" element
         */
        void setSAKSBEHANDLERSMOBIL(java.lang.String saksbehandlersmobil);
        
        /**
         * Sets (as xml) the "SAKSBEHANDLERS_MOBIL" element
         */
        void xsetSAKSBEHANDLERSMOBIL(org.apache.xmlbeans.XmlString saksbehandlersmobil);
        
        /**
         * Gets the "VISNINGSAVTALE" element
         */
        java.lang.String getVISNINGSAVTALE();
        
        /**
         * Gets (as xml) the "VISNINGSAVTALE" element
         */
        org.apache.xmlbeans.XmlString xgetVISNINGSAVTALE();
        
        /**
         * Sets the "VISNINGSAVTALE" element
         */
        void setVISNINGSAVTALE(java.lang.String visningsavtale);
        
        /**
         * Sets (as xml) the "VISNINGSAVTALE" element
         */
        void xsetVISNINGSAVTALE(org.apache.xmlbeans.XmlString visningsavtale);
        
        /**
         * Gets array of all "VISNINGSTIDER" elements
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[] getVISNINGSTIDERArray();
        
        /**
         * Gets ith "VISNINGSTIDER" element
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER getVISNINGSTIDERArray(int i);
        
        /**
         * Returns number of "VISNINGSTIDER" element
         */
        int sizeOfVISNINGSTIDERArray();
        
        /**
         * Sets array of all "VISNINGSTIDER" element
         */
        void setVISNINGSTIDERArray(com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[] visningstiderArray);
        
        /**
         * Sets ith "VISNINGSTIDER" element
         */
        void setVISNINGSTIDERArray(int i, com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER visningstider);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VISNINGSTIDER" element
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER insertNewVISNINGSTIDER(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VISNINGSTIDER" element
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER addNewVISNINGSTIDER();
        
        /**
         * Removes the ith "VISNINGSTIDER" element
         */
        void removeVISNINGSTIDER(int i);
        
        /**
         * Gets array of all "VEDLEGG" elements
         */
        com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[] getVEDLEGGArray();
        
        /**
         * Gets ith "VEDLEGG" element
         */
        com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG getVEDLEGGArray(int i);
        
        /**
         * Returns number of "VEDLEGG" element
         */
        int sizeOfVEDLEGGArray();
        
        /**
         * Sets array of all "VEDLEGG" element
         */
        void setVEDLEGGArray(com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[] vedleggArray);
        
        /**
         * Sets ith "VEDLEGG" element
         */
        void setVEDLEGGArray(int i, com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG vedlegg);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VEDLEGG" element
         */
        com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG insertNewVEDLEGG(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VEDLEGG" element
         */
        com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG addNewVEDLEGG();
        
        /**
         * Removes the ith "VEDLEGG" element
         */
        void removeVEDLEGG(int i);
        
        /**
         * Gets array of all "LINKER" elements
         */
        com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[] getLINKERArray();
        
        /**
         * Gets ith "LINKER" element
         */
        com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER getLINKERArray(int i);
        
        /**
         * Returns number of "LINKER" element
         */
        int sizeOfLINKERArray();
        
        /**
         * Sets array of all "LINKER" element
         */
        void setLINKERArray(com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[] linkerArray);
        
        /**
         * Sets ith "LINKER" element
         */
        void setLINKERArray(int i, com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER linker);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LINKER" element
         */
        com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER insertNewLINKER(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LINKER" element
         */
        com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER addNewLINKER();
        
        /**
         * Removes the ith "LINKER" element
         */
        void removeLINKER(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
