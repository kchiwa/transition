/*
 * An XML document type.
 * Localname: MiniVacation2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MiniVacation2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MiniVacation2(@) element.
 *
 * This is a complex type.
 */
public class MiniVacation2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MiniVacation2Document
{
    private static final long serialVersionUID = 1L;
    
    public MiniVacation2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIVACATION2$0 = 
        new javax.xml.namespace.QName("", "MiniVacation2");
    
    
    /**
     * Gets the "MiniVacation2" element
     */
    public java.lang.String getMiniVacation2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MiniVacation2" element
     */
    public org.apache.xmlbeans.XmlString xgetMiniVacation2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MiniVacation2" element
     */
    public void setMiniVacation2(java.lang.String miniVacation2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATION2$0);
            }
            target.setStringValue(miniVacation2);
        }
    }
    
    /**
     * Sets (as xml) the "MiniVacation2" element
     */
    public void xsetMiniVacation2(org.apache.xmlbeans.XmlString miniVacation2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINIVACATION2$0);
            }
            target.set(miniVacation2);
        }
    }
}
