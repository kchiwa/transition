/*
 * An XML document type.
 * Localname: MODERNISERINGSAAR_INNVENDIG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARINNVENDIGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MODERNISERINGSAAR_INNVENDIG(@) element.
 *
 * This is a complex type.
 */
public class MODERNISERINGSAARINNVENDIGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARINNVENDIGDocument
{
    private static final long serialVersionUID = 1L;
    
    public MODERNISERINGSAARINNVENDIGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODERNISERINGSAARINNVENDIG$0 = 
        new javax.xml.namespace.QName("", "MODERNISERINGSAAR_INNVENDIG");
    
    
    /**
     * Gets the "MODERNISERINGSAAR_INNVENDIG" element
     */
    public java.math.BigInteger getMODERNISERINGSAARINNVENDIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARINNVENDIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MODERNISERINGSAAR_INNVENDIG" element
     */
    public void setMODERNISERINGSAARINNVENDIG(java.math.BigInteger moderniseringsaarinnvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAARINNVENDIG$0);
            }
            target.setBigIntegerValue(moderniseringsaarinnvendig);
        }
    }
    
    /**
     * Sets (as xml) the "MODERNISERINGSAAR_INNVENDIG" element
     */
    public void xsetMODERNISERINGSAARINNVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarinnvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARINNVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAARINNVENDIG$0);
            }
            target.set(moderniseringsaarinnvendig);
        }
    }
}
