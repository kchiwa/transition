/*
 * An XML document type.
 * Localname: FESTEAVGIFT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.FESTEAVGIFTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one FESTEAVGIFT(@) element.
 *
 * This is a complex type.
 */
public class FESTEAVGIFTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.FESTEAVGIFTDocument
{
    private static final long serialVersionUID = 1L;
    
    public FESTEAVGIFTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FESTEAVGIFT$0 = 
        new javax.xml.namespace.QName("", "FESTEAVGIFT");
    
    
    /**
     * Gets the "FESTEAVGIFT" element
     */
    public java.lang.String getFESTEAVGIFT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTEAVGIFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FESTEAVGIFT" element
     */
    public org.apache.xmlbeans.XmlString xgetFESTEAVGIFT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTEAVGIFT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FESTEAVGIFT" element
     */
    public void setFESTEAVGIFT(java.lang.String festeavgift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTEAVGIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FESTEAVGIFT$0);
            }
            target.setStringValue(festeavgift);
        }
    }
    
    /**
     * Sets (as xml) the "FESTEAVGIFT" element
     */
    public void xsetFESTEAVGIFT(org.apache.xmlbeans.XmlString festeavgift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTEAVGIFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FESTEAVGIFT$0);
            }
            target.set(festeavgift);
        }
    }
}
