/*
 * An XML document type.
 * Localname: MiniVacation
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MiniVacationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MiniVacation(@) element.
 *
 * This is a complex type.
 */
public class MiniVacationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MiniVacationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MiniVacationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIVACATION$0 = 
        new javax.xml.namespace.QName("", "MiniVacation");
    
    
    /**
     * Gets the "MiniVacation" element
     */
    public java.lang.String getMiniVacation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MiniVacation" element
     */
    public org.apache.xmlbeans.XmlString xgetMiniVacation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MiniVacation" element
     */
    public void setMiniVacation(java.lang.String miniVacation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATION$0);
            }
            target.setStringValue(miniVacation);
        }
    }
    
    /**
     * Sets (as xml) the "MiniVacation" element
     */
    public void xsetMiniVacation(org.apache.xmlbeans.XmlString miniVacation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINIVACATION$0);
            }
            target.set(miniVacation);
        }
    }
}
