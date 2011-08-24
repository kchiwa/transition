/*
 * An XML document type.
 * Localname: Television
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TelevisionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Television(@) element.
 *
 * This is a complex type.
 */
public class TelevisionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TelevisionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelevisionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEVISION$0 = 
        new javax.xml.namespace.QName("", "Television");
    
    
    /**
     * Gets the "Television" element
     */
    public java.lang.String getTelevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEVISION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Television" element
     */
    public org.apache.xmlbeans.XmlString xgetTelevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEVISION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Television" element
     */
    public void setTelevision(java.lang.String television)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEVISION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEVISION$0);
            }
            target.setStringValue(television);
        }
    }
    
    /**
     * Sets (as xml) the "Television" element
     */
    public void xsetTelevision(org.apache.xmlbeans.XmlString television)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEVISION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEVISION$0);
            }
            target.set(television);
        }
    }
}
