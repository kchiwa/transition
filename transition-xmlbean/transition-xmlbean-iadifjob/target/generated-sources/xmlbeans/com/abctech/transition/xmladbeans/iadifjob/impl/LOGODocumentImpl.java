/*
 * An XML document type.
 * Localname: LOGO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.LOGODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one LOGO(@) element.
 *
 * This is a complex type.
 */
public class LOGODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.LOGODocument
{
    private static final long serialVersionUID = 1L;
    
    public LOGODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGO$0 = 
        new javax.xml.namespace.QName("", "LOGO");
    
    
    /**
     * Gets the "LOGO" element
     */
    public java.lang.String getLOGO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LOGO" element
     */
    public org.apache.xmlbeans.XmlString xgetLOGO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LOGO" element
     */
    public void setLOGO(java.lang.String logo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGO$0);
            }
            target.setStringValue(logo);
        }
    }
    
    /**
     * Sets (as xml) the "LOGO" element
     */
    public void xsetLOGO(org.apache.xmlbeans.XmlString logo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGO$0);
            }
            target.set(logo);
        }
    }
}
