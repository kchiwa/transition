/*
 * An XML document type.
 * Localname: OWNERSHIP_TYPE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.OWNERSHIPTYPEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one OWNERSHIP_TYPE(@) element.
 *
 * This is a complex type.
 */
public class OWNERSHIPTYPEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.OWNERSHIPTYPEDocument
{
    private static final long serialVersionUID = 1L;
    
    public OWNERSHIPTYPEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERSHIPTYPE$0 = 
        new javax.xml.namespace.QName("", "OWNERSHIP_TYPE");
    
    
    /**
     * Gets the "OWNERSHIP_TYPE" element
     */
    public java.lang.String getOWNERSHIPTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OWNERSHIP_TYPE" element
     */
    public org.apache.xmlbeans.XmlString xgetOWNERSHIPTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OWNERSHIP_TYPE" element
     */
    public void setOWNERSHIPTYPE(java.lang.String ownershiptype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPE$0);
            }
            target.setStringValue(ownershiptype);
        }
    }
    
    /**
     * Sets (as xml) the "OWNERSHIP_TYPE" element
     */
    public void xsetOWNERSHIPTYPE(org.apache.xmlbeans.XmlString ownershiptype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERSHIPTYPE$0);
            }
            target.set(ownershiptype);
        }
    }
}
