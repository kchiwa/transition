/*
 * An XML document type.
 * Localname: PetType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PetTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PetType(@) element.
 *
 * This is a complex type.
 */
public class PetTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PetTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PetTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PETTYPE$0 = 
        new javax.xml.namespace.QName("", "PetType");
    
    
    /**
     * Gets the "PetType" element
     */
    public com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType getPetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().find_element_user(PETTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PetType" element
     */
    public void setPetType(com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType petType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().find_element_user(PETTYPE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().add_element_user(PETTYPE$0);
            }
            target.set(petType);
        }
    }
    
    /**
     * Appends and returns a new empty "PetType" element
     */
    public com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType addNewPetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().add_element_user(PETTYPE$0);
            return target;
        }
    }
    /**
     * An XML PetType(@).
     *
     * This is a complex type.
     */
    public static class PetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType
    {
        private static final long serialVersionUID = 1L;
        
        public PetTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
