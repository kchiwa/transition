/*
 * An XML document type.
 * Localname: EIERFORM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.EIERFORMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one EIERFORM(@) element.
 *
 * This is a complex type.
 */
public class EIERFORMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.EIERFORMDocument
{
    private static final long serialVersionUID = 1L;
    
    public EIERFORMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EIERFORM$0 = 
        new javax.xml.namespace.QName("", "EIERFORM");
    
    
    /**
     * Gets the "EIERFORM" element
     */
    public java.lang.String getEIERFORM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EIERFORM" element
     */
    public org.apache.xmlbeans.XmlString xgetEIERFORM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EIERFORM" element
     */
    public void setEIERFORM(java.lang.String eierform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIERFORM$0);
            }
            target.setStringValue(eierform);
        }
    }
    
    /**
     * Sets (as xml) the "EIERFORM" element
     */
    public void xsetEIERFORM(org.apache.xmlbeans.XmlString eierform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIERFORM$0);
            }
            target.set(eierform);
        }
    }
}
