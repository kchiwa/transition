/*
 * An XML document type.
 * Localname: MicroOven
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.MicroOvenDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one MicroOven(@) element.
 *
 * This is a complex type.
 */
public class MicroOvenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.MicroOvenDocument
{
    private static final long serialVersionUID = 1L;
    
    public MicroOvenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MICROOVEN$0 = 
        new javax.xml.namespace.QName("", "MicroOven");
    
    
    /**
     * Gets the "MicroOven" element
     */
    public java.lang.String getMicroOven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICROOVEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MicroOven" element
     */
    public org.apache.xmlbeans.XmlString xgetMicroOven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICROOVEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MicroOven" element
     */
    public void setMicroOven(java.lang.String microOven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICROOVEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MICROOVEN$0);
            }
            target.setStringValue(microOven);
        }
    }
    
    /**
     * Sets (as xml) the "MicroOven" element
     */
    public void xsetMicroOven(org.apache.xmlbeans.XmlString microOven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICROOVEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MICROOVEN$0);
            }
            target.set(microOven);
        }
    }
}
