/*
 * An XML document type.
 * Localname: descriptiontext
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.DescriptiontextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one descriptiontext(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class DescriptiontextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptiontextDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiontextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptiontext");
    
    
    /**
     * Gets the "descriptiontext" element
     */
    public java.lang.String getDescriptiontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptiontext" element
     */
    public org.apache.xmlbeans.XmlString xgetDescriptiontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "descriptiontext" element
     */
    public void setDescriptiontext(java.lang.String descriptiontext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONTEXT$0);
            }
            target.setStringValue(descriptiontext);
        }
    }
    
    /**
     * Sets (as xml) the "descriptiontext" element
     */
    public void xsetDescriptiontext(org.apache.xmlbeans.XmlString descriptiontext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIONTEXT$0);
            }
            target.set(descriptiontext);
        }
    }
}
