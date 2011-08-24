/*
 * An XML document type.
 * Localname: MiniVacationCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MiniVacationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MiniVacationCode(@) element.
 *
 * This is a complex type.
 */
public class MiniVacationCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MiniVacationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MiniVacationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIVACATIONCODE$0 = 
        new javax.xml.namespace.QName("", "MiniVacationCode");
    
    
    /**
     * Gets the "MiniVacationCode" element
     */
    public java.math.BigInteger getMiniVacationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MiniVacationCode" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMiniVacationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINIVACATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MiniVacationCode" element
     */
    public void setMiniVacationCode(java.math.BigInteger miniVacationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATIONCODE$0);
            }
            target.setBigIntegerValue(miniVacationCode);
        }
    }
    
    /**
     * Sets (as xml) the "MiniVacationCode" element
     */
    public void xsetMiniVacationCode(org.apache.xmlbeans.XmlInteger miniVacationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINIVACATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINIVACATIONCODE$0);
            }
            target.set(miniVacationCode);
        }
    }
}
