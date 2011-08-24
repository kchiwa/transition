/*
 * An XML document type.
 * Localname: ENERGY_LABEL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ENERGYLABELDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ENERGY_LABEL(@) element.
 *
 * This is a complex type.
 */
public class ENERGYLABELDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ENERGYLABELDocument
{
    private static final long serialVersionUID = 1L;
    
    public ENERGYLABELDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENERGYLABEL$0 = 
        new javax.xml.namespace.QName("", "ENERGY_LABEL");
    
    
    /**
     * Gets the "ENERGY_LABEL" element
     */
    public java.lang.String getENERGYLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ENERGY_LABEL" element
     */
    public org.apache.xmlbeans.XmlString xgetENERGYLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ENERGY_LABEL" element
     */
    public void setENERGYLABEL(java.lang.String energylabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABEL$0);
            }
            target.setStringValue(energylabel);
        }
    }
    
    /**
     * Sets (as xml) the "ENERGY_LABEL" element
     */
    public void xsetENERGYLABEL(org.apache.xmlbeans.XmlString energylabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABEL$0);
            }
            target.set(energylabel);
        }
    }
}
