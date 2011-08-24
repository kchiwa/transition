/*
 * An XML document type.
 * Localname: AntSeter
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.AntSeterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one AntSeter(@) element.
 *
 * This is a complex type.
 */
public class AntSeterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.AntSeterDocument
{
    private static final long serialVersionUID = 1L;
    
    public AntSeterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANTSETER$0 = 
        new javax.xml.namespace.QName("", "AntSeter");
    
    
    /**
     * Gets the "AntSeter" element
     */
    public java.lang.String getAntSeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTSETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AntSeter" element
     */
    public org.apache.xmlbeans.XmlString xgetAntSeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTSETER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AntSeter" element
     */
    public void setAntSeter(java.lang.String antSeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTSETER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTSETER$0);
            }
            target.setStringValue(antSeter);
        }
    }
    
    /**
     * Sets (as xml) the "AntSeter" element
     */
    public void xsetAntSeter(org.apache.xmlbeans.XmlString antSeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTSETER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTSETER$0);
            }
            target.set(antSeter);
        }
    }
}
