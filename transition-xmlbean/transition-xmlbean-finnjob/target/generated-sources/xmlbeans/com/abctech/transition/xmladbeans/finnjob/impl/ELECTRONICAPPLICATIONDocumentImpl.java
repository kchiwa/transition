/*
 * An XML document type.
 * Localname: ELECTRONIC_APPLICATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one ELECTRONIC_APPLICATION(@) element.
 *
 * This is a complex type.
 */
public class ELECTRONICAPPLICATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public ELECTRONICAPPLICATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELECTRONICAPPLICATION$0 = 
        new javax.xml.namespace.QName("", "ELECTRONIC_APPLICATION");
    
    
    /**
     * Gets the "ELECTRONIC_APPLICATION" element
     */
    public com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ELECTRONIC_APPLICATION" element
     */
    public void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$0);
            }
            target.set(electronicapplication);
        }
    }
    
    /**
     * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
     */
    public com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$0);
            return target;
        }
    }
    /**
     * An XML ELECTRONIC_APPLICATION(@).
     *
     * This is a complex type.
     */
    public static class ELECTRONICAPPLICATIONImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION
    {
        private static final long serialVersionUID = 1L;
        
        public ELECTRONICAPPLICATIONImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTOMATICRESPONSE$0 = 
            new javax.xml.namespace.QName("", "AUTOMATIC_RESPONSE");
        private static final javax.xml.namespace.QName MODUS$2 = 
            new javax.xml.namespace.QName("", "MODUS");
        
        
        /**
         * Gets the "AUTOMATIC_RESPONSE" attribute
         */
        public java.lang.String getAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOMATICRESPONSE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTOMATICRESPONSE$0);
                return target;
            }
        }
        
        /**
         * Sets the "AUTOMATIC_RESPONSE" attribute
         */
        public void setAUTOMATICRESPONSE(java.lang.String automaticresponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOMATICRESPONSE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOMATICRESPONSE$0);
                }
                target.setStringValue(automaticresponse);
            }
        }
        
        /**
         * Sets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        public void xsetAUTOMATICRESPONSE(org.apache.xmlbeans.XmlString automaticresponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTOMATICRESPONSE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AUTOMATICRESPONSE$0);
                }
                target.set(automaticresponse);
            }
        }
        
        /**
         * Gets the "MODUS" attribute
         */
        public java.lang.String getMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODUS$2);
                return target;
            }
        }
        
        /**
         * Sets the "MODUS" attribute
         */
        public void setMODUS(java.lang.String modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODUS$2);
                }
                target.setStringValue(modus);
            }
        }
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        public void xsetMODUS(org.apache.xmlbeans.XmlString modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODUS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODUS$2);
                }
                target.set(modus);
            }
        }
    }
}
