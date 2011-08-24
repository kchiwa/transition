/*
 * An XML document type.
 * Localname: MODERNISERINGSAAR_UTVENDIG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARUTVENDIGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MODERNISERINGSAAR_UTVENDIG(@) element.
 *
 * This is a complex type.
 */
public class MODERNISERINGSAARUTVENDIGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MODERNISERINGSAARUTVENDIGDocument
{
    private static final long serialVersionUID = 1L;
    
    public MODERNISERINGSAARUTVENDIGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODERNISERINGSAARUTVENDIG$0 = 
        new javax.xml.namespace.QName("", "MODERNISERINGSAAR_UTVENDIG");
    
    
    /**
     * Gets the "MODERNISERINGSAAR_UTVENDIG" element
     */
    public java.math.BigInteger getMODERNISERINGSAARUTVENDIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMODERNISERINGSAARUTVENDIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MODERNISERINGSAAR_UTVENDIG" element
     */
    public void setMODERNISERINGSAARUTVENDIG(java.math.BigInteger moderniseringsaarutvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODERNISERINGSAARUTVENDIG$0);
            }
            target.setBigIntegerValue(moderniseringsaarutvendig);
        }
    }
    
    /**
     * Sets (as xml) the "MODERNISERINGSAAR_UTVENDIG" element
     */
    public void xsetMODERNISERINGSAARUTVENDIG(org.apache.xmlbeans.XmlInteger moderniseringsaarutvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MODERNISERINGSAARUTVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MODERNISERINGSAARUTVENDIG$0);
            }
            target.set(moderniseringsaarutvendig);
        }
    }
}
