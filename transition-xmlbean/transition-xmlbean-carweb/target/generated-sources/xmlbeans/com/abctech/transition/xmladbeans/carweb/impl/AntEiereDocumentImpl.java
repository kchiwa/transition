/*
 * An XML document type.
 * Localname: AntEiere
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.AntEiereDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one AntEiere(@) element.
 *
 * This is a complex type.
 */
public class AntEiereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.AntEiereDocument
{
    private static final long serialVersionUID = 1L;
    
    public AntEiereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANTEIERE$0 = 
        new javax.xml.namespace.QName("", "AntEiere");
    
    
    /**
     * Gets the "AntEiere" element
     */
    public java.lang.String getAntEiere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTEIERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AntEiere" element
     */
    public org.apache.xmlbeans.XmlString xgetAntEiere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTEIERE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AntEiere" element
     */
    public void setAntEiere(java.lang.String antEiere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTEIERE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTEIERE$0);
            }
            target.setStringValue(antEiere);
        }
    }
    
    /**
     * Sets (as xml) the "AntEiere" element
     */
    public void xsetAntEiere(org.apache.xmlbeans.XmlString antEiere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTEIERE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTEIERE$0);
            }
            target.set(antEiere);
        }
    }
}
