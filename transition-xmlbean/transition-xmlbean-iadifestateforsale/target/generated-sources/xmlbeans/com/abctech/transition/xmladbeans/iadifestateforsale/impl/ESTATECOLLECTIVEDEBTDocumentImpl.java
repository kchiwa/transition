/*
 * An XML document type.
 * Localname: ESTATE_COLLECTIVE_DEBT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_COLLECTIVE_DEBT(@) element.
 *
 * This is a complex type.
 */
public class ESTATECOLLECTIVEDEBTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATECOLLECTIVEDEBTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATECOLLECTIVEDEBT$0 = 
        new javax.xml.namespace.QName("", "ESTATE_COLLECTIVE_DEBT");
    
    
    /**
     * Gets the "ESTATE_COLLECTIVE_DEBT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT getESTATECOLLECTIVEDEBT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().find_element_user(ESTATECOLLECTIVEDEBT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_COLLECTIVE_DEBT" element
     */
    public void setESTATECOLLECTIVEDEBT(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT estatecollectivedebt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().find_element_user(ESTATECOLLECTIVEDEBT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().add_element_user(ESTATECOLLECTIVEDEBT$0);
            }
            target.set(estatecollectivedebt);
        }
    }
    
    /**
     * Appends and returns a new empty "ESTATE_COLLECTIVE_DEBT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT addNewESTATECOLLECTIVEDEBT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().add_element_user(ESTATECOLLECTIVEDEBT$0);
            return target;
        }
    }
    /**
     * An XML ESTATE_COLLECTIVE_DEBT(@).
     *
     * This is a complex type.
     */
    public static class ESTATECOLLECTIVEDEBTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT
    {
        private static final long serialVersionUID = 1L;
        
        public ESTATECOLLECTIVEDEBTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEBTFROM$0 = 
            new javax.xml.namespace.QName("", "DEBT_FROM");
        private static final javax.xml.namespace.QName DEBTTO$2 = 
            new javax.xml.namespace.QName("", "DEBT_TO");
        
        
        /**
         * Gets the "DEBT_FROM" element
         */
        public java.lang.String getDEBTFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DEBT_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetDEBTFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTFROM$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DEBT_FROM" element
         */
        public boolean isSetDEBTFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEBTFROM$0) != 0;
            }
        }
        
        /**
         * Sets the "DEBT_FROM" element
         */
        public void setDEBTFROM(java.lang.String debtfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTFROM$0);
                }
                target.setStringValue(debtfrom);
            }
        }
        
        /**
         * Sets (as xml) the "DEBT_FROM" element
         */
        public void xsetDEBTFROM(org.apache.xmlbeans.XmlString debtfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEBTFROM$0);
                }
                target.set(debtfrom);
            }
        }
        
        /**
         * Unsets the "DEBT_FROM" element
         */
        public void unsetDEBTFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEBTFROM$0, 0);
            }
        }
        
        /**
         * Gets the "DEBT_TO" element
         */
        public java.lang.String getDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DEBT_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTTO$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "DEBT_TO" element
         */
        public boolean isSetDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEBTTO$2) != 0;
            }
        }
        
        /**
         * Sets the "DEBT_TO" element
         */
        public void setDEBTTO(java.lang.String debtto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTTO$2);
                }
                target.setStringValue(debtto);
            }
        }
        
        /**
         * Sets (as xml) the "DEBT_TO" element
         */
        public void xsetDEBTTO(org.apache.xmlbeans.XmlString debtto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEBTTO$2);
                }
                target.set(debtto);
            }
        }
        
        /**
         * Unsets the "DEBT_TO" element
         */
        public void unsetDEBTTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEBTTO$2, 0);
            }
        }
    }
}
