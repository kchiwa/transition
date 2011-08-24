/*
 * An XML document type.
 * Localname: Viewing
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Viewing(@) element.
 *
 * This is a complex type.
 */
public class ViewingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWING$0 = 
        new javax.xml.namespace.QName("", "Viewing");
    
    
    /**
     * Gets the "Viewing" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing getViewing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().find_element_user(VIEWING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Viewing" element
     */
    public void setViewing(com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing viewing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().find_element_user(VIEWING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().add_element_user(VIEWING$0);
            }
            target.set(viewing);
        }
    }
    
    /**
     * Appends and returns a new empty "Viewing" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing addNewViewing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().add_element_user(VIEWING$0);
            return target;
        }
    }
    /**
     * An XML Viewing(@).
     *
     * This is a complex type.
     */
    public static class ViewingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing
    {
        private static final long serialVersionUID = 1L;
        
        public ViewingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("", "Date");
        private static final javax.xml.namespace.QName FROM$2 = 
            new javax.xml.namespace.QName("", "From");
        private static final javax.xml.namespace.QName TO$4 = 
            new javax.xml.namespace.QName("", "To");
        
        
        /**
         * Gets the "Date" attribute
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Date" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$0);
                return target;
            }
        }
        
        /**
         * True if has "Date" attribute
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATE$0) != null;
            }
        }
        
        /**
         * Sets the "Date" attribute
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$0);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "Date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "Date" attribute
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATE$0);
            }
        }
        
        /**
         * Gets the "From" attribute
         */
        public java.lang.String getFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "From" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$2);
                return target;
            }
        }
        
        /**
         * True if has "From" attribute
         */
        public boolean isSetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FROM$2) != null;
            }
        }
        
        /**
         * Sets the "From" attribute
         */
        public void setFrom(java.lang.String from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$2);
                }
                target.setStringValue(from);
            }
        }
        
        /**
         * Sets (as xml) the "From" attribute
         */
        public void xsetFrom(org.apache.xmlbeans.XmlString from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$2);
                }
                target.set(from);
            }
        }
        
        /**
         * Unsets the "From" attribute
         */
        public void unsetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FROM$2);
            }
        }
        
        /**
         * Gets the "To" attribute
         */
        public java.lang.String getTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "To" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
                return target;
            }
        }
        
        /**
         * True if has "To" attribute
         */
        public boolean isSetTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TO$4) != null;
            }
        }
        
        /**
         * Sets the "To" attribute
         */
        public void setTo(java.lang.String to)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$4);
                }
                target.setStringValue(to);
            }
        }
        
        /**
         * Sets (as xml) the "To" attribute
         */
        public void xsetTo(org.apache.xmlbeans.XmlString to)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$4);
                }
                target.set(to);
            }
        }
        
        /**
         * Unsets the "To" attribute
         */
        public void unsetTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TO$4);
            }
        }
    }
}
