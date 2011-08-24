/*
 * An XML document type.
 * Localname: styringskode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one styringskode(@) element.
 *
 * This is a complex type.
 */
public class StyringskodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyringskodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYRINGSKODE$0 = 
        new javax.xml.namespace.QName("", "styringskode");
    
    
    /**
     * Gets the "styringskode" element
     */
    public com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode getStyringskode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().find_element_user(STYRINGSKODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styringskode" element
     */
    public void setStyringskode(com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode styringskode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().find_element_user(STYRINGSKODE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode)get_store().add_element_user(STYRINGSKODE$0);
            }
            target.set(styringskode);
        }
    }
    
    /**
     * Appends and returns a new empty "styringskode" element
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
     * An XML styringskode(@).
     *
     * This is a complex type.
     */
    public static class StyringskodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.StyringskodeDocument.Styringskode
    {
        private static final long serialVersionUID = 1L;
        
        public StyringskodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAVN$2 = 
            new javax.xml.namespace.QName("", "navn");
        private static final javax.xml.namespace.QName MAPPENAVN$4 = 
            new javax.xml.namespace.QName("", "mappenavn");
        
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$0) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$0);
            }
        }
        
        /**
         * Gets the "navn" attribute
         */
        public java.lang.String getNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navn" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$2);
                return target;
            }
        }
        
        /**
         * True if has "navn" attribute
         */
        public boolean isSetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAVN$2) != null;
            }
        }
        
        /**
         * Sets the "navn" attribute
         */
        public void setNavn(java.lang.String navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVN$2);
                }
                target.setStringValue(navn);
            }
        }
        
        /**
         * Sets (as xml) the "navn" attribute
         */
        public void xsetNavn(org.apache.xmlbeans.XmlString navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVN$2);
                }
                target.set(navn);
            }
        }
        
        /**
         * Unsets the "navn" attribute
         */
        public void unsetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAVN$2);
            }
        }
        
        /**
         * Gets the "mappenavn" attribute
         */
        public java.lang.String getMappenavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPENAVN$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mappenavn" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetMappenavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(MAPPENAVN$4);
                return target;
            }
        }
        
        /**
         * True if has "mappenavn" attribute
         */
        public boolean isSetMappenavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAPPENAVN$4) != null;
            }
        }
        
        /**
         * Sets the "mappenavn" attribute
         */
        public void setMappenavn(java.lang.String mappenavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPENAVN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPPENAVN$4);
                }
                target.setStringValue(mappenavn);
            }
        }
        
        /**
         * Sets (as xml) the "mappenavn" attribute
         */
        public void xsetMappenavn(org.apache.xmlbeans.XmlNCName mappenavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(MAPPENAVN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(MAPPENAVN$4);
                }
                target.set(mappenavn);
            }
        }
        
        /**
         * Unsets the "mappenavn" attribute
         */
        public void unsetMappenavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAPPENAVN$4);
            }
        }
    }
}
