/*
 * An XML document type.
 * Localname: WhirlpoolSize
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.WhirlpoolSizeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one WhirlpoolSize(@) element.
 *
 * This is a complex type.
 */
public class WhirlpoolSizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.WhirlpoolSizeDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhirlpoolSizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHIRLPOOLSIZE$0 = 
        new javax.xml.namespace.QName("", "WhirlpoolSize");
    
    
    /**
     * Gets the "WhirlpoolSize" element
     */
    public java.lang.String getWhirlpoolSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOLSIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WhirlpoolSize" element
     */
    public org.apache.xmlbeans.XmlString xgetWhirlpoolSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOLSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WhirlpoolSize" element
     */
    public void setWhirlpoolSize(java.lang.String whirlpoolSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOLSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHIRLPOOLSIZE$0);
            }
            target.setStringValue(whirlpoolSize);
        }
    }
    
    /**
     * Sets (as xml) the "WhirlpoolSize" element
     */
    public void xsetWhirlpoolSize(org.apache.xmlbeans.XmlString whirlpoolSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOLSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHIRLPOOLSIZE$0);
            }
            target.set(whirlpoolSize);
        }
    }
}
