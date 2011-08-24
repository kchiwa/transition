/*
 * An XML document type.
 * Localname: EIERFORMTOMT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.EIERFORMTOMTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one EIERFORMTOMT(@) element.
 *
 * This is a complex type.
 */
public class EIERFORMTOMTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.EIERFORMTOMTDocument
{
    private static final long serialVersionUID = 1L;
    
    public EIERFORMTOMTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EIERFORMTOMT$0 = 
        new javax.xml.namespace.QName("", "EIERFORMTOMT");
    
    
    /**
     * Gets the "EIERFORMTOMT" element
     */
    public java.lang.String getEIERFORMTOMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORMTOMT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EIERFORMTOMT" element
     */
    public org.apache.xmlbeans.XmlString xgetEIERFORMTOMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORMTOMT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EIERFORMTOMT" element
     */
    public void setEIERFORMTOMT(java.lang.String eierformtomt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EIERFORMTOMT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EIERFORMTOMT$0);
            }
            target.setStringValue(eierformtomt);
        }
    }
    
    /**
     * Sets (as xml) the "EIERFORMTOMT" element
     */
    public void xsetEIERFORMTOMT(org.apache.xmlbeans.XmlString eierformtomt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EIERFORMTOMT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EIERFORMTOMT$0);
            }
            target.set(eierformtomt);
        }
    }
}
