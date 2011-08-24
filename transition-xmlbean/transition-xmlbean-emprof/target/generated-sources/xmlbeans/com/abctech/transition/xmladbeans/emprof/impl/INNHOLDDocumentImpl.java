/*
 * An XML document type.
 * Localname: INNHOLD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.INNHOLDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one INNHOLD(@) element.
 *
 * This is a complex type.
 */
public class INNHOLDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.INNHOLDDocument
{
    private static final long serialVersionUID = 1L;
    
    public INNHOLDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNHOLD$0 = 
        new javax.xml.namespace.QName("", "INNHOLD");
    
    
    /**
     * Gets the "INNHOLD" element
     */
    public java.lang.String getINNHOLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNHOLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "INNHOLD" element
     */
    public org.apache.xmlbeans.XmlString xgetINNHOLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INNHOLD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "INNHOLD" element
     */
    public void setINNHOLD(java.lang.String innhold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNHOLD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INNHOLD$0);
            }
            target.setStringValue(innhold);
        }
    }
    
    /**
     * Sets (as xml) the "INNHOLD" element
     */
    public void xsetINNHOLD(org.apache.xmlbeans.XmlString innhold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INNHOLD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INNHOLD$0);
            }
            target.set(innhold);
        }
    }
}
