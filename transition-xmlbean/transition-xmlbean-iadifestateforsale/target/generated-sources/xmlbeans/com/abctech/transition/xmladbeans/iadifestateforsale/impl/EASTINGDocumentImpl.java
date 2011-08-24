/*
 * An XML document type.
 * Localname: EASTING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.EASTINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one EASTING(@) element.
 *
 * This is a complex type.
 */
public class EASTINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.EASTINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public EASTINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EASTING$0 = 
        new javax.xml.namespace.QName("", "EASTING");
    
    
    /**
     * Gets the "EASTING" element
     */
    public java.lang.String getEASTING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EASTING" element
     */
    public org.apache.xmlbeans.XmlString xgetEASTING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EASTING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EASTING" element
     */
    public void setEASTING(java.lang.String easting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EASTING$0);
            }
            target.setStringValue(easting);
        }
    }
    
    /**
     * Sets (as xml) the "EASTING" element
     */
    public void xsetEASTING(org.apache.xmlbeans.XmlString easting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EASTING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EASTING$0);
            }
            target.set(easting);
        }
    }
}
