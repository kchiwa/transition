/*
 * An XML document type.
 * Localname: dokumenter
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.DokumenterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one dokumenter(@) element.
 *
 * This is a complex type.
 */
public class DokumenterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.DokumenterDocument
{
    private static final long serialVersionUID = 1L;
    
    public DokumenterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOKUMENTER$0 = 
        new javax.xml.namespace.QName("", "dokumenter");
    
    
    /**
     * Gets the "dokumenter" element
     */
    public com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter getDokumenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().find_element_user(DOKUMENTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dokumenter" element
     */
    public void setDokumenter(com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter dokumenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().find_element_user(DOKUMENTER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().add_element_user(DOKUMENTER$0);
            }
            target.set(dokumenter);
        }
    }
    
    /**
     * Appends and returns a new empty "dokumenter" element
     */
    public com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter addNewDokumenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().add_element_user(DOKUMENTER$0);
            return target;
        }
    }
    /**
     * An XML dokumenter(@).
     *
     * This is a complex type.
     */
    public static class DokumenterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter
    {
        private static final long serialVersionUID = 1L;
        
        public DokumenterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOKUMENT$0 = 
            new javax.xml.namespace.QName("", "dokument");
        
        
        /**
         * Gets array of all "dokument" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument[] getDokumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOKUMENT$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument[] result = new com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dokument" element
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument getDokumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument)get_store().find_element_user(DOKUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dokument" element
         */
        public int sizeOfDokumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOKUMENT$0);
            }
        }
        
        /**
         * Sets array of all "dokument" element
         */
        public void setDokumentArray(com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument[] dokumentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dokumentArray, DOKUMENT$0);
            }
        }
        
        /**
         * Sets ith "dokument" element
         */
        public void setDokumentArray(int i, com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument dokument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument)get_store().find_element_user(DOKUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dokument);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dokument" element
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument insertNewDokument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument)get_store().insert_element_user(DOKUMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dokument" element
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument addNewDokument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumentDocument.Dokument)get_store().add_element_user(DOKUMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dokument" element
         */
        public void removeDokument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOKUMENT$0, i);
            }
        }
    }
}
