/*
 * An XML document type.
 * Localname: Modell
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ModellDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Modell(@) element.
 *
 * This is a complex type.
 */
public class ModellDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ModellDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModellDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELL$0 = 
        new javax.xml.namespace.QName("", "Modell");
    
    
    /**
     * Gets the "Modell" element
     */
    public java.lang.String getModell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Modell" element
     */
    public org.apache.xmlbeans.XmlString xgetModell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Modell" element
     */
    public void setModell(java.lang.String modell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODELL$0);
            }
            target.setStringValue(modell);
        }
    }
    
    /**
     * Sets (as xml) the "Modell" element
     */
    public void xsetModell(org.apache.xmlbeans.XmlString modell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODELL$0);
            }
            target.set(modell);
        }
    }
}
