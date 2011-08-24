/*
 * An XML document type.
 * Localname: APPLICATION_EMAIL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.APPLICATIONEMAILDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one APPLICATION_EMAIL(@) element.
 *
 * This is a complex type.
 */
public class APPLICATIONEMAILDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.APPLICATIONEMAILDocument
{
    private static final long serialVersionUID = 1L;
    
    public APPLICATIONEMAILDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONEMAIL$0 = 
        new javax.xml.namespace.QName("", "APPLICATION_EMAIL");
    
    
    /**
     * Gets the "APPLICATION_EMAIL" element
     */
    public java.lang.String getAPPLICATIONEMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONEMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "APPLICATION_EMAIL" element
     */
    public org.apache.xmlbeans.XmlString xgetAPPLICATIONEMAIL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONEMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "APPLICATION_EMAIL" element
     */
    public void setAPPLICATIONEMAIL(java.lang.String applicationemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONEMAIL$0);
            }
            target.setStringValue(applicationemail);
        }
    }
    
    /**
     * Sets (as xml) the "APPLICATION_EMAIL" element
     */
    public void xsetAPPLICATIONEMAIL(org.apache.xmlbeans.XmlString applicationemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONEMAIL$0);
            }
            target.set(applicationemail);
        }
    }
}
