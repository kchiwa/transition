/*
 * An XML document type.
 * Localname: EDUCATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.EDUCATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one EDUCATION(@) element.
 *
 * This is a complex type.
 */
public class EDUCATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.EDUCATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public EDUCATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDUCATION$0 = 
        new javax.xml.namespace.QName("", "EDUCATION");
    
    
    /**
     * Gets the "EDUCATION" element
     */
    public java.lang.String getEDUCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EDUCATION" element
     */
    public org.apache.xmlbeans.XmlString xgetEDUCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EDUCATION" element
     */
    public void setEDUCATION(java.lang.String education)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDUCATION$0);
            }
            target.setStringValue(education);
        }
    }
    
    /**
     * Sets (as xml) the "EDUCATION" element
     */
    public void xsetEDUCATION(org.apache.xmlbeans.XmlString education)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDUCATION$0);
            }
            target.set(education);
        }
    }
}
