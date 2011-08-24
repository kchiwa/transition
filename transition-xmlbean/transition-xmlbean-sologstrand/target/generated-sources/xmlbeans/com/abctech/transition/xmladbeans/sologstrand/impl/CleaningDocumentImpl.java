/*
 * An XML document type.
 * Localname: cleaning
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.CleaningDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one cleaning(@) element.
 *
 * This is a complex type.
 */
public class CleaningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.CleaningDocument
{
    private static final long serialVersionUID = 1L;
    
    public CleaningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEANING$0 = 
        new javax.xml.namespace.QName("", "cleaning");
    
    
    /**
     * Gets the "cleaning" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning getCleaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().find_element_user(CLEANING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cleaning" element
     */
    public void setCleaning(com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning cleaning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().find_element_user(CLEANING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().add_element_user(CLEANING$0);
            }
            target.set(cleaning);
        }
    }
    
    /**
     * Appends and returns a new empty "cleaning" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning addNewCleaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().add_element_user(CLEANING$0);
            return target;
        }
    }
    /**
     * An XML cleaning(@).
     *
     * This is a complex type.
     */
    public static class CleaningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning
    {
        private static final long serialVersionUID = 1L;
        
        public CleaningImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOK$0 = 
            new javax.xml.namespace.QName("", "nok");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName TYPESHORTSTAY$4 = 
            new javax.xml.namespace.QName("", "type_short_stay");
        
        
        /**
         * Gets the "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok getNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nok" element
         */
        public void setNok(com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok nok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                }
                target.set(nok);
            }
        }
        
        /**
         * Appends and returns a new empty "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok addNewNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                return target;
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "type_short_stay" attribute
         */
        public java.lang.String getTypeShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPESHORTSTAY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type_short_stay" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTypeShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPESHORTSTAY$4);
                return target;
            }
        }
        
        /**
         * True if has "type_short_stay" attribute
         */
        public boolean isSetTypeShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPESHORTSTAY$4) != null;
            }
        }
        
        /**
         * Sets the "type_short_stay" attribute
         */
        public void setTypeShortStay(java.lang.String typeShortStay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPESHORTSTAY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPESHORTSTAY$4);
                }
                target.setStringValue(typeShortStay);
            }
        }
        
        /**
         * Sets (as xml) the "type_short_stay" attribute
         */
        public void xsetTypeShortStay(org.apache.xmlbeans.XmlString typeShortStay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPESHORTSTAY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPESHORTSTAY$4);
                }
                target.set(typeShortStay);
            }
        }
        
        /**
         * Unsets the "type_short_stay" attribute
         */
        public void unsetTypeShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPESHORTSTAY$4);
            }
        }
    }
}
