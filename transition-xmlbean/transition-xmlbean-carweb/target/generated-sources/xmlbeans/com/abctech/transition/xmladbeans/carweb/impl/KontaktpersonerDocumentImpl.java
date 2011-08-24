/*
 * An XML document type.
 * Localname: Kontaktpersoner
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kontaktpersoner(@) element.
 *
 * This is a complex type.
 */
public class KontaktpersonerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument
{
    private static final long serialVersionUID = 1L;
    
    public KontaktpersonerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTAKTPERSONER$0 = 
        new javax.xml.namespace.QName("", "Kontaktpersoner");
    
    
    /**
     * Gets the "Kontaktpersoner" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner getKontaktpersoner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().find_element_user(KONTAKTPERSONER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Kontaktpersoner" element
     */
    public void setKontaktpersoner(com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner kontaktpersoner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().find_element_user(KONTAKTPERSONER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().add_element_user(KONTAKTPERSONER$0);
            }
            target.set(kontaktpersoner);
        }
    }
    
    /**
     * Appends and returns a new empty "Kontaktpersoner" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner addNewKontaktpersoner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().add_element_user(KONTAKTPERSONER$0);
            return target;
        }
    }
    /**
     * An XML Kontaktpersoner(@).
     *
     * This is a complex type.
     */
    public static class KontaktpersonerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner
    {
        private static final long serialVersionUID = 1L;
        
        public KontaktpersonerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KONTAKTPERSON$0 = 
            new javax.xml.namespace.QName("", "Kontaktperson");
        
        
        /**
         * Gets the "Kontaktperson" element
         */
        public java.lang.String getKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KONTAKTPERSON$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kontaktperson" element
         */
        public org.apache.xmlbeans.XmlString xgetKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KONTAKTPERSON$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Kontaktperson" element
         */
        public boolean isSetKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KONTAKTPERSON$0) != 0;
            }
        }
        
        /**
         * Sets the "Kontaktperson" element
         */
        public void setKontaktperson(java.lang.String kontaktperson)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KONTAKTPERSON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KONTAKTPERSON$0);
                }
                target.setStringValue(kontaktperson);
            }
        }
        
        /**
         * Sets (as xml) the "Kontaktperson" element
         */
        public void xsetKontaktperson(org.apache.xmlbeans.XmlString kontaktperson)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KONTAKTPERSON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KONTAKTPERSON$0);
                }
                target.set(kontaktperson);
            }
        }
        
        /**
         * Unsets the "Kontaktperson" element
         */
        public void unsetKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KONTAKTPERSON$0, 0);
            }
        }
    }
}
