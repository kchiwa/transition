/*
 * An XML document type.
 * Localname: deviant_zipcode
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.DeviantZipcodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one deviant_zipcode(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class DeviantZipcodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.DeviantZipcodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeviantZipcodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEVIANTZIPCODE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "deviant_zipcode");
    
    
    /**
     * Gets the "deviant_zipcode" element
     */
    public java.lang.String getDeviantZipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVIANTZIPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deviant_zipcode" element
     */
    public org.apache.xmlbeans.XmlString xgetDeviantZipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVIANTZIPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "deviant_zipcode" element
     */
    public void setDeviantZipcode(java.lang.String deviantZipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVIANTZIPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEVIANTZIPCODE$0);
            }
            target.setStringValue(deviantZipcode);
        }
    }
    
    /**
     * Sets (as xml) the "deviant_zipcode" element
     */
    public void xsetDeviantZipcode(org.apache.xmlbeans.XmlString deviantZipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVIANTZIPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEVIANTZIPCODE$0);
            }
            target.set(deviantZipcode);
        }
    }
}
