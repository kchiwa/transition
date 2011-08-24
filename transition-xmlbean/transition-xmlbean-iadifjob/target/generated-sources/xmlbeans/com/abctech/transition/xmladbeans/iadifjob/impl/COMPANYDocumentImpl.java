/*
 * An XML document type.
 * Localname: COMPANY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one COMPANY(@) element.
 *
 * This is a complex type.
 */
public class COMPANYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument
{
    private static final long serialVersionUID = 1L;
    
    public COMPANYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANY$0 = 
        new javax.xml.namespace.QName("", "COMPANY");
    
    
    /**
     * Gets the "COMPANY" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY getCOMPANY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "COMPANY" element
     */
    public void setCOMPANY(com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY)get_store().add_element_user(COMPANY$0);
            }
            target.set(company);
        }
    }
    
    /**
     * Appends and returns a new empty "COMPANY" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY addNewCOMPANY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY)get_store().add_element_user(COMPANY$0);
            return target;
        }
    }
    /**
     * An XML COMPANY(@).
     *
     * This is a complex type.
     */
    public static class COMPANYImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY
    {
        private static final long serialVersionUID = 1L;
        
        public COMPANYImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPANYNAME$0 = 
            new javax.xml.namespace.QName("", "COMPANY_NAME");
        private static final javax.xml.namespace.QName LOGO$2 = 
            new javax.xml.namespace.QName("", "LOGO");
        private static final javax.xml.namespace.QName URL$4 = 
            new javax.xml.namespace.QName("", "URL");
        private static final javax.xml.namespace.QName INGRESS$6 = 
            new javax.xml.namespace.QName("", "INGRESS");
        
        
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
         * Gets the "LOGO" element
         */
        public java.lang.String getLOGO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LOGO" element
         */
        public org.apache.xmlbeans.XmlString xgetLOGO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "LOGO" element
         */
        public boolean isSetLOGO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOGO$2) != 0;
            }
        }
        
        /**
         * Sets the "LOGO" element
         */
        public void setLOGO(java.lang.String logo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGO$2);
                }
                target.setStringValue(logo);
            }
        }
        
        /**
         * Sets (as xml) the "LOGO" element
         */
        public void xsetLOGO(org.apache.xmlbeans.XmlString logo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGO$2);
                }
                target.set(logo);
            }
        }
        
        /**
         * Unsets the "LOGO" element
         */
        public void unsetLOGO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOGO$2, 0);
            }
        }
        
        /**
         * Gets the "URL" element
         */
        public java.lang.String getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URL" element
         */
        public org.apache.xmlbeans.XmlString xgetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "URL" element
         */
        public boolean isSetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$4) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$4);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "URL" element
         */
        public void xsetURL(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$4);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "URL" element
         */
        public void unsetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$4, 0);
            }
        }
        
        /**
         * Gets the "INGRESS" element
         */
        public java.lang.String getINGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INGRESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "INGRESS" element
         */
        public org.apache.xmlbeans.XmlString xgetINGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INGRESS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "INGRESS" element
         */
        public boolean isSetINGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INGRESS$6) != 0;
            }
        }
        
        /**
         * Sets the "INGRESS" element
         */
        public void setINGRESS(java.lang.String ingress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INGRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INGRESS$6);
                }
                target.setStringValue(ingress);
            }
        }
        
        /**
         * Sets (as xml) the "INGRESS" element
         */
        public void xsetINGRESS(org.apache.xmlbeans.XmlString ingress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INGRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INGRESS$6);
                }
                target.set(ingress);
            }
        }
        
        /**
         * Unsets the "INGRESS" element
         */
        public void unsetINGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INGRESS$6, 0);
            }
        }
    }
}
