/*
 * An XML document type.
 * Localname: zett.no
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ZettNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one zett.no(@) element.
 *
 * This is a complex type.
 */
public class ZettNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ZettNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZettNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZETTNO$0 = 
        new javax.xml.namespace.QName("", "zett.no");
    
    
    /**
     * Gets the "zett.no" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo getZettNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().find_element_user(ZETTNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "zett.no" element
     */
    public void setZettNo(com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo zettNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().find_element_user(ZETTNO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().add_element_user(ZETTNO$0);
            }
            target.set(zettNo);
        }
    }
    
    /**
     * Appends and returns a new empty "zett.no" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo addNewZettNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().add_element_user(ZETTNO$0);
            return target;
        }
    }
    /**
     * An XML zett.no(@).
     *
     * This is a complex type.
     */
    public static class ZettNoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo
    {
        private static final long serialVersionUID = 1L;
        
        public ZettNoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AD$0 = 
            new javax.xml.namespace.QName("", "Ad");
        private static final javax.xml.namespace.QName ZETTNO$2 = 
            new javax.xml.namespace.QName("", "zett.no");
        
        
        /**
         * Gets array of all "Ad" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[] getAdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AD$0, targetList);
                com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[] result = new com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Ad" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad getAdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().find_element_user(AD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Ad" element
         */
        public int sizeOfAdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AD$0);
            }
        }
        
        /**
         * Sets array of all "Ad" element
         */
        public void setAdArray(com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[] adArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(adArray, AD$0);
            }
        }
        
        /**
         * Sets ith "Ad" element
         */
        public void setAdArray(int i, com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad ad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().find_element_user(AD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ad);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Ad" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad insertNewAd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().insert_element_user(AD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Ad" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad addNewAd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().add_element_user(AD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Ad" element
         */
        public void removeAd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AD$0, i);
            }
        }
        
        /**
         * Gets array of all "zett.no" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[] getZettNoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZETTNO$2, targetList);
                com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[] result = new com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "zett.no" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo getZettNoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().find_element_user(ZETTNO$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "zett.no" element
         */
        public int sizeOfZettNoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZETTNO$2);
            }
        }
        
        /**
         * Sets array of all "zett.no" element
         */
        public void setZettNoArray(com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[] zettNoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zettNoArray, ZETTNO$2);
            }
        }
        
        /**
         * Sets ith "zett.no" element
         */
        public void setZettNoArray(int i, com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo zettNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().find_element_user(ZETTNO$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zettNo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "zett.no" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo insertNewZettNo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().insert_element_user(ZETTNO$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "zett.no" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo addNewZettNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo)get_store().add_element_user(ZETTNO$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "zett.no" element
         */
        public void removeZettNo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZETTNO$2, i);
            }
        }
    }
}
