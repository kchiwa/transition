/*
 * An XML document type.
 * Localname: ExtraUnitValue
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraUnitValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraUnitValue(@) element.
 *
 * This is a complex type.
 */
public class ExtraUnitValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraUnitValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraUnitValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAUNITVALUE$0 = 
        new javax.xml.namespace.QName("", "ExtraUnitValue");
    
    
    /**
     * Gets the "ExtraUnitValue" element
     */
    public java.lang.String getExtraUnitValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraUnitValue" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraUnitValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraUnitValue" element
     */
    public void setExtraUnitValue(java.lang.String extraUnitValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNITVALUE$0);
            }
            target.setStringValue(extraUnitValue);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraUnitValue" element
     */
    public void xsetExtraUnitValue(org.apache.xmlbeans.XmlString extraUnitValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNITVALUE$0);
            }
            target.set(extraUnitValue);
        }
    }
}
