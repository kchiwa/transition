/*
 * An XML document type.
 * Localname: WhiteBeach
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.WhiteBeachDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one WhiteBeach(@) element.
 *
 * This is a complex type.
 */
public class WhiteBeachDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.WhiteBeachDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhiteBeachDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHITEBEACH$0 = 
        new javax.xml.namespace.QName("", "WhiteBeach");
    
    
    /**
     * Gets the "WhiteBeach" element
     */
    public java.lang.String getWhiteBeach()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHITEBEACH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WhiteBeach" element
     */
    public org.apache.xmlbeans.XmlString xgetWhiteBeach()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHITEBEACH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WhiteBeach" element
     */
    public void setWhiteBeach(java.lang.String whiteBeach)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHITEBEACH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHITEBEACH$0);
            }
            target.setStringValue(whiteBeach);
        }
    }
    
    /**
     * Sets (as xml) the "WhiteBeach" element
     */
    public void xsetWhiteBeach(org.apache.xmlbeans.XmlString whiteBeach)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHITEBEACH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHITEBEACH$0);
            }
            target.set(whiteBeach);
        }
    }
}
