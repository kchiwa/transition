/*
 * An XML document type.
 * Localname: SwimmingpoolM2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SwimmingpoolM2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SwimmingpoolM2(@) element.
 *
 * This is a complex type.
 */
public class SwimmingpoolM2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SwimmingpoolM2Document
{
    private static final long serialVersionUID = 1L;
    
    public SwimmingpoolM2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SWIMMINGPOOLM2$0 = 
        new javax.xml.namespace.QName("", "SwimmingpoolM2");
    
    
    /**
     * Gets the "SwimmingpoolM2" element
     */
    public java.lang.String getSwimmingpoolM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOLM2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SwimmingpoolM2" element
     */
    public org.apache.xmlbeans.XmlString xgetSwimmingpoolM2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOLM2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SwimmingpoolM2" element
     */
    public void setSwimmingpoolM2(java.lang.String swimmingpoolM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOLM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIMMINGPOOLM2$0);
            }
            target.setStringValue(swimmingpoolM2);
        }
    }
    
    /**
     * Sets (as xml) the "SwimmingpoolM2" element
     */
    public void xsetSwimmingpoolM2(org.apache.xmlbeans.XmlString swimmingpoolM2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOLM2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIMMINGPOOLM2$0);
            }
            target.set(swimmingpoolM2);
        }
    }
}
