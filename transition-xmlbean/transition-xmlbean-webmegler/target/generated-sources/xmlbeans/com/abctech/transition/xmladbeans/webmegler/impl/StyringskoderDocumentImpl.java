/*
 * An XML document type.
 * Localname: styringskoder
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one styringskoder(@) element.
 *
 * This is a complex type.
 */
public class StyringskoderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyringskoderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYRINGSKODER$0 = 
        new javax.xml.namespace.QName("", "styringskoder");
    
    
    /**
     * Gets the "styringskoder" element
     */
    public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder getStyringskoder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().find_element_user(STYRINGSKODER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styringskoder" element
     */
    public void setStyringskoder(com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder styringskoder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().find_element_user(STYRINGSKODER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().add_element_user(STYRINGSKODER$0);
            }
            target.set(styringskoder);
        }
    }
    
    /**
     * Appends and returns a new empty "styringskoder" element
     */
    public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder addNewStyringskoder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().add_element_user(STYRINGSKODER$0);
            return target;
        }
    }
    /**
     * An XML styringskoder(@).
     *
     * This is a complex type.
     */
    public static class StyringskoderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder
    {
        private static final long serialVersionUID = 1L;
        
        public StyringskoderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STYRINGSKODE$0 = 
            new javax.xml.namespace.QName("", "styringskode");
        
        
        /**
         * Gets array of all "styringskode" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode[] getStyringskodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STYRINGSKODE$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode[] result = new com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "styringskode" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode getStyringskodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().find_element_user(STYRINGSKODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "styringskode" element
         */
        public int sizeOfStyringskodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYRINGSKODE$0);
            }
        }
        
        /**
         * Sets array of all "styringskode" element
         */
        public void setStyringskodeArray(com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode[] styringskodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(styringskodeArray, STYRINGSKODE$0);
            }
        }
        
        /**
         * Sets ith "styringskode" element
         */
        public void setStyringskodeArray(int i, com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode styringskode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().find_element_user(STYRINGSKODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(styringskode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "styringskode" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode insertNewStyringskode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().insert_element_user(STYRINGSKODE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "styringskode" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode addNewStyringskode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().add_element_user(STYRINGSKODE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "styringskode" element
         */
        public void removeStyringskode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYRINGSKODE$0, i);
            }
        }
    }
}
