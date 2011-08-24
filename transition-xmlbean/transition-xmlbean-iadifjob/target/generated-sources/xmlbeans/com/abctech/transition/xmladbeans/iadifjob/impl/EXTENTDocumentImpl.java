/*
 * An XML document type.
 * Localname: EXTENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.EXTENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one EXTENT(@) element.
 *
 * This is a complex type.
 */
public class EXTENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.EXTENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXTENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("", "EXTENT");
    
    
    /**
     * Gets the "EXTENT" element
     */
    public java.lang.String getEXTENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EXTENT" element
     */
    public org.apache.xmlbeans.XmlString xgetEXTENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EXTENT" element
     */
    public void setEXTENT(java.lang.String extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENT$0);
            }
            target.setStringValue(extent);
        }
    }
    
    /**
     * Sets (as xml) the "EXTENT" element
     */
    public void xsetEXTENT(org.apache.xmlbeans.XmlString extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENT$0);
            }
            target.set(extent);
        }
    }
}
