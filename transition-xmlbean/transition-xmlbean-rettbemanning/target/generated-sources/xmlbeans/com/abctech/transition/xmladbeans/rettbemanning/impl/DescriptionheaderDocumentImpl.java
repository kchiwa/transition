/*
 * An XML document type.
 * Localname: descriptionheader
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.DescriptionheaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one descriptionheader(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class DescriptionheaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptionheaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionheaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONHEADER$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptionheader");
    
    
    /**
     * Gets the "descriptionheader" element
     */
    public java.lang.String getDescriptionheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptionheader" element
     */
    public org.apache.xmlbeans.XmlString xgetDescriptionheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONHEADER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "descriptionheader" element
     */
    public void setDescriptionheader(java.lang.String descriptionheader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONHEADER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONHEADER$0);
            }
            target.setStringValue(descriptionheader);
        }
    }
    
    /**
     * Sets (as xml) the "descriptionheader" element
     */
    public void xsetDescriptionheader(org.apache.xmlbeans.XmlString descriptionheader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONHEADER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIONHEADER$0);
            }
            target.set(descriptionheader);
        }
    }
}
