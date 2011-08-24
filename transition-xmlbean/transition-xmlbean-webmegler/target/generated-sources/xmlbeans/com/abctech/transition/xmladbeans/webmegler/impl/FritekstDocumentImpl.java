/*
 * An XML document type.
 * Localname: fritekst
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.FritekstDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one fritekst(@) element.
 *
 * This is a complex type.
 */
public class FritekstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.FritekstDocument
{
    private static final long serialVersionUID = 1L;
    
    public FritekstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRITEKST$0 = 
        new javax.xml.namespace.QName("", "fritekst");
    
    
    /**
     * Gets the "fritekst" element
     */
    public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst getFritekst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().find_element_user(FRITEKST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fritekst" element
     */
    public void setFritekst(com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst fritekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().find_element_user(FRITEKST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().add_element_user(FRITEKST$0);
            }
            target.set(fritekst);
        }
    }
    
    /**
     * Appends and returns a new empty "fritekst" element
     */
    public com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst addNewFritekst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst)get_store().add_element_user(FRITEKST$0);
            return target;
        }
    }
    /**
     * An XML fritekst(@).
     *
     * This is a complex type.
     */
    public static class FritekstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.FritekstDocument.Fritekst
    {
        private static final long serialVersionUID = 1L;
        
        public FritekstImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FELT$0 = 
            new javax.xml.namespace.QName("", "felt");
        private static final javax.xml.namespace.QName NR$2 = 
            new javax.xml.namespace.QName("", "nr");
        private static final javax.xml.namespace.QName VISINETTPORTALER$4 = 
            new javax.xml.namespace.QName("", "visinettportaler");
        
        
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
         * Gets the "nr" attribute
         */
        public java.math.BigInteger getNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$2);
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
                return get_store().find_attribute_user(NR$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NR$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NR$2);
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
                get_store().remove_attribute(NR$2);
            }
        }
        
        /**
         * Gets the "visinettportaler" attribute
         */
        public java.math.BigInteger getVisinettportaler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISINETTPORTALER$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "visinettportaler" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetVisinettportaler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISINETTPORTALER$4);
                return target;
            }
        }
        
        /**
         * True if has "visinettportaler" attribute
         */
        public boolean isSetVisinettportaler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISINETTPORTALER$4) != null;
            }
        }
        
        /**
         * Sets the "visinettportaler" attribute
         */
        public void setVisinettportaler(java.math.BigInteger visinettportaler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISINETTPORTALER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISINETTPORTALER$4);
                }
                target.setBigIntegerValue(visinettportaler);
            }
        }
        
        /**
         * Sets (as xml) the "visinettportaler" attribute
         */
        public void xsetVisinettportaler(org.apache.xmlbeans.XmlInteger visinettportaler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISINETTPORTALER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VISINETTPORTALER$4);
                }
                target.set(visinettportaler);
            }
        }
        
        /**
         * Unsets the "visinettportaler" attribute
         */
        public void unsetVisinettportaler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISINETTPORTALER$4);
            }
        }
    }
}
