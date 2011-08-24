/*
 * An XML document type.
 * Localname: HEADING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.HEADINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one HEADING(@) element.
 *
 * This is a complex type.
 */
public class HEADINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.HEADINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public HEADINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADING$0 = 
        new javax.xml.namespace.QName("", "HEADING");
    
    
    /**
     * Gets the "HEADING" element
     */
    public java.lang.String getHEADING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HEADING" element
     */
    public org.apache.xmlbeans.XmlString xgetHEADING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HEADING" element
     */
    public void setHEADING(java.lang.String heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADING$0);
            }
            target.setStringValue(heading);
        }
    }
    
    /**
     * Sets (as xml) the "HEADING" element
     */
    public void xsetHEADING(org.apache.xmlbeans.XmlString heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADING$0);
            }
            target.set(heading);
        }
    }
}
