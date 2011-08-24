/*
 * An XML document type.
 * Localname: PART_NAME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTNAMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PART_NAME(@) element.
 *
 * This is a complex type.
 */
public class PARTNAMEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTNAMEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTNAMEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNAME$0 = 
        new javax.xml.namespace.QName("", "PART_NAME");
    
    
    /**
     * Gets the "PART_NAME" element
     */
    public java.lang.String getPARTNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PART_NAME" element
     */
    public org.apache.xmlbeans.XmlString xgetPARTNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PART_NAME" element
     */
    public void setPARTNAME(java.lang.String partname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNAME$0);
            }
            target.setStringValue(partname);
        }
    }
    
    /**
     * Sets (as xml) the "PART_NAME" element
     */
    public void xsetPARTNAME(org.apache.xmlbeans.XmlString partname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNAME$0);
            }
            target.set(partname);
        }
    }
}
