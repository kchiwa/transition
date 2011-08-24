/*
 * An XML document type.
 * Localname: customer_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one customer_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class CustomerListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERLIST$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "customer_list");
    
    
    /**
     * Gets the "customer_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList getCustomerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().find_element_user(CUSTOMERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customer_list" element
     */
    public void setCustomerList(com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList customerList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().find_element_user(CUSTOMERLIST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().add_element_user(CUSTOMERLIST$0);
            }
            target.set(customerList);
        }
    }
    
    /**
     * Appends and returns a new empty "customer_list" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList addNewCustomerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList)get_store().add_element_user(CUSTOMERLIST$0);
            return target;
        }
    }
    /**
     * An XML customer_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class CustomerListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList
    {
        private static final long serialVersionUID = 1L;
        
        public CustomerListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMER$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "customer");
        
        
        /**
         * Gets array of all "customer" elements
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer[] getCustomerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CUSTOMER$0, targetList);
                com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer[] result = new com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "customer" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer getCustomerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "customer" element
         */
        public int sizeOfCustomerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOMER$0);
            }
        }
        
        /**
         * Sets array of all "customer" element
         */
        public void setCustomerArray(com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer[] customerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(customerArray, CUSTOMER$0);
            }
        }
        
        /**
         * Sets ith "customer" element
         */
        public void setCustomerArray(int i, com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer customer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(customer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "customer" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer insertNewCustomer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().insert_element_user(CUSTOMER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "customer" element
         */
        public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer addNewCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "customer" element
         */
        public void removeCustomer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOMER$0, i);
            }
        }
    }
}
