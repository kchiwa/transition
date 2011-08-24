/*
 * An XML document type.
 * Localname: ADDRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ADDRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one ADDRESS(@) element.
 *
 * This is a complex type.
 */
public class ADDRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ADDRESSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ADDRESSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("", "ADDRESS");
    
    
    /**
     * Gets the "ADDRESS" element
     */
    public java.lang.String getADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADDRESS" element
     */
    public org.apache.xmlbeans.XmlString xgetADDRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ADDRESS" element
     */
    public void setADDRESS(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$0);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "ADDRESS" element
     */
    public void xsetADDRESS(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
}
