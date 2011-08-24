/*
 * An XML document type.
 * Localname: PropertyNameExt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyNameExt(@) element.
 *
 * This is a complex type.
 */
public class PropertyNameExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyNameExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYNAMEEXT$0 = 
        new javax.xml.namespace.QName("", "PropertyNameExt");
    
    
    /**
     * Gets the "PropertyNameExt" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt getPropertyNameExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().find_element_user(PROPERTYNAMEEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PropertyNameExt" element
     */
    public void setPropertyNameExt(com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt propertyNameExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().find_element_user(PROPERTYNAMEEXT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().add_element_user(PROPERTYNAMEEXT$0);
            }
            target.set(propertyNameExt);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertyNameExt" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt addNewPropertyNameExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().add_element_user(PROPERTYNAMEEXT$0);
            return target;
        }
    }
    /**
     * An XML PropertyNameExt(@).
     *
     * This is a complex type.
     */
    public static class PropertyNameExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyNameExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
