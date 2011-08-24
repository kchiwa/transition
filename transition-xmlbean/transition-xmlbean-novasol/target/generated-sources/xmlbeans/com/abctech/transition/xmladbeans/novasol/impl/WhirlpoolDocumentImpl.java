/*
 * An XML document type.
 * Localname: Whirlpool
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.WhirlpoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Whirlpool(@) element.
 *
 * This is a complex type.
 */
public class WhirlpoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.WhirlpoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhirlpoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHIRLPOOL$0 = 
        new javax.xml.namespace.QName("", "Whirlpool");
    
    
    /**
     * Gets the "Whirlpool" element
     */
    public java.lang.String getWhirlpool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Whirlpool" element
     */
    public org.apache.xmlbeans.XmlString xgetWhirlpool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Whirlpool" element
     */
    public void setWhirlpool(java.lang.String whirlpool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHIRLPOOL$0);
            }
            target.setStringValue(whirlpool);
        }
    }
    
    /**
     * Sets (as xml) the "Whirlpool" element
     */
    public void xsetWhirlpool(org.apache.xmlbeans.XmlString whirlpool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHIRLPOOL$0);
            }
            target.set(whirlpool);
        }
    }
}
