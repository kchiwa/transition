/*
 * An XML document type.
 * Localname: Sector
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.SectorDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Sector(@) element.
 *
 * This is a complex type.
 */
public class SectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.SectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTOR$0 = 
        new javax.xml.namespace.QName("", "Sector");
    
    
    /**
     * Gets the "Sector" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector getSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().find_element_user(SECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sector" element
     */
    public void setSector(com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector sector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().find_element_user(SECTOR$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().add_element_user(SECTOR$0);
            }
            target.set(sector);
        }
    }
    
    /**
     * Appends and returns a new empty "Sector" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector addNewSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().add_element_user(SECTOR$0);
            return target;
        }
    }
    /**
     * An XML Sector(@).
     *
     * This is a complex type.
     */
    public static class SectorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector
    {
        private static final long serialVersionUID = 1L;
        
        public SectorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        
        
        /**
         * Gets the "Name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "Name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "Name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
    }
}
