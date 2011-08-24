/*
 * An XML document type.
 * Localname: PriceFields
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one PriceFields(@) element.
 *
 * This is a complex type.
 */
public class PriceFieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PriceFieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICEFIELDS$0 = 
        new javax.xml.namespace.QName("", "PriceFields");
    
    
    /**
     * Gets the "PriceFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields getPriceFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().find_element_user(PRICEFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PriceFields" element
     */
    public void setPriceFields(com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields priceFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().find_element_user(PRICEFIELDS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().add_element_user(PRICEFIELDS$0);
            }
            target.set(priceFields);
        }
    }
    
    /**
     * Appends and returns a new empty "PriceFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields addNewPriceFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().add_element_user(PRICEFIELDS$0);
            return target;
        }
    }
    /**
     * An XML PriceFields(@).
     *
     * This is a complex type.
     */
    public static class PriceFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields
    {
        private static final long serialVersionUID = 1L;
        
        public PriceFieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRICE$0 = 
            new javax.xml.namespace.QName("", "Price");
        
        
        /**
         * Gets array of all "Price" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price[] getPriceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRICE$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price[] result = new com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Price" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price getPriceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().find_element_user(PRICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Price" element
         */
        public int sizeOfPriceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRICE$0);
            }
        }
        
        /**
         * Sets array of all "Price" element
         */
        public void setPriceArray(com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price[] priceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(priceArray, PRICE$0);
            }
        }
        
        /**
         * Sets ith "Price" element
         */
        public void setPriceArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price price)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().find_element_user(PRICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(price);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Price" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price insertNewPrice(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().insert_element_user(PRICE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Price" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price addNewPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().add_element_user(PRICE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Price" element
         */
        public void removePrice(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRICE$0, i);
            }
        }
    }
}
