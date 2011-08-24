/*
 * An XML document type.
 * Localname: FINANCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FINANCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FINANCE(@) element.
 *
 * This is a complex type.
 */
public class FINANCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FINANCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public FINANCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINANCE$0 = 
        new javax.xml.namespace.QName("", "FINANCE");
    
    
    /**
     * Gets the "FINANCE" element
     */
    public java.lang.String getFINANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FINANCE" element
     */
    public org.apache.xmlbeans.XmlString xgetFINANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FINANCE" element
     */
    public void setFINANCE(java.lang.String finance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINANCE$0);
            }
            target.setStringValue(finance);
        }
    }
    
    /**
     * Sets (as xml) the "FINANCE" element
     */
    public void xsetFINANCE(org.apache.xmlbeans.XmlString finance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINANCE$0);
            }
            target.set(finance);
        }
    }
}
