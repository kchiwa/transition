/*
 * An XML document type.
 * Localname: DisplayRef
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.DisplayRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one DisplayRef(@) element.
 *
 * This is a complex type.
 */
public class DisplayRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.DisplayRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYREF$0 = 
        new javax.xml.namespace.QName("", "DisplayRef");
    
    
    /**
     * Gets the "DisplayRef" element
     */
    public java.lang.String getDisplayRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayRef" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DisplayRef" element
     */
    public void setDisplayRef(java.lang.String displayRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYREF$0);
            }
            target.setStringValue(displayRef);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayRef" element
     */
    public void xsetDisplayRef(org.apache.xmlbeans.XmlString displayRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYREF$0);
            }
            target.set(displayRef);
        }
    }
}
