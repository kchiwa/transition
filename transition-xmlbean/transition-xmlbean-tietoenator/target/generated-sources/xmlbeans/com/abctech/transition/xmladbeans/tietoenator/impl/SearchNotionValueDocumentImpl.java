/*
 * An XML document type.
 * Localname: search_notion_value
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion_value(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTIONVALUE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_value");
    
    
    /**
     * Gets the "search_notion_value" element
     */
    public java.lang.String getSearchNotionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "search_notion_value" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchNotionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "search_notion_value" element
     */
    public void setSearchNotionValue(java.lang.String searchNotionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONVALUE$0);
            }
            target.setStringValue(searchNotionValue);
        }
    }
    
    /**
     * Sets (as xml) the "search_notion_value" element
     */
    public void xsetSearchNotionValue(org.apache.xmlbeans.XmlString searchNotionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONVALUE$0);
            }
            target.set(searchNotionValue);
        }
    }
}
