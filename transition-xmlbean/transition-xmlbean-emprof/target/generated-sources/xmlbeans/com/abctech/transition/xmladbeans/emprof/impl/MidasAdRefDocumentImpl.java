/*
 * An XML document type.
 * Localname: MidasAdRef
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MidasAdRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MidasAdRef(@) element.
 *
 * This is a complex type.
 */
public class MidasAdRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MidasAdRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public MidasAdRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIDASADREF$0 = 
        new javax.xml.namespace.QName("", "MidasAdRef");
    
    
    /**
     * Gets the "MidasAdRef" element
     */
    public java.lang.String getMidasAdRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MidasAdRef" element
     */
    public org.apache.xmlbeans.XmlString xgetMidasAdRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MidasAdRef" element
     */
    public void setMidasAdRef(java.lang.String midasAdRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDASADREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDASADREF$0);
            }
            target.setStringValue(midasAdRef);
        }
    }
    
    /**
     * Sets (as xml) the "MidasAdRef" element
     */
    public void xsetMidasAdRef(org.apache.xmlbeans.XmlString midasAdRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDASADREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDASADREF$0);
            }
            target.set(midasAdRef);
        }
    }
}
