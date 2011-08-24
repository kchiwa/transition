/*
 * An XML document type.
 * Localname: HUSLEIEINKLUDERER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.HUSLEIEINKLUDERERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one HUSLEIEINKLUDERER(@) element.
 *
 * This is a complex type.
 */
public class HUSLEIEINKLUDERERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.HUSLEIEINKLUDERERDocument
{
    private static final long serialVersionUID = 1L;
    
    public HUSLEIEINKLUDERERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HUSLEIEINKLUDERER$0 = 
        new javax.xml.namespace.QName("", "HUSLEIEINKLUDERER");
    
    
    /**
     * Gets the "HUSLEIEINKLUDERER" element
     */
    public java.lang.String getHUSLEIEINKLUDERER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUSLEIEINKLUDERER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HUSLEIEINKLUDERER" element
     */
    public org.apache.xmlbeans.XmlString xgetHUSLEIEINKLUDERER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HUSLEIEINKLUDERER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HUSLEIEINKLUDERER" element
     */
    public void setHUSLEIEINKLUDERER(java.lang.String husleieinkluderer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUSLEIEINKLUDERER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HUSLEIEINKLUDERER$0);
            }
            target.setStringValue(husleieinkluderer);
        }
    }
    
    /**
     * Sets (as xml) the "HUSLEIEINKLUDERER" element
     */
    public void xsetHUSLEIEINKLUDERER(org.apache.xmlbeans.XmlString husleieinkluderer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HUSLEIEINKLUDERER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HUSLEIEINKLUDERER$0);
            }
            target.set(husleieinkluderer);
        }
    }
}
