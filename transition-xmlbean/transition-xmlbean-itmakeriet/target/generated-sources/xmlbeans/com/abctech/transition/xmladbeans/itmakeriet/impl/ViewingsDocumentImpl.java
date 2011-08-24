/*
 * An XML document type.
 * Localname: Viewings
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Viewings(@) element.
 *
 * This is a complex type.
 */
public class ViewingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWINGS$0 = 
        new javax.xml.namespace.QName("", "Viewings");
    
    
    /**
     * Gets the "Viewings" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings getViewings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().find_element_user(VIEWINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Viewings" element
     */
    public void setViewings(com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings viewings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().find_element_user(VIEWINGS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().add_element_user(VIEWINGS$0);
            }
            target.set(viewings);
        }
    }
    
    /**
     * Appends and returns a new empty "Viewings" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings addNewViewings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().add_element_user(VIEWINGS$0);
            return target;
        }
    }
    /**
     * An XML Viewings(@).
     *
     * This is a complex type.
     */
    public static class ViewingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings
    {
        private static final long serialVersionUID = 1L;
        
        public ViewingsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VIEWING$0 = 
            new javax.xml.namespace.QName("", "Viewing");
        private static final javax.xml.namespace.QName VIEWINGTEXT$2 = 
            new javax.xml.namespace.QName("", "ViewingText");
        
        
        /**
         * Gets array of all "Viewing" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing[] getViewingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWING$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing[] result = new com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Viewing" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing getViewingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().find_element_user(VIEWING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Viewing" element
         */
        public int sizeOfViewingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWING$0);
            }
        }
        
        /**
         * Sets array of all "Viewing" element
         */
        public void setViewingArray(com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing[] viewingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewingArray, VIEWING$0);
            }
        }
        
        /**
         * Sets ith "Viewing" element
         */
        public void setViewingArray(int i, com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing viewing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().find_element_user(VIEWING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewing);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Viewing" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing insertNewViewing(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingDocument.Viewing)get_store().insert_element_user(VIEWING$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Viewing" element
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
         * Removes the ith "Viewing" element
         */
        public void removeViewing(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWING$0, i);
            }
        }
        
        /**
         * Gets the "ViewingText" element
         */
        public java.lang.String getViewingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWINGTEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ViewingText" element
         */
        public org.apache.xmlbeans.XmlString xgetViewingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWINGTEXT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ViewingText" element
         */
        public boolean isSetViewingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWINGTEXT$2) != 0;
            }
        }
        
        /**
         * Sets the "ViewingText" element
         */
        public void setViewingText(java.lang.String viewingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWINGTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWINGTEXT$2);
                }
                target.setStringValue(viewingText);
            }
        }
        
        /**
         * Sets (as xml) the "ViewingText" element
         */
        public void xsetViewingText(org.apache.xmlbeans.XmlString viewingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWINGTEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWINGTEXT$2);
                }
                target.set(viewingText);
            }
        }
        
        /**
         * Unsets the "ViewingText" element
         */
        public void unsetViewingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWINGTEXT$2, 0);
            }
        }
    }
}
