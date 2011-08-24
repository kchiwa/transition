/*
 * An XML document type.
 * Localname: ExtraGroup
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraGroup(@) element.
 *
 * This is a complex type.
 */
public class ExtraGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAGROUP$0 = 
        new javax.xml.namespace.QName("", "ExtraGroup");
    
    
    /**
     * Gets the "ExtraGroup" element
     */
    public com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup getExtraGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().find_element_user(EXTRAGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExtraGroup" element
     */
    public void setExtraGroup(com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup extraGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().find_element_user(EXTRAGROUP$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup)get_store().add_element_user(EXTRAGROUP$0);
            }
            target.set(extraGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtraGroup" element
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
     * An XML ExtraGroup(@).
     *
     * This is a complex type.
     */
    public static class ExtraGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup
    {
        private static final long serialVersionUID = 1L;
        
        public ExtraGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTRAGROUPDESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "ExtraGroupDescription");
        private static final javax.xml.namespace.QName EXTRAPARAMETER$2 = 
            new javax.xml.namespace.QName("", "ExtraParameter");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "ExtraGroupDescription" element
         */
        public java.lang.String getExtraGroupDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraGroupDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraGroupDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraGroupDescription" element
         */
        public void setExtraGroupDescription(java.lang.String extraGroupDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAGROUPDESCRIPTION$0);
                }
                target.setStringValue(extraGroupDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraGroupDescription" element
         */
        public void xsetExtraGroupDescription(org.apache.xmlbeans.XmlString extraGroupDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAGROUPDESCRIPTION$0);
                }
                target.set(extraGroupDescription);
            }
        }
        
        /**
         * Gets array of all "ExtraParameter" elements
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[] getExtraParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAPARAMETER$2, targetList);
                com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[] result = new com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ExtraParameter" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter getExtraParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().find_element_user(EXTRAPARAMETER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ExtraParameter" element
         */
        public int sizeOfExtraParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRAPARAMETER$2);
            }
        }
        
        /**
         * Sets array of all "ExtraParameter" element
         */
        public void setExtraParameterArray(com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[] extraParameterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraParameterArray, EXTRAPARAMETER$2);
            }
        }
        
        /**
         * Sets ith "ExtraParameter" element
         */
        public void setExtraParameterArray(int i, com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter extraParameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().find_element_user(EXTRAPARAMETER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extraParameter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ExtraParameter" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter insertNewExtraParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().insert_element_user(EXTRAPARAMETER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ExtraParameter" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter addNewExtraParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().add_element_user(EXTRAPARAMETER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ExtraParameter" element
         */
        public void removeExtraParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRAPARAMETER$2, i);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.math.BigInteger getId()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.math.BigInteger id)
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
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
    }
}
