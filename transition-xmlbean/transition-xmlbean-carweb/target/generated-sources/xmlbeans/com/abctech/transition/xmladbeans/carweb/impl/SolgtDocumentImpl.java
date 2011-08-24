/*
 * An XML document type.
 * Localname: Solgt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.SolgtDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Solgt(@) element.
 *
 * This is a complex type.
 */
public class SolgtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.SolgtDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolgtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLGT$0 = 
        new javax.xml.namespace.QName("", "Solgt");
    
    
    /**
     * Gets the "Solgt" element
     */
    public java.lang.String getSolgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLGT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Solgt" element
     */
    public org.apache.xmlbeans.XmlString xgetSolgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLGT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Solgt" element
     */
    public void setSolgt(java.lang.String solgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLGT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLGT$0);
            }
            target.setStringValue(solgt);
        }
    }
    
    /**
     * Sets (as xml) the "Solgt" element
     */
    public void xsetSolgt(org.apache.xmlbeans.XmlString solgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLGT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLGT$0);
            }
            target.set(solgt);
        }
    }
}
