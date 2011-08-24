/*
 * An XML document type.
 * Localname: VEDLEGGTITTEL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGTITTELDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGGTITTEL(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGTITTELDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGTITTELDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGTITTELDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGGTITTEL$0 = 
        new javax.xml.namespace.QName("", "VEDLEGGTITTEL");
    
    
    /**
     * Gets the "VEDLEGGTITTEL" element
     */
    public java.lang.String getVEDLEGGTITTEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGTITTEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEDLEGGTITTEL" element
     */
    public org.apache.xmlbeans.XmlString xgetVEDLEGGTITTEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGTITTEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGGTITTEL" element
     */
    public void setVEDLEGGTITTEL(java.lang.String vedleggtittel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGTITTEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGTITTEL$0);
            }
            target.setStringValue(vedleggtittel);
        }
    }
    
    /**
     * Sets (as xml) the "VEDLEGGTITTEL" element
     */
    public void xsetVEDLEGGTITTEL(org.apache.xmlbeans.XmlString vedleggtittel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGTITTEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGTITTEL$0);
            }
            target.set(vedleggtittel);
        }
    }
}
