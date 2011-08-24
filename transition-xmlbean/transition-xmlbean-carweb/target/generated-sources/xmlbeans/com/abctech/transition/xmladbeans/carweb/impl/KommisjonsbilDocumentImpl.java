/*
 * An XML document type.
 * Localname: Kommisjonsbil
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KommisjonsbilDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kommisjonsbil(@) element.
 *
 * This is a complex type.
 */
public class KommisjonsbilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KommisjonsbilDocument
{
    private static final long serialVersionUID = 1L;
    
    public KommisjonsbilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMISJONSBIL$0 = 
        new javax.xml.namespace.QName("", "Kommisjonsbil");
    
    
    /**
     * Gets the "Kommisjonsbil" element
     */
    public java.lang.String getKommisjonsbil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMISJONSBIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kommisjonsbil" element
     */
    public org.apache.xmlbeans.XmlString xgetKommisjonsbil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMISJONSBIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kommisjonsbil" element
     */
    public void setKommisjonsbil(java.lang.String kommisjonsbil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMISJONSBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMISJONSBIL$0);
            }
            target.setStringValue(kommisjonsbil);
        }
    }
    
    /**
     * Sets (as xml) the "Kommisjonsbil" element
     */
    public void xsetKommisjonsbil(org.apache.xmlbeans.XmlString kommisjonsbil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMISJONSBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMISJONSBIL$0);
            }
            target.set(kommisjonsbil);
        }
    }
}
