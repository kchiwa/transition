/*
 * An XML document type.
 * Localname: ESTATE_PRICE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_PRICE(@) element.
 *
 * This is a complex type.
 */
public class ESTATEPRICEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATEPRICEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATEPRICE$0 = 
        new javax.xml.namespace.QName("", "ESTATE_PRICE");
    
    
    /**
     * Gets the "ESTATE_PRICE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE getESTATEPRICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_PRICE" element
     */
    public void setESTATEPRICE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE estateprice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$0);
            }
            target.set(estateprice);
        }
    }
    
    /**
     * Appends and returns a new empty "ESTATE_PRICE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE addNewESTATEPRICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$0);
            return target;
        }
    }
    /**
     * An XML ESTATE_PRICE(@).
     *
     * This is a complex type.
     */
    public static class ESTATEPRICEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE
    {
        private static final long serialVersionUID = 1L;
        
        public ESTATEPRICEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRICESUGGESTION$0 = 
            new javax.xml.namespace.QName("", "PRICE_SUGGESTION");
        private static final javax.xml.namespace.QName ESTIMATEDVALUE$2 = 
            new javax.xml.namespace.QName("", "ESTIMATED_VALUE");
        private static final javax.xml.namespace.QName COLLECTIVEDEBT$4 = 
            new javax.xml.namespace.QName("", "COLLECTIVE_DEBT");
        private static final javax.xml.namespace.QName COLLECTIVEDEBTTO$6 = 
            new javax.xml.namespace.QName("", "COLLECTIVE_DEBT_TO");
        private static final javax.xml.namespace.QName COLLECTIVEASSETS$8 = 
            new javax.xml.namespace.QName("", "COLLECTIVE_ASSETS");
        private static final javax.xml.namespace.QName LOANFARE$10 = 
            new javax.xml.namespace.QName("", "LOAN_FARE");
        private static final javax.xml.namespace.QName LOANVALUE$12 = 
            new javax.xml.namespace.QName("", "LOAN_VALUE");
        private static final javax.xml.namespace.QName COMMUNITYTAX$14 = 
            new javax.xml.namespace.QName("", "COMMUNITY_TAX");
        private static final javax.xml.namespace.QName SHAREDCOST$16 = 
            new javax.xml.namespace.QName("", "SHARED_COST");
        private static final javax.xml.namespace.QName CURRENCY$18 = 
            new javax.xml.namespace.QName("", "CURRENCY");
        private static final javax.xml.namespace.QName SALESCOST$20 = 
            new javax.xml.namespace.QName("", "SALES_COST");
        
        
        /**
         * Gets the "PRICE_SUGGESTION" element
         */
        public java.lang.String getPRICESUGGESTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICESUGGESTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRICE_SUGGESTION" element
         */
        public org.apache.xmlbeans.XmlString xgetPRICESUGGESTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICESUGGESTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRICE_SUGGESTION" element
         */
        public void setPRICESUGGESTION(java.lang.String pricesuggestion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICESUGGESTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICESUGGESTION$0);
                }
                target.setStringValue(pricesuggestion);
            }
        }
        
        /**
         * Sets (as xml) the "PRICE_SUGGESTION" element
         */
        public void xsetPRICESUGGESTION(org.apache.xmlbeans.XmlString pricesuggestion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICESUGGESTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICESUGGESTION$0);
                }
                target.set(pricesuggestion);
            }
        }
        
        /**
         * Gets the "ESTIMATED_VALUE" element
         */
        public java.lang.String getESTIMATEDVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ESTIMATED_VALUE" element
         */
        public org.apache.xmlbeans.XmlString xgetESTIMATEDVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTIMATEDVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ESTIMATED_VALUE" element
         */
        public boolean isSetESTIMATEDVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTIMATEDVALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "ESTIMATED_VALUE" element
         */
        public void setESTIMATEDVALUE(java.lang.String estimatedvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDVALUE$2);
                }
                target.setStringValue(estimatedvalue);
            }
        }
        
        /**
         * Sets (as xml) the "ESTIMATED_VALUE" element
         */
        public void xsetESTIMATEDVALUE(org.apache.xmlbeans.XmlString estimatedvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTIMATEDVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTIMATEDVALUE$2);
                }
                target.set(estimatedvalue);
            }
        }
        
        /**
         * Unsets the "ESTIMATED_VALUE" element
         */
        public void unsetESTIMATEDVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTIMATEDVALUE$2, 0);
            }
        }
        
        /**
         * Gets the "COLLECTIVE_DEBT" element
         */
        public java.lang.String getCOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COLLECTIVE_DEBT" element
         */
        public org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "COLLECTIVE_DEBT" element
         */
        public boolean isSetCOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLLECTIVEDEBT$4) != 0;
            }
        }
        
        /**
         * Sets the "COLLECTIVE_DEBT" element
         */
        public void setCOLLECTIVEDEBT(java.lang.String collectivedebt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEDEBT$4);
                }
                target.setStringValue(collectivedebt);
            }
        }
        
        /**
         * Sets (as xml) the "COLLECTIVE_DEBT" element
         */
        public void xsetCOLLECTIVEDEBT(org.apache.xmlbeans.XmlString collectivedebt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEDEBT$4);
                }
                target.set(collectivedebt);
            }
        }
        
        /**
         * Unsets the "COLLECTIVE_DEBT" element
         */
        public void unsetCOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLLECTIVEDEBT$4, 0);
            }
        }
        
        /**
         * Gets the "COLLECTIVE_DEBT_TO" element
         */
        public java.lang.String getCOLLECTIVEDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBTTO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COLLECTIVE_DEBT_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBTTO$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "COLLECTIVE_DEBT_TO" element
         */
        public boolean isSetCOLLECTIVEDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLLECTIVEDEBTTO$6) != 0;
            }
        }
        
        /**
         * Sets the "COLLECTIVE_DEBT_TO" element
         */
        public void setCOLLECTIVEDEBTTO(java.lang.String collectivedebtto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBTTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEDEBTTO$6);
                }
                target.setStringValue(collectivedebtto);
            }
        }
        
        /**
         * Sets (as xml) the "COLLECTIVE_DEBT_TO" element
         */
        public void xsetCOLLECTIVEDEBTTO(org.apache.xmlbeans.XmlString collectivedebtto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBTTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEDEBTTO$6);
                }
                target.set(collectivedebtto);
            }
        }
        
        /**
         * Unsets the "COLLECTIVE_DEBT_TO" element
         */
        public void unsetCOLLECTIVEDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLLECTIVEDEBTTO$6, 0);
            }
        }
        
        /**
         * Gets the "COLLECTIVE_ASSETS" element
         */
        public java.lang.String getCOLLECTIVEASSETS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEASSETS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COLLECTIVE_ASSETS" element
         */
        public org.apache.xmlbeans.XmlString xgetCOLLECTIVEASSETS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEASSETS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "COLLECTIVE_ASSETS" element
         */
        public boolean isSetCOLLECTIVEASSETS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLLECTIVEASSETS$8) != 0;
            }
        }
        
        /**
         * Sets the "COLLECTIVE_ASSETS" element
         */
        public void setCOLLECTIVEASSETS(java.lang.String collectiveassets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEASSETS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEASSETS$8);
                }
                target.setStringValue(collectiveassets);
            }
        }
        
        /**
         * Sets (as xml) the "COLLECTIVE_ASSETS" element
         */
        public void xsetCOLLECTIVEASSETS(org.apache.xmlbeans.XmlString collectiveassets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEASSETS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEASSETS$8);
                }
                target.set(collectiveassets);
            }
        }
        
        /**
         * Unsets the "COLLECTIVE_ASSETS" element
         */
        public void unsetCOLLECTIVEASSETS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLLECTIVEASSETS$8, 0);
            }
        }
        
        /**
         * Gets the "LOAN_FARE" element
         */
        public java.lang.String getLOANFARE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANFARE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LOAN_FARE" element
         */
        public org.apache.xmlbeans.XmlString xgetLOANFARE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANFARE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "LOAN_FARE" element
         */
        public boolean isSetLOANFARE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOANFARE$10) != 0;
            }
        }
        
        /**
         * Sets the "LOAN_FARE" element
         */
        public void setLOANFARE(java.lang.String loanfare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANFARE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOANFARE$10);
                }
                target.setStringValue(loanfare);
            }
        }
        
        /**
         * Sets (as xml) the "LOAN_FARE" element
         */
        public void xsetLOANFARE(org.apache.xmlbeans.XmlString loanfare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANFARE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOANFARE$10);
                }
                target.set(loanfare);
            }
        }
        
        /**
         * Unsets the "LOAN_FARE" element
         */
        public void unsetLOANFARE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOANFARE$10, 0);
            }
        }
        
        /**
         * Gets the "LOAN_VALUE" element
         */
        public java.lang.String getLOANVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANVALUE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LOAN_VALUE" element
         */
        public org.apache.xmlbeans.XmlString xgetLOANVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANVALUE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "LOAN_VALUE" element
         */
        public boolean isSetLOANVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOANVALUE$12) != 0;
            }
        }
        
        /**
         * Sets the "LOAN_VALUE" element
         */
        public void setLOANVALUE(java.lang.String loanvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANVALUE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOANVALUE$12);
                }
                target.setStringValue(loanvalue);
            }
        }
        
        /**
         * Sets (as xml) the "LOAN_VALUE" element
         */
        public void xsetLOANVALUE(org.apache.xmlbeans.XmlString loanvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANVALUE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOANVALUE$12);
                }
                target.set(loanvalue);
            }
        }
        
        /**
         * Unsets the "LOAN_VALUE" element
         */
        public void unsetLOANVALUE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOANVALUE$12, 0);
            }
        }
        
        /**
         * Gets the "COMMUNITY_TAX" element
         */
        public java.lang.String getCOMMUNITYTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYTAX$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COMMUNITY_TAX" element
         */
        public org.apache.xmlbeans.XmlString xgetCOMMUNITYTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYTAX$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "COMMUNITY_TAX" element
         */
        public boolean isSetCOMMUNITYTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMUNITYTAX$14) != 0;
            }
        }
        
        /**
         * Sets the "COMMUNITY_TAX" element
         */
        public void setCOMMUNITYTAX(java.lang.String communitytax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYTAX$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYTAX$14);
                }
                target.setStringValue(communitytax);
            }
        }
        
        /**
         * Sets (as xml) the "COMMUNITY_TAX" element
         */
        public void xsetCOMMUNITYTAX(org.apache.xmlbeans.XmlString communitytax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYTAX$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYTAX$14);
                }
                target.set(communitytax);
            }
        }
        
        /**
         * Unsets the "COMMUNITY_TAX" element
         */
        public void unsetCOMMUNITYTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMUNITYTAX$14, 0);
            }
        }
        
        /**
         * Gets the "SHARED_COST" element
         */
        public java.lang.String getSHAREDCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCOST$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SHARED_COST" element
         */
        public org.apache.xmlbeans.XmlString xgetSHAREDCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCOST$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "SHARED_COST" element
         */
        public boolean isSetSHAREDCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHAREDCOST$16) != 0;
            }
        }
        
        /**
         * Sets the "SHARED_COST" element
         */
        public void setSHAREDCOST(java.lang.String sharedcost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCOST$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDCOST$16);
                }
                target.setStringValue(sharedcost);
            }
        }
        
        /**
         * Sets (as xml) the "SHARED_COST" element
         */
        public void xsetSHAREDCOST(org.apache.xmlbeans.XmlString sharedcost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCOST$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDCOST$16);
                }
                target.set(sharedcost);
            }
        }
        
        /**
         * Unsets the "SHARED_COST" element
         */
        public void unsetSHAREDCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHAREDCOST$16, 0);
            }
        }
        
        /**
         * Gets the "CURRENCY" element
         */
        public java.lang.String getCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CURRENCY" element
         */
        public org.apache.xmlbeans.XmlString xgetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "CURRENCY" element
         */
        public boolean isSetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENCY$18) != 0;
            }
        }
        
        /**
         * Sets the "CURRENCY" element
         */
        public void setCURRENCY(java.lang.String currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$18);
                }
                target.setStringValue(currency);
            }
        }
        
        /**
         * Sets (as xml) the "CURRENCY" element
         */
        public void xsetCURRENCY(org.apache.xmlbeans.XmlString currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$18);
                }
                target.set(currency);
            }
        }
        
        /**
         * Unsets the "CURRENCY" element
         */
        public void unsetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENCY$18, 0);
            }
        }
        
        /**
         * Gets the "SALES_COST" element
         */
        public java.lang.String getSALESCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESCOST$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SALES_COST" element
         */
        public org.apache.xmlbeans.XmlString xgetSALESCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESCOST$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "SALES_COST" element
         */
        public boolean isSetSALESCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SALESCOST$20) != 0;
            }
        }
        
        /**
         * Sets the "SALES_COST" element
         */
        public void setSALESCOST(java.lang.String salescost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESCOST$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESCOST$20);
                }
                target.setStringValue(salescost);
            }
        }
        
        /**
         * Sets (as xml) the "SALES_COST" element
         */
        public void xsetSALESCOST(org.apache.xmlbeans.XmlString salescost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESCOST$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALESCOST$20);
                }
                target.set(salescost);
            }
        }
        
        /**
         * Unsets the "SALES_COST" element
         */
        public void unsetSALESCOST()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SALESCOST$20, 0);
            }
        }
    }
}
