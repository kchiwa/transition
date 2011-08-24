/*
 * An XML document type.
 * Localname: LETTING_UNIT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LETTINGUNITDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LETTING_UNIT(@) element.
 *
 * This is a complex type.
 */
public class LETTINGUNITDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LETTINGUNITDocument
{
    private static final long serialVersionUID = 1L;
    
    public LETTINGUNITDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LETTINGUNIT$0 = 
        new javax.xml.namespace.QName("", "LETTING_UNIT");
    
    
    /**
     * Gets the "LETTING_UNIT" element
     */
    public java.lang.String getLETTINGUNIT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTINGUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LETTING_UNIT" element
     */
    public org.apache.xmlbeans.XmlString xgetLETTINGUNIT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETTINGUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LETTING_UNIT" element
     */
    public void setLETTINGUNIT(java.lang.String lettingunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTINGUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETTINGUNIT$0);
            }
            target.setStringValue(lettingunit);
        }
    }
    
    /**
     * Sets (as xml) the "LETTING_UNIT" element
     */
    public void xsetLETTINGUNIT(org.apache.xmlbeans.XmlString lettingunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETTINGUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETTINGUNIT$0);
            }
            target.set(lettingunit);
        }
    }
}
