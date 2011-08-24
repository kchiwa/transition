/*
 * An XML document type.
 * Localname: STREETADDRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.STREETADDRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one STREETADDRESS(@) element.
 *
 * This is a complex type.
 */
public class STREETADDRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.STREETADDRESSDocument
{
    private static final long serialVersionUID = 1L;
    
    public STREETADDRESSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETADDRESS$0 = 
        new javax.xml.namespace.QName("", "STREETADDRESS");
    
    
    /**
     * Gets the "STREETADDRESS" element
     */
    public java.lang.String getSTREETADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "STREETADDRESS" element
     */
    public org.apache.xmlbeans.XmlString xgetSTREETADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "STREETADDRESS" element
     */
    public void setSTREETADDRESS(java.lang.String streetaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETADDRESS$0);
            }
            target.setStringValue(streetaddress);
        }
    }
    
    /**
     * Sets (as xml) the "STREETADDRESS" element
     */
    public void xsetSTREETADDRESS(org.apache.xmlbeans.XmlString streetaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETADDRESS$0);
            }
            target.set(streetaddress);
        }
    }
}
