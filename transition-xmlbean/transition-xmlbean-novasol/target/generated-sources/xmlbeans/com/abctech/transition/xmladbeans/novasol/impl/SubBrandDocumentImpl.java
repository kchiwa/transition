/*
 * An XML document type.
 * Localname: SubBrand
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SubBrandDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SubBrand(@) element.
 *
 * This is a complex type.
 */
public class SubBrandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SubBrandDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubBrandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBBRAND$0 = 
        new javax.xml.namespace.QName("", "SubBrand");
    
    
    /**
     * Gets the "SubBrand" element
     */
    public java.lang.String getSubBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBBRAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubBrand" element
     */
    public org.apache.xmlbeans.XmlString xgetSubBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBBRAND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubBrand" element
     */
    public void setSubBrand(java.lang.String subBrand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBBRAND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBBRAND$0);
            }
            target.setStringValue(subBrand);
        }
    }
    
    /**
     * Sets (as xml) the "SubBrand" element
     */
    public void xsetSubBrand(org.apache.xmlbeans.XmlString subBrand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBBRAND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBBRAND$0);
            }
            target.set(subBrand);
        }
    }
}
