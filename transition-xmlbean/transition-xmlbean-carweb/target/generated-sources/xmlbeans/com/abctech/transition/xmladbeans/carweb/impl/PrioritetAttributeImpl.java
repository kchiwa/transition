/*
 * An XML attribute type.
 * Localname: prioritet
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.PrioritetAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one prioritet(@) attribute.
 *
 * This is a complex type.
 */
public class PrioritetAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.PrioritetAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PrioritetAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIORITET$0 = 
        new javax.xml.namespace.QName("", "prioritet");
    
    
    /**
     * Gets the "prioritet" attribute
     */
    public java.lang.String getPrioritet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITET$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prioritet" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPrioritet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITET$0);
            return target;
        }
    }
    
    /**
     * True if has "prioritet" attribute
     */
    public boolean isSetPrioritet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRIORITET$0) != null;
        }
    }
    
    /**
     * Sets the "prioritet" attribute
     */
    public void setPrioritet(java.lang.String prioritet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITET$0);
            }
            target.setStringValue(prioritet);
        }
    }
    
    /**
     * Sets (as xml) the "prioritet" attribute
     */
    public void xsetPrioritet(org.apache.xmlbeans.XmlString prioritet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIORITET$0);
            }
            target.set(prioritet);
        }
    }
    
    /**
     * Unsets the "prioritet" attribute
     */
    public void unsetPrioritet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRIORITET$0);
        }
    }
}
