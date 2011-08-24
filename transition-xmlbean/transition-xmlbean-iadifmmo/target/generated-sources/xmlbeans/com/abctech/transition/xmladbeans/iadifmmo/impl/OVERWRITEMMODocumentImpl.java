/*
 * An XML document type.
 * Localname: OVERWRITE_MMO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one OVERWRITE_MMO(@) element.
 *
 * This is a complex type.
 */
public class OVERWRITEMMODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument
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
    public com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$0, 0);
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
    public void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$0);
            }
            target.set(overwritemmo);
        }
    }
    
    /**
     * Appends and returns a new empty "OVERWRITE_MMO" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$0);
            return target;
        }
    }
    /**
     * An XML OVERWRITE_MMO(@).
     *
     * This is a complex type.
     */
    public static class OVERWRITEMMOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO
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
        public java.lang.String getMODUS()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMODUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODUS$0);
                return target;
            }
        }
        
        /**
         * Sets the "MODUS" attribute
         */
        public void setMODUS(java.lang.String modus)
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
                target.setStringValue(modus);
            }
        }
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        public void xsetMODUS(org.apache.xmlbeans.XmlString modus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODUS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODUS$0);
                }
                target.set(modus);
            }
        }
    }
}
