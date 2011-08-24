/*
 * An XML document type.
 * Localname: Freezer
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FreezerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Freezer(@) element.
 *
 * This is a complex type.
 */
public class FreezerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FreezerDocument
{
    private static final long serialVersionUID = 1L;
    
    public FreezerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREEZER$0 = 
        new javax.xml.namespace.QName("", "Freezer");
    
    
    /**
     * Gets the "Freezer" element
     */
    public java.lang.String getFreezer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Freezer" element
     */
    public org.apache.xmlbeans.XmlString xgetFreezer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Freezer" element
     */
    public void setFreezer(java.lang.String freezer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZER$0);
            }
            target.setStringValue(freezer);
        }
    }
    
    /**
     * Sets (as xml) the "Freezer" element
     */
    public void xsetFreezer(org.apache.xmlbeans.XmlString freezer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZER$0);
            }
            target.set(freezer);
        }
    }
}
