/*
 * An XML document type.
 * Localname: bilder
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.BilderDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one bilder(@) element.
 *
 * This is a complex type.
 */
public class BilderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.BilderDocument
{
    private static final long serialVersionUID = 1L;
    
    public BilderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILDER$0 = 
        new javax.xml.namespace.QName("", "bilder");
    
    
    /**
     * Gets the "bilder" element
     */
    public com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder getBilder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().find_element_user(BILDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bilder" element
     */
    public void setBilder(com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder bilder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().find_element_user(BILDER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().add_element_user(BILDER$0);
            }
            target.set(bilder);
        }
    }
    
    /**
     * Appends and returns a new empty "bilder" element
     */
    public com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder addNewBilder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().add_element_user(BILDER$0);
            return target;
        }
    }
    /**
     * An XML bilder(@).
     *
     * This is a complex type.
     */
    public static class BilderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder
    {
        private static final long serialVersionUID = 1L;
        
        public BilderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BILDE$0 = 
            new javax.xml.namespace.QName("", "bilde");
        
        
        /**
         * Gets array of all "bilde" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde[] getBildeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BILDE$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde[] result = new com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "bilde" element
         */
        public com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde getBildeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde)get_store().find_element_user(BILDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "bilde" element
         */
        public int sizeOfBildeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BILDE$0);
            }
        }
        
        /**
         * Sets array of all "bilde" element
         */
        public void setBildeArray(com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde[] bildeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bildeArray, BILDE$0);
            }
        }
        
        /**
         * Sets ith "bilde" element
         */
        public void setBildeArray(int i, com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde bilde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde)get_store().find_element_user(BILDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bilde);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bilde" element
         */
        public com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde insertNewBilde(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde)get_store().insert_element_user(BILDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bilde" element
         */
        public com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde addNewBilde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BildeDocument.Bilde)get_store().add_element_user(BILDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "bilde" element
         */
        public void removeBilde(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BILDE$0, i);
            }
        }
    }
}
