/*
 * An XML document type.
 * Localname: NUMBER_OF_UNITS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NUMBEROFUNITSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NUMBER_OF_UNITS(@) element.
 *
 * This is a complex type.
 */
public class NUMBEROFUNITSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NUMBEROFUNITSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NUMBEROFUNITSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFUNITS$0 = 
        new javax.xml.namespace.QName("", "NUMBER_OF_UNITS");
    
    
    /**
     * Gets the "NUMBER_OF_UNITS" element
     */
    public java.lang.String getNUMBEROFUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NUMBER_OF_UNITS" element
     */
    public org.apache.xmlbeans.XmlString xgetNUMBEROFUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFUNITS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NUMBER_OF_UNITS" element
     */
    public void setNUMBEROFUNITS(java.lang.String numberofunits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFUNITS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFUNITS$0);
            }
            target.setStringValue(numberofunits);
        }
    }
    
    /**
     * Sets (as xml) the "NUMBER_OF_UNITS" element
     */
    public void xsetNUMBEROFUNITS(org.apache.xmlbeans.XmlString numberofunits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFUNITS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFUNITS$0);
            }
            target.set(numberofunits);
        }
    }
}
