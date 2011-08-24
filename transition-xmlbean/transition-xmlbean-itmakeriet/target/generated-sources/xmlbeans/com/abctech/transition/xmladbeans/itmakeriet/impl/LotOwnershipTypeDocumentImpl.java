/*
 * An XML document type.
 * Localname: LotOwnershipType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.LotOwnershipTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one LotOwnershipType(@) element.
 *
 * This is a complex type.
 */
public class LotOwnershipTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.LotOwnershipTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LotOwnershipTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOTOWNERSHIPTYPE$0 = 
        new javax.xml.namespace.QName("", "LotOwnershipType");
    
    
    /**
     * Gets the "LotOwnershipType" element
     */
    public java.lang.String getLotOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTOWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LotOwnershipType" element
     */
    public org.apache.xmlbeans.XmlString xgetLotOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTOWNERSHIPTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LotOwnershipType" element
     */
    public void setLotOwnershipType(java.lang.String lotOwnershipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTOWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOTOWNERSHIPTYPE$0);
            }
            target.setStringValue(lotOwnershipType);
        }
    }
    
    /**
     * Sets (as xml) the "LotOwnershipType" element
     */
    public void xsetLotOwnershipType(org.apache.xmlbeans.XmlString lotOwnershipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTOWNERSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOTOWNERSHIPTYPE$0);
            }
            target.set(lotOwnershipType);
        }
    }
}
