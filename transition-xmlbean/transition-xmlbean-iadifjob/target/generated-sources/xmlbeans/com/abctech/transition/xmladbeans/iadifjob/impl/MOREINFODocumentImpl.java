/*
 * An XML document type.
 * Localname: MOREINFO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one MOREINFO(@) element.
 *
 * This is a complex type.
 */
public class MOREINFODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument
{
    private static final long serialVersionUID = 1L;
    
    public MOREINFODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOREINFO$0 = 
        new javax.xml.namespace.QName("", "MOREINFO");
    
    
    /**
     * Gets the "MOREINFO" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO getMOREINFO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MOREINFO" element
     */
    public void setMOREINFO(com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO moreinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$0);
            }
            target.set(moreinfo);
        }
    }
    
    /**
     * Appends and returns a new empty "MOREINFO" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO addNewMOREINFO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$0);
            return target;
        }
    }
    /**
     * An XML MOREINFO(@).
     *
     * This is a complex type.
     */
    public static class MOREINFOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.MOREINFODocument.MOREINFO
    {
        private static final long serialVersionUID = 1L;
        
        public MOREINFOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URL$0 = 
            new javax.xml.namespace.QName("", "URL");
        private static final javax.xml.namespace.QName URLTEXT$2 = 
            new javax.xml.namespace.QName("", "URLTEXT");
        
        
        /**
         * Gets the "URL" element
         */
        public java.lang.String getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URL" element
         */
        public org.apache.xmlbeans.XmlString xgetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$0);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "URL" element
         */
        public void xsetURL(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$0);
                }
                target.set(url);
            }
        }
        
        /**
         * Gets the "URLTEXT" element
         */
        public java.lang.String getURLTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLTEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URLTEXT" element
         */
        public org.apache.xmlbeans.XmlString xgetURLTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLTEXT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "URLTEXT" element
         */
        public boolean isSetURLTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URLTEXT$2) != 0;
            }
        }
        
        /**
         * Sets the "URLTEXT" element
         */
        public void setURLTEXT(java.lang.String urltext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLTEXT$2);
                }
                target.setStringValue(urltext);
            }
        }
        
        /**
         * Sets (as xml) the "URLTEXT" element
         */
        public void xsetURLTEXT(org.apache.xmlbeans.XmlString urltext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLTEXT$2);
                }
                target.set(urltext);
            }
        }
        
        /**
         * Unsets the "URLTEXT" element
         */
        public void unsetURLTEXT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URLTEXT$2, 0);
            }
        }
    }
}
