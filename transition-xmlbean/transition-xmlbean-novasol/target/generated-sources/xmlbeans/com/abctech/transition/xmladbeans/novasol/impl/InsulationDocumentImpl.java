/*
 * An XML document type.
 * Localname: Insulation
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.InsulationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Insulation(@) element.
 *
 * This is a complex type.
 */
public class InsulationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.InsulationDocument
{
    private static final long serialVersionUID = 1L;
    
    public InsulationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSULATION$0 = 
        new javax.xml.namespace.QName("", "Insulation");
    
    
    /**
     * Gets the "Insulation" element
     */
    public java.lang.String getInsulation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSULATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Insulation" element
     */
    public org.apache.xmlbeans.XmlString xgetInsulation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSULATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Insulation" element
     */
    public void setInsulation(java.lang.String insulation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSULATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSULATION$0);
            }
            target.setStringValue(insulation);
        }
    }
    
    /**
     * Sets (as xml) the "Insulation" element
     */
    public void xsetInsulation(org.apache.xmlbeans.XmlString insulation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSULATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSULATION$0);
            }
            target.set(insulation);
        }
    }
}
