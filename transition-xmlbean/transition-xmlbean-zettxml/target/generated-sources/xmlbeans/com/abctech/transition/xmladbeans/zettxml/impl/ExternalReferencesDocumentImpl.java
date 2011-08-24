/*
 * An XML document type.
 * Localname: ExternalReferences
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ExternalReferences(@) element.
 *
 * This is a complex type.
 */
public class ExternalReferencesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalReferencesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALREFERENCES$0 = 
        new javax.xml.namespace.QName("", "ExternalReferences");
    
    
    /**
     * Gets the "ExternalReferences" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences getExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalReferences" element
     */
    public void setExternalReferences(com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences externalReferences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$0);
            }
            target.set(externalReferences);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalReferences" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences addNewExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$0);
            return target;
        }
    }
    /**
     * An XML ExternalReferences(@).
     *
     * This is a complex type.
     */
    public static class ExternalReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences
    {
        private static final long serialVersionUID = 1L;
        
        public ExternalReferencesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERENCE$0 = 
            new javax.xml.namespace.QName("", "Reference");
        
        
        /**
         * Gets the "Reference" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference)get_store().find_element_user(REFERENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Reference" element
         */
        public void setReference(com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference)get_store().find_element_user(REFERENCE$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference)get_store().add_element_user(REFERENCE$0);
                }
                target.set(reference);
            }
        }
        
        /**
         * Appends and returns a new empty "Reference" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference addNewReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ReferenceDocument.Reference)get_store().add_element_user(REFERENCE$0);
                return target;
            }
        }
    }
}
