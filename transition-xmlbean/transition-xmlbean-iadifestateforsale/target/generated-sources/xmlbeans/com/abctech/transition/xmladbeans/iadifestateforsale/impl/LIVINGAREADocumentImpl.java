/*
 * An XML document type.
 * Localname: LIVING_AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LIVINGAREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LIVING_AREA(@) element.
 *
 * This is a complex type.
 */
public class LIVINGAREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LIVINGAREADocument
{
    private static final long serialVersionUID = 1L;
    
    public LIVINGAREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIVINGAREA$0 = 
        new javax.xml.namespace.QName("", "LIVING_AREA");
    
    
    /**
     * Gets the "LIVING_AREA" element
     */
    public java.lang.String getLIVINGAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LIVING_AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetLIVINGAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIVINGAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LIVING_AREA" element
     */
    public void setLIVINGAREA(java.lang.String livingarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVINGAREA$0);
            }
            target.setStringValue(livingarea);
        }
    }
    
    /**
     * Sets (as xml) the "LIVING_AREA" element
     */
    public void xsetLIVINGAREA(org.apache.xmlbeans.XmlString livingarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIVINGAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIVINGAREA$0);
            }
            target.set(livingarea);
        }
    }
}
