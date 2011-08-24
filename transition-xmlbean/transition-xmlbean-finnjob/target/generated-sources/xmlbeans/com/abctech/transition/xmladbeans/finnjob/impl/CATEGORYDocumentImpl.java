/*
 * An XML document type.
 * Localname: CATEGORY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.CATEGORYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one CATEGORY(@) element.
 *
 * This is a complex type.
 */
public class CATEGORYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.CATEGORYDocument
{
    private static final long serialVersionUID = 1L;
    
    public CATEGORYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("", "CATEGORY");
    
    
    /**
     * Gets the "CATEGORY" element
     */
    public java.lang.String getCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CATEGORY" element
     */
    public org.apache.xmlbeans.XmlString xgetCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CATEGORY" element
     */
    public void setCATEGORY(java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$0);
            }
            target.setStringValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "CATEGORY" element
     */
    public void xsetCATEGORY(org.apache.xmlbeans.XmlString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
}
