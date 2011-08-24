/*
 * An XML document type.
 * Localname: LocalGovernment
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.LocalGovernmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one LocalGovernment(@) element.
 *
 * This is a complex type.
 */
public class LocalGovernmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.LocalGovernmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalGovernmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALGOVERNMENT$0 = 
        new javax.xml.namespace.QName("", "LocalGovernment");
    
    
    /**
     * Gets the "LocalGovernment" element
     */
    public java.lang.String getLocalGovernment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALGOVERNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalGovernment" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalGovernment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALGOVERNMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LocalGovernment" element
     */
    public void setLocalGovernment(java.lang.String localGovernment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALGOVERNMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALGOVERNMENT$0);
            }
            target.setStringValue(localGovernment);
        }
    }
    
    /**
     * Sets (as xml) the "LocalGovernment" element
     */
    public void xsetLocalGovernment(org.apache.xmlbeans.XmlString localGovernment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALGOVERNMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALGOVERNMENT$0);
            }
            target.set(localGovernment);
        }
    }
}
