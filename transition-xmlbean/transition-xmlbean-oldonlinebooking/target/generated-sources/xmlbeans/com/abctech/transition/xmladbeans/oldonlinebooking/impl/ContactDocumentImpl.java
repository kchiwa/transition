/*
 * An XML document type.
 * Localname: contact
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one contact(@) element.
 *
 * This is a complex type.
 */
public class ContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("", "contact");
    
    
    /**
     * Gets the "contact" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contact" element
     */
    public void setContact(com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
            }
            target.set(contact);
        }
    }
    
    /**
     * Appends and returns a new empty "contact" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
            return target;
        }
    }
    /**
     * An XML contact(@).
     *
     * This is a complex type.
     */
    public static class ContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact
    {
        private static final long serialVersionUID = 1L;
        
        public ContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        
        
        /**
         * Gets array of all "field" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$0, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field" element
         */
        public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$0);
            }
        }
        
        /**
         * Sets array of all "field" element
         */
        public void setFieldArray(com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field[] fieldArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldArray, FIELD$0);
            }
        }
        
        /**
         * Sets ith "field" element
         */
        public void setFieldArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(field);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().insert_element_user(FIELD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.FieldDocument.Field)get_store().add_element_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "field" element
         */
        public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$0, i);
            }
        }
    }
}
