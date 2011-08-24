/*
 * An XML document type.
 * Localname: LOAN_FARE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LOANFAREDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LOAN_FARE(@) element.
 *
 * This is a complex type.
 */
public class LOANFAREDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LOANFAREDocument
{
    private static final long serialVersionUID = 1L;
    
    public LOANFAREDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOANFARE$0 = 
        new javax.xml.namespace.QName("", "LOAN_FARE");
    
    
    /**
     * Gets the "LOAN_FARE" element
     */
    public java.lang.String getLOANFARE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANFARE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LOAN_FARE" element
     */
    public org.apache.xmlbeans.XmlString xgetLOANFARE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANFARE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LOAN_FARE" element
     */
    public void setLOANFARE(java.lang.String loanfare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOANFARE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOANFARE$0);
            }
            target.setStringValue(loanfare);
        }
    }
    
    /**
     * Sets (as xml) the "LOAN_FARE" element
     */
    public void xsetLOANFARE(org.apache.xmlbeans.XmlString loanfare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOANFARE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOANFARE$0);
            }
            target.set(loanfare);
        }
    }
}
