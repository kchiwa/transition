/*
 * An XML document type.
 * Localname: Company
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.CompanyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Company(@) element.
 *
 * This is a complex type.
 */
public class CompanyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.CompanyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompanyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANY$0 = 
        new javax.xml.namespace.QName("", "Company");
    
    
    /**
     * Gets the "Company" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company getCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Company" element
     */
    public void setCompany(com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().find_element_user(COMPANY$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().add_element_user(COMPANY$0);
            }
            target.set(company);
        }
    }
    
    /**
     * Appends and returns a new empty "Company" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company addNewCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().add_element_user(COMPANY$0);
            return target;
        }
    }
    /**
     * An XML Company(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.webcruiter.CompanyDocument$Company.
     */
    public static class CompanyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company
    {
        private static final long serialVersionUID = 1L;
        
        public CompanyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CompanyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        
        
        /**
         * Gets the "Name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "Name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "Name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
    }
}
