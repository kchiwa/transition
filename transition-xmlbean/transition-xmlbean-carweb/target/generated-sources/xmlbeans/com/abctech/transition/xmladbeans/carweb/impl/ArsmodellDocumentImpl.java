/*
 * An XML document type.
 * Localname: Arsmodell
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ArsmodellDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Arsmodell(@) element.
 *
 * This is a complex type.
 */
public class ArsmodellDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ArsmodellDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArsmodellDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARSMODELL$0 = 
        new javax.xml.namespace.QName("", "Arsmodell");
    
    
    /**
     * Gets the "Arsmodell" element
     */
    public java.lang.String getArsmodell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARSMODELL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Arsmodell" element
     */
    public org.apache.xmlbeans.XmlString xgetArsmodell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARSMODELL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Arsmodell" element
     */
    public void setArsmodell(java.lang.String arsmodell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARSMODELL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARSMODELL$0);
            }
            target.setStringValue(arsmodell);
        }
    }
    
    /**
     * Sets (as xml) the "Arsmodell" element
     */
    public void xsetArsmodell(org.apache.xmlbeans.XmlString arsmodell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARSMODELL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARSMODELL$0);
            }
            target.set(arsmodell);
        }
    }
}
