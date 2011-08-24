/*
 * An XML document type.
 * Localname: PRICE_SUGGESTION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRICESUGGESTIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRICE_SUGGESTION(@) element.
 *
 * This is a complex type.
 */
public class PRICESUGGESTIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRICESUGGESTIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRICESUGGESTIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICESUGGESTION$0 = 
        new javax.xml.namespace.QName("", "PRICE_SUGGESTION");
    
    
    /**
     * Gets the "PRICE_SUGGESTION" element
     */
    public java.lang.String getPRICESUGGESTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICESUGGESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRICE_SUGGESTION" element
     */
    public org.apache.xmlbeans.XmlString xgetPRICESUGGESTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICESUGGESTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRICE_SUGGESTION" element
     */
    public void setPRICESUGGESTION(java.lang.String pricesuggestion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICESUGGESTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICESUGGESTION$0);
            }
            target.setStringValue(pricesuggestion);
        }
    }
    
    /**
     * Sets (as xml) the "PRICE_SUGGESTION" element
     */
    public void xsetPRICESUGGESTION(org.apache.xmlbeans.XmlString pricesuggestion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICESUGGESTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICESUGGESTION$0);
            }
            target.set(pricesuggestion);
        }
    }
}
