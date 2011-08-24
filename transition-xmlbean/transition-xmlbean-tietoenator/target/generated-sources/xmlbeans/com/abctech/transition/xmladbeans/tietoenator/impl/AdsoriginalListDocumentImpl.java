/*
 * An XML document type.
 * Localname: adsoriginal_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one adsoriginal_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdsoriginalListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdsoriginalListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSORIGINALLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_list");
    
    
    /**
     * Gets the "adsoriginal_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList getAdsoriginalList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().find_element_user(ADSORIGINALLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "adsoriginal_list" element
     */
    public void setAdsoriginalList(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList adsoriginalList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().find_element_user(ADSORIGINALLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().add_element_user(ADSORIGINALLIST$0);
            }
            target.set(adsoriginalList);
        }
    }
    
    /**
     * Appends and returns a new empty "adsoriginal_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList addNewAdsoriginalList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList)get_store().add_element_user(ADSORIGINALLIST$0);
            return target;
        }
    }
    /**
     * An XML adsoriginal_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class AdsoriginalListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList
    {
        private static final long serialVersionUID = 1L;
        
        public AdsoriginalListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADSORIGINAL$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal");
        
        
        /**
         * Gets array of all "adsoriginal" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal[] getAdsoriginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADSORIGINAL$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal[] result = new com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "adsoriginal" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal getAdsoriginalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().find_element_user(ADSORIGINAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "adsoriginal" element
         */
        public int sizeOfAdsoriginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADSORIGINAL$0);
            }
        }
        
        /**
         * Sets array of all "adsoriginal" element
         */
        public void setAdsoriginalArray(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal[] adsoriginalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(adsoriginalArray, ADSORIGINAL$0);
            }
        }
        
        /**
         * Sets ith "adsoriginal" element
         */
        public void setAdsoriginalArray(int i, com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal adsoriginal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().find_element_user(ADSORIGINAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(adsoriginal);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "adsoriginal" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal insertNewAdsoriginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().insert_element_user(ADSORIGINAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "adsoriginal" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal addNewAdsoriginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal)get_store().add_element_user(ADSORIGINAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "adsoriginal" element
         */
        public void removeAdsoriginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADSORIGINAL$0, i);
            }
        }
    }
}
