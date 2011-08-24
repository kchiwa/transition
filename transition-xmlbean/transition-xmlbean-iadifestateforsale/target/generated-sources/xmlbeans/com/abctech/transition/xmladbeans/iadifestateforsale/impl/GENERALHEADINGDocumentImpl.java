/*
 * An XML document type.
 * Localname: GENERAL_HEADING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GENERALHEADINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GENERAL_HEADING(@) element.
 *
 * This is a complex type.
 */
public class GENERALHEADINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GENERALHEADINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public GENERALHEADINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALHEADING$0 = 
        new javax.xml.namespace.QName("", "GENERAL_HEADING");
    
    
    /**
     * Gets the "GENERAL_HEADING" element
     */
    public java.lang.String getGENERALHEADING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALHEADING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GENERAL_HEADING" element
     */
    public org.apache.xmlbeans.XmlString xgetGENERALHEADING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALHEADING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GENERAL_HEADING" element
     */
    public void setGENERALHEADING(java.lang.String generalheading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALHEADING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALHEADING$0);
            }
            target.setStringValue(generalheading);
        }
    }
    
    /**
     * Sets (as xml) the "GENERAL_HEADING" element
     */
    public void xsetGENERALHEADING(org.apache.xmlbeans.XmlString generalheading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALHEADING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERALHEADING$0);
            }
            target.set(generalheading);
        }
    }
}
