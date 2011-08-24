/*
 * An XML document type.
 * Localname: telephone
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one telephone(@) element.
 *
 * This is a complex type.
 */
public class TelephoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONE$0 = 
        new javax.xml.namespace.QName("", "telephone");
    
    
    /**
     * Gets the "telephone" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone getTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().find_element_user(TELEPHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "telephone" element
     */
    public void setTelephone(com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().find_element_user(TELEPHONE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().add_element_user(TELEPHONE$0);
            }
            target.set(telephone);
        }
    }
    
    /**
     * Appends and returns a new empty "telephone" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone addNewTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().add_element_user(TELEPHONE$0);
            return target;
        }
    }
    /**
     * An XML telephone(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument$Telephone.
     */
    public static class TelephoneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone
    {
        private static final long serialVersionUID = 1L;
        
        public TelephoneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TelephoneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("", "number");
        
        
        /**
         * Gets the "number" attribute
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "number" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$0);
                return target;
            }
        }
        
        /**
         * True if has "number" attribute
         */
        public boolean isSetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBER$0) != null;
            }
        }
        
        /**
         * Sets the "number" attribute
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBER$0);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "number" attribute
         */
        public void xsetNumber(org.apache.xmlbeans.XmlString number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMBER$0);
                }
                target.set(number);
            }
        }
        
        /**
         * Unsets the "number" attribute
         */
        public void unsetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBER$0);
            }
        }
    }
}
