/*
 * An XML document type.
 * Localname: Min2Weeks
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.Min2WeeksDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Min2Weeks(@) element.
 *
 * This is a complex type.
 */
public class Min2WeeksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.Min2WeeksDocument
{
    private static final long serialVersionUID = 1L;
    
    public Min2WeeksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIN2WEEKS$0 = 
        new javax.xml.namespace.QName("", "Min2Weeks");
    
    
    /**
     * Gets the "Min2Weeks" element
     */
    public java.lang.String getMin2Weeks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN2WEEKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Min2Weeks" element
     */
    public org.apache.xmlbeans.XmlString xgetMin2Weeks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIN2WEEKS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Min2Weeks" element
     */
    public void setMin2Weeks(java.lang.String min2Weeks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN2WEEKS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIN2WEEKS$0);
            }
            target.setStringValue(min2Weeks);
        }
    }
    
    /**
     * Sets (as xml) the "Min2Weeks" element
     */
    public void xsetMin2Weeks(org.apache.xmlbeans.XmlString min2Weeks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIN2WEEKS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIN2WEEKS$0);
            }
            target.set(min2Weeks);
        }
    }
}
