/*
 * An XML document type.
 * Localname: MainAreaCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MainAreaCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MainAreaCode(@) element.
 *
 * This is a complex type.
 */
public class MainAreaCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MainAreaCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MainAreaCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINAREACODE$0 = 
        new javax.xml.namespace.QName("", "MainAreaCode");
    
    
    /**
     * Gets the "MainAreaCode" element
     */
    public java.lang.String getMainAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINAREACODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MainAreaCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMainAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINAREACODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MainAreaCode" element
     */
    public void setMainAreaCode(java.lang.String mainAreaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINAREACODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINAREACODE$0);
            }
            target.setStringValue(mainAreaCode);
        }
    }
    
    /**
     * Sets (as xml) the "MainAreaCode" element
     */
    public void xsetMainAreaCode(org.apache.xmlbeans.XmlString mainAreaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINAREACODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAINAREACODE$0);
            }
            target.set(mainAreaCode);
        }
    }
}
