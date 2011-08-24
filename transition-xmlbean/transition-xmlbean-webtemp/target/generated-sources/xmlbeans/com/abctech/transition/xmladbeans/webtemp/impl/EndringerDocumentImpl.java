/*
 * An XML document type.
 * Localname: endringer
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.EndringerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one endringer(@) element.
 *
 * This is a complex type.
 */
public class EndringerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.EndringerDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndringerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDRINGER$0 = 
        new javax.xml.namespace.QName("", "endringer");
    
    
    /**
     * Gets the "endringer" element
     */
    public com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer getEndringer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer)get_store().find_element_user(ENDRINGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endringer" element
     */
    public void setEndringer(com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer endringer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer)get_store().find_element_user(ENDRINGER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer)get_store().add_element_user(ENDRINGER$0);
            }
            target.set(endringer);
        }
    }
    
    /**
     * Appends and returns a new empty "endringer" element
     */
    public com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer addNewEndringer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer)get_store().add_element_user(ENDRINGER$0);
            return target;
        }
    }
    /**
     * An XML endringer(@).
     *
     * This is a complex type.
     */
    public static class EndringerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.EndringerDocument.Endringer
    {
        private static final long serialVersionUID = 1L;
        
        public EndringerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UTLYSTSTILLING$0 = 
            new javax.xml.namespace.QName("", "utlyststilling");
        
        
        /**
         * Gets array of all "utlyststilling" elements
         */
        public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling[] getUtlyststillingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UTLYSTSTILLING$0, targetList);
                com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling[] result = new com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "utlyststilling" element
         */
        public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling getUtlyststillingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().find_element_user(UTLYSTSTILLING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "utlyststilling" element
         */
        public int sizeOfUtlyststillingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UTLYSTSTILLING$0);
            }
        }
        
        /**
         * Sets array of all "utlyststilling" element
         */
        public void setUtlyststillingArray(com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling[] utlyststillingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(utlyststillingArray, UTLYSTSTILLING$0);
            }
        }
        
        /**
         * Sets ith "utlyststilling" element
         */
        public void setUtlyststillingArray(int i, com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling utlyststilling)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().find_element_user(UTLYSTSTILLING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(utlyststilling);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "utlyststilling" element
         */
        public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling insertNewUtlyststilling(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().insert_element_user(UTLYSTSTILLING$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "utlyststilling" element
         */
        public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling addNewUtlyststilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().add_element_user(UTLYSTSTILLING$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "utlyststilling" element
         */
        public void removeUtlyststilling(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UTLYSTSTILLING$0, i);
            }
        }
    }
}
