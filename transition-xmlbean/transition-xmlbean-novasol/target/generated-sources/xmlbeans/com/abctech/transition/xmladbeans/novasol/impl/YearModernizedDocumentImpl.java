/*
 * An XML document type.
 * Localname: YearModernized
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.YearModernizedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one YearModernized(@) element.
 *
 * This is a complex type.
 */
public class YearModernizedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.YearModernizedDocument
{
    private static final long serialVersionUID = 1L;
    
    public YearModernizedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName YEARMODERNIZED$0 = 
        new javax.xml.namespace.QName("", "YearModernized");
    
    
    /**
     * Gets the "YearModernized" element
     */
    public java.lang.String getYearModernized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARMODERNIZED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "YearModernized" element
     */
    public org.apache.xmlbeans.XmlString xgetYearModernized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARMODERNIZED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "YearModernized" element
     */
    public void setYearModernized(java.lang.String yearModernized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARMODERNIZED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARMODERNIZED$0);
            }
            target.setStringValue(yearModernized);
        }
    }
    
    /**
     * Sets (as xml) the "YearModernized" element
     */
    public void xsetYearModernized(org.apache.xmlbeans.XmlString yearModernized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARMODERNIZED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YEARMODERNIZED$0);
            }
            target.set(yearModernized);
        }
    }
}
