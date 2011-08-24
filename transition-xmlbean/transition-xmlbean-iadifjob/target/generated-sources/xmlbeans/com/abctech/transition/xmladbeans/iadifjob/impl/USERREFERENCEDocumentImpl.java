/*
 * An XML document type.
 * Localname: USER_REFERENCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.USERREFERENCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one USER_REFERENCE(@) element.
 *
 * This is a complex type.
 */
public class USERREFERENCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.USERREFERENCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public USERREFERENCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERREFERENCE$0 = 
        new javax.xml.namespace.QName("", "USER_REFERENCE");
    
    
    /**
     * Gets the "USER_REFERENCE" element
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
     * Gets (as xml) the "USER_REFERENCE" element
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
     * Sets the "USER_REFERENCE" element
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
     * Sets (as xml) the "USER_REFERENCE" element
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
