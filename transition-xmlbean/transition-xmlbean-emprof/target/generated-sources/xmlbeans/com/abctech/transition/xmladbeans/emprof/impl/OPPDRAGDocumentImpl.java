/*
 * An XML document type.
 * Localname: OPPDRAG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one OPPDRAG(@) element.
 *
 * This is a complex type.
 */
public class OPPDRAGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument
{
    private static final long serialVersionUID = 1L;
    
    public OPPDRAGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPDRAG$0 = 
        new javax.xml.namespace.QName("", "OPPDRAG");
    
    
    /**
     * Gets the "OPPDRAG" element
     */
    public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG getOPPDRAG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().find_element_user(OPPDRAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OPPDRAG" element
     */
    public void setOPPDRAG(com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG oppdrag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().find_element_user(OPPDRAG$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().add_element_user(OPPDRAG$0);
            }
            target.set(oppdrag);
        }
    }
    
    /**
     * Appends and returns a new empty "OPPDRAG" element
     */
    public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG addNewOPPDRAG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().add_element_user(OPPDRAG$0);
            return target;
        }
    }
    /**
     * An XML OPPDRAG(@).
     *
     * This is a complex type.
     */
    public static class OPPDRAGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG
    {
        private static final long serialVersionUID = 1L;
        
        public OPPDRAGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("", "STATUS");
        private static final javax.xml.namespace.QName OPPDRAGSNR$2 = 
            new javax.xml.namespace.QName("", "OPPDRAGSNR");
        private static final javax.xml.namespace.QName EIENDOMSNAVN$4 = 
            new javax.xml.namespace.QName("", "EIENDOMSNAVN");
        private static final javax.xml.namespace.QName OVERSKRIFT1$6 = 
            new javax.xml.namespace.QName("", "OVERSKRIFT1");
        private static final javax.xml.namespace.QName BOLIGTYPE$8 = 
            new javax.xml.namespace.QName("", "BOLIGTYPE");
        private static final javax.xml.namespace.QName OPPDRAGHOVEDTYPE$10 = 
            new javax.xml.namespace.QName("", "OPPDRAGHOVEDTYPE");
        private static final javax.xml.namespace.QName KOMMUNENR$12 = 
            new javax.xml.namespace.QName("", "KOMMUNENR");
        private static final javax.xml.namespace.QName TOMTESTORRELSE$14 = 
            new javax.xml.namespace.QName("", "TOMTESTORRELSE");
        private static final javax.xml.namespace.QName PRISANTYDNINGLEDETEKST$16 = 
            new javax.xml.namespace.QName("", "PRISANTYDNING_LEDETEKST");
        private static final javax.xml.namespace.QName PRISANTYDNINGVERDI$18 = 
            new javax.xml.namespace.QName("", "PRISANTYDNING_VERDI");
        private static final javax.xml.namespace.QName GNR$20 = 
            new javax.xml.namespace.QName("", "GNR");
        private static final javax.xml.namespace.QName BNR$22 = 
            new javax.xml.namespace.QName("", "BNR");
        private static final javax.xml.namespace.QName SNR$24 = 
            new javax.xml.namespace.QName("", "SNR");
        private static final javax.xml.namespace.QName FNR$26 = 
            new javax.xml.namespace.QName("", "FNR");
        private static final javax.xml.namespace.QName ENERGYLABEL$28 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL");
        private static final javax.xml.namespace.QName ENERGYLABELCOLORCODE$30 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL_COLOR_CODE");
        private static final javax.xml.namespace.QName BRUTTOAREAL$32 = 
            new javax.xml.namespace.QName("", "BRUTTOAREAL");
        private static final javax.xml.namespace.QName BOAREAL$34 = 
            new javax.xml.namespace.QName("", "BOAREAL");
        private static final javax.xml.namespace.QName HUSLEIEINKLUDERER$36 = 
            new javax.xml.namespace.QName("", "HUSLEIEINKLUDERER");
        private static final javax.xml.namespace.QName OMKOSTNINGER$38 = 
            new javax.xml.namespace.QName("", "OMKOSTNINGER");
        private static final javax.xml.namespace.QName LAANEVILKAARFELLESGJELD$40 = 
            new javax.xml.namespace.QName("", "LAANEVILKAARFELLESGJELD");
        private static final javax.xml.namespace.QName PROM$42 = 
            new javax.xml.namespace.QName("", "P-ROM");
        private static final javax.xml.namespace.QName PRIMAERROMBESKRIVELSE$44 = 
            new javax.xml.namespace.QName("", "PRIMAERROM_BESKRIVELSE");
        private static final javax.xml.namespace.QName PRIMAEREROMLEDERTEKST$46 = 
            new javax.xml.namespace.QName("", "PRIMAEREROM_LEDERTEKST");
        private static final javax.xml.namespace.QName AREALBESKRIVELSE$48 = 
            new javax.xml.namespace.QName("", "AREALBESKRIVELSE");
        private static final javax.xml.namespace.QName EIERFORM$50 = 
            new javax.xml.namespace.QName("", "EIERFORM");
        private static final javax.xml.namespace.QName EIERFORMTOMT$52 = 
            new javax.xml.namespace.QName("", "EIERFORMTOMT");
        private static final javax.xml.namespace.QName TOMTEBESKRIVELSE$54 = 
            new javax.xml.namespace.QName("", "TOMTEBESKRIVELSE");
        private static final javax.xml.namespace.QName INNHOLD$56 = 
            new javax.xml.namespace.QName("", "INNHOLD");
        private static final javax.xml.namespace.QName STANDARD$58 = 
            new javax.xml.namespace.QName("", "STANDARD");
        private static final javax.xml.namespace.QName BELIGGENHET$60 = 
            new javax.xml.namespace.QName("", "BELIGGENHET");
        private static final javax.xml.namespace.QName ADKOMST$62 = 
            new javax.xml.namespace.QName("", "ADKOMST");
        private static final javax.xml.namespace.QName ANTALLSOVEROM$64 = 
            new javax.xml.namespace.QName("", "ANTALL_SOVEROM");
        private static final javax.xml.namespace.QName BYGGEAAR$66 = 
            new javax.xml.namespace.QName("", "BYGGEAAR");
        private static final javax.xml.namespace.QName MODERNISERINGSAAR$68 = 
            new javax.xml.namespace.QName("", "MODERNISERINGSAAR");
        private static final javax.xml.namespace.QName MODERNISERINGSAARINNVENDIG$70 = 
            new javax.xml.namespace.QName("", "MODERNISERINGSAAR_INNVENDIG");
        private static final javax.xml.namespace.QName MODERNISERINGSAARUTVENDIG$72 = 
            new javax.xml.namespace.QName("", "MODERNISERINGSAAR_UTVENDIG");
        private static final javax.xml.namespace.QName POSTNR$74 = 
            new javax.xml.namespace.QName("", "POSTNR");
        private static final javax.xml.namespace.QName POSTSTED$76 = 
            new javax.xml.namespace.QName("", "POSTSTED");
        private static final javax.xml.namespace.QName ETASJE$78 = 
            new javax.xml.namespace.QName("", "ETASJE");
        private static final javax.xml.namespace.QName VEIVANNKLOAKK$80 = 
            new javax.xml.namespace.QName("", "VEI_VANN_KLOAKK");
        private static final javax.xml.namespace.QName FELLESUTGIFTER$82 = 
            new javax.xml.namespace.QName("", "FELLESUTGIFTER");
        private static final javax.xml.namespace.QName FELLESGJELD$84 = 
            new javax.xml.namespace.QName("", "FELLESGJELD");
        private static final javax.xml.namespace.QName FESTEAVGIFT$86 = 
            new javax.xml.namespace.QName("", "FESTEAVGIFT");
        private static final javax.xml.namespace.QName MARKEDSVERDI$88 = 
            new javax.xml.namespace.QName("", "MARKEDSVERDI");
        private static final javax.xml.namespace.QName LAANEVERDI$90 = 
            new javax.xml.namespace.QName("", "LAANEVERDI");
        private static final javax.xml.namespace.QName SAKSBEHANDLERNAVN$92 = 
            new javax.xml.namespace.QName("", "SAKSBEHANDLER_NAVN");
        private static final javax.xml.namespace.QName SAKSBEHANDLEREMAIL$94 = 
            new javax.xml.namespace.QName("", "SAKSBEHANDLER_EMAIL");
        private static final javax.xml.namespace.QName SAKSBEHANDLERSTELEFON$96 = 
            new javax.xml.namespace.QName("", "SAKSBEHANDLERS_TELEFON");
        private static final javax.xml.namespace.QName SAKSBEHANDLERSMOBIL$98 = 
            new javax.xml.namespace.QName("", "SAKSBEHANDLERS_MOBIL");
        private static final javax.xml.namespace.QName VISNINGSAVTALE$100 = 
            new javax.xml.namespace.QName("", "VISNINGSAVTALE");
        private static final javax.xml.namespace.QName VISNINGSTIDER$102 = 
            new javax.xml.namespace.QName("", "VISNINGSTIDER");
        private static final javax.xml.namespace.QName VEDLEGG$104 = 
            new javax.xml.namespace.QName("", "VEDLEGG");
        private static final javax.xml.namespace.QName LINKER$106 = 
            new javax.xml.namespace.QName("", "LINKER");
        
        
        /**
         * Gets the "STATUS" element
         */
        public java.lang.String getSTATUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "STATUS" element
         */
        public org.apache.xmlbeans.XmlString xgetSTATUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "STATUS" element
         */
        public void setSTATUS(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "STATUS" element
         */
        public void xsetSTATUS(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "OPPDRAGSNR" element
         */
        public java.lang.String getOPPDRAGSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGSNR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OPPDRAGSNR" element
         */
        public org.apache.xmlbeans.XmlString xgetOPPDRAGSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPPDRAGSNR$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OPPDRAGSNR" element
         */
        public void setOPPDRAGSNR(java.lang.String oppdragsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGSNR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPDRAGSNR$2);
                }
                target.setStringValue(oppdragsnr);
            }
        }
        
        /**
         * Sets (as xml) the "OPPDRAGSNR" element
         */
        public void xsetOPPDRAGSNR(org.apache.xmlbeans.XmlString oppdragsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPPDRAGSNR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPPDRAGSNR$2);
                }
                target.set(oppdragsnr);
            }
        }
        
        /**
         * Gets the "EIENDOMSNAVN" element
         */
        public java.lang.String getEIENDOMSNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIENDOMSNAVN$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EIENDOMSNAVN" element
         */
        public org.apache.xmlbeans.XmlString xgetEIENDOMSNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIENDOMSNAVN$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EIENDOMSNAVN" element
         */
        public void setEIENDOMSNAVN(java.lang.String eiendomsnavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIENDOMSNAVN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIENDOMSNAVN$4);
                }
                target.setStringValue(eiendomsnavn);
            }
        }
        
        /**
         * Sets (as xml) the "EIENDOMSNAVN" element
         */
        public void xsetEIENDOMSNAVN(org.apache.xmlbeans.XmlString eiendomsnavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIENDOMSNAVN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIENDOMSNAVN$4);
                }
                target.set(eiendomsnavn);
            }
        }
        
        /**
         * Gets the "OVERSKRIFT1" element
         */
        public java.lang.String getOVERSKRIFT1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT1$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OVERSKRIFT1" element
         */
        public org.apache.xmlbeans.XmlString xgetOVERSKRIFT1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT1$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OVERSKRIFT1" element
         */
        public void setOVERSKRIFT1(java.lang.String overskrift1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT1$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSKRIFT1$6);
                }
                target.setStringValue(overskrift1);
            }
        }
        
        /**
         * Sets (as xml) the "OVERSKRIFT1" element
         */
        public void xsetOVERSKRIFT1(org.apache.xmlbeans.XmlString overskrift1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT1$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERSKRIFT1$6);
                }
                target.set(overskrift1);
            }
        }
        
        /**
         * Gets the "BOLIGTYPE" element
         */
        public java.lang.String getBOLIGTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BOLIGTYPE" element
         */
        public org.apache.xmlbeans.XmlString xgetBOLIGTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BOLIGTYPE" element
         */
        public void setBOLIGTYPE(java.lang.String boligtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLIGTYPE$8);
                }
                target.setStringValue(boligtype);
            }
        }
        
        /**
         * Sets (as xml) the "BOLIGTYPE" element
         */
        public void xsetBOLIGTYPE(org.apache.xmlbeans.XmlString boligtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOLIGTYPE$8);
                }
                target.set(boligtype);
            }
        }
        
        /**
         * Gets the "OPPDRAGHOVEDTYPE" element
         */
        public java.math.BigInteger getOPPDRAGHOVEDTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGHOVEDTYPE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "OPPDRAGHOVEDTYPE" element
         */
        public org.apache.xmlbeans.XmlInteger xgetOPPDRAGHOVEDTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPPDRAGHOVEDTYPE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OPPDRAGHOVEDTYPE" element
         */
        public void setOPPDRAGHOVEDTYPE(java.math.BigInteger oppdraghovedtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPDRAGHOVEDTYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPDRAGHOVEDTYPE$10);
                }
                target.setBigIntegerValue(oppdraghovedtype);
            }
        }
        
        /**
         * Sets (as xml) the "OPPDRAGHOVEDTYPE" element
         */
        public void xsetOPPDRAGHOVEDTYPE(org.apache.xmlbeans.XmlInteger oppdraghovedtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPPDRAGHOVEDTYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(OPPDRAGHOVEDTYPE$10);
                }
                target.set(oppdraghovedtype);
            }
        }
        
        /**
         * Gets the "KOMMUNENR" element
         */
        public java.lang.String getKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KOMMUNENR" element
         */
        public org.apache.xmlbeans.XmlString xgetKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KOMMUNENR" element
         */
        public void setKOMMUNENR(java.lang.String kommunenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMUNENR$12);
                }
                target.setStringValue(kommunenr);
            }
        }
        
        /**
         * Sets (as xml) the "KOMMUNENR" element
         */
        public void xsetKOMMUNENR(org.apache.xmlbeans.XmlString kommunenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMUNENR$12);
                }
                target.set(kommunenr);
            }
        }
        
        /**
         * Gets the "TOMTESTORRELSE" element
         */
        public java.math.BigInteger getTOMTESTORRELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTESTORRELSE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "TOMTESTORRELSE" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTOMTESTORRELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOMTESTORRELSE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TOMTESTORRELSE" element
         */
        public void setTOMTESTORRELSE(java.math.BigInteger tomtestorrelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTESTORRELSE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMTESTORRELSE$14);
                }
                target.setBigIntegerValue(tomtestorrelse);
            }
        }
        
        /**
         * Sets (as xml) the "TOMTESTORRELSE" element
         */
        public void xsetTOMTESTORRELSE(org.apache.xmlbeans.XmlInteger tomtestorrelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOMTESTORRELSE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOMTESTORRELSE$14);
                }
                target.set(tomtestorrelse);
            }
        }
        
        /**
         * Gets the "PRISANTYDNING_LEDETEKST" element
         */
        public java.lang.String getPRISANTYDNINGLEDETEKST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGLEDETEKST$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRISANTYDNING_LEDETEKST" element
         */
        public org.apache.xmlbeans.XmlString xgetPRISANTYDNINGLEDETEKST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRISANTYDNINGLEDETEKST$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRISANTYDNING_LEDETEKST" element
         */
        public void setPRISANTYDNINGLEDETEKST(java.lang.String prisantydningledetekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGLEDETEKST$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRISANTYDNINGLEDETEKST$16);
                }
                target.setStringValue(prisantydningledetekst);
            }
        }
        
        /**
         * Sets (as xml) the "PRISANTYDNING_LEDETEKST" element
         */
        public void xsetPRISANTYDNINGLEDETEKST(org.apache.xmlbeans.XmlString prisantydningledetekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRISANTYDNINGLEDETEKST$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRISANTYDNINGLEDETEKST$16);
                }
                target.set(prisantydningledetekst);
            }
        }
        
        /**
         * Gets the "PRISANTYDNING_VERDI" element
         */
        public java.math.BigInteger getPRISANTYDNINGVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGVERDI$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRISANTYDNING_VERDI" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPRISANTYDNINGVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRISANTYDNINGVERDI$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRISANTYDNING_VERDI" element
         */
        public void setPRISANTYDNINGVERDI(java.math.BigInteger prisantydningverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGVERDI$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRISANTYDNINGVERDI$18);
                }
                target.setBigIntegerValue(prisantydningverdi);
            }
        }
        
        /**
         * Sets (as xml) the "PRISANTYDNING_VERDI" element
         */
        public void xsetPRISANTYDNINGVERDI(org.apache.xmlbeans.XmlInteger prisantydningverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRISANTYDNINGVERDI$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PRISANTYDNINGVERDI$18);
                }
                target.set(prisantydningverdi);
            }
        }
        
        /**
         * Gets the "GNR" element
         */
        public java.lang.String getGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GNR$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GNR" element
         */
        public org.apache.xmlbeans.XmlString xgetGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GNR$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GNR" element
         */
        public void setGNR(java.lang.String gnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GNR$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GNR$20);
                }
                target.setStringValue(gnr);
            }
        }
        
        /**
         * Sets (as xml) the "GNR" element
         */
        public void xsetGNR(org.apache.xmlbeans.XmlString gnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GNR$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GNR$20);
                }
                target.set(gnr);
            }
        }
        
        /**
         * Gets the "BNR" element
         */
        public java.lang.String getBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNR$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BNR" element
         */
        public org.apache.xmlbeans.XmlString xgetBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BNR$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BNR" element
         */
        public void setBNR(java.lang.String bnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNR$22);
                }
                target.setStringValue(bnr);
            }
        }
        
        /**
         * Sets (as xml) the "BNR" element
         */
        public void xsetBNR(org.apache.xmlbeans.XmlString bnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BNR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BNR$22);
                }
                target.set(bnr);
            }
        }
        
        /**
         * Gets the "SNR" element
         */
        public java.lang.String getSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNR$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SNR" element
         */
        public org.apache.xmlbeans.XmlString xgetSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNR$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SNR" element
         */
        public void setSNR(java.lang.String snr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNR$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNR$24);
                }
                target.setStringValue(snr);
            }
        }
        
        /**
         * Sets (as xml) the "SNR" element
         */
        public void xsetSNR(org.apache.xmlbeans.XmlString snr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNR$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SNR$24);
                }
                target.set(snr);
            }
        }
        
        /**
         * Gets the "FNR" element
         */
        public java.lang.String getFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FNR$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FNR" element
         */
        public org.apache.xmlbeans.XmlString xgetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FNR$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "FNR" element
         */
        public boolean isSetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FNR$26) != 0;
            }
        }
        
        /**
         * Sets the "FNR" element
         */
        public void setFNR(java.lang.String fnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FNR$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FNR$26);
                }
                target.setStringValue(fnr);
            }
        }
        
        /**
         * Sets (as xml) the "FNR" element
         */
        public void xsetFNR(org.apache.xmlbeans.XmlString fnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FNR$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FNR$26);
                }
                target.set(fnr);
            }
        }
        
        /**
         * Unsets the "FNR" element
         */
        public void unsetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FNR$26, 0);
            }
        }
        
        /**
         * Gets the "ENERGY_LABEL" element
         */
        public java.lang.String getENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ENERGY_LABEL" element
         */
        public org.apache.xmlbeans.XmlString xgetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "ENERGY_LABEL" element
         */
        public boolean isSetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENERGYLABEL$28) != 0;
            }
        }
        
        /**
         * Sets the "ENERGY_LABEL" element
         */
        public void setENERGYLABEL(java.lang.String energylabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABEL$28);
                }
                target.setStringValue(energylabel);
            }
        }
        
        /**
         * Sets (as xml) the "ENERGY_LABEL" element
         */
        public void xsetENERGYLABEL(org.apache.xmlbeans.XmlString energylabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABEL$28);
                }
                target.set(energylabel);
            }
        }
        
        /**
         * Unsets the "ENERGY_LABEL" element
         */
        public void unsetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENERGYLABEL$28, 0);
            }
        }
        
        /**
         * Gets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public java.lang.String getENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        public org.apache.xmlbeans.XmlString xgetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "ENERGY_LABEL_COLOR_CODE" element
         */
        public boolean isSetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENERGYLABELCOLORCODE$30) != 0;
            }
        }
        
        /**
         * Sets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void setENERGYLABELCOLORCODE(java.lang.String energylabelcolorcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABELCOLORCODE$30);
                }
                target.setStringValue(energylabelcolorcode);
            }
        }
        
        /**
         * Sets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void xsetENERGYLABELCOLORCODE(org.apache.xmlbeans.XmlString energylabelcolorcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABELCOLORCODE$30);
                }
                target.set(energylabelcolorcode);
            }
        }
        
        /**
         * Unsets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void unsetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENERGYLABELCOLORCODE$30, 0);
            }
        }
        
        /**
         * Gets the "BRUTTOAREAL" element
         */
        public java.math.BigInteger getBRUTTOAREAL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUTTOAREAL$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BRUTTOAREAL" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBRUTTOAREAL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BRUTTOAREAL$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BRUTTOAREAL" element
         */
        public void setBRUTTOAREAL(java.math.BigInteger bruttoareal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUTTOAREAL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRUTTOAREAL$32);
                }
                target.setBigIntegerValue(bruttoareal);
            }
        }
        
        /**
         * Sets (as xml) the "BRUTTOAREAL" element
         */
        public void xsetBRUTTOAREAL(org.apache.xmlbeans.XmlInteger bruttoareal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BRUTTOAREAL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BRUTTOAREAL$32);
                }
                target.set(bruttoareal);
            }
        }
        
        /**
         * Gets the "BOAREAL" element
         */
        public java.math.BigInteger getBOAREAL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAREAL$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BOAREAL" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBOAREAL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BOAREAL$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BOAREAL" element
         */
        public void setBOAREAL(java.math.BigInteger boareal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAREAL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOAREAL$34);
                }
                target.setBigIntegerValue(boareal);
            }
        }
        
        /**
         * Sets (as xml) the "BOAREAL" element
         */
        public void xsetBOAREAL(org.apache.xmlbeans.XmlInteger boareal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BOAREAL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BOAREAL$34);
                }
                target.set(boareal);
            }
        }
        
        /**
         * Gets the "HUSLEIEINKLUDERER" element
         */
        public java.lang.String getHUSLEIEINKLUDERER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUSLEIEINKLUDERER$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HUSLEIEINKLUDERER" element
         */
        public org.apache.xmlbeans.XmlString xgetHUSLEIEINKLUDERER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HUSLEIEINKLUDERER$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "HUSLEIEINKLUDERER" element
         */
        public boolean isSetHUSLEIEINKLUDERER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HUSLEIEINKLUDERER$36) != 0;
            }
        }
        
        /**
         * Sets the "HUSLEIEINKLUDERER" element
         */
        public void setHUSLEIEINKLUDERER(java.lang.String husleieinkluderer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUSLEIEINKLUDERER$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HUSLEIEINKLUDERER$36);
                }
                target.setStringValue(husleieinkluderer);
            }
        }
        
        /**
         * Sets (as xml) the "HUSLEIEINKLUDERER" element
         */
        public void xsetHUSLEIEINKLUDERER(org.apache.xmlbeans.XmlString husleieinkluderer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HUSLEIEINKLUDERER$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HUSLEIEINKLUDERER$36);
                }
                target.set(husleieinkluderer);
            }
        }
        
        /**
         * Unsets the "HUSLEIEINKLUDERER" element
         */
        public void unsetHUSLEIEINKLUDERER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HUSLEIEINKLUDERER$36, 0);
            }
        }
        
        /**
         * Gets the "OMKOSTNINGER" element
         */
        public java.lang.String getOMKOSTNINGER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMKOSTNINGER$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OMKOSTNINGER" element
         */
        public org.apache.xmlbeans.XmlString xgetOMKOSTNINGER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMKOSTNINGER$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "OMKOSTNINGER" element
         */
        public boolean isSetOMKOSTNINGER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OMKOSTNINGER$38) != 0;
            }
        }
        
        /**
         * Sets the "OMKOSTNINGER" element
         */
        public void setOMKOSTNINGER(java.lang.String omkostninger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMKOSTNINGER$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMKOSTNINGER$38);
                }
                target.setStringValue(omkostninger);
            }
        }
        
        /**
         * Sets (as xml) the "OMKOSTNINGER" element
         */
        public void xsetOMKOSTNINGER(org.apache.xmlbeans.XmlString omkostninger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMKOSTNINGER$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMKOSTNINGER$38);
                }
                target.set(omkostninger);
            }
        }
        
        /**
         * Unsets the "OMKOSTNINGER" element
         */
        public void unsetOMKOSTNINGER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OMKOSTNINGER$38, 0);
            }
        }
        
        /**
         * Gets the "LAANEVILKAARFELLESGJELD" element
         */
        public java.lang.String getLAANEVILKAARFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVILKAARFELLESGJELD$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LAANEVILKAARFELLESGJELD" element
         */
        public org.apache.xmlbeans.XmlString xgetLAANEVILKAARFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAANEVILKAARFELLESGJELD$40, 0);
                return target;
            }
        }
        
        /**
         * True if has "LAANEVILKAARFELLESGJELD" element
         */
        public boolean isSetLAANEVILKAARFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LAANEVILKAARFELLESGJELD$40) != 0;
            }
        }
        
        /**
         * Sets the "LAANEVILKAARFELLESGJELD" element
         */
        public void setLAANEVILKAARFELLESGJELD(java.lang.String laanevilkaarfellesgjeld)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVILKAARFELLESGJELD$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAANEVILKAARFELLESGJELD$40);
                }
                target.setStringValue(laanevilkaarfellesgjeld);
            }
        }
        
        /**
         * Sets (as xml) the "LAANEVILKAARFELLESGJELD" element
         */
        public void xsetLAANEVILKAARFELLESGJELD(org.apache.xmlbeans.XmlString laanevilkaarfellesgjeld)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAANEVILKAARFELLESGJELD$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAANEVILKAARFELLESGJELD$40);
                }
                target.set(laanevilkaarfellesgjeld);
            }
        }
        
        /**
         * Unsets the "LAANEVILKAARFELLESGJELD" element
         */
        public void unsetLAANEVILKAARFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LAANEVILKAARFELLESGJELD$40, 0);
            }
        }
        
        /**
         * Gets the "P-ROM" element
         */
        public java.math.BigInteger getPROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROM$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "P-ROM" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROM$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "P-ROM" element
         */
        public void setPROM(java.math.BigInteger prom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROM$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROM$42);
                }
                target.setBigIntegerValue(prom);
            }
        }
        
        /**
         * Sets (as xml) the "P-ROM" element
         */
        public void xsetPROM(org.apache.xmlbeans.XmlInteger prom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROM$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROM$42);
                }
                target.set(prom);
            }
        }
        
        /**
         * Gets the "PRIMAERROM_BESKRIVELSE" element
         */
        public java.lang.String getPRIMAERROMBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAERROMBESKRIVELSE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMAERROM_BESKRIVELSE" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMAERROMBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAERROMBESKRIVELSE$44, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRIMAERROM_BESKRIVELSE" element
         */
        public boolean isSetPRIMAERROMBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIMAERROMBESKRIVELSE$44) != 0;
            }
        }
        
        /**
         * Sets the "PRIMAERROM_BESKRIVELSE" element
         */
        public void setPRIMAERROMBESKRIVELSE(java.lang.String primaerrombeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAERROMBESKRIVELSE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMAERROMBESKRIVELSE$44);
                }
                target.setStringValue(primaerrombeskrivelse);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMAERROM_BESKRIVELSE" element
         */
        public void xsetPRIMAERROMBESKRIVELSE(org.apache.xmlbeans.XmlString primaerrombeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAERROMBESKRIVELSE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMAERROMBESKRIVELSE$44);
                }
                target.set(primaerrombeskrivelse);
            }
        }
        
        /**
         * Unsets the "PRIMAERROM_BESKRIVELSE" element
         */
        public void unsetPRIMAERROMBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIMAERROMBESKRIVELSE$44, 0);
            }
        }
        
        /**
         * Gets the "PRIMAEREROM_LEDERTEKST" element
         */
        public java.lang.String getPRIMAEREROMLEDERTEKST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAEREROMLEDERTEKST$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMAEREROM_LEDERTEKST" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMAEREROMLEDERTEKST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAEREROMLEDERTEKST$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRIMAEREROM_LEDERTEKST" element
         */
        public void setPRIMAEREROMLEDERTEKST(java.lang.String primaereromledertekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAEREROMLEDERTEKST$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMAEREROMLEDERTEKST$46);
                }
                target.setStringValue(primaereromledertekst);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMAEREROM_LEDERTEKST" element
         */
        public void xsetPRIMAEREROMLEDERTEKST(org.apache.xmlbeans.XmlString primaereromledertekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAEREROMLEDERTEKST$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMAEREROMLEDERTEKST$46);
                }
                target.set(primaereromledertekst);
            }
        }
        
        /**
         * Gets the "AREALBESKRIVELSE" element
         */
        public java.lang.String getAREALBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREALBESKRIVELSE$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AREALBESKRIVELSE" element
         */
        public org.apache.xmlbeans.XmlString xgetAREALBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREALBESKRIVELSE$48, 0);
                return target;
            }
        }
        
        /**
         * True if has "AREALBESKRIVELSE" element
         */
        public boolean isSetAREALBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREALBESKRIVELSE$48) != 0;
            }
        }
        
        /**
         * Sets the "AREALBESKRIVELSE" element
         */
        public void setAREALBESKRIVELSE(java.lang.String arealbeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREALBESKRIVELSE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREALBESKRIVELSE$48);
                }
                target.setStringValue(arealbeskrivelse);
            }
        }
        
        /**
         * Sets (as xml) the "AREALBESKRIVELSE" element
         */
        public void xsetAREALBESKRIVELSE(org.apache.xmlbeans.XmlString arealbeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREALBESKRIVELSE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREALBESKRIVELSE$48);
                }
                target.set(arealbeskrivelse);
            }
        }
        
        /**
         * Unsets the "AREALBESKRIVELSE" element
         */
        public void unsetAREALBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREALBESKRIVELSE$48, 0);
            }
        }
        
        /**
         * Gets the "EIERFORM" element
         */
        public java.lang.String getEIERFORM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORM$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EIERFORM" element
         */
        public org.apache.xmlbeans.XmlString xgetEIERFORM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORM$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EIERFORM" element
         */
        public void setEIERFORM(java.lang.String eierform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORM$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIERFORM$50);
                }
                target.setStringValue(eierform);
            }
        }
        
        /**
         * Sets (as xml) the "EIERFORM" element
         */
        public void xsetEIERFORM(org.apache.xmlbeans.XmlString eierform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORM$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIERFORM$50);
                }
                target.set(eierform);
            }
        }
        
        /**
         * Gets the "EIERFORMTOMT" element
         */
        public java.lang.String getEIERFORMTOMT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORMTOMT$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EIERFORMTOMT" element
         */
        public org.apache.xmlbeans.XmlString xgetEIERFORMTOMT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORMTOMT$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EIERFORMTOMT" element
         */
        public void setEIERFORMTOMT(java.lang.String eierformtomt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORMTOMT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIERFORMTOMT$52);
                }
                target.setStringValue(eierformtomt);
            }
        }
        
        /**
         * Sets (as xml) the "EIERFORMTOMT" element
         */
        public void xsetEIERFORMTOMT(org.apache.xmlbeans.XmlString eierformtomt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORMTOMT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIERFORMTOMT$52);
                }
                target.set(eierformtomt);
            }
        }
        
        /**
         * Gets the "TOMTEBESKRIVELSE" element
         */
        public java.lang.String getTOMTEBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTEBESKRIVELSE$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TOMTEBESKRIVELSE" element
         */
        public org.apache.xmlbeans.XmlString xgetTOMTEBESKRIVELSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMTEBESKRIVELSE$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TOMTEBESKRIVELSE" element
         */
        public void setTOMTEBESKRIVELSE(java.lang.String tomtebeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTEBESKRIVELSE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMTEBESKRIVELSE$54);
                }
                target.setStringValue(tomtebeskrivelse);
            }
        }
        
        /**
         * Sets (as xml) the "TOMTEBESKRIVELSE" element
         */
        public void xsetTOMTEBESKRIVELSE(org.apache.xmlbeans.XmlString tomtebeskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMTEBESKRIVELSE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOMTEBESKRIVELSE$54);
                }
                target.set(tomtebeskrivelse);
            }
        }
        
        /**
         * Gets the "INNHOLD" element
         */
        public java.lang.String getINNHOLD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNHOLD$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "INNHOLD" element
         */
        public org.apache.xmlbeans.XmlString xgetINNHOLD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INNHOLD$56, 0);
                return target;
            }
        }
        
        /**
         * True if has "INNHOLD" element
         */
        public boolean isSetINNHOLD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INNHOLD$56) != 0;
            }
        }
        
        /**
         * Sets the "INNHOLD" element
         */
        public void setINNHOLD(java.lang.String innhold)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNHOLD$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INNHOLD$56);
                }
                target.setStringValue(innhold);
            }
        }
        
        /**
         * Sets (as xml) the "INNHOLD" element
         */
        public void xsetINNHOLD(org.apache.xmlbeans.XmlString innhold)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INNHOLD$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INNHOLD$56);
                }
                target.set(innhold);
            }
        }
        
        /**
         * Unsets the "INNHOLD" element
         */
        public void unsetINNHOLD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INNHOLD$56, 0);
            }
        }
        
        /**
         * Gets the "STANDARD" element
         */
        public java.lang.String getSTANDARD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STANDARD$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "STANDARD" element
         */
        public org.apache.xmlbeans.XmlString xgetSTANDARD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STANDARD$58, 0);
                return target;
            }
        }
        
        /**
         * True if has "STANDARD" element
         */
        public boolean isSetSTANDARD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STANDARD$58) != 0;
            }
        }
        
        /**
         * Sets the "STANDARD" element
         */
        public void setSTANDARD(java.lang.String standard)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STANDARD$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STANDARD$58);
                }
                target.setStringValue(standard);
            }
        }
        
        /**
         * Sets (as xml) the "STANDARD" element
         */
        public void xsetSTANDARD(org.apache.xmlbeans.XmlString standard)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STANDARD$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STANDARD$58);
                }
                target.set(standard);
            }
        }
        
        /**
         * Unsets the "STANDARD" element
         */
        public void unsetSTANDARD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STANDARD$58, 0);
            }
        }
        
        /**
         * Gets the "BELIGGENHET" element
         */
        public java.lang.String getBELIGGENHET()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BELIGGENHET$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BELIGGENHET" element
         */
        public org.apache.xmlbeans.XmlString xgetBELIGGENHET()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BELIGGENHET$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BELIGGENHET" element
         */
        public void setBELIGGENHET(java.lang.String beliggenhet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BELIGGENHET$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BELIGGENHET$60);
                }
                target.setStringValue(beliggenhet);
            }
        }
        
        /**
         * Sets (as xml) the "BELIGGENHET" element
         */
        public void xsetBELIGGENHET(org.apache.xmlbeans.XmlString beliggenhet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BELIGGENHET$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BELIGGENHET$60);
                }
                target.set(beliggenhet);
            }
        }
        
        /**
         * Gets the "ADKOMST" element
         */
        public java.lang.String getADKOMST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADKOMST$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADKOMST" element
         */
        public org.apache.xmlbeans.XmlString xgetADKOMST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADKOMST$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ADKOMST" element
         */
        public void setADKOMST(java.lang.String adkomst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADKOMST$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADKOMST$62);
                }
                target.setStringValue(adkomst);
            }
        }
        
        /**
         * Sets (as xml) the "ADKOMST" element
         */
        public void xsetADKOMST(org.apache.xmlbeans.XmlString adkomst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADKOMST$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADKOMST$62);
                }
                target.set(adkomst);
            }
        }
        
        /**
         * Gets the "ANTALL_SOVEROM" element
         */
        public java.math.BigInteger getANTALLSOVEROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSOVEROM$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "ANTALL_SOVEROM" element
         */
        public org.apache.xmlbeans.XmlInteger xgetANTALLSOVEROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANTALLSOVEROM$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ANTALL_SOVEROM" element
         */
        public void setANTALLSOVEROM(java.math.BigInteger antallsoverom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSOVEROM$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTALLSOVEROM$64);
                }
                target.setBigIntegerValue(antallsoverom);
            }
        }
        
        /**
         * Sets (as xml) the "ANTALL_SOVEROM" element
         */
        public void xsetANTALLSOVEROM(org.apache.xmlbeans.XmlInteger antallsoverom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANTALLSOVEROM$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ANTALLSOVEROM$64);
                }
                target.set(antallsoverom);
            }
        }
        
        /**
         * Gets the "BYGGEAAR" element
         */
        public java.math.BigInteger getBYGGEAAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYGGEAAR$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BYGGEAAR" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBYGGEAAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BYGGEAAR$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BYGGEAAR" element
         */
        public void setBYGGEAAR(java.math.BigInteger byggeaar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYGGEAAR$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYGGEAAR$66);
                }
                target.setBigIntegerValue(byggeaar);
            }
        }
        
        /**
         * Sets (as xml) the "BYGGEAAR" element
         */
        public void xsetBYGGEAAR(org.apache.xmlbeans.XmlInteger byggeaar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BYGGEAAR$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BYGGEAAR$66);
                }
                target.set(byggeaar);
            }
        }
        
        /**
         * Gets the "MODERNISERINGSAAR" element
         */
        public java.math.BigInteger getMODERNISERINGSAAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAAR$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAAR$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MODERNISERINGSAAR" element
         */
        public void setMODERNISERINGSAAR(java.math.BigInteger moderniseringsaar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAAR$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAAR$68);
                }
                target.setBigIntegerValue(moderniseringsaar);
            }
        }
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR" element
         */
        public void xsetMODERNISERINGSAAR(org.apache.xmlbeans.XmlInteger moderniseringsaar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAAR$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAAR$68);
                }
                target.set(moderniseringsaar);
            }
        }
        
        /**
         * Gets the "MODERNISERINGSAAR_INNVENDIG" element
         */
        public java.math.BigInteger getMODERNISERINGSAARINNVENDIG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARINNVENDIG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MODERNISERINGSAAR_INNVENDIG" element
         */
        public void setMODERNISERINGSAARINNVENDIG(java.math.BigInteger moderniseringsaarinnvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAARINNVENDIG$70);
                }
                target.setBigIntegerValue(moderniseringsaarinnvendig);
            }
        }
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
         */
        public void xsetMODERNISERINGSAARINNVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarinnvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAARINNVENDIG$70);
                }
                target.set(moderniseringsaarinnvendig);
            }
        }
        
        /**
         * Gets the "MODERNISERINGSAAR_UTVENDIG" element
         */
        public java.math.BigInteger getMODERNISERINGSAARUTVENDIG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARUTVENDIG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$72, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MODERNISERINGSAAR_UTVENDIG" element
         */
        public void setMODERNISERINGSAARUTVENDIG(java.math.BigInteger moderniseringsaarutvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAARUTVENDIG$72);
                }
                target.setBigIntegerValue(moderniseringsaarutvendig);
            }
        }
        
        /**
         * Sets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
         */
        public void xsetMODERNISERINGSAARUTVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarutvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAARUTVENDIG$72);
                }
                target.set(moderniseringsaarutvendig);
            }
        }
        
        /**
         * Gets the "POSTNR" element
         */
        public java.lang.String getPOSTNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNR$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "POSTNR" element
         */
        public org.apache.xmlbeans.XmlString xgetPOSTNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTNR$74, 0);
                return target;
            }
        }
        
        /**
         * Sets the "POSTNR" element
         */
        public void setPOSTNR(java.lang.String postnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNR$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTNR$74);
                }
                target.setStringValue(postnr);
            }
        }
        
        /**
         * Sets (as xml) the "POSTNR" element
         */
        public void xsetPOSTNR(org.apache.xmlbeans.XmlString postnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTNR$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTNR$74);
                }
                target.set(postnr);
            }
        }
        
        /**
         * Gets the "POSTSTED" element
         */
        public java.lang.String getPOSTSTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTSTED$76, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "POSTSTED" element
         */
        public org.apache.xmlbeans.XmlString xgetPOSTSTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTSTED$76, 0);
                return target;
            }
        }
        
        /**
         * Sets the "POSTSTED" element
         */
        public void setPOSTSTED(java.lang.String poststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTSTED$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTSTED$76);
                }
                target.setStringValue(poststed);
            }
        }
        
        /**
         * Sets (as xml) the "POSTSTED" element
         */
        public void xsetPOSTSTED(org.apache.xmlbeans.XmlString poststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTSTED$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTSTED$76);
                }
                target.set(poststed);
            }
        }
        
        /**
         * Gets the "ETASJE" element
         */
        public java.math.BigInteger getETASJE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETASJE$78, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "ETASJE" element
         */
        public org.apache.xmlbeans.XmlInteger xgetETASJE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ETASJE$78, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ETASJE" element
         */
        public void setETASJE(java.math.BigInteger etasje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETASJE$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETASJE$78);
                }
                target.setBigIntegerValue(etasje);
            }
        }
        
        /**
         * Sets (as xml) the "ETASJE" element
         */
        public void xsetETASJE(org.apache.xmlbeans.XmlInteger etasje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ETASJE$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ETASJE$78);
                }
                target.set(etasje);
            }
        }
        
        /**
         * Gets the "VEI_VANN_KLOAKK" element
         */
        public java.lang.String getVEIVANNKLOAKK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEIVANNKLOAKK$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEI_VANN_KLOAKK" element
         */
        public org.apache.xmlbeans.XmlString xgetVEIVANNKLOAKK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEIVANNKLOAKK$80, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEI_VANN_KLOAKK" element
         */
        public void setVEIVANNKLOAKK(java.lang.String veivannkloakk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEIVANNKLOAKK$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEIVANNKLOAKK$80);
                }
                target.setStringValue(veivannkloakk);
            }
        }
        
        /**
         * Sets (as xml) the "VEI_VANN_KLOAKK" element
         */
        public void xsetVEIVANNKLOAKK(org.apache.xmlbeans.XmlString veivannkloakk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEIVANNKLOAKK$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEIVANNKLOAKK$80);
                }
                target.set(veivannkloakk);
            }
        }
        
        /**
         * Gets the "FELLESUTGIFTER" element
         */
        public java.lang.String getFELLESUTGIFTER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESUTGIFTER$82, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FELLESUTGIFTER" element
         */
        public org.apache.xmlbeans.XmlString xgetFELLESUTGIFTER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESUTGIFTER$82, 0);
                return target;
            }
        }
        
        /**
         * True if has "FELLESUTGIFTER" element
         */
        public boolean isSetFELLESUTGIFTER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FELLESUTGIFTER$82) != 0;
            }
        }
        
        /**
         * Sets the "FELLESUTGIFTER" element
         */
        public void setFELLESUTGIFTER(java.lang.String fellesutgifter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESUTGIFTER$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FELLESUTGIFTER$82);
                }
                target.setStringValue(fellesutgifter);
            }
        }
        
        /**
         * Sets (as xml) the "FELLESUTGIFTER" element
         */
        public void xsetFELLESUTGIFTER(org.apache.xmlbeans.XmlString fellesutgifter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESUTGIFTER$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FELLESUTGIFTER$82);
                }
                target.set(fellesutgifter);
            }
        }
        
        /**
         * Unsets the "FELLESUTGIFTER" element
         */
        public void unsetFELLESUTGIFTER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FELLESUTGIFTER$82, 0);
            }
        }
        
        /**
         * Gets the "FELLESGJELD" element
         */
        public java.lang.String getFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESGJELD$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FELLESGJELD" element
         */
        public org.apache.xmlbeans.XmlString xgetFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESGJELD$84, 0);
                return target;
            }
        }
        
        /**
         * True if has "FELLESGJELD" element
         */
        public boolean isSetFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FELLESGJELD$84) != 0;
            }
        }
        
        /**
         * Sets the "FELLESGJELD" element
         */
        public void setFELLESGJELD(java.lang.String fellesgjeld)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESGJELD$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FELLESGJELD$84);
                }
                target.setStringValue(fellesgjeld);
            }
        }
        
        /**
         * Sets (as xml) the "FELLESGJELD" element
         */
        public void xsetFELLESGJELD(org.apache.xmlbeans.XmlString fellesgjeld)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESGJELD$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FELLESGJELD$84);
                }
                target.set(fellesgjeld);
            }
        }
        
        /**
         * Unsets the "FELLESGJELD" element
         */
        public void unsetFELLESGJELD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FELLESGJELD$84, 0);
            }
        }
        
        /**
         * Gets the "FESTEAVGIFT" element
         */
        public java.lang.String getFESTEAVGIFT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTEAVGIFT$86, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FESTEAVGIFT" element
         */
        public org.apache.xmlbeans.XmlString xgetFESTEAVGIFT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTEAVGIFT$86, 0);
                return target;
            }
        }
        
        /**
         * True if has "FESTEAVGIFT" element
         */
        public boolean isSetFESTEAVGIFT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FESTEAVGIFT$86) != 0;
            }
        }
        
        /**
         * Sets the "FESTEAVGIFT" element
         */
        public void setFESTEAVGIFT(java.lang.String festeavgift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTEAVGIFT$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FESTEAVGIFT$86);
                }
                target.setStringValue(festeavgift);
            }
        }
        
        /**
         * Sets (as xml) the "FESTEAVGIFT" element
         */
        public void xsetFESTEAVGIFT(org.apache.xmlbeans.XmlString festeavgift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTEAVGIFT$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FESTEAVGIFT$86);
                }
                target.set(festeavgift);
            }
        }
        
        /**
         * Unsets the "FESTEAVGIFT" element
         */
        public void unsetFESTEAVGIFT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FESTEAVGIFT$86, 0);
            }
        }
        
        /**
         * Gets the "MARKEDSVERDI" element
         */
        public java.math.BigInteger getMARKEDSVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKEDSVERDI$88, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MARKEDSVERDI" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMARKEDSVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MARKEDSVERDI$88, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MARKEDSVERDI" element
         */
        public void setMARKEDSVERDI(java.math.BigInteger markedsverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKEDSVERDI$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKEDSVERDI$88);
                }
                target.setBigIntegerValue(markedsverdi);
            }
        }
        
        /**
         * Sets (as xml) the "MARKEDSVERDI" element
         */
        public void xsetMARKEDSVERDI(org.apache.xmlbeans.XmlInteger markedsverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MARKEDSVERDI$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MARKEDSVERDI$88);
                }
                target.set(markedsverdi);
            }
        }
        
        /**
         * Gets the "LAANEVERDI" element
         */
        public java.math.BigInteger getLAANEVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVERDI$90, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "LAANEVERDI" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLAANEVERDI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LAANEVERDI$90, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LAANEVERDI" element
         */
        public void setLAANEVERDI(java.math.BigInteger laaneverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAANEVERDI$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAANEVERDI$90);
                }
                target.setBigIntegerValue(laaneverdi);
            }
        }
        
        /**
         * Sets (as xml) the "LAANEVERDI" element
         */
        public void xsetLAANEVERDI(org.apache.xmlbeans.XmlInteger laaneverdi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LAANEVERDI$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LAANEVERDI$90);
                }
                target.set(laaneverdi);
            }
        }
        
        /**
         * Gets the "SAKSBEHANDLER_NAVN" element
         */
        public java.lang.String getSAKSBEHANDLERNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERNAVN$92, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SAKSBEHANDLER_NAVN" element
         */
        public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERNAVN$92, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SAKSBEHANDLER_NAVN" element
         */
        public void setSAKSBEHANDLERNAVN(java.lang.String saksbehandlernavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERNAVN$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERNAVN$92);
                }
                target.setStringValue(saksbehandlernavn);
            }
        }
        
        /**
         * Sets (as xml) the "SAKSBEHANDLER_NAVN" element
         */
        public void xsetSAKSBEHANDLERNAVN(org.apache.xmlbeans.XmlString saksbehandlernavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERNAVN$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERNAVN$92);
                }
                target.set(saksbehandlernavn);
            }
        }
        
        /**
         * Gets the "SAKSBEHANDLER_EMAIL" element
         */
        public java.lang.String getSAKSBEHANDLEREMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLEREMAIL$94, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SAKSBEHANDLER_EMAIL" element
         */
        public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLEREMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLEREMAIL$94, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SAKSBEHANDLER_EMAIL" element
         */
        public void setSAKSBEHANDLEREMAIL(java.lang.String saksbehandleremail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLEREMAIL$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLEREMAIL$94);
                }
                target.setStringValue(saksbehandleremail);
            }
        }
        
        /**
         * Sets (as xml) the "SAKSBEHANDLER_EMAIL" element
         */
        public void xsetSAKSBEHANDLEREMAIL(org.apache.xmlbeans.XmlString saksbehandleremail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLEREMAIL$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLEREMAIL$94);
                }
                target.set(saksbehandleremail);
            }
        }
        
        /**
         * Gets the "SAKSBEHANDLERS_TELEFON" element
         */
        public java.lang.String getSAKSBEHANDLERSTELEFON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSTELEFON$96, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SAKSBEHANDLERS_TELEFON" element
         */
        public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSTELEFON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSTELEFON$96, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SAKSBEHANDLERS_TELEFON" element
         */
        public void setSAKSBEHANDLERSTELEFON(java.lang.String saksbehandlerstelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSTELEFON$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERSTELEFON$96);
                }
                target.setStringValue(saksbehandlerstelefon);
            }
        }
        
        /**
         * Sets (as xml) the "SAKSBEHANDLERS_TELEFON" element
         */
        public void xsetSAKSBEHANDLERSTELEFON(org.apache.xmlbeans.XmlString saksbehandlerstelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSTELEFON$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERSTELEFON$96);
                }
                target.set(saksbehandlerstelefon);
            }
        }
        
        /**
         * Gets the "SAKSBEHANDLERS_MOBIL" element
         */
        public java.lang.String getSAKSBEHANDLERSMOBIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSMOBIL$98, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SAKSBEHANDLERS_MOBIL" element
         */
        public org.apache.xmlbeans.XmlString xgetSAKSBEHANDLERSMOBIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSMOBIL$98, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SAKSBEHANDLERS_MOBIL" element
         */
        public void setSAKSBEHANDLERSMOBIL(java.lang.String saksbehandlersmobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAKSBEHANDLERSMOBIL$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAKSBEHANDLERSMOBIL$98);
                }
                target.setStringValue(saksbehandlersmobil);
            }
        }
        
        /**
         * Sets (as xml) the "SAKSBEHANDLERS_MOBIL" element
         */
        public void xsetSAKSBEHANDLERSMOBIL(org.apache.xmlbeans.XmlString saksbehandlersmobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAKSBEHANDLERSMOBIL$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAKSBEHANDLERSMOBIL$98);
                }
                target.set(saksbehandlersmobil);
            }
        }
        
        /**
         * Gets the "VISNINGSAVTALE" element
         */
        public java.lang.String getVISNINGSAVTALE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISNINGSAVTALE$100, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VISNINGSAVTALE" element
         */
        public org.apache.xmlbeans.XmlString xgetVISNINGSAVTALE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VISNINGSAVTALE$100, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VISNINGSAVTALE" element
         */
        public void setVISNINGSAVTALE(java.lang.String visningsavtale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISNINGSAVTALE$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISNINGSAVTALE$100);
                }
                target.setStringValue(visningsavtale);
            }
        }
        
        /**
         * Sets (as xml) the "VISNINGSAVTALE" element
         */
        public void xsetVISNINGSAVTALE(org.apache.xmlbeans.XmlString visningsavtale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VISNINGSAVTALE$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VISNINGSAVTALE$100);
                }
                target.set(visningsavtale);
            }
        }
        
        /**
         * Gets array of all "VISNINGSTIDER" elements
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[] getVISNINGSTIDERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VISNINGSTIDER$102, targetList);
                com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[] result = new com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "VISNINGSTIDER" element
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER getVISNINGSTIDERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().find_element_user(VISNINGSTIDER$102, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "VISNINGSTIDER" element
         */
        public int sizeOfVISNINGSTIDERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VISNINGSTIDER$102);
            }
        }
        
        /**
         * Sets array of all "VISNINGSTIDER" element
         */
        public void setVISNINGSTIDERArray(com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER[] visningstiderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(visningstiderArray, VISNINGSTIDER$102);
            }
        }
        
        /**
         * Sets ith "VISNINGSTIDER" element
         */
        public void setVISNINGSTIDERArray(int i, com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER visningstider)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().find_element_user(VISNINGSTIDER$102, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(visningstider);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VISNINGSTIDER" element
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER insertNewVISNINGSTIDER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().insert_element_user(VISNINGSTIDER$102, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VISNINGSTIDER" element
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER addNewVISNINGSTIDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().add_element_user(VISNINGSTIDER$102);
                return target;
            }
        }
        
        /**
         * Removes the ith "VISNINGSTIDER" element
         */
        public void removeVISNINGSTIDER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VISNINGSTIDER$102, i);
            }
        }
        
        /**
         * Gets array of all "VEDLEGG" elements
         */
        public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[] getVEDLEGGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VEDLEGG$104, targetList);
                com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[] result = new com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "VEDLEGG" element
         */
        public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG getVEDLEGGArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().find_element_user(VEDLEGG$104, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "VEDLEGG" element
         */
        public int sizeOfVEDLEGGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VEDLEGG$104);
            }
        }
        
        /**
         * Sets array of all "VEDLEGG" element
         */
        public void setVEDLEGGArray(com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG[] vedleggArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(vedleggArray, VEDLEGG$104);
            }
        }
        
        /**
         * Sets ith "VEDLEGG" element
         */
        public void setVEDLEGGArray(int i, com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG vedlegg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().find_element_user(VEDLEGG$104, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(vedlegg);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VEDLEGG" element
         */
        public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG insertNewVEDLEGG(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().insert_element_user(VEDLEGG$104, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VEDLEGG" element
         */
        public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG addNewVEDLEGG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().add_element_user(VEDLEGG$104);
                return target;
            }
        }
        
        /**
         * Removes the ith "VEDLEGG" element
         */
        public void removeVEDLEGG(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VEDLEGG$104, i);
            }
        }
        
        /**
         * Gets array of all "LINKER" elements
         */
        public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[] getLINKERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINKER$106, targetList);
                com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[] result = new com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "LINKER" element
         */
        public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER getLINKERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().find_element_user(LINKER$106, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "LINKER" element
         */
        public int sizeOfLINKERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKER$106);
            }
        }
        
        /**
         * Sets array of all "LINKER" element
         */
        public void setLINKERArray(com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER[] linkerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(linkerArray, LINKER$106);
            }
        }
        
        /**
         * Sets ith "LINKER" element
         */
        public void setLINKERArray(int i, com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER linker)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().find_element_user(LINKER$106, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(linker);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LINKER" element
         */
        public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER insertNewLINKER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().insert_element_user(LINKER$106, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LINKER" element
         */
        public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER addNewLINKER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
                target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().add_element_user(LINKER$106);
                return target;
            }
        }
        
        /**
         * Removes the ith "LINKER" element
         */
        public void removeLINKER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKER$106, i);
            }
        }
    }
}
