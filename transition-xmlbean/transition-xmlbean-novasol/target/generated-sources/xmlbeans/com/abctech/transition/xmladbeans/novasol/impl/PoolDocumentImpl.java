/*
 * An XML document type.
 * Localname: Pool
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Pool(@) element.
 *
 * This is a complex type.
 */
public class PoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public PoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOL$0 = 
        new javax.xml.namespace.QName("", "Pool");
    
    
    /**
     * Gets the "Pool" element
     */
    public java.lang.String getPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pool" element
     */
    public org.apache.xmlbeans.XmlString xgetPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Pool" element
     */
    public void setPool(java.lang.String pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOL$0);
            }
            target.setStringValue(pool);
        }
    }
    
    /**
     * Sets (as xml) the "Pool" element
     */
    public void xsetPool(org.apache.xmlbeans.XmlString pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOL$0);
            }
            target.set(pool);
        }
    }
}
