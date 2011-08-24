/*
 * An XML document type.
 * Localname: Spar
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SparDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Spar(@) element.
 *
 * This is a complex type.
 */
public class SparDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SparDocument
{
    private static final long serialVersionUID = 1L;
    
    public SparDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPAR$0 = 
        new javax.xml.namespace.QName("", "Spar");
    
    
    /**
     * Gets the "Spar" element
     */
    public java.lang.String getSpar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Spar" element
     */
    public org.apache.xmlbeans.XmlString xgetSpar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Spar" element
     */
    public void setSpar(java.lang.String spar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPAR$0);
            }
            target.setStringValue(spar);
        }
    }
    
    /**
     * Sets (as xml) the "Spar" element
     */
    public void xsetSpar(org.apache.xmlbeans.XmlString spar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPAR$0);
            }
            target.set(spar);
        }
    }
}
