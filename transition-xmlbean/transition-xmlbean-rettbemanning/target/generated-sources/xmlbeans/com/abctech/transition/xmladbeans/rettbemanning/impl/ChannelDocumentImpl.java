/*
 * An XML document type.
 * Localname: channel
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one channel(@) element.
 *
 * This is a complex type.
 */
public class ChannelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChannelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANNEL$0 = 
        new javax.xml.namespace.QName("", "channel");
    
    
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
     * An XML channel(@).
     *
     * This is a complex type.
     */
    public static class ChannelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel
    {
        private static final long serialVersionUID = 1L;
        
        public ChannelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LINK$2 = 
            new javax.xml.namespace.QName("", "link");
        private static final javax.xml.namespace.QName DESCRIPTION$4 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName LANGUAGE$6 = 
            new javax.xml.namespace.QName("", "language");
        private static final javax.xml.namespace.QName LASTBUILDDATE$8 = 
            new javax.xml.namespace.QName("", "lastbuilddate");
        private static final javax.xml.namespace.QName GENERATOR$10 = 
            new javax.xml.namespace.QName("", "generator");
        private static final javax.xml.namespace.QName ITEM$12 = 
            new javax.xml.namespace.QName("", "item");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "link" element
         */
        public java.lang.String getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "link" element
         */
        public org.apache.xmlbeans.XmlString xgetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "link" element
         */
        public void setLink(java.lang.String link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINK$2);
                }
                target.setStringValue(link);
            }
        }
        
        /**
         * Sets (as xml) the "link" element
         */
        public void xsetLink(org.apache.xmlbeans.XmlString link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINK$2);
                }
                target.set(link);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "language" element
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "language" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "language" element
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$6);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "language" element
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlString language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$6);
                }
                target.set(language);
            }
        }
        
        /**
         * Gets the "lastbuilddate" element
         */
        public java.lang.String getLastbuilddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTBUILDDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastbuilddate" element
         */
        public org.apache.xmlbeans.XmlString xgetLastbuilddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTBUILDDATE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lastbuilddate" element
         */
        public void setLastbuilddate(java.lang.String lastbuilddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTBUILDDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTBUILDDATE$8);
                }
                target.setStringValue(lastbuilddate);
            }
        }
        
        /**
         * Sets (as xml) the "lastbuilddate" element
         */
        public void xsetLastbuilddate(org.apache.xmlbeans.XmlString lastbuilddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTBUILDDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTBUILDDATE$8);
                }
                target.set(lastbuilddate);
            }
        }
        
        /**
         * Gets the "generator" element
         */
        public java.lang.String getGenerator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATOR$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "generator" element
         */
        public org.apache.xmlbeans.XmlString xgetGenerator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERATOR$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "generator" element
         */
        public void setGenerator(java.lang.String generator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATOR$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERATOR$10);
                }
                target.setStringValue(generator);
            }
        }
        
        /**
         * Sets (as xml) the "generator" element
         */
        public void xsetGenerator(org.apache.xmlbeans.XmlString generator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERATOR$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERATOR$10);
                }
                target.set(generator);
            }
        }
        
        /**
         * Gets array of all "item" elements
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[] getItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ITEM$12, targetList);
                com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[] result = new com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "item" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item getItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().find_element_user(ITEM$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "item" element
         */
        public int sizeOfItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITEM$12);
            }
        }
        
        /**
         * Sets array of all "item" element
         */
        public void setItemArray(com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[] itemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(itemArray, ITEM$12);
            }
        }
        
        /**
         * Sets ith "item" element
         */
        public void setItemArray(int i, com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item item)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().find_element_user(ITEM$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(item);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "item" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item insertNewItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().insert_element_user(ITEM$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "item" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item addNewItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item)get_store().add_element_user(ITEM$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "item" element
         */
        public void removeItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITEM$12, i);
            }
        }
    }
}
