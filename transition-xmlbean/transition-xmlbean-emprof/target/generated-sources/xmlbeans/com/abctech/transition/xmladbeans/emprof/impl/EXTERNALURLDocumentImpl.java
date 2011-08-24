/*
 * An XML document type.
 * Localname: EXTERNALURL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.EXTERNALURLDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one EXTERNALURL(@) element.
 *
 * This is a complex type.
 */
public class EXTERNALURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.EXTERNALURLDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXTERNALURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALURL$0 = 
        new javax.xml.namespace.QName("", "EXTERNALURL");
    
    
    /**
     * Gets the "EXTERNALURL" element
     */
    public java.lang.String getEXTERNALURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EXTERNALURL" element
     */
    public org.apache.xmlbeans.XmlString xgetEXTERNALURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EXTERNALURL" element
     */
    public void setEXTERNALURL(java.lang.String externalurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALURL$0);
            }
            target.setStringValue(externalurl);
        }
    }
    
    /**
     * Sets (as xml) the "EXTERNALURL" element
     */
    public void xsetEXTERNALURL(org.apache.xmlbeans.XmlString externalurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALURL$0);
            }
            target.set(externalurl);
        }
    }
}
