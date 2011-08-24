/*
 * An XML document type.
 * Localname: aqualands
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one aqualands(@) element.
 *
 * This is a complex type.
 */
public class AqualandsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AqualandsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AQUALANDS$0 = 
        new javax.xml.namespace.QName("", "aqualands");
    
    
    /**
     * Gets the "aqualands" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands getAqualands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().find_element_user(AQUALANDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "aqualands" element
     */
    public void setAqualands(com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands aqualands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().find_element_user(AQUALANDS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().add_element_user(AQUALANDS$0);
            }
            target.set(aqualands);
        }
    }
    
    /**
     * Appends and returns a new empty "aqualands" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands addNewAqualands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().add_element_user(AQUALANDS$0);
            return target;
        }
    }
    /**
     * An XML aqualands(@).
     *
     * This is a complex type.
     */
    public static class AqualandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands
    {
        private static final long serialVersionUID = 1L;
        
        public AqualandsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AQUALAND$0 = 
            new javax.xml.namespace.QName("", "aqualand");
        
        
        /**
         * Gets array of all "aqualand" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand[] getAqualandArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AQUALAND$0, targetList);
                com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand[] result = new com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "aqualand" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand getAqualandArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().find_element_user(AQUALAND$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "aqualand" element
         */
        public int sizeOfAqualandArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AQUALAND$0);
            }
        }
        
        /**
         * Sets array of all "aqualand" element
         */
        public void setAqualandArray(com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand[] aqualandArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(aqualandArray, AQUALAND$0);
            }
        }
        
        /**
         * Sets ith "aqualand" element
         */
        public void setAqualandArray(int i, com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand aqualand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().find_element_user(AQUALAND$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(aqualand);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "aqualand" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand insertNewAqualand(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().insert_element_user(AQUALAND$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "aqualand" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand addNewAqualand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().add_element_user(AQUALAND$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "aqualand" element
         */
        public void removeAqualand(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AQUALAND$0, i);
            }
        }
    }
}
