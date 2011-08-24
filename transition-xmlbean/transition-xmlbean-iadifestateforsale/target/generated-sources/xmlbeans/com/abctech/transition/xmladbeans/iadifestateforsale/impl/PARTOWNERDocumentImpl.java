/*
 * An XML document type.
 * Localname: PART_OWNER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PART_OWNER(@) element.
 *
 * This is a complex type.
 */
public class PARTOWNERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTOWNERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTOWNER$0 = 
        new javax.xml.namespace.QName("", "PART_OWNER");
    
    
    /**
     * Gets the "PART_OWNER" element
     */
    public java.lang.String getPARTOWNER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTOWNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PART_OWNER" element
     */
    public org.apache.xmlbeans.XmlString xgetPARTOWNER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTOWNER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PART_OWNER" element
     */
    public void setPARTOWNER(java.lang.String partowner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTOWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTOWNER$0);
            }
            target.setStringValue(partowner);
        }
    }
    
    /**
     * Sets (as xml) the "PART_OWNER" element
     */
    public void xsetPARTOWNER(org.apache.xmlbeans.XmlString partowner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTOWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTOWNER$0);
            }
            target.set(partowner);
        }
    }
}
