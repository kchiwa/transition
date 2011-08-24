/*
 * An XML document type.
 * Localname: Option
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.OptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Option(@) element.
 *
 * This is a complex type.
 */
public class OptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.OptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTION$0 = 
        new javax.xml.namespace.QName("", "Option");
    
    
    /**
     * Gets the "Option" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option getOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().find_element_user(OPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Option" element
     */
    public void setOption(com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().find_element_user(OPTION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().add_element_user(OPTION$0);
            }
            target.set(option);
        }
    }
    
    /**
     * Appends and returns a new empty "Option" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option addNewOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().add_element_user(OPTION$0);
            return target;
        }
    }
    /**
     * An XML Option(@).
     *
     * This is a complex type.
     */
    public static class OptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option
    {
        private static final long serialVersionUID = 1L;
        
        public OptionImpl(org.apache.xmlbeans.SchemaType sType)
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
