/*
 * An XML document type.
 * Localname: APPLICATION_DEADLINE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.APPLICATIONDEADLINEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one APPLICATION_DEADLINE(@) element.
 *
 * This is a complex type.
 */
public class APPLICATIONDEADLINEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.APPLICATIONDEADLINEDocument
{
    private static final long serialVersionUID = 1L;
    
    public APPLICATIONDEADLINEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONDEADLINE$0 = 
        new javax.xml.namespace.QName("", "APPLICATION_DEADLINE");
    
    
    /**
     * Gets the "APPLICATION_DEADLINE" element
     */
    public java.lang.String getAPPLICATIONDEADLINE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDEADLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "APPLICATION_DEADLINE" element
     */
    public org.apache.xmlbeans.XmlString xgetAPPLICATIONDEADLINE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDEADLINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "APPLICATION_DEADLINE" element
     */
    public void setAPPLICATIONDEADLINE(java.lang.String applicationdeadline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDEADLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONDEADLINE$0);
            }
            target.setStringValue(applicationdeadline);
        }
    }
    
    /**
     * Sets (as xml) the "APPLICATION_DEADLINE" element
     */
    public void xsetAPPLICATIONDEADLINE(org.apache.xmlbeans.XmlString applicationdeadline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDEADLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONDEADLINE$0);
            }
            target.set(applicationdeadline);
        }
    }
}
