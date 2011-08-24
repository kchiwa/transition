/*
 * An XML document type.
 * Localname: ACQUISITION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ACQUISITIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ACQUISITION(@) element.
 *
 * This is a complex type.
 */
public class ACQUISITIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ACQUISITIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public ACQUISITIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACQUISITION$0 = 
        new javax.xml.namespace.QName("", "ACQUISITION");
    
    
    /**
     * Gets the "ACQUISITION" element
     */
    public java.lang.String getACQUISITION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ACQUISITION" element
     */
    public org.apache.xmlbeans.XmlString xgetACQUISITION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUISITION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ACQUISITION" element
     */
    public void setACQUISITION(java.lang.String acquisition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACQUISITION$0);
            }
            target.setStringValue(acquisition);
        }
    }
    
    /**
     * Sets (as xml) the "ACQUISITION" element
     */
    public void xsetACQUISITION(org.apache.xmlbeans.XmlString acquisition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUISITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACQUISITION$0);
            }
            target.set(acquisition);
        }
    }
}
