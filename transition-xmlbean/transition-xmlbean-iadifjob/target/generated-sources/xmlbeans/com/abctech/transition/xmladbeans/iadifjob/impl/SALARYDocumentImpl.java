/*
 * An XML document type.
 * Localname: SALARY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.SALARYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one SALARY(@) element.
 *
 * This is a complex type.
 */
public class SALARYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.SALARYDocument
{
    private static final long serialVersionUID = 1L;
    
    public SALARYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALARY$0 = 
        new javax.xml.namespace.QName("", "SALARY");
    
    
    /**
     * Gets the "SALARY" element
     */
    public java.lang.String getSALARY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SALARY" element
     */
    public org.apache.xmlbeans.XmlString xgetSALARY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SALARY" element
     */
    public void setSALARY(java.lang.String salary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARY$0);
            }
            target.setStringValue(salary);
        }
    }
    
    /**
     * Sets (as xml) the "SALARY" element
     */
    public void xsetSALARY(org.apache.xmlbeans.XmlString salary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALARY$0);
            }
            target.set(salary);
        }
    }
}
