/*
 * An XML document type.
 * Localname: Kontaktpunktliste
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kontaktpunktliste(@) element.
 *
 * This is a complex type.
 */
public class KontaktpunktlisteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument
{
    private static final long serialVersionUID = 1L;
    
    public KontaktpunktlisteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTAKTPUNKTLISTE$0 = 
        new javax.xml.namespace.QName("", "Kontaktpunktliste");
    
    
    /**
     * Gets the "Kontaktpunktliste" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste getKontaktpunktliste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().find_element_user(KONTAKTPUNKTLISTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Kontaktpunktliste" element
     */
    public void setKontaktpunktliste(com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste kontaktpunktliste)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().find_element_user(KONTAKTPUNKTLISTE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().add_element_user(KONTAKTPUNKTLISTE$0);
            }
            target.set(kontaktpunktliste);
        }
    }
    
    /**
     * Appends and returns a new empty "Kontaktpunktliste" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste addNewKontaktpunktliste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().add_element_user(KONTAKTPUNKTLISTE$0);
            return target;
        }
    }
    /**
     * An XML Kontaktpunktliste(@).
     *
     * This is a complex type.
     */
    public static class KontaktpunktlisteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste
    {
        private static final long serialVersionUID = 1L;
        
        public KontaktpunktlisteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KONTAKTPUNKT$0 = 
            new javax.xml.namespace.QName("", "Kontaktpunkt");
        
        
        /**
         * Gets array of all "Kontaktpunkt" elements
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt[] getKontaktpunktArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KONTAKTPUNKT$0, targetList);
                com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt[] result = new com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Kontaktpunkt" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt getKontaktpunktArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().find_element_user(KONTAKTPUNKT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Kontaktpunkt" element
         */
        public int sizeOfKontaktpunktArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KONTAKTPUNKT$0);
            }
        }
        
        /**
         * Sets array of all "Kontaktpunkt" element
         */
        public void setKontaktpunktArray(com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt[] kontaktpunktArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(kontaktpunktArray, KONTAKTPUNKT$0);
            }
        }
        
        /**
         * Sets ith "Kontaktpunkt" element
         */
        public void setKontaktpunktArray(int i, com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt kontaktpunkt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().find_element_user(KONTAKTPUNKT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(kontaktpunkt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Kontaktpunkt" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt insertNewKontaktpunkt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().insert_element_user(KONTAKTPUNKT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Kontaktpunkt" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt addNewKontaktpunkt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().add_element_user(KONTAKTPUNKT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Kontaktpunkt" element
         */
        public void removeKontaktpunkt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KONTAKTPUNKT$0, i);
            }
        }
    }
}
