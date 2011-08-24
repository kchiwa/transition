/*
 * An XML document type.
 * Localname: APPLICATION_LABEL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.APPLICATIONLABELDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one APPLICATION_LABEL(@) element.
 *
 * This is a complex type.
 */
public class APPLICATIONLABELDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.APPLICATIONLABELDocument
{
    private static final long serialVersionUID = 1L;
    
    public APPLICATIONLABELDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONLABEL$0 = 
        new javax.xml.namespace.QName("", "APPLICATION_LABEL");
    
    
    /**
     * Gets the "APPLICATION_LABEL" element
     */
    public java.lang.String getAPPLICATIONLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "APPLICATION_LABEL" element
     */
    public org.apache.xmlbeans.XmlString xgetAPPLICATIONLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONLABEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "APPLICATION_LABEL" element
     */
    public void setAPPLICATIONLABEL(java.lang.String applicationlabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONLABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONLABEL$0);
            }
            target.setStringValue(applicationlabel);
        }
    }
    
    /**
     * Sets (as xml) the "APPLICATION_LABEL" element
     */
    public void xsetAPPLICATIONLABEL(org.apache.xmlbeans.XmlString applicationlabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONLABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONLABEL$0);
            }
            target.set(applicationlabel);
        }
    }
}
