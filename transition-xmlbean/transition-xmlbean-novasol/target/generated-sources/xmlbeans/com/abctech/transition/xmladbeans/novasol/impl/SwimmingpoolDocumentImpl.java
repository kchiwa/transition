/*
 * An XML document type.
 * Localname: Swimmingpool
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SwimmingpoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Swimmingpool(@) element.
 *
 * This is a complex type.
 */
public class SwimmingpoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SwimmingpoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public SwimmingpoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SWIMMINGPOOL$0 = 
        new javax.xml.namespace.QName("", "Swimmingpool");
    
    
    /**
     * Gets the "Swimmingpool" element
     */
    public java.lang.String getSwimmingpool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Swimmingpool" element
     */
    public org.apache.xmlbeans.XmlString xgetSwimmingpool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Swimmingpool" element
     */
    public void setSwimmingpool(java.lang.String swimmingpool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIMMINGPOOL$0);
            }
            target.setStringValue(swimmingpool);
        }
    }
    
    /**
     * Sets (as xml) the "Swimmingpool" element
     */
    public void xsetSwimmingpool(org.apache.xmlbeans.XmlString swimmingpool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIMMINGPOOL$0);
            }
            target.set(swimmingpool);
        }
    }
}
