/*
 * An XML document type.
 * Localname: USERREFERENCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.USERREFERENCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one USERREFERENCE(@) element.
 *
 * This is a complex type.
 */
public class USERREFERENCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.USERREFERENCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public USERREFERENCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERREFERENCE$0 = 
        new javax.xml.namespace.QName("", "USERREFERENCE");
    
    
    /**
     * Gets the "USERREFERENCE" element
     */
    public java.lang.String getUSERREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "USERREFERENCE" element
     */
    public org.apache.xmlbeans.XmlString xgetUSERREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "USERREFERENCE" element
     */
    public void setUSERREFERENCE(java.lang.String userreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERREFERENCE$0);
            }
            target.setStringValue(userreference);
        }
    }
    
    /**
     * Sets (as xml) the "USERREFERENCE" element
     */
    public void xsetUSERREFERENCE(org.apache.xmlbeans.XmlString userreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERREFERENCE$0);
            }
            target.set(userreference);
        }
    }
}
