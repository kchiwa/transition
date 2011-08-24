/*
 * An XML document type.
 * Localname: AREALBESKRIVELSE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.AREALBESKRIVELSEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one AREALBESKRIVELSE(@) element.
 *
 * This is a complex type.
 */
public class AREALBESKRIVELSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.AREALBESKRIVELSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public AREALBESKRIVELSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREALBESKRIVELSE$0 = 
        new javax.xml.namespace.QName("", "AREALBESKRIVELSE");
    
    
    /**
     * Gets the "AREALBESKRIVELSE" element
     */
    public java.lang.String getAREALBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREALBESKRIVELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AREALBESKRIVELSE" element
     */
    public org.apache.xmlbeans.XmlString xgetAREALBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREALBESKRIVELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AREALBESKRIVELSE" element
     */
    public void setAREALBESKRIVELSE(java.lang.String arealbeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREALBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREALBESKRIVELSE$0);
            }
            target.setStringValue(arealbeskrivelse);
        }
    }
    
    /**
     * Sets (as xml) the "AREALBESKRIVELSE" element
     */
    public void xsetAREALBESKRIVELSE(org.apache.xmlbeans.XmlString arealbeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREALBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREALBESKRIVELSE$0);
            }
            target.set(arealbeskrivelse);
        }
    }
}
