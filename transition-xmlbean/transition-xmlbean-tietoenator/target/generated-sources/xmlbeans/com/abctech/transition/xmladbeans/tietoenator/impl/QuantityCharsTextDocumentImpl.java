/*
 * An XML document type.
 * Localname: quantity_chars_text
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.QuantityCharsTextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one quantity_chars_text(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class QuantityCharsTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.QuantityCharsTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityCharsTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYCHARSTEXT$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "quantity_chars_text");
    
    
    /**
     * Gets the "quantity_chars_text" element
     */
    public java.lang.String getQuantityCharsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity_chars_text" element
     */
    public org.apache.xmlbeans.XmlString xgetQuantityCharsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quantity_chars_text" element
     */
    public void setQuantityCharsText(java.lang.String quantityCharsText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYCHARSTEXT$0);
            }
            target.setStringValue(quantityCharsText);
        }
    }
    
    /**
     * Sets (as xml) the "quantity_chars_text" element
     */
    public void xsetQuantityCharsText(org.apache.xmlbeans.XmlString quantityCharsText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITYCHARSTEXT$0);
            }
            target.set(quantityCharsText);
        }
    }
}
