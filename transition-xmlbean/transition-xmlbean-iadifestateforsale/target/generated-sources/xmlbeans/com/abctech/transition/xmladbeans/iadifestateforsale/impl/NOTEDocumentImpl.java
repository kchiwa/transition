/*
 * An XML document type.
 * Localname: NOTE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOTEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NOTE(@) element.
 *
 * This is a complex type.
 */
public class NOTEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOTEDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOTEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTE$0 = 
        new javax.xml.namespace.QName("", "NOTE");
    
    
    /**
     * Gets the "NOTE" element
     */
    public java.lang.String getNOTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NOTE" element
     */
    public org.apache.xmlbeans.XmlString xgetNOTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NOTE" element
     */
    public void setNOTE(java.lang.String note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$0);
            }
            target.setStringValue(note);
        }
    }
    
    /**
     * Sets (as xml) the "NOTE" element
     */
    public void xsetNOTE(org.apache.xmlbeans.XmlString note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$0);
            }
            target.set(note);
        }
    }
}
