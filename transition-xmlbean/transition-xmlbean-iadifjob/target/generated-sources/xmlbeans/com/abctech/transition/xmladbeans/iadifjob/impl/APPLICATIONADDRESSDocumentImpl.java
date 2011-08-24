/*
 * An XML document type.
 * Localname: APPLICATION_ADDRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one APPLICATION_ADDRESS(@) element.
 *
 * This is a complex type.
 */
public class APPLICATIONADDRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument
{
    private static final long serialVersionUID = 1L;
    
    public APPLICATIONADDRESSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONADDRESS$0 = 
        new javax.xml.namespace.QName("", "APPLICATION_ADDRESS");
    
    
    /**
     * Gets the "APPLICATION_ADDRESS" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "APPLICATION_ADDRESS" element
     */
    public void setAPPLICATIONADDRESS(com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().add_element_user(APPLICATIONADDRESS$0);
            }
            target.set(applicationaddress);
        }
    }
    
    /**
     * Appends and returns a new empty "APPLICATION_ADDRESS" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().add_element_user(APPLICATIONADDRESS$0);
            return target;
        }
    }
    /**
     * An XML APPLICATION_ADDRESS(@).
     *
     * This is a complex type.
     */
    public static class APPLICATIONADDRESSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS
    {
        private static final long serialVersionUID = 1L;
        
        public APPLICATIONADDRESSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPANYNAME$0 = 
            new javax.xml.namespace.QName("", "COMPANY_NAME");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "NAME");
        private static final javax.xml.namespace.QName ADDRESS$4 = 
            new javax.xml.namespace.QName("", "ADDRESS");
        
        
        /**
         * Gets the "COMPANY_NAME" element
         */
        public java.lang.String getCOMPANYNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COMPANY_NAME" element
         */
        public org.apache.xmlbeans.XmlString xgetCOMPANYNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "COMPANY_NAME" element
         */
        public boolean isSetCOMPANYNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPANYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "COMPANY_NAME" element
         */
        public void setCOMPANYNAME(java.lang.String companyname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$0);
                }
                target.setStringValue(companyname);
            }
        }
        
        /**
         * Sets (as xml) the "COMPANY_NAME" element
         */
        public void xsetCOMPANYNAME(org.apache.xmlbeans.XmlString companyname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYNAME$0);
                }
                target.set(companyname);
            }
        }
        
        /**
         * Unsets the "COMPANY_NAME" element
         */
        public void unsetCOMPANYNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPANYNAME$0, 0);
            }
        }
        
        /**
         * Gets the "NAME" element
         */
        public java.lang.String getNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NAME" element
         */
        public org.apache.xmlbeans.XmlString xgetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "NAME" element
         */
        public boolean isSetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2) != 0;
            }
        }
        
        /**
         * Sets the "NAME" element
         */
        public void setNAME(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "NAME" element
         */
        public void xsetNAME(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "NAME" element
         */
        public void unsetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, 0);
            }
        }
        
        /**
         * Gets the "ADDRESS" element
         */
        public java.lang.String getADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADDRESS" element
         */
        public org.apache.xmlbeans.XmlString xgetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ADDRESS" element
         */
        public boolean isSetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$4) != 0;
            }
        }
        
        /**
         * Sets the "ADDRESS" element
         */
        public void setADDRESS(java.lang.String address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$4);
                }
                target.setStringValue(address);
            }
        }
        
        /**
         * Sets (as xml) the "ADDRESS" element
         */
        public void xsetADDRESS(org.apache.xmlbeans.XmlString address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$4);
                }
                target.set(address);
            }
        }
        
        /**
         * Unsets the "ADDRESS" element
         */
        public void unsetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$4, 0);
            }
        }
    }
}
