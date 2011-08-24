/*
 * An XML document type.
 * Localname: EngagementType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one EngagementType(@) element.
 *
 * This is a complex type.
 */
public class EngagementTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngagementTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGAGEMENTTYPE$0 = 
        new javax.xml.namespace.QName("", "EngagementType");
    
    
    /**
     * Gets the "EngagementType" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType getEngagementType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().find_element_user(ENGAGEMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EngagementType" element
     */
    public void setEngagementType(com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType engagementType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().find_element_user(ENGAGEMENTTYPE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().add_element_user(ENGAGEMENTTYPE$0);
            }
            target.set(engagementType);
        }
    }
    
    /**
     * Appends and returns a new empty "EngagementType" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType addNewEngagementType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().add_element_user(ENGAGEMENTTYPE$0);
            return target;
        }
    }
    /**
     * An XML EngagementType(@).
     *
     * This is a complex type.
     */
    public static class EngagementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType
    {
        private static final long serialVersionUID = 1L;
        
        public EngagementTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
