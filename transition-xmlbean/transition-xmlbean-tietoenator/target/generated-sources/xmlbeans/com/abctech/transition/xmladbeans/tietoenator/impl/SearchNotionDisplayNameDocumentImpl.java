/*
 * An XML document type.
 * Localname: search_notion_display_name
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionDisplayNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion_display_name(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionDisplayNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionDisplayNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionDisplayNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTIONDISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_display_name");
    
    
    /**
     * Gets the "search_notion_display_name" element
     */
    public java.lang.String getSearchNotionDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "search_notion_display_name" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchNotionDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "search_notion_display_name" element
     */
    public void setSearchNotionDisplayName(java.lang.String searchNotionDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONDISPLAYNAME$0);
            }
            target.setStringValue(searchNotionDisplayName);
        }
    }
    
    /**
     * Sets (as xml) the "search_notion_display_name" element
     */
    public void xsetSearchNotionDisplayName(org.apache.xmlbeans.XmlString searchNotionDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHNOTIONDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHNOTIONDISPLAYNAME$0);
            }
            target.set(searchNotionDisplayName);
        }
    }
}
