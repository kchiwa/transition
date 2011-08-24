/*
 * An XML document type.
 * Localname: pets
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.PetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one pets(@) element.
 *
 * This is a complex type.
 */
public class PetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PETS$0 = 
        new javax.xml.namespace.QName("", "pets");
    
    
    /**
     * Gets the "pets" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets getPets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().find_element_user(PETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pets" element
     */
    public void setPets(com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets pets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().find_element_user(PETS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().add_element_user(PETS$0);
            }
            target.set(pets);
        }
    }
    
    /**
     * Appends and returns a new empty "pets" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets addNewPets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().add_element_user(PETS$0);
            return target;
        }
    }
    /**
     * An XML pets(@).
     *
     * This is a complex type.
     */
    public static class PetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets
    {
        private static final long serialVersionUID = 1L;
        
        public PetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOK$0 = 
            new javax.xml.namespace.QName("", "nok");
        
        
        /**
         * Gets the "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok getNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nok" element
         */
        public void setNok(com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok nok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                }
                target.set(nok);
            }
        }
        
        /**
         * Appends and returns a new empty "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok addNewNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                return target;
            }
        }
    }
}
