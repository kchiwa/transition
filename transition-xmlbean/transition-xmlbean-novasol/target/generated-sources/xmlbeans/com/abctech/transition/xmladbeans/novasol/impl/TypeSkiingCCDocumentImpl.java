/*
 * An XML document type.
 * Localname: TypeSkiingCC
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.TypeSkiingCCDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one TypeSkiingCC(@) element.
 *
 * This is a complex type.
 */
public class TypeSkiingCCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.TypeSkiingCCDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeSkiingCCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPESKIINGCC$0 = 
        new javax.xml.namespace.QName("", "TypeSkiingCC");
    
    
    /**
     * Gets the "TypeSkiingCC" element
     */
    public java.lang.String getTypeSkiingCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGCC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeSkiingCC" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeSkiingCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGCC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TypeSkiingCC" element
     */
    public void setTypeSkiingCC(java.lang.String typeSkiingCC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGCC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPESKIINGCC$0);
            }
            target.setStringValue(typeSkiingCC);
        }
    }
    
    /**
     * Sets (as xml) the "TypeSkiingCC" element
     */
    public void xsetTypeSkiingCC(org.apache.xmlbeans.XmlString typeSkiingCC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGCC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPESKIINGCC$0);
            }
            target.set(typeSkiingCC);
        }
    }
}
