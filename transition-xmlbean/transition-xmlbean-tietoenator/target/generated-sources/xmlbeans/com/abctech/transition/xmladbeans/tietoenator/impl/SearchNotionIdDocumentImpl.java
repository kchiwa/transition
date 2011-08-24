/*
 * An XML document type.
 * Localname: search_notion_id
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one search_notion_id(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class SearchNotionIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.SearchNotionIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchNotionIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHNOTIONID$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "search_notion_id");
    
    
    /**
     * Gets the "search_notion_id" element
     */
    public java.math.BigInteger getSearchNotionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "search_notion_id" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSearchNotionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEARCHNOTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "search_notion_id" element
     */
    public void setSearchNotionId(java.math.BigInteger searchNotionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHNOTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHNOTIONID$0);
            }
            target.setBigIntegerValue(searchNotionId);
        }
    }
    
    /**
     * Sets (as xml) the "search_notion_id" element
     */
    public void xsetSearchNotionId(org.apache.xmlbeans.XmlInteger searchNotionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEARCHNOTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SEARCHNOTIONID$0);
            }
            target.set(searchNotionId);
        }
    }
}
