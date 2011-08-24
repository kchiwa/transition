/*
 * An XML document type.
 * Localname: OVERWRITE_MMO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one OVERWRITE_MMO(@) element.
 *
 * This is a complex type.
 */
public class OVERWRITEMMODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument
{
    private static final long serialVersionUID = 1L;
    
    public OVERWRITEMMODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OVERWRITEMMO$0 = 
        new javax.xml.namespace.QName("", "OVERWRITE_MMO");
    
    
    /**
     * Gets the "OVERWRITE_MMO" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OVERWRITE_MMO" element
     */
    public void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$0);
            }
            target.set(overwritemmo);
        }
    }
    
    /**
     * Appends and returns a new empty "OVERWRITE_MMO" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$0);
            return target;
        }
    }
    /**
     * An XML OVERWRITE_MMO(@).
     *
     * This is a complex type.
     */
    public static class OVERWRITEMMOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO
    {
        private static final long serialVersionUID = 1L;
        
        public OVERWRITEMMOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MODUS$0 = 
            new javax.xml.namespace.QName("", "MODUS");
        
        
        /**
         * Gets the "MODUS" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS.Enum getMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS xgetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS)get_store().find_attribute_user(MODUS$0);
                return target;
            }
        }
        
        /**
         * Sets the "MODUS" attribute
         */
        public void setMODUS(com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS.Enum modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODUS$0);
                }
                target.setEnumValue(modus);
            }
        }
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        public void xsetMODUS(com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS)get_store().add_attribute_user(MODUS$0);
                }
                target.set(modus);
            }
        }
        /**
         * An XML MODUS(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument$OVERWRITEMMO$MODUS.
         */
        public static class MODUSImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifestateforsale.OVERWRITEMMODocument.OVERWRITEMMO.MODUS
        {
            private static final long serialVersionUID = 1L;
            
            public MODUSImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MODUSImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
