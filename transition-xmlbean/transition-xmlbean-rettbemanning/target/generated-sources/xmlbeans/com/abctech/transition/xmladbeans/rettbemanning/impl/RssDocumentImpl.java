/*
 * An XML document type.
 * Localname: rss
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.RssDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one rss(@) element.
 *
 * This is a complex type.
 */
public class RssDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.RssDocument
{
    private static final long serialVersionUID = 1L;
    
    public RssDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RSS$0 = 
        new javax.xml.namespace.QName("", "rss");
    
    
    /**
     * Gets the "rss" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss getRss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss)get_store().find_element_user(RSS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rss" element
     */
    public void setRss(com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss rss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss)get_store().find_element_user(RSS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss)get_store().add_element_user(RSS$0);
            }
            target.set(rss);
        }
    }
    
    /**
     * Appends and returns a new empty "rss" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss addNewRss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss)get_store().add_element_user(RSS$0);
            return target;
        }
    }
    /**
     * An XML rss(@).
     *
     * This is a complex type.
     */
    public static class RssImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.RssDocument.Rss
    {
        private static final long serialVersionUID = 1L;
        
        public RssImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHANNEL$0 = 
            new javax.xml.namespace.QName("", "channel");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "channel" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel getChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel)get_store().find_element_user(CHANNEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "channel" element
         */
        public void setChannel(com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel channel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel)get_store().find_element_user(CHANNEL$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel)get_store().add_element_user(CHANNEL$0);
                }
                target.set(channel);
            }
        }
        
        /**
         * Appends and returns a new empty "channel" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel addNewChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel)get_store().add_element_user(CHANNEL$0);
                return target;
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$2) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$2);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$2);
            }
        }
    }
}
