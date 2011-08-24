/*
 * An XML document type.
 * Localname: ExtraParameters
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraParameters(@) element.
 *
 * This is a complex type.
 */
public class ExtraParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAPARAMETERS$0 = 
        new javax.xml.namespace.QName("", "ExtraParameters");
    
    
    /**
     * Gets the "ExtraParameters" element
     */
    public com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters getExtraParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().find_element_user(EXTRAPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExtraParameters" element
     */
    public void setExtraParameters(com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters extraParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().find_element_user(EXTRAPARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().add_element_user(EXTRAPARAMETERS$0);
            }
            target.set(extraParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtraParameters" element
     */
    public com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters addNewExtraParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().add_element_user(EXTRAPARAMETERS$0);
            return target;
        }
    }
    /**
     * An XML ExtraParameters(@).
     *
     * This is a complex type.
     */
    public static class ExtraParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters
    {
        private static final long serialVersionUID = 1L;
        
        public ExtraParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTRAGROUP$0 = 
            new javax.xml.namespace.QName("", "ExtraGroup");
        
        
        /**
         * Gets array of all "ExtraGroup" elements
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup[] getExtraGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAGROUP$0, targetList);
                com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup[] result = new com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ExtraGroup" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup getExtraGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().find_element_user(EXTRAGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ExtraGroup" element
         */
        public int sizeOfExtraGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRAGROUP$0);
            }
        }
        
        /**
         * Sets array of all "ExtraGroup" element
         */
        public void setExtraGroupArray(com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup[] extraGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraGroupArray, EXTRAGROUP$0);
            }
        }
        
        /**
         * Sets ith "ExtraGroup" element
         */
        public void setExtraGroupArray(int i, com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup extraGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().find_element_user(EXTRAGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extraGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ExtraGroup" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup insertNewExtraGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().insert_element_user(EXTRAGROUP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ExtraGroup" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup addNewExtraGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().add_element_user(EXTRAGROUP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ExtraGroup" element
         */
        public void removeExtraGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRAGROUP$0, i);
            }
        }
    }
}
