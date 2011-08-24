/*
 * An XML document type.
 * Localname: Beds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Beds(@) element.
 *
 * This is a complex type.
 */
public class BedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDS$0 = 
        new javax.xml.namespace.QName("", "Beds");
    
    
    /**
     * Gets the "Beds" element
     */
    public com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds getBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().find_element_user(BEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Beds" element
     */
    public void setBeds(com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds beds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().find_element_user(BEDS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().add_element_user(BEDS$0);
            }
            target.set(beds);
        }
    }
    
    /**
     * Appends and returns a new empty "Beds" element
     */
    public com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds addNewBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().add_element_user(BEDS$0);
            return target;
        }
    }
    /**
     * An XML Beds(@).
     *
     * This is a complex type.
     */
    public static class BedsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds
    {
        private static final long serialVersionUID = 1L;
        
        public BedsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BED$0 = 
            new javax.xml.namespace.QName("", "Bed");
        
        
        /**
         * Gets array of all "Bed" elements
         */
        public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed[] getBedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BED$0, targetList);
                com.abctech.transition.xmladbeans.novasol.BedDocument.Bed[] result = new com.abctech.transition.xmladbeans.novasol.BedDocument.Bed[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Bed" element
         */
        public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed getBedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().find_element_user(BED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Bed" element
         */
        public int sizeOfBedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BED$0);
            }
        }
        
        /**
         * Sets array of all "Bed" element
         */
        public void setBedArray(com.abctech.transition.xmladbeans.novasol.BedDocument.Bed[] bedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bedArray, BED$0);
            }
        }
        
        /**
         * Sets ith "Bed" element
         */
        public void setBedArray(int i, com.abctech.transition.xmladbeans.novasol.BedDocument.Bed bed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().find_element_user(BED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bed);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Bed" element
         */
        public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed insertNewBed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().insert_element_user(BED$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Bed" element
         */
        public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed addNewBed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().add_element_user(BED$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Bed" element
         */
        public void removeBed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BED$0, i);
            }
        }
    }
}
