/*
 * An XML document type.
 * Localname: enddate
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.EnddateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one enddate(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class EnddateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.EnddateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnddateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "enddate");
    
    
    /**
     * Gets the "enddate" element
     */
    public java.lang.String getEnddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "enddate" element
     */
    public org.apache.xmlbeans.XmlString xgetEnddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "enddate" element
     */
    public void setEnddate(java.lang.String enddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$0);
            }
            target.setStringValue(enddate);
        }
    }
    
    /**
     * Sets (as xml) the "enddate" element
     */
    public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$0);
            }
            target.set(enddate);
        }
    }
}
