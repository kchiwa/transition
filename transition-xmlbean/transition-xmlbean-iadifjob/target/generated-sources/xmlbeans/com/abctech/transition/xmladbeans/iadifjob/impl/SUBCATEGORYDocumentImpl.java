/*
 * An XML document type.
 * Localname: SUBCATEGORY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.SUBCATEGORYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one SUBCATEGORY(@) element.
 *
 * This is a complex type.
 */
public class SUBCATEGORYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.SUBCATEGORYDocument
{
    private static final long serialVersionUID = 1L;
    
    public SUBCATEGORYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCATEGORY$0 = 
        new javax.xml.namespace.QName("", "SUBCATEGORY");
    
    
    /**
     * Gets the "SUBCATEGORY" element
     */
    public java.lang.String getSUBCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SUBCATEGORY" element
     */
    public org.apache.xmlbeans.XmlString xgetSUBCATEGORY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SUBCATEGORY" element
     */
    public void setSUBCATEGORY(java.lang.String subcategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCATEGORY$0);
            }
            target.setStringValue(subcategory);
        }
    }
    
    /**
     * Sets (as xml) the "SUBCATEGORY" element
     */
    public void xsetSUBCATEGORY(org.apache.xmlbeans.XmlString subcategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBCATEGORY$0);
            }
            target.set(subcategory);
        }
    }
}
