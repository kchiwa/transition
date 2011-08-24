/*
 * An XML document type.
 * Localname: ContactAttributes
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ContactAttributes(@) element.
 *
 * This is a complex type.
 */
public class ContactAttributesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactAttributesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTATTRIBUTES$0 = 
        new javax.xml.namespace.QName("", "ContactAttributes");
    
    
    /**
     * Gets the "ContactAttributes" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes getContactAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().find_element_user(CONTACTATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactAttributes" element
     */
    public void setContactAttributes(com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes contactAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().find_element_user(CONTACTATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().add_element_user(CONTACTATTRIBUTES$0);
            }
            target.set(contactAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactAttributes" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes addNewContactAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().add_element_user(CONTACTATTRIBUTES$0);
            return target;
        }
    }
    /**
     * An XML ContactAttributes(@).
     *
     * This is a complex type.
     */
    public static class ContactAttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes
    {
        private static final long serialVersionUID = 1L;
        
        public ContactAttributesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTATTRIBUTESECTION$0 = 
            new javax.xml.namespace.QName("", "ContactAttributeSection");
        
        
        /**
         * Gets the "ContactAttributeSection" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection getContactAttributeSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().find_element_user(CONTACTATTRIBUTESECTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ContactAttributeSection" element
         */
        public void setContactAttributeSection(com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection contactAttributeSection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().find_element_user(CONTACTATTRIBUTESECTION$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().add_element_user(CONTACTATTRIBUTESECTION$0);
                }
                target.set(contactAttributeSection);
            }
        }
        
        /**
         * Appends and returns a new empty "ContactAttributeSection" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection addNewContactAttributeSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().add_element_user(CONTACTATTRIBUTESECTION$0);
                return target;
            }
        }
    }
}
