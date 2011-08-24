/*
 * An XML document type.
 * Localname: visninger
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.VisningerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one visninger(@) element.
 *
 * This is a complex type.
 */
public class VisningerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.VisningerDocument
{
    private static final long serialVersionUID = 1L;
    
    public VisningerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISNINGER$0 = 
        new javax.xml.namespace.QName("", "visninger");
    
    
    /**
     * Gets the "visninger" element
     */
    public com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger getVisninger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().find_element_user(VISNINGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "visninger" element
     */
    public void setVisninger(com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger visninger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().find_element_user(VISNINGER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().add_element_user(VISNINGER$0);
            }
            target.set(visninger);
        }
    }
    
    /**
     * Appends and returns a new empty "visninger" element
     */
    public com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger addNewVisninger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().add_element_user(VISNINGER$0);
            return target;
        }
    }
    /**
     * An XML visninger(@).
     *
     * This is a complex type.
     */
    public static class VisningerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger
    {
        private static final long serialVersionUID = 1L;
        
        public VisningerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VISNING$0 = 
            new javax.xml.namespace.QName("", "visning");
        
        
        /**
         * Gets array of all "visning" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning[] getVisningArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VISNING$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning[] result = new com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "visning" element
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning getVisningArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().find_element_user(VISNING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "visning" element
         */
        public int sizeOfVisningArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VISNING$0);
            }
        }
        
        /**
         * Sets array of all "visning" element
         */
        public void setVisningArray(com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning[] visningArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(visningArray, VISNING$0);
            }
        }
        
        /**
         * Sets ith "visning" element
         */
        public void setVisningArray(int i, com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning visning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().find_element_user(VISNING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(visning);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "visning" element
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning insertNewVisning(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().insert_element_user(VISNING$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "visning" element
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning addNewVisning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().add_element_user(VISNING$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "visning" element
         */
        public void removeVisning(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VISNING$0, i);
            }
        }
    }
}
