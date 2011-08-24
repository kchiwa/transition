/*
 * An XML document type.
 * Localname: KOMMUNENR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.KOMMUNENRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one KOMMUNENR(@) element.
 *
 * This is a complex type.
 */
public class KOMMUNENRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.KOMMUNENRDocument
{
    private static final long serialVersionUID = 1L;
    
    public KOMMUNENRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMUNENR$0 = 
        new javax.xml.namespace.QName("", "KOMMUNENR");
    
    
    /**
     * Gets the "KOMMUNENR" element
     */
    public java.lang.String getKOMMUNENR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KOMMUNENR" element
     */
    public org.apache.xmlbeans.XmlString xgetKOMMUNENR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KOMMUNENR" element
     */
    public void setKOMMUNENR(java.lang.String kommunenr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMUNENR$0);
            }
            target.setStringValue(kommunenr);
        }
    }
    
    /**
     * Sets (as xml) the "KOMMUNENR" element
     */
    public void xsetKOMMUNENR(org.apache.xmlbeans.XmlString kommunenr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMUNENR$0);
            }
            target.set(kommunenr);
        }
    }
}
