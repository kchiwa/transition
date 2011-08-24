/*
 * An XML document type.
 * Localname: TypeSkiingAlpine
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TypeSkiingAlpineDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one TypeSkiingAlpine(@) element.
 *
 * This is a complex type.
 */
public class TypeSkiingAlpineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TypeSkiingAlpineDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeSkiingAlpineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPESKIINGALPINE$0 = 
        new javax.xml.namespace.QName("", "TypeSkiingAlpine");
    
    
    /**
     * Gets the "TypeSkiingAlpine" element
     */
    public java.lang.String getTypeSkiingAlpine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGALPINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeSkiingAlpine" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeSkiingAlpine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGALPINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TypeSkiingAlpine" element
     */
    public void setTypeSkiingAlpine(java.lang.String typeSkiingAlpine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGALPINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPESKIINGALPINE$0);
            }
            target.setStringValue(typeSkiingAlpine);
        }
    }
    
    /**
     * Sets (as xml) the "TypeSkiingAlpine" element
     */
    public void xsetTypeSkiingAlpine(org.apache.xmlbeans.XmlString typeSkiingAlpine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGALPINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPESKIINGALPINE$0);
            }
            target.set(typeSkiingAlpine);
        }
    }
}
