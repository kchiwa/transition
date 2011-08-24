/*
 * An XML document type.
 * Localname: FACILITIES
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FACILITIESDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FACILITIES(@) element.
 *
 * This is a complex type.
 */
public class FACILITIESDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FACILITIESDocument
{
    private static final long serialVersionUID = 1L;
    
    public FACILITIESDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACILITIES$0 = 
        new javax.xml.namespace.QName("", "FACILITIES");
    
    
    /**
     * Gets the "FACILITIES" element
     */
    public java.lang.String getFACILITIES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FACILITIES" element
     */
    public org.apache.xmlbeans.XmlString xgetFACILITIES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FACILITIES" element
     */
    public void setFACILITIES(java.lang.String facilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACILITIES$0);
            }
            target.setStringValue(facilities);
        }
    }
    
    /**
     * Sets (as xml) the "FACILITIES" element
     */
    public void xsetFACILITIES(org.apache.xmlbeans.XmlString facilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FACILITIES$0);
            }
            target.set(facilities);
        }
    }
}
