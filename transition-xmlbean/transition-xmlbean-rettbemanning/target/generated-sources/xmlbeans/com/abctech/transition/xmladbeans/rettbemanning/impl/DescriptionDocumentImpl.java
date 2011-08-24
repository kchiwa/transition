/*
 * An XML document type.
 * Localname: description
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one description(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "description");
    
    
    /**
     * Gets the "description" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML description(@http://www.intelliplan.se).
     *
     * This is a complex type.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIONHEADER$0 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptionheader");
        private static final javax.xml.namespace.QName DESCRIPTIONTEXT$2 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptiontext");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
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
        
        /**
         * Gets the "descriptiontext" element
         */
        public java.lang.String getDescriptiontext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descriptiontext" element
         */
        public org.apache.xmlbeans.XmlString xgetDescriptiontext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "descriptiontext" element
         */
        public void setDescriptiontext(java.lang.String descriptiontext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONTEXT$2);
                }
                target.setStringValue(descriptiontext);
            }
        }
        
        /**
         * Sets (as xml) the "descriptiontext" element
         */
        public void xsetDescriptiontext(org.apache.xmlbeans.XmlString descriptiontext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIONTEXT$2);
                }
                target.set(descriptiontext);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$4) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$4);
            }
        }
    }
}
