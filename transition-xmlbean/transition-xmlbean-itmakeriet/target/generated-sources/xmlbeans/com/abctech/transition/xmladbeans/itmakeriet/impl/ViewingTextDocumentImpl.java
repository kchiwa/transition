/*
 * An XML document type.
 * Localname: ViewingText
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ViewingTextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one ViewingText(@) element.
 *
 * This is a complex type.
 */
public class ViewingTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ViewingTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewingTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWINGTEXT$0 = 
        new javax.xml.namespace.QName("", "ViewingText");
    
    
    /**
     * Gets the "ViewingText" element
     */
    public java.lang.String getViewingText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWINGTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ViewingText" element
     */
    public org.apache.xmlbeans.XmlString xgetViewingText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWINGTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ViewingText" element
     */
    public void setViewingText(java.lang.String viewingText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWINGTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWINGTEXT$0);
            }
            target.setStringValue(viewingText);
        }
    }
    
    /**
     * Sets (as xml) the "ViewingText" element
     */
    public void xsetViewingText(org.apache.xmlbeans.XmlString viewingText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWINGTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWINGTEXT$0);
            }
            target.set(viewingText);
        }
    }
}
