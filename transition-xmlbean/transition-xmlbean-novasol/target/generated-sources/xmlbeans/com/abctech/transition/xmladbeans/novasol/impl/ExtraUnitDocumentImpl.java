/*
 * An XML document type.
 * Localname: ExtraUnit
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraUnitDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraUnit(@) element.
 *
 * This is a complex type.
 */
public class ExtraUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAUNIT$0 = 
        new javax.xml.namespace.QName("", "ExtraUnit");
    
    
    /**
     * Gets the "ExtraUnit" element
     */
    public java.lang.String getExtraUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraUnit" element
     */
    public void setExtraUnit(java.lang.String extraUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNIT$0);
            }
            target.setStringValue(extraUnit);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraUnit" element
     */
    public void xsetExtraUnit(org.apache.xmlbeans.XmlString extraUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNIT$0);
            }
            target.set(extraUnit);
        }
    }
}
