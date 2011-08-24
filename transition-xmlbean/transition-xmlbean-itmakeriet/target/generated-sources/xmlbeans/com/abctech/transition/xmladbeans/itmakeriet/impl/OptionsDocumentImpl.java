/*
 * An XML document type.
 * Localname: Options
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Options(@) element.
 *
 * This is a complex type.
 */
public class OptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONS$0 = 
        new javax.xml.namespace.QName("", "Options");
    
    
    /**
     * Gets the "Options" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().find_element_user(OPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Options" element
     */
    public void setOptions(com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options options)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().find_element_user(OPTIONS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().add_element_user(OPTIONS$0);
            }
            target.set(options);
        }
    }
    
    /**
     * Appends and returns a new empty "Options" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options addNewOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().add_element_user(OPTIONS$0);
            return target;
        }
    }
    /**
     * An XML Options(@).
     *
     * This is a complex type.
     */
    public static class OptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options
    {
        private static final long serialVersionUID = 1L;
        
        public OptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTION$0 = 
            new javax.xml.namespace.QName("", "Option");
        
        
        /**
         * Gets array of all "Option" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option[] getOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPTION$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option[] result = new com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Option" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option getOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().find_element_user(OPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Option" element
         */
        public int sizeOfOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTION$0);
            }
        }
        
        /**
         * Sets array of all "Option" element
         */
        public void setOptionArray(com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option[] optionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(optionArray, OPTION$0);
            }
        }
        
        /**
         * Sets ith "Option" element
         */
        public void setOptionArray(int i, com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option option)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().find_element_user(OPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(option);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Option" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option insertNewOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().insert_element_user(OPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Option" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option addNewOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionDocument.Option)get_store().add_element_user(OPTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Option" element
         */
        public void removeOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTION$0, i);
            }
        }
    }
}
