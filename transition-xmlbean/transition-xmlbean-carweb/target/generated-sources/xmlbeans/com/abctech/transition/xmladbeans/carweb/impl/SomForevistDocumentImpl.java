/*
 * An XML document type.
 * Localname: SomForevist
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.SomForevistDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one SomForevist(@) element.
 *
 * This is a complex type.
 */
public class SomForevistDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.SomForevistDocument
{
    private static final long serialVersionUID = 1L;
    
    public SomForevistDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOMFOREVIST$0 = 
        new javax.xml.namespace.QName("", "SomForevist");
    
    
    /**
     * Gets the "SomForevist" element
     */
    public java.lang.String getSomForevist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOMFOREVIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SomForevist" element
     */
    public org.apache.xmlbeans.XmlString xgetSomForevist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOMFOREVIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SomForevist" element
     */
    public void setSomForevist(java.lang.String somForevist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOMFOREVIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOMFOREVIST$0);
            }
            target.setStringValue(somForevist);
        }
    }
    
    /**
     * Sets (as xml) the "SomForevist" element
     */
    public void xsetSomForevist(org.apache.xmlbeans.XmlString somForevist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOMFOREVIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOMFOREVIST$0);
            }
            target.set(somForevist);
        }
    }
}
