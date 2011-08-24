/*
 * An XML document type.
 * Localname: descriptions
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one descriptions(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class DescriptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONS$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "descriptions");
    
    
    /**
     * Gets the "descriptions" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions getDescriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().find_element_user(DESCRIPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptions" element
     */
    public void setDescriptions(com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions descriptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().find_element_user(DESCRIPTIONS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().add_element_user(DESCRIPTIONS$0);
            }
            target.set(descriptions);
        }
    }
    
    /**
     * Appends and returns a new empty "descriptions" element
     */
    public com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions addNewDescriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions target = null;
            target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions)get_store().add_element_user(DESCRIPTIONS$0);
            return target;
        }
    }
    /**
     * An XML descriptions(@http://www.intelliplan.se).
     *
     * This is a complex type.
     */
    public static class DescriptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.DescriptionsDocument.Descriptions
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://www.intelliplan.se", "description");
        
        
        /**
         * Gets array of all "description" elements
         */
        public com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$0, targetList);
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description[] result = new com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "description" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0);
            }
        }
        
        /**
         * Sets array of all "description" element
         */
        public void setDescriptionArray(com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description[] descriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(descriptionArray, DESCRIPTION$0);
            }
        }
        
        /**
         * Sets ith "description" element
         */
        public void setDescriptionArray(int i, com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(description);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        public com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description target = null;
                target = (com.abctech.transition.xmladbeans.rettbemanning.DescriptionDocument.Description)get_store().insert_element_user(DESCRIPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
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
         * Removes the ith "description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, i);
            }
        }
    }
}
