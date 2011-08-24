/*
 * An XML document type.
 * Localname: OwnershipType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.OwnershipTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one OwnershipType(@) element.
 *
 * This is a complex type.
 */
public class OwnershipTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.OwnershipTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OwnershipTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERSHIPTYPE$0 = 
        new javax.xml.namespace.QName("", "OwnershipType");
    
    
    /**
     * Gets the "OwnershipType" element
     */
    public java.lang.String getOwnershipType()
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
     * Gets (as xml) the "OwnershipType" element
     */
    public org.apache.xmlbeans.XmlString xgetOwnershipType()
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
     * Sets the "OwnershipType" element
     */
    public void setOwnershipType(java.lang.String ownershipType)
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
            target.setStringValue(ownershipType);
        }
    }
    
    /**
     * Sets (as xml) the "OwnershipType" element
     */
    public void xsetOwnershipType(org.apache.xmlbeans.XmlString ownershipType)
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
            target.set(ownershipType);
        }
    }
}
