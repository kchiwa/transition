/*
 * An XML document type.
 * Localname: visning
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.VisningDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one visning(@) element.
 *
 * This is a complex type.
 */
public class VisningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.VisningDocument
{
    private static final long serialVersionUID = 1L;
    
    public VisningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISNING$0 = 
        new javax.xml.namespace.QName("", "visning");
    
    
    /**
     * Gets the "visning" element
     */
    public com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning getVisning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().find_element_user(VISNING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "visning" element
     */
    public void setVisning(com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning visning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().find_element_user(VISNING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning)get_store().add_element_user(VISNING$0);
            }
            target.set(visning);
        }
    }
    
    /**
     * Appends and returns a new empty "visning" element
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
     * An XML visning(@).
     *
     * This is a complex type.
     */
    public static class VisningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.VisningDocument.Visning
    {
        private static final long serialVersionUID = 1L;
        
        public VisningImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FELT$0 = 
            new javax.xml.namespace.QName("", "felt");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NR$4 = 
            new javax.xml.namespace.QName("", "nr");
        
        
        /**
         * Gets array of all "felt" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] getFeltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FELT$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] result = new com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt getFeltArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "felt" element
         */
        public int sizeOfFeltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FELT$0);
            }
        }
        
        /**
         * Sets array of all "felt" element
         */
        public void setFeltArray(com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] feltArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(feltArray, FELT$0);
            }
        }
        
        /**
         * Sets ith "felt" element
         */
        public void setFeltArray(int i, com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt felt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(felt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt insertNewFelt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().insert_element_user(FELT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt addNewFelt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().add_element_user(FELT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "felt" element
         */
        public void removeFelt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FELT$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
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
                return get_store().find_attribute_user(ID$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
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
                get_store().remove_attribute(ID$2);
            }
        }
        
        /**
         * Gets the "nr" attribute
         */
        public java.math.BigInteger getNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nr" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$4);
                return target;
            }
        }
        
        /**
         * True if has "nr" attribute
         */
        public boolean isSetNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NR$4) != null;
            }
        }
        
        /**
         * Sets the "nr" attribute
         */
        public void setNr(java.math.BigInteger nr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NR$4);
                }
                target.setBigIntegerValue(nr);
            }
        }
        
        /**
         * Sets (as xml) the "nr" attribute
         */
        public void xsetNr(org.apache.xmlbeans.XmlInteger nr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NR$4);
                }
                target.set(nr);
            }
        }
        
        /**
         * Unsets the "nr" attribute
         */
        public void unsetNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NR$4);
            }
        }
    }
}
