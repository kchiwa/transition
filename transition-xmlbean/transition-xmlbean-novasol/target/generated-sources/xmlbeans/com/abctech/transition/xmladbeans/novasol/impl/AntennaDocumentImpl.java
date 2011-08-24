/*
 * An XML document type.
 * Localname: Antenna
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AntennaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Antenna(@) element.
 *
 * This is a complex type.
 */
public class AntennaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AntennaDocument
{
    private static final long serialVersionUID = 1L;
    
    public AntennaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANTENNA$0 = 
        new javax.xml.namespace.QName("", "Antenna");
    
    
    /**
     * Gets the "Antenna" element
     */
    public java.lang.String getAntenna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTENNA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Antenna" element
     */
    public org.apache.xmlbeans.XmlString xgetAntenna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTENNA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Antenna" element
     */
    public void setAntenna(java.lang.String antenna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTENNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTENNA$0);
            }
            target.setStringValue(antenna);
        }
    }
    
    /**
     * Sets (as xml) the "Antenna" element
     */
    public void xsetAntenna(org.apache.xmlbeans.XmlString antenna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTENNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTENNA$0);
            }
            target.set(antenna);
        }
    }
}
