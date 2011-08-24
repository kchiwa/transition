/*
 * An XML document type.
 * Localname: SITUATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.SITUATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one SITUATION(@) element.
 *
 * This is a complex type.
 */
public class SITUATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.SITUATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public SITUATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITUATION$0 = 
        new javax.xml.namespace.QName("", "SITUATION");
    
    
    /**
     * Gets the "SITUATION" element
     */
    public java.lang.String getSITUATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SITUATION" element
     */
    public org.apache.xmlbeans.XmlString xgetSITUATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SITUATION" element
     */
    public void setSITUATION(java.lang.String situation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITUATION$0);
            }
            target.setStringValue(situation);
        }
    }
    
    /**
     * Sets (as xml) the "SITUATION" element
     */
    public void xsetSITUATION(org.apache.xmlbeans.XmlString situation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITUATION$0);
            }
            target.set(situation);
        }
    }
}
