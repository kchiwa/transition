/*
 * An XML document type.
 * Localname: product_web
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one product_web(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class ProductWebDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductWebDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTWEB$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "product_web");
    
    
    /**
     * Gets the "product_web" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb getProductWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().find_element_user(PRODUCTWEB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "product_web" element
     */
    public void setProductWeb(com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb productWeb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().find_element_user(PRODUCTWEB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().add_element_user(PRODUCTWEB$0);
            }
            target.set(productWeb);
        }
    }
    
    /**
     * Appends and returns a new empty "product_web" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb addNewProductWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb)get_store().add_element_user(PRODUCTWEB$0);
            return target;
        }
    }
    /**
     * An XML product_web(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class ProductWebImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb
    {
        private static final long serialVersionUID = 1L;
        
        public ProductWebImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "code");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "name");
        
        
        /**
         * Gets array of all "code" elements
         */
        public java.lang.String[] getCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "code" element
         */
        public java.lang.String getCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "code" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "code" element
         */
        public org.apache.xmlbeans.XmlString xgetCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "code" element
         */
        public int sizeOfCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODE$0);
            }
        }
        
        /**
         * Sets array of all "code" element
         */
        public void setCodeArray(java.lang.String[] codeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codeArray, CODE$0);
            }
        }
        
        /**
         * Sets ith "code" element
         */
        public void setCodeArray(int i, java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) array of all "code" element
         */
        public void xsetCodeArray(org.apache.xmlbeans.XmlString[]codeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codeArray, CODE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "code" element
         */
        public void xsetCodeArray(int i, org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(code);
            }
        }
        
        /**
         * Inserts the value as the ith "code" element
         */
        public void insertCode(int i, java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CODE$0, i);
                target.setStringValue(code);
            }
        }
        
        /**
         * Appends the value as the last "code" element
         */
        public void addCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                target.setStringValue(code);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "code" element
         */
        public org.apache.xmlbeans.XmlString insertNewCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CODE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "code" element
         */
        public org.apache.xmlbeans.XmlString addNewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "code" element
         */
        public void removeCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODE$0, i);
            }
        }
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$2);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$2);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$2, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, i);
            }
        }
    }
}
