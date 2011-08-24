/*
 * An XML document type.
 * Localname: Drivhjul
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.DrivhjulDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Drivhjul(@) element.
 *
 * This is a complex type.
 */
public class DrivhjulDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.DrivhjulDocument
{
    private static final long serialVersionUID = 1L;
    
    public DrivhjulDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DRIVHJUL$0 = 
        new javax.xml.namespace.QName("", "Drivhjul");
    
    
    /**
     * Gets the "Drivhjul" element
     */
    public java.lang.String getDrivhjul()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVHJUL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Drivhjul" element
     */
    public org.apache.xmlbeans.XmlString xgetDrivhjul()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVHJUL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Drivhjul" element
     */
    public void setDrivhjul(java.lang.String drivhjul)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVHJUL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRIVHJUL$0);
            }
            target.setStringValue(drivhjul);
        }
    }
    
    /**
     * Sets (as xml) the "Drivhjul" element
     */
    public void xsetDrivhjul(org.apache.xmlbeans.XmlString drivhjul)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVHJUL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRIVHJUL$0);
            }
            target.set(drivhjul);
        }
    }
}
