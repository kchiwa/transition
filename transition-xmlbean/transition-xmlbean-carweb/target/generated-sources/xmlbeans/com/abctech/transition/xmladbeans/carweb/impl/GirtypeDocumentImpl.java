/*
 * An XML document type.
 * Localname: Girtype
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.GirtypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Girtype(@) element.
 *
 * This is a complex type.
 */
public class GirtypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.GirtypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GirtypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIRTYPE$0 = 
        new javax.xml.namespace.QName("", "Girtype");
    
    
    /**
     * Gets the "Girtype" element
     */
    public java.lang.String getGirtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIRTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Girtype" element
     */
    public org.apache.xmlbeans.XmlString xgetGirtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GIRTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Girtype" element
     */
    public void setGirtype(java.lang.String girtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIRTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIRTYPE$0);
            }
            target.setStringValue(girtype);
        }
    }
    
    /**
     * Sets (as xml) the "Girtype" element
     */
    public void xsetGirtype(org.apache.xmlbeans.XmlString girtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GIRTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GIRTYPE$0);
            }
            target.set(girtype);
        }
    }
}
