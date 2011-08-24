/*
 * An XML document type.
 * Localname: UPLOAD_REFERENCE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.UPLOADREFERENCEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one UPLOAD_REFERENCE(@) element.
 *
 * This is a complex type.
 */
public class UPLOADREFERENCEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.UPLOADREFERENCEDocument
{
    private static final long serialVersionUID = 1L;
    
    public UPLOADREFERENCEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPLOADREFERENCE$0 = 
        new javax.xml.namespace.QName("", "UPLOAD_REFERENCE");
    
    
    /**
     * Gets the "UPLOAD_REFERENCE" element
     */
    public java.lang.String getUPLOADREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPLOADREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UPLOAD_REFERENCE" element
     */
    public org.apache.xmlbeans.XmlString xgetUPLOADREFERENCE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPLOADREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UPLOAD_REFERENCE" element
     */
    public void setUPLOADREFERENCE(java.lang.String uploadreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPLOADREFERENCE$0);
            }
            target.setStringValue(uploadreference);
        }
    }
    
    /**
     * Sets (as xml) the "UPLOAD_REFERENCE" element
     */
    public void xsetUPLOADREFERENCE(org.apache.xmlbeans.XmlString uploadreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPLOADREFERENCE$0);
            }
            target.set(uploadreference);
        }
    }
}
