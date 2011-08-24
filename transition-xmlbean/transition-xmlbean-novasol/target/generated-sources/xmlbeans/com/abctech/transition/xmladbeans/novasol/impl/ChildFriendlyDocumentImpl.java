/*
 * An XML document type.
 * Localname: ChildFriendly
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ChildFriendlyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ChildFriendly(@) element.
 *
 * This is a complex type.
 */
public class ChildFriendlyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ChildFriendlyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChildFriendlyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILDFRIENDLY$0 = 
        new javax.xml.namespace.QName("", "ChildFriendly");
    
    
    /**
     * Gets the "ChildFriendly" element
     */
    public java.lang.String getChildFriendly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDFRIENDLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChildFriendly" element
     */
    public org.apache.xmlbeans.XmlString xgetChildFriendly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDFRIENDLY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ChildFriendly" element
     */
    public void setChildFriendly(java.lang.String childFriendly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDFRIENDLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDFRIENDLY$0);
            }
            target.setStringValue(childFriendly);
        }
    }
    
    /**
     * Sets (as xml) the "ChildFriendly" element
     */
    public void xsetChildFriendly(org.apache.xmlbeans.XmlString childFriendly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDFRIENDLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHILDFRIENDLY$0);
            }
            target.set(childFriendly);
        }
    }
}
