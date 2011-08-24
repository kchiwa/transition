/*
 * An XML document type.
 * Localname: ESTIMATED_VALUE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTIMATEDVALUEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTIMATED_VALUE(@) element.
 *
 * This is a complex type.
 */
public class ESTIMATEDVALUEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTIMATEDVALUEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTIMATEDVALUEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTIMATEDVALUE$0 = 
        new javax.xml.namespace.QName("", "ESTIMATED_VALUE");
    
    
    /**
     * Gets the "ESTIMATED_VALUE" element
     */
    public java.lang.String getESTIMATEDVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ESTIMATED_VALUE" element
     */
    public org.apache.xmlbeans.XmlString xgetESTIMATEDVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTIMATEDVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ESTIMATED_VALUE" element
     */
    public void setESTIMATEDVALUE(java.lang.String estimatedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDVALUE$0);
            }
            target.setStringValue(estimatedvalue);
        }
    }
    
    /**
     * Sets (as xml) the "ESTIMATED_VALUE" element
     */
    public void xsetESTIMATEDVALUE(org.apache.xmlbeans.XmlString estimatedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTIMATEDVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTIMATEDVALUE$0);
            }
            target.set(estimatedvalue);
        }
    }
}
