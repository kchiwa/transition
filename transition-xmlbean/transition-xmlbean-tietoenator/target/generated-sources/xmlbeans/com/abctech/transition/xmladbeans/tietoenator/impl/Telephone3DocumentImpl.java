/*
 * An XML document type.
 * Localname: telephone3
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.Telephone3Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one telephone3(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class Telephone3DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.Telephone3Document
{
    private static final long serialVersionUID = 1L;
    
    public Telephone3DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONE3$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone3");
    
    
    /**
     * Gets the "telephone3" element
     */
    public java.lang.String getTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone3" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "telephone3" element
     */
    public void setTelephone3(java.lang.String telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE3$0);
            }
            target.setStringValue(telephone3);
        }
    }
    
    /**
     * Sets (as xml) the "telephone3" element
     */
    public void xsetTelephone3(org.apache.xmlbeans.XmlString telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE3$0);
            }
            target.set(telephone3);
        }
    }
}
