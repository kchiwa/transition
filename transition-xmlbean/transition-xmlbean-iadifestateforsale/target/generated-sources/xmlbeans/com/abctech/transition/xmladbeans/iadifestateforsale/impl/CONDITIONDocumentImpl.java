/*
 * An XML document type.
 * Localname: CONDITION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.CONDITIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one CONDITION(@) element.
 *
 * This is a complex type.
 */
public class CONDITIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.CONDITIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public CONDITIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("", "CONDITION");
    
    
    /**
     * Gets the "CONDITION" element
     */
    public java.lang.String getCONDITION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CONDITION" element
     */
    public org.apache.xmlbeans.XmlString xgetCONDITION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CONDITION" element
     */
    public void setCONDITION(java.lang.String condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITION$0);
            }
            target.setStringValue(condition);
        }
    }
    
    /**
     * Sets (as xml) the "CONDITION" element
     */
    public void xsetCONDITION(org.apache.xmlbeans.XmlString condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONDITION$0);
            }
            target.set(condition);
        }
    }
}
