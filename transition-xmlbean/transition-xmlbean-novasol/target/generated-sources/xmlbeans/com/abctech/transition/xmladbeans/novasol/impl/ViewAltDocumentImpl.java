/*
 * An XML document type.
 * Localname: ViewAlt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ViewAltDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ViewAlt(@) element.
 *
 * This is a complex type.
 */
public class ViewAltDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ViewAltDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewAltDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWALT$0 = 
        new javax.xml.namespace.QName("", "ViewAlt");
    
    
    /**
     * Gets the "ViewAlt" element
     */
    public java.lang.String getViewAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWALT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ViewAlt" element
     */
    public org.apache.xmlbeans.XmlString xgetViewAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWALT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ViewAlt" element
     */
    public void setViewAlt(java.lang.String viewAlt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWALT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWALT$0);
            }
            target.setStringValue(viewAlt);
        }
    }
    
    /**
     * Sets (as xml) the "ViewAlt" element
     */
    public void xsetViewAlt(org.apache.xmlbeans.XmlString viewAlt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWALT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWALT$0);
            }
            target.set(viewAlt);
        }
    }
}
