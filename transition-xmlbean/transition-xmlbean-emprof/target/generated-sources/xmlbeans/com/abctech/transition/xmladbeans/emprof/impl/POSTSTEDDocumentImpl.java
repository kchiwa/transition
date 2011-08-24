/*
 * An XML document type.
 * Localname: POSTSTED
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.POSTSTEDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one POSTSTED(@) element.
 *
 * This is a complex type.
 */
public class POSTSTEDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.POSTSTEDDocument
{
    private static final long serialVersionUID = 1L;
    
    public POSTSTEDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTSTED$0 = 
        new javax.xml.namespace.QName("", "POSTSTED");
    
    
    /**
     * Gets the "POSTSTED" element
     */
    public java.lang.String getPOSTSTED()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTSTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "POSTSTED" element
     */
    public org.apache.xmlbeans.XmlString xgetPOSTSTED()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTSTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "POSTSTED" element
     */
    public void setPOSTSTED(java.lang.String poststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTSTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTSTED$0);
            }
            target.setStringValue(poststed);
        }
    }
    
    /**
     * Sets (as xml) the "POSTSTED" element
     */
    public void xsetPOSTSTED(org.apache.xmlbeans.XmlString poststed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTSTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTSTED$0);
            }
            target.set(poststed);
        }
    }
}
