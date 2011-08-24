/*
 * An XML document type.
 * Localname: search_notion_name
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion_name(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTIONNAME$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_name");
    
    
    /**
     * Gets the "search_notion_name" element
     */
    public java.lang.String getSearchNotionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "search_notion_name" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchNotionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "search_notion_name" element
     */
    public void setSearchNotionName(java.lang.String searchNotionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONNAME$0);
            }
            target.setStringValue(searchNotionName);
        }
    }
    
    /**
     * Sets (as xml) the "search_notion_name" element
     */
    public void xsetSearchNotionName(org.apache.xmlbeans.XmlString searchNotionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONNAME$0);
            }
            target.set(searchNotionName);
        }
    }
}
