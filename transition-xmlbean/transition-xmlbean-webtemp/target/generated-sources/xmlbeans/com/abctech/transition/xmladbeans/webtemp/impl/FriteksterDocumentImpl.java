/*
 * An XML document type.
 * Localname: fritekster
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.FriteksterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one fritekster(@) element.
 *
 * This is a complex type.
 */
public class FriteksterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.FriteksterDocument
{
    private static final long serialVersionUID = 1L;
    
    public FriteksterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRITEKSTER$0 = 
        new javax.xml.namespace.QName("", "fritekster");
    
    
    /**
     * Gets the "fritekster" element
     */
    public com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster getFritekster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fritekster" element
     */
    public void setFritekster(com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster fritekster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$0);
            }
            target.set(fritekster);
        }
    }
    
    /**
     * Appends and returns a new empty "fritekster" element
     */
    public com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster addNewFritekster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$0);
            return target;
        }
    }
    /**
     * An XML fritekster(@).
     *
     * This is a complex type.
     */
    public static class FriteksterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster
    {
        private static final long serialVersionUID = 1L;
        
        public FriteksterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENFRITEKST$0 = 
            new javax.xml.namespace.QName("", "enfritekst");
        
        
        /**
         * Gets array of all "enfritekst" elements
         */
        public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst[] getEnfritekstArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENFRITEKST$0, targetList);
                com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst[] result = new com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "enfritekst" element
         */
        public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst getEnfritekstArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().find_element_user(ENFRITEKST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "enfritekst" element
         */
        public int sizeOfEnfritekstArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENFRITEKST$0);
            }
        }
        
        /**
         * Sets array of all "enfritekst" element
         */
        public void setEnfritekstArray(com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst[] enfritekstArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(enfritekstArray, ENFRITEKST$0);
            }
        }
        
        /**
         * Sets ith "enfritekst" element
         */
        public void setEnfritekstArray(int i, com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst enfritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().find_element_user(ENFRITEKST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(enfritekst);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "enfritekst" element
         */
        public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst insertNewEnfritekst(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().insert_element_user(ENFRITEKST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "enfritekst" element
         */
        public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst addNewEnfritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().add_element_user(ENFRITEKST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "enfritekst" element
         */
        public void removeEnfritekst(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENFRITEKST$0, i);
            }
        }
    }
}
