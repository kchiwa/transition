/*
 * An XML document type.
 * Localname: bemanningsselskap
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one bemanningsselskap(@) element.
 *
 * This is a complex type.
 */
public class BemanningsselskapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument
{
    private static final long serialVersionUID = 1L;
    
    public BemanningsselskapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEMANNINGSSELSKAP$0 = 
        new javax.xml.namespace.QName("", "bemanningsselskap");
    
    
    /**
     * Gets the "bemanningsselskap" element
     */
    public com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap getBemanningsselskap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().find_element_user(BEMANNINGSSELSKAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bemanningsselskap" element
     */
    public void setBemanningsselskap(com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap bemanningsselskap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().find_element_user(BEMANNINGSSELSKAP$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().add_element_user(BEMANNINGSSELSKAP$0);
            }
            target.set(bemanningsselskap);
        }
    }
    
    /**
     * Appends and returns a new empty "bemanningsselskap" element
     */
    public com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap addNewBemanningsselskap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().add_element_user(BEMANNINGSSELSKAP$0);
            return target;
        }
    }
    /**
     * An XML bemanningsselskap(@).
     *
     * This is a complex type.
     */
    public static class BemanningsselskapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap
    {
        private static final long serialVersionUID = 1L;
        
        public BemanningsselskapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JURIDISKNAVN$0 = 
            new javax.xml.namespace.QName("", "juridisknavn");
        private static final javax.xml.namespace.QName AVDELINGSNAVN$2 = 
            new javax.xml.namespace.QName("", "avdelingsnavn");
        private static final javax.xml.namespace.QName KOMMENTAR$4 = 
            new javax.xml.namespace.QName("", "kommentar");
        private static final javax.xml.namespace.QName KONTAKTPERSON$6 = 
            new javax.xml.namespace.QName("", "kontaktperson");
        
        
        /**
         * Gets the "juridisknavn" element
         */
        public java.lang.String getJuridisknavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURIDISKNAVN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "juridisknavn" element
         */
        public org.apache.xmlbeans.XmlString xgetJuridisknavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JURIDISKNAVN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "juridisknavn" element
         */
        public void setJuridisknavn(java.lang.String juridisknavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURIDISKNAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JURIDISKNAVN$0);
                }
                target.setStringValue(juridisknavn);
            }
        }
        
        /**
         * Sets (as xml) the "juridisknavn" element
         */
        public void xsetJuridisknavn(org.apache.xmlbeans.XmlString juridisknavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JURIDISKNAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JURIDISKNAVN$0);
                }
                target.set(juridisknavn);
            }
        }
        
        /**
         * Gets the "avdelingsnavn" element
         */
        public java.lang.String getAvdelingsnavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVDELINGSNAVN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "avdelingsnavn" element
         */
        public org.apache.xmlbeans.XmlString xgetAvdelingsnavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVDELINGSNAVN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "avdelingsnavn" element
         */
        public void setAvdelingsnavn(java.lang.String avdelingsnavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVDELINGSNAVN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVDELINGSNAVN$2);
                }
                target.setStringValue(avdelingsnavn);
            }
        }
        
        /**
         * Sets (as xml) the "avdelingsnavn" element
         */
        public void xsetAvdelingsnavn(org.apache.xmlbeans.XmlString avdelingsnavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVDELINGSNAVN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AVDELINGSNAVN$2);
                }
                target.set(avdelingsnavn);
            }
        }
        
        /**
         * Gets the "kommentar" element
         */
        public java.lang.String getKommentar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "kommentar" element
         */
        public org.apache.xmlbeans.XmlString xgetKommentar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "kommentar" element
         */
        public void setKommentar(java.lang.String kommentar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMENTAR$4);
                }
                target.setStringValue(kommentar);
            }
        }
        
        /**
         * Sets (as xml) the "kommentar" element
         */
        public void xsetKommentar(org.apache.xmlbeans.XmlString kommentar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMENTAR$4);
                }
                target.set(kommentar);
            }
        }
        
        /**
         * Gets array of all "kontaktperson" elements
         */
        public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[] getKontaktpersonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KONTAKTPERSON$6, targetList);
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[] result = new com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "kontaktperson" element
         */
        public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktpersonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "kontaktperson" element
         */
        public int sizeOfKontaktpersonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KONTAKTPERSON$6);
            }
        }
        
        /**
         * Sets array of all "kontaktperson" element
         */
        public void setKontaktpersonArray(com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[] kontaktpersonArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(kontaktpersonArray, KONTAKTPERSON$6);
            }
        }
        
        /**
         * Sets ith "kontaktperson" element
         */
        public void setKontaktpersonArray(int i, com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson kontaktperson)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(kontaktperson);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "kontaktperson" element
         */
        public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson insertNewKontaktperson(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().insert_element_user(KONTAKTPERSON$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "kontaktperson" element
         */
        public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson addNewKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().add_element_user(KONTAKTPERSON$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "kontaktperson" element
         */
        public void removeKontaktperson(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KONTAKTPERSON$6, i);
            }
        }
    }
}
