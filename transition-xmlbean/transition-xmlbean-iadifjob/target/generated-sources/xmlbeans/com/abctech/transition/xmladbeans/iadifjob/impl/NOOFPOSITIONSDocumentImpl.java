/*
 * An XML document type.
 * Localname: NO_OF_POSITIONS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.NOOFPOSITIONSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one NO_OF_POSITIONS(@) element.
 *
 * This is a complex type.
 */
public class NOOFPOSITIONSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.NOOFPOSITIONSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFPOSITIONSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFPOSITIONS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_POSITIONS");
    
    
    /**
     * Gets the "NO_OF_POSITIONS" element
     */
    public java.lang.String getNOOFPOSITIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPOSITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_POSITIONS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFPOSITIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFPOSITIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_POSITIONS" element
     */
    public void setNOOFPOSITIONS(java.lang.String noofpositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPOSITIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFPOSITIONS$0);
            }
            target.setStringValue(noofpositions);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_POSITIONS" element
     */
    public void xsetNOOFPOSITIONS(org.apache.xmlbeans.XmlString noofpositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFPOSITIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFPOSITIONS$0);
            }
            target.set(noofpositions);
        }
    }
}
