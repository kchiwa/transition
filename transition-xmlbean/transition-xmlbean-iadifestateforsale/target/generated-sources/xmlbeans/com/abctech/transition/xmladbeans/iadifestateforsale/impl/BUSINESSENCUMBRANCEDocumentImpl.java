/*
 * An XML document type.
 * Localname: BUSINESS_ENCUMBRANCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BUSINESSENCUMBRANCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BUSINESS_ENCUMBRANCE(@) element.
 *
 * This is a complex type.
 */
public class BUSINESSENCUMBRANCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BUSINESSENCUMBRANCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public BUSINESSENCUMBRANCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENCUMBRANCE$0 = 
        new javax.xml.namespace.QName("", "BUSINESS_ENCUMBRANCE");
    
    
    /**
     * Gets the "BUSINESS_ENCUMBRANCE" element
     */
    public java.lang.String getBUSINESSENCUMBRANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSENCUMBRANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BUSINESS_ENCUMBRANCE" element
     */
    public org.apache.xmlbeans.XmlString xgetBUSINESSENCUMBRANCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUSINESSENCUMBRANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BUSINESS_ENCUMBRANCE" element
     */
    public void setBUSINESSENCUMBRANCE(java.lang.String businessencumbrance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSENCUMBRANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSENCUMBRANCE$0);
            }
            target.setStringValue(businessencumbrance);
        }
    }
    
    /**
     * Sets (as xml) the "BUSINESS_ENCUMBRANCE" element
     */
    public void xsetBUSINESSENCUMBRANCE(org.apache.xmlbeans.XmlString businessencumbrance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUSINESSENCUMBRANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUSINESSENCUMBRANCE$0);
            }
            target.set(businessencumbrance);
        }
    }
}
