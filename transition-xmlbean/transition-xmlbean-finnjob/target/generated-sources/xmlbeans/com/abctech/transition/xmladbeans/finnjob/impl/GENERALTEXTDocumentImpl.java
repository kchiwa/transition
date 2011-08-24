/*
 * An XML document type.
 * Localname: GENERAL_TEXT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.GENERALTEXTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one GENERAL_TEXT(@) element.
 *
 * This is a complex type.
 */
public class GENERALTEXTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.GENERALTEXTDocument
{
    private static final long serialVersionUID = 1L;
    
    public GENERALTEXTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALTEXT$0 = 
        new javax.xml.namespace.QName("", "GENERAL_TEXT");
    
    
    /**
     * Gets the "GENERAL_TEXT" element
     */
    public java.lang.String getGENERALTEXT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GENERAL_TEXT" element
     */
    public org.apache.xmlbeans.XmlString xgetGENERALTEXT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GENERAL_TEXT" element
     */
    public void setGENERALTEXT(java.lang.String generaltext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALTEXT$0);
            }
            target.setStringValue(generaltext);
        }
    }
    
    /**
     * Sets (as xml) the "GENERAL_TEXT" element
     */
    public void xsetGENERALTEXT(org.apache.xmlbeans.XmlString generaltext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERALTEXT$0);
            }
            target.set(generaltext);
        }
    }
}
