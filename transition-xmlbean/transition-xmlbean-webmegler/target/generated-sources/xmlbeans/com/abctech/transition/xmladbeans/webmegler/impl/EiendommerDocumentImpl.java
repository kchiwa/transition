/*
 * An XML document type.
 * Localname: eiendommer
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.EiendommerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one eiendommer(@) element.
 *
 * This is a complex type.
 */
public class EiendommerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.EiendommerDocument
{
    private static final long serialVersionUID = 1L;
    
    public EiendommerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EIENDOMMER$0 = 
        new javax.xml.namespace.QName("", "eiendommer");
    
    
    /**
     * Gets the "eiendommer" element
     */
    public com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer getEiendommer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer)get_store().find_element_user(EIENDOMMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eiendommer" element
     */
    public void setEiendommer(com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer eiendommer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer)get_store().find_element_user(EIENDOMMER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer)get_store().add_element_user(EIENDOMMER$0);
            }
            target.set(eiendommer);
        }
    }
    
    /**
     * Appends and returns a new empty "eiendommer" element
     */
    public com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer addNewEiendommer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer)get_store().add_element_user(EIENDOMMER$0);
            return target;
        }
    }
    /**
     * An XML eiendommer(@).
     *
     * This is a complex type.
     */
    public static class EiendommerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.EiendommerDocument.Eiendommer
    {
        private static final long serialVersionUID = 1L;
        
        public EiendommerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENEIENDOM$0 = 
            new javax.xml.namespace.QName("", "eneiendom");
        
        
        /**
         * Gets array of all "eneiendom" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom[] getEneiendomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENEIENDOM$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom[] result = new com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "eneiendom" element
         */
        public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom getEneiendomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().find_element_user(ENEIENDOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "eneiendom" element
         */
        public int sizeOfEneiendomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENEIENDOM$0);
            }
        }
        
        /**
         * Sets array of all "eneiendom" element
         */
        public void setEneiendomArray(com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom[] eneiendomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(eneiendomArray, ENEIENDOM$0);
            }
        }
        
        /**
         * Sets ith "eneiendom" element
         */
        public void setEneiendomArray(int i, com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom eneiendom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().find_element_user(ENEIENDOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(eneiendom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "eneiendom" element
         */
        public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom insertNewEneiendom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().insert_element_user(ENEIENDOM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "eneiendom" element
         */
        public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom addNewEneiendom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().add_element_user(ENEIENDOM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "eneiendom" element
         */
        public void removeEneiendom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENEIENDOM$0, i);
            }
        }
    }
}
