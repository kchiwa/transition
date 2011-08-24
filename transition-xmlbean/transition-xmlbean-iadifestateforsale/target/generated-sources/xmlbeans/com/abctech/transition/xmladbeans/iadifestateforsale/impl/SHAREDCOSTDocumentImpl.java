/*
 * An XML document type.
 * Localname: SHARED_COST
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.SHAREDCOSTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one SHARED_COST(@) element.
 *
 * This is a complex type.
 */
public class SHAREDCOSTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.SHAREDCOSTDocument
{
    private static final long serialVersionUID = 1L;
    
    public SHAREDCOSTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREDCOST$0 = 
        new javax.xml.namespace.QName("", "SHARED_COST");
    
    
    /**
     * Gets the "SHARED_COST" element
     */
    public java.lang.String getSHAREDCOST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SHARED_COST" element
     */
    public org.apache.xmlbeans.XmlString xgetSHAREDCOST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SHARED_COST" element
     */
    public void setSHAREDCOST(java.lang.String sharedcost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDCOST$0);
            }
            target.setStringValue(sharedcost);
        }
    }
    
    /**
     * Sets (as xml) the "SHARED_COST" element
     */
    public void xsetSHAREDCOST(org.apache.xmlbeans.XmlString sharedcost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDCOST$0);
            }
            target.set(sharedcost);
        }
    }
}
