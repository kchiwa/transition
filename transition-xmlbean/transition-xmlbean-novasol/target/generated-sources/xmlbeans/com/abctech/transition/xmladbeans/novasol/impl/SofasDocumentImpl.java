/*
 * An XML document type.
 * Localname: Sofas
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SofasDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Sofas(@) element.
 *
 * This is a complex type.
 */
public class SofasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SofasDocument
{
    private static final long serialVersionUID = 1L;
    
    public SofasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFAS$0 = 
        new javax.xml.namespace.QName("", "Sofas");
    
    
    /**
     * Gets the "Sofas" element
     */
    public java.math.BigInteger getSofas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sofas" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSofas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SOFAS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Sofas" element
     */
    public void setSofas(java.math.BigInteger sofas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFAS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFAS$0);
            }
            target.setBigIntegerValue(sofas);
        }
    }
    
    /**
     * Sets (as xml) the "Sofas" element
     */
    public void xsetSofas(org.apache.xmlbeans.XmlInteger sofas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SOFAS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SOFAS$0);
            }
            target.set(sofas);
        }
    }
}
