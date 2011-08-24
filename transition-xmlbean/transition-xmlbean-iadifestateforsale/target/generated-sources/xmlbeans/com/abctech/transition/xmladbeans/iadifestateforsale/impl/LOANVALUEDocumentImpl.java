/*
 * An XML document type.
 * Localname: LOAN_VALUE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LOANVALUEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LOAN_VALUE(@) element.
 *
 * This is a complex type.
 */
public class LOANVALUEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LOANVALUEDocument
{
    private static final long serialVersionUID = 1L;
    
    public LOANVALUEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOANVALUE$0 = 
        new javax.xml.namespace.QName("", "LOAN_VALUE");
    
    
    /**
     * Gets the "LOAN_VALUE" element
     */
    public java.lang.String getLOANVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LOAN_VALUE" element
     */
    public org.apache.xmlbeans.XmlString xgetLOANVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LOAN_VALUE" element
     */
    public void setLOANVALUE(java.lang.String loanvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOANVALUE$0);
            }
            target.setStringValue(loanvalue);
        }
    }
    
    /**
     * Sets (as xml) the "LOAN_VALUE" element
     */
    public void xsetLOANVALUE(org.apache.xmlbeans.XmlString loanvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOANVALUE$0);
            }
            target.set(loanvalue);
        }
    }
}
