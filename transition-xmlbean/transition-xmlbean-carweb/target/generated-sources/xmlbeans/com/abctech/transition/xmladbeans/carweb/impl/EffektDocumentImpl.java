/*
 * An XML document type.
 * Localname: Effekt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.EffektDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Effekt(@) element.
 *
 * This is a complex type.
 */
public class EffektDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.EffektDocument
{
    private static final long serialVersionUID = 1L;
    
    public EffektDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFEKT$0 = 
        new javax.xml.namespace.QName("", "Effekt");
    
    
    /**
     * Gets the "Effekt" element
     */
    public java.lang.String getEffekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFEKT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Effekt" element
     */
    public org.apache.xmlbeans.XmlString xgetEffekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFEKT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Effekt" element
     */
    public void setEffekt(java.lang.String effekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFEKT$0);
            }
            target.setStringValue(effekt);
        }
    }
    
    /**
     * Sets (as xml) the "Effekt" element
     */
    public void xsetEffekt(org.apache.xmlbeans.XmlString effekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFEKT$0);
            }
            target.set(effekt);
        }
    }
}
