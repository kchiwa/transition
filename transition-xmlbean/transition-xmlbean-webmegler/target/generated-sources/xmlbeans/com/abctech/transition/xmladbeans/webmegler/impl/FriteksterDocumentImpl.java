/*
 * An XML document type.
 * Localname: fritekster
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.FriteksterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one fritekster(@) element.
 *
 * This is a complex type.
 */
public class FriteksterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.FriteksterDocument
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
    public com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster getFritekster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$0, 0);
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
    public void setFritekster(com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster fritekster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$0);
            }
            target.set(fritekster);
        }
    }
    
    /**
     * Appends and returns a new empty "fritekster" element
     */
    public com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster addNewFritekster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$0);
            return target;
        }
    }
    /**
     * An XML fritekster(@).
     *
     * This is a complex type.
     */
    public static class FriteksterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster
    {
        private static final long serialVersionUID = 1L;
        
        public FriteksterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FRITEKST$0 = 
            new javax.xml.namespace.QName("", "fritekst");
        
        
        /**
         * Gets array of all "fritekst" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst[] getFritekstArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FRITEKST$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst[] result = new com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fritekst" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst getFritekstArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().find_element_user(FRITEKST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fritekst" element
         */
        public int sizeOfFritekstArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FRITEKST$0);
            }
        }
        
        /**
         * Sets array of all "fritekst" element
         */
        public void setFritekstArray(com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst[] fritekstArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fritekstArray, FRITEKST$0);
            }
        }
        
        /**
         * Sets ith "fritekst" element
         */
        public void setFritekstArray(int i, com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst fritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().find_element_user(FRITEKST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fritekst);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fritekst" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst insertNewFritekst(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().insert_element_user(FRITEKST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fritekst" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst addNewFritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().add_element_user(FRITEKST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fritekst" element
         */
        public void removeFritekst(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FRITEKST$0, i);
            }
        }
    }
}
