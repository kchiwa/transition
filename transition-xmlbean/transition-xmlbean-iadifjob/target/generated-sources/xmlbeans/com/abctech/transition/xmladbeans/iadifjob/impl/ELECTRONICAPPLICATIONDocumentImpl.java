/*
 * An XML document type.
 * Localname: ELECTRONIC_APPLICATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one ELECTRONIC_APPLICATION(@) element.
 *
 * This is a complex type.
 */
public class ELECTRONICAPPLICATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument
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
    public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$0, 0);
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
    public void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$0);
            }
            target.set(electronicapplication);
        }
    }
    
    /**
     * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$0);
            return target;
        }
    }
    /**
     * An XML ELECTRONIC_APPLICATION(@).
     *
     * This is a complex type.
     */
    public static class ELECTRONICAPPLICATIONImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION
    {
        private static final long serialVersionUID = 1L;
        
        public ELECTRONICAPPLICATIONImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MODUS$0 = 
            new javax.xml.namespace.QName("", "MODUS");
        private static final javax.xml.namespace.QName AUTOMATICRESPONSE$2 = 
            new javax.xml.namespace.QName("", "AUTOMATIC_RESPONSE");
        
        
        /**
         * Gets the "MODUS" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS.Enum getMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MODUS$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS xgetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS)get_default_attribute_value(MODUS$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "MODUS" attribute
         */
        public boolean isSetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODUS$0) != null;
            }
        }
        
        /**
         * Sets the "MODUS" attribute
         */
        public void setMODUS(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS.Enum modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODUS$0);
                }
                target.setEnumValue(modus);
            }
        }
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        public void xsetMODUS(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS)get_store().add_attribute_user(MODUS$0);
                }
                target.set(modus);
            }
        }
        
        /**
         * Unsets the "MODUS" attribute
         */
        public void unsetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODUS$0);
            }
        }
        
        /**
         * Gets the "AUTOMATIC_RESPONSE" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE.Enum getAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOMATICRESPONSE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOMATICRESPONSE$2);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE xgetAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE)get_store().find_attribute_user(AUTOMATICRESPONSE$2);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE)get_default_attribute_value(AUTOMATICRESPONSE$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "AUTOMATIC_RESPONSE" attribute
         */
        public boolean isSetAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOMATICRESPONSE$2) != null;
            }
        }
        
        /**
         * Sets the "AUTOMATIC_RESPONSE" attribute
         */
        public void setAUTOMATICRESPONSE(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE.Enum automaticresponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOMATICRESPONSE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOMATICRESPONSE$2);
                }
                target.setEnumValue(automaticresponse);
            }
        }
        
        /**
         * Sets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        public void xsetAUTOMATICRESPONSE(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE automaticresponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE)get_store().find_attribute_user(AUTOMATICRESPONSE$2);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE)get_store().add_attribute_user(AUTOMATICRESPONSE$2);
                }
                target.set(automaticresponse);
            }
        }
        
        /**
         * Unsets the "AUTOMATIC_RESPONSE" attribute
         */
        public void unsetAUTOMATICRESPONSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOMATICRESPONSE$2);
            }
        }
        /**
         * An XML MODUS(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$MODUS.
         */
        public static class MODUSImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS
        {
            private static final long serialVersionUID = 1L;
            
            public MODUSImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MODUSImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML AUTOMATIC_RESPONSE(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$AUTOMATICRESPONSE.
         */
        public static class AUTOMATICRESPONSEImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE
        {
            private static final long serialVersionUID = 1L;
            
            public AUTOMATICRESPONSEImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AUTOMATICRESPONSEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
