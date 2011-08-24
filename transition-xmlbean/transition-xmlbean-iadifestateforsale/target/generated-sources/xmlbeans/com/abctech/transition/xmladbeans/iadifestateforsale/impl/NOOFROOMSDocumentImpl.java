/*
 * An XML document type.
 * Localname: NO_OF_ROOMS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_ROOMS(@) element.
 *
 * This is a complex type.
 */
public class NOOFROOMSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFROOMSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFROOMS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_ROOMS");
    
    
    /**
     * Gets the "NO_OF_ROOMS" element
     */
    public java.lang.String getNOOFROOMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_ROOMS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFROOMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_ROOMS" element
     */
    public void setNOOFROOMS(java.lang.String noofrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFROOMS$0);
            }
            target.setStringValue(noofrooms);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_ROOMS" element
     */
    public void xsetNOOFROOMS(org.apache.xmlbeans.XmlString noofrooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFROOMS$0);
            }
            target.set(noofrooms);
        }
    }
}
