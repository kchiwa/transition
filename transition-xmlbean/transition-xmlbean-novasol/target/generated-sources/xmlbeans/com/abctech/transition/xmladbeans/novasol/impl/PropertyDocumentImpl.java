/*
 * An XML document type.
 * Localname: Property
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Property(@) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("", "Property");
    
    
    /**
     * Gets the "Property" element
     */
    public java.lang.String getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Property" element
     */
    public org.apache.xmlbeans.XmlString xgetProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Property" element
     */
    public void setProperty(java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY$0);
            }
            target.setStringValue(property);
        }
    }
    
    /**
     * Sets (as xml) the "Property" element
     */
    public void xsetProperty(org.apache.xmlbeans.XmlString property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
}
