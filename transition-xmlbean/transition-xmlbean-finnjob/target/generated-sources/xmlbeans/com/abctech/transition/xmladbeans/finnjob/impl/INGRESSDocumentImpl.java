/*
 * An XML document type.
 * Localname: INGRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.INGRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one INGRESS(@) element.
 *
 * This is a complex type.
 */
public class INGRESSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.INGRESSDocument
{
    private static final long serialVersionUID = 1L;
    
    public INGRESSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INGRESS$0 = 
        new javax.xml.namespace.QName("", "INGRESS");
    
    
    /**
     * Gets the "INGRESS" element
     */
    public java.lang.String getINGRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INGRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "INGRESS" element
     */
    public org.apache.xmlbeans.XmlString xgetINGRESS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INGRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "INGRESS" element
     */
    public void setINGRESS(java.lang.String ingress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INGRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INGRESS$0);
            }
            target.setStringValue(ingress);
        }
    }
    
    /**
     * Sets (as xml) the "INGRESS" element
     */
    public void xsetINGRESS(org.apache.xmlbeans.XmlString ingress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INGRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INGRESS$0);
            }
            target.set(ingress);
        }
    }
}
