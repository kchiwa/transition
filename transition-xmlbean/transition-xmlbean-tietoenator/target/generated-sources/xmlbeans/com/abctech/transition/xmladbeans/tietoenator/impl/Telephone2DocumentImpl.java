/*
 * An XML document type.
 * Localname: telephone2
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.Telephone2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one telephone2(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class Telephone2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.Telephone2Document
{
    private static final long serialVersionUID = 1L;
    
    public Telephone2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONE2$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone2");
    
    
    /**
     * Gets the "telephone2" element
     */
    public java.lang.String getTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone2" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "telephone2" element
     */
    public void setTelephone2(java.lang.String telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE2$0);
            }
            target.setStringValue(telephone2);
        }
    }
    
    /**
     * Sets (as xml) the "telephone2" element
     */
    public void xsetTelephone2(org.apache.xmlbeans.XmlString telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE2$0);
            }
            target.set(telephone2);
        }
    }
}
