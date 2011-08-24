/*
 * An XML document type.
 * Localname: APPLICATION_ADDRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one APPLICATION_ADDRESS(@) element.
 *
 * This is a complex type.
 */
public class APPLICATIONADDRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument
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
    public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$0, 0);
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
    public void setAPPLICATIONADDRESS(com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().add_element_user(APPLICATIONADDRESS$0);
            }
            target.set(applicationaddress);
        }
    }
    
    /**
     * Appends and returns a new empty "APPLICATION_ADDRESS" element
     */
    public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().add_element_user(APPLICATIONADDRESS$0);
            return target;
        }
    }
    /**
     * An XML APPLICATION_ADDRESS(@).
     *
     * This is a complex type.
     */
    public static class APPLICATIONADDRESSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS
    {
        private static final long serialVersionUID = 1L;
        
        public APPLICATIONADDRESSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESS$0 = 
            new javax.xml.namespace.QName("", "ADDRESS");
        
        
        /**
         * Gets the "ADDRESS" element
         */
        public java.lang.String getADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$0);
                }
                target.set(address);
            }
        }
    }
}
