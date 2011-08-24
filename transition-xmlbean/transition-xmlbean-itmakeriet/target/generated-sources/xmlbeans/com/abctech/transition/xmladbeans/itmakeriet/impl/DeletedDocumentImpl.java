/*
 * An XML document type.
 * Localname: Deleted
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Deleted(@) element.
 *
 * This is a complex type.
 */
public class DeletedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeletedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETED$0 = 
        new javax.xml.namespace.QName("", "Deleted");
    
    
    /**
     * Gets the "Deleted" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().find_element_user(DELETED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Deleted" element
     */
    public void setDeleted(com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().find_element_user(DELETED$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().add_element_user(DELETED$0);
            }
            target.set(deleted);
        }
    }
    
    /**
     * Appends and returns a new empty "Deleted" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted addNewDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().add_element_user(DELETED$0);
            return target;
        }
    }
    /**
     * An XML Deleted(@).
     *
     * This is a complex type.
     */
    public static class DeletedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted
    {
        private static final long serialVersionUID = 1L;
        
        public DeletedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("", "Date");
        private static final javax.xml.namespace.QName TIME$2 = 
            new javax.xml.namespace.QName("", "Time");
        
        
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
         * Gets the "Time" attribute
         */
        public java.lang.String getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Time" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$2);
                return target;
            }
        }
        
        /**
         * True if has "Time" attribute
         */
        public boolean isSetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIME$2) != null;
            }
        }
        
        /**
         * Sets the "Time" attribute
         */
        public void setTime(java.lang.String time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$2);
                }
                target.setStringValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "Time" attribute
         */
        public void xsetTime(org.apache.xmlbeans.XmlString time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$2);
                }
                target.set(time);
            }
        }
        
        /**
         * Unsets the "Time" attribute
         */
        public void unsetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIME$2);
            }
        }
    }
}
