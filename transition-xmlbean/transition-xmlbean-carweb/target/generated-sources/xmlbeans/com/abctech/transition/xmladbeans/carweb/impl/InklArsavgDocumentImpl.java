/*
 * An XML document type.
 * Localname: InklArsavg
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.InklArsavgDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one InklArsavg(@) element.
 *
 * This is a complex type.
 */
public class InklArsavgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.InklArsavgDocument
{
    private static final long serialVersionUID = 1L;
    
    public InklArsavgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INKLARSAVG$0 = 
        new javax.xml.namespace.QName("", "InklArsavg");
    
    
    /**
     * Gets the "InklArsavg" element
     */
    public java.lang.String getInklArsavg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLARSAVG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InklArsavg" element
     */
    public org.apache.xmlbeans.XmlString xgetInklArsavg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLARSAVG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InklArsavg" element
     */
    public void setInklArsavg(java.lang.String inklArsavg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLARSAVG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INKLARSAVG$0);
            }
            target.setStringValue(inklArsavg);
        }
    }
    
    /**
     * Sets (as xml) the "InklArsavg" element
     */
    public void xsetInklArsavg(org.apache.xmlbeans.XmlString inklArsavg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLARSAVG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INKLARSAVG$0);
            }
            target.set(inklArsavg);
        }
    }
}
