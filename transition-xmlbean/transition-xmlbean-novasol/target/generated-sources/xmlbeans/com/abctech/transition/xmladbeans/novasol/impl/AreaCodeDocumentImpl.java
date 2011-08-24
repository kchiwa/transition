/*
 * An XML document type.
 * Localname: AreaCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AreaCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one AreaCode(@) element.
 *
 * This is a complex type.
 */
public class AreaCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AreaCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREACODE$0 = 
        new javax.xml.namespace.QName("", "AreaCode");
    
    
    /**
     * Gets the "AreaCode" element
     */
    public java.lang.String getAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AreaCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AreaCode" element
     */
    public void setAreaCode(java.lang.String areaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREACODE$0);
            }
            target.setStringValue(areaCode);
        }
    }
    
    /**
     * Sets (as xml) the "AreaCode" element
     */
    public void xsetAreaCode(org.apache.xmlbeans.XmlString areaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREACODE$0);
            }
            target.set(areaCode);
        }
    }
}
