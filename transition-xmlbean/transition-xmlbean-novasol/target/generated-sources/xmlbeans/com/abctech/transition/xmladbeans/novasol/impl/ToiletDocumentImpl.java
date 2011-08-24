/*
 * An XML document type.
 * Localname: Toilet
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ToiletDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Toilet(@) element.
 *
 * This is a complex type.
 */
public class ToiletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ToiletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ToiletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOILET$0 = 
        new javax.xml.namespace.QName("", "Toilet");
    
    
    /**
     * Gets the "Toilet" element
     */
    public java.lang.String getToilet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOILET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Toilet" element
     */
    public org.apache.xmlbeans.XmlString xgetToilet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOILET$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Toilet" element
     */
    public void setToilet(java.lang.String toilet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOILET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOILET$0);
            }
            target.setStringValue(toilet);
        }
    }
    
    /**
     * Sets (as xml) the "Toilet" element
     */
    public void xsetToilet(org.apache.xmlbeans.XmlString toilet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOILET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOILET$0);
            }
            target.set(toilet);
        }
    }
}
