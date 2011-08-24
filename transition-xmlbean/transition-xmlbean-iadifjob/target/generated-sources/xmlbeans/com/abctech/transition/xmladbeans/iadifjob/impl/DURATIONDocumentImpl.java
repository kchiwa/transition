/*
 * An XML document type.
 * Localname: DURATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.DURATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one DURATION(@) element.
 *
 * This is a complex type.
 */
public class DURATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.DURATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public DURATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DURATION$0 = 
        new javax.xml.namespace.QName("", "DURATION");
    
    
    /**
     * Gets the "DURATION" element
     */
    public java.lang.String getDURATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DURATION" element
     */
    public org.apache.xmlbeans.XmlString xgetDURATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DURATION" element
     */
    public void setDURATION(java.lang.String duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$0);
            }
            target.setStringValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "DURATION" element
     */
    public void xsetDURATION(org.apache.xmlbeans.XmlString duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DURATION$0);
            }
            target.set(duration);
        }
    }
}
