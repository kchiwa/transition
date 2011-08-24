/*
 * An XML document type.
 * Localname: Area
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AreaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Area(@) element.
 *
 * This is a complex type.
 */
public class AreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AreaDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREA$0 = 
        new javax.xml.namespace.QName("", "Area");
    
    
    /**
     * Gets the "Area" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area getArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().find_element_user(AREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Area" element
     */
    public void setArea(com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area area)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().find_element_user(AREA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().add_element_user(AREA$0);
            }
            target.set(area);
        }
    }
    
    /**
     * Appends and returns a new empty "Area" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area addNewArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().add_element_user(AREA$0);
            return target;
        }
    }
    /**
     * An XML Area(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.itmakeriet.AreaDocument$Area.
     */
    public static class AreaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area
    {
        private static final long serialVersionUID = 1L;
        
        public AreaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AreaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
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
