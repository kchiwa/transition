/*
 * An XML document type.
 * Localname: DEBT_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.DEBTTODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one DEBT_TO(@) element.
 *
 * This is a complex type.
 */
public class DEBTTODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.DEBTTODocument
{
    private static final long serialVersionUID = 1L;
    
    public DEBTTODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBTTO$0 = 
        new javax.xml.namespace.QName("", "DEBT_TO");
    
    
    /**
     * Gets the "DEBT_TO" element
     */
    public java.lang.String getDEBTTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DEBT_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetDEBTTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DEBT_TO" element
     */
    public void setDEBTTO(java.lang.String debtto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTTO$0);
            }
            target.setStringValue(debtto);
        }
    }
    
    /**
     * Sets (as xml) the "DEBT_TO" element
     */
    public void xsetDEBTTO(org.apache.xmlbeans.XmlString debtto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEBTTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEBTTO$0);
            }
            target.set(debtto);
        }
    }
}
