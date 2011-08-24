/*
 * An XML document type.
 * Localname: PART_ORG_NUMBER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTORGNUMBERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PART_ORG_NUMBER(@) element.
 *
 * This is a complex type.
 */
public class PARTORGNUMBERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTORGNUMBERDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTORGNUMBERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTORGNUMBER$0 = 
        new javax.xml.namespace.QName("", "PART_ORG_NUMBER");
    
    
    /**
     * Gets the "PART_ORG_NUMBER" element
     */
    public java.lang.String getPARTORGNUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTORGNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PART_ORG_NUMBER" element
     */
    public org.apache.xmlbeans.XmlString xgetPARTORGNUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTORGNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PART_ORG_NUMBER" element
     */
    public void setPARTORGNUMBER(java.lang.String partorgnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTORGNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTORGNUMBER$0);
            }
            target.setStringValue(partorgnumber);
        }
    }
    
    /**
     * Sets (as xml) the "PART_ORG_NUMBER" element
     */
    public void xsetPARTORGNUMBER(org.apache.xmlbeans.XmlString partorgnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTORGNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTORGNUMBER$0);
            }
            target.set(partorgnumber);
        }
    }
}
