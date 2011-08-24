/*
 * An XML document type.
 * Localname: GENERAL_TEXT_JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one GENERAL_TEXT_JOB(@) element.
 *
 * This is a complex type.
 */
public class GENERALTEXTJOBDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument
{
    private static final long serialVersionUID = 1L;
    
    public GENERALTEXTJOBDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALTEXTJOB$0 = 
        new javax.xml.namespace.QName("", "GENERAL_TEXT_JOB");
    
    
    /**
     * Gets the "GENERAL_TEXT_JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB getGENERALTEXTJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().find_element_user(GENERALTEXTJOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GENERAL_TEXT_JOB" element
     */
    public void setGENERALTEXTJOB(com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB generaltextjob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().find_element_user(GENERALTEXTJOB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().add_element_user(GENERALTEXTJOB$0);
            }
            target.set(generaltextjob);
        }
    }
    
    /**
     * Appends and returns a new empty "GENERAL_TEXT_JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB addNewGENERALTEXTJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().add_element_user(GENERALTEXTJOB$0);
            return target;
        }
    }
    /**
     * An XML GENERAL_TEXT_JOB(@).
     *
     * This is a complex type.
     */
    public static class GENERALTEXTJOBImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB
    {
        private static final long serialVersionUID = 1L;
        
        public GENERALTEXTJOBImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENERALHEADING$0 = 
            new javax.xml.namespace.QName("", "GENERAL_HEADING");
        private static final javax.xml.namespace.QName GENERALTEXT$2 = 
            new javax.xml.namespace.QName("", "GENERAL_TEXT");
        
        
        /**
         * Gets the "GENERAL_HEADING" element
         */
        public java.lang.String getGENERALHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALHEADING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GENERAL_HEADING" element
         */
        public org.apache.xmlbeans.XmlString xgetGENERALHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALHEADING$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GENERAL_HEADING" element
         */
        public void setGENERALHEADING(java.lang.String generalheading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALHEADING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALHEADING$0);
                }
                target.setStringValue(generalheading);
            }
        }
        
        /**
         * Sets (as xml) the "GENERAL_HEADING" element
         */
        public void xsetGENERALHEADING(org.apache.xmlbeans.XmlString generalheading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALHEADING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERALHEADING$0);
                }
                target.set(generalheading);
            }
        }
        
        /**
         * Gets the "GENERAL_TEXT" element
         */
        public java.lang.String getGENERALTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALTEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GENERAL_TEXT" element
         */
        public org.apache.xmlbeans.XmlString xgetGENERALTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALTEXT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GENERAL_TEXT" element
         */
        public void setGENERALTEXT(java.lang.String generaltext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALTEXT$2);
                }
                target.setStringValue(generaltext);
            }
        }
        
        /**
         * Sets (as xml) the "GENERAL_TEXT" element
         */
        public void xsetGENERALTEXT(org.apache.xmlbeans.XmlString generaltext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERALTEXT$2);
                }
                target.set(generaltext);
            }
        }
    }
}
