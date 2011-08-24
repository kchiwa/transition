/*
 * An XML document type.
 * Localname: Links
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.LinksDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Links(@) element.
 *
 * This is a complex type.
 */
public class LinksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.LinksDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKS$0 = 
        new javax.xml.namespace.QName("", "Links");
    
    
    /**
     * Gets the "Links" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links getLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().find_element_user(LINKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Links" element
     */
    public void setLinks(com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links links)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().find_element_user(LINKS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().add_element_user(LINKS$0);
            }
            target.set(links);
        }
    }
    
    /**
     * Appends and returns a new empty "Links" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links addNewLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().add_element_user(LINKS$0);
            return target;
        }
    }
    /**
     * An XML Links(@).
     *
     * This is a complex type.
     */
    public static class LinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links
    {
        private static final long serialVersionUID = 1L;
        
        public LinksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINK$0 = 
            new javax.xml.namespace.QName("", "Link");
        
        
        /**
         * Gets array of all "Link" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link[] result = new com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Link" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link)get_store().find_element_user(LINK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$0);
            }
        }
        
        /**
         * Sets array of all "Link" element
         */
        public void setLinkArray(com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link[] linkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(linkArray, LINK$0);
            }
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link)get_store().find_element_user(LINK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(link);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link)get_store().insert_element_user(LINK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinkDocument.Link)get_store().add_element_user(LINK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$0, i);
            }
        }
    }
}
