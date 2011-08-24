/*
 * An XML document type.
 * Localname: Aircondition
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AirconditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Aircondition(@) element.
 *
 * This is a complex type.
 */
public class AirconditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AirconditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AirconditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRCONDITION$0 = 
        new javax.xml.namespace.QName("", "Aircondition");
    
    
    /**
     * Gets the "Aircondition" element
     */
    public com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition getAircondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
            target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().find_element_user(AIRCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Aircondition" element
     */
    public void setAircondition(com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition aircondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
            target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().find_element_user(AIRCONDITION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().add_element_user(AIRCONDITION$0);
            }
            target.set(aircondition);
        }
    }
    
    /**
     * Appends and returns a new empty "Aircondition" element
     */
    public com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition addNewAircondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
            target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().add_element_user(AIRCONDITION$0);
            return target;
        }
    }
    /**
     * An XML Aircondition(@).
     *
     * This is a complex type.
     */
    public static class AirconditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition
    {
        private static final long serialVersionUID = 1L;
        
        public AirconditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
