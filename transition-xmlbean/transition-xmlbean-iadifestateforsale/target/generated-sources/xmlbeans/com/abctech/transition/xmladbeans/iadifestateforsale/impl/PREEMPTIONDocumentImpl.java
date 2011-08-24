/*
 * An XML document type.
 * Localname: PREEMPTION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PREEMPTIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PREEMPTION(@) element.
 *
 * This is a complex type.
 */
public class PREEMPTIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PREEMPTIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public PREEMPTIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREEMPTION$0 = 
        new javax.xml.namespace.QName("", "PREEMPTION");
    
    
    /**
     * Gets the "PREEMPTION" element
     */
    public java.lang.String getPREEMPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PREEMPTION" element
     */
    public org.apache.xmlbeans.XmlString xgetPREEMPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREEMPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PREEMPTION" element
     */
    public void setPREEMPTION(java.lang.String preemption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREEMPTION$0);
            }
            target.setStringValue(preemption);
        }
    }
    
    /**
     * Sets (as xml) the "PREEMPTION" element
     */
    public void xsetPREEMPTION(org.apache.xmlbeans.XmlString preemption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREEMPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREEMPTION$0);
            }
            target.set(preemption);
        }
    }
}
