/*
 * An XML document type.
 * Localname: SparGroup
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SparGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SparGroup(@) element.
 *
 * This is a complex type.
 */
public class SparGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SparGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public SparGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPARGROUP$0 = 
        new javax.xml.namespace.QName("", "SparGroup");
    
    
    /**
     * Gets the "SparGroup" element
     */
    public java.math.BigInteger getSparGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPARGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SparGroup" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSparGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SPARGROUP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SparGroup" element
     */
    public void setSparGroup(java.math.BigInteger sparGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPARGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPARGROUP$0);
            }
            target.setBigIntegerValue(sparGroup);
        }
    }
    
    /**
     * Sets (as xml) the "SparGroup" element
     */
    public void xsetSparGroup(org.apache.xmlbeans.XmlInteger sparGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SPARGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SPARGROUP$0);
            }
            target.set(sparGroup);
        }
    }
}
