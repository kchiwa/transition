/*
 * An XML document type.
 * Localname: ESTATE_PREFERENCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPREFERENCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_PREFERENCE(@) element.
 *
 * This is a complex type.
 */
public class ESTATEPREFERENCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPREFERENCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATEPREFERENCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATEPREFERENCE$0 = 
        new javax.xml.namespace.QName("", "ESTATE_PREFERENCE");
    
    
    /**
     * Gets the "ESTATE_PREFERENCE" element
     */
    public java.lang.String getESTATEPREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEPREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ESTATE_PREFERENCE" element
     */
    public org.apache.xmlbeans.XmlString xgetESTATEPREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEPREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_PREFERENCE" element
     */
    public void setESTATEPREFERENCE(java.lang.String estatepreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEPREFERENCE$0);
            }
            target.setStringValue(estatepreference);
        }
    }
    
    /**
     * Sets (as xml) the "ESTATE_PREFERENCE" element
     */
    public void xsetESTATEPREFERENCE(org.apache.xmlbeans.XmlString estatepreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEPREFERENCE$0);
            }
            target.set(estatepreference);
        }
    }
}
