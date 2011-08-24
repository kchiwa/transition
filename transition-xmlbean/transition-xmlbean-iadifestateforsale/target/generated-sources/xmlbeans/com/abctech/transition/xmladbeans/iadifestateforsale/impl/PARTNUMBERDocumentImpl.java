/*
 * An XML document type.
 * Localname: PART_NUMBER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTNUMBERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PART_NUMBER(@) element.
 *
 * This is a complex type.
 */
public class PARTNUMBERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTNUMBERDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTNUMBERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNUMBER$0 = 
        new javax.xml.namespace.QName("", "PART_NUMBER");
    
    
    /**
     * Gets the "PART_NUMBER" element
     */
    public java.lang.String getPARTNUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PART_NUMBER" element
     */
    public org.apache.xmlbeans.XmlString xgetPARTNUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PART_NUMBER" element
     */
    public void setPARTNUMBER(java.lang.String partnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNUMBER$0);
            }
            target.setStringValue(partnumber);
        }
    }
    
    /**
     * Sets (as xml) the "PART_NUMBER" element
     */
    public void xsetPARTNUMBER(org.apache.xmlbeans.XmlString partnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNUMBER$0);
            }
            target.set(partnumber);
        }
    }
}
