/*
 * An XML document type.
 * Localname: quantity_chars_title
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.QuantityCharsTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one quantity_chars_title(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class QuantityCharsTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.QuantityCharsTitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityCharsTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYCHARSTITLE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "quantity_chars_title");
    
    
    /**
     * Gets the "quantity_chars_title" element
     */
    public java.lang.String getQuantityCharsTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity_chars_title" element
     */
    public org.apache.xmlbeans.XmlString xgetQuantityCharsTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quantity_chars_title" element
     */
    public void setQuantityCharsTitle(java.lang.String quantityCharsTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYCHARSTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYCHARSTITLE$0);
            }
            target.setStringValue(quantityCharsTitle);
        }
    }
    
    /**
     * Sets (as xml) the "quantity_chars_title" element
     */
    public void xsetQuantityCharsTitle(org.apache.xmlbeans.XmlString quantityCharsTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYCHARSTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITYCHARSTITLE$0);
            }
            target.set(quantityCharsTitle);
        }
    }
}
