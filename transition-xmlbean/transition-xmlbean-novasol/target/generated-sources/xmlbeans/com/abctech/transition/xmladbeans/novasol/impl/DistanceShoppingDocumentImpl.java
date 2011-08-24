/*
 * An XML document type.
 * Localname: DistanceShopping
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceShoppingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceShopping(@) element.
 *
 * This is a complex type.
 */
public class DistanceShoppingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceShoppingDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceShoppingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCESHOPPING$0 = 
        new javax.xml.namespace.QName("", "DistanceShopping");
    
    
    /**
     * Gets the "DistanceShopping" element
     */
    public java.lang.String getDistanceShopping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESHOPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceShopping" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceShopping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESHOPPING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceShopping" element
     */
    public void setDistanceShopping(java.lang.String distanceShopping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESHOPPING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESHOPPING$0);
            }
            target.setStringValue(distanceShopping);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceShopping" element
     */
    public void xsetDistanceShopping(org.apache.xmlbeans.XmlString distanceShopping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESHOPPING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESHOPPING$0);
            }
            target.set(distanceShopping);
        }
    }
}
