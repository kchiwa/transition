/*
 * An XML document type.
 * Localname: PARTNER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.PARTNERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one PARTNER(@) element.
 *
 * This is a complex type.
 */
public class PARTNERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.PARTNERDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTNERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNER$0 = 
        new javax.xml.namespace.QName("", "PARTNER");
    
    
    /**
     * Gets the "PARTNER" element
     */
    public java.lang.String getPARTNER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PARTNER" element
     */
    public org.apache.xmlbeans.XmlString xgetPARTNER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PARTNER" element
     */
    public void setPARTNER(java.lang.String partner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNER$0);
            }
            target.setStringValue(partner);
        }
    }
    
    /**
     * Sets (as xml) the "PARTNER" element
     */
    public void xsetPARTNER(org.apache.xmlbeans.XmlString partner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNER$0);
            }
            target.set(partner);
        }
    }
}
