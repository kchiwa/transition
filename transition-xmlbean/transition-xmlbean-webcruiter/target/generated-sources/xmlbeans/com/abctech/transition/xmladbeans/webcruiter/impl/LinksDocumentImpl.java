/*
 * An XML document type.
 * Localname: Links
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.LinksDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Links(@) element.
 *
 * This is a complex type.
 */
public class LinksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.LinksDocument
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
    public com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links getLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().find_element_user(LINKS$0, 0);
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
    public void setLinks(com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links links)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().find_element_user(LINKS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().add_element_user(LINKS$0);
            }
            target.set(links);
        }
    }
    
    /**
     * Appends and returns a new empty "Links" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links addNewLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().add_element_user(LINKS$0);
            return target;
        }
    }
    /**
     * An XML Links(@).
     *
     * This is a complex type.
     */
    public static class LinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links
    {
        private static final long serialVersionUID = 1L;
        
        public LinksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINK$0 = 
            new javax.xml.namespace.QName("", "Link");
        
        
        /**
         * Gets the "Link" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().find_element_user(LINK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Link" element
         */
        public void setLink(com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().find_element_user(LINK$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().add_element_user(LINK$0);
                }
                target.set(link);
            }
        }
        
        /**
         * Appends and returns a new empty "Link" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link)get_store().add_element_user(LINK$0);
                return target;
            }
        }
    }
}
