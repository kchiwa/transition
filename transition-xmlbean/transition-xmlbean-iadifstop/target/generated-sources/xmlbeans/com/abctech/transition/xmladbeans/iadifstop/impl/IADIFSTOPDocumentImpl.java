/*
 * An XML document type.
 * Localname: IAD.IF.STOP
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop.impl;
/**
 * A document containing one IAD.IF.STOP(@) element.
 *
 * This is a complex type.
 */
public class IADIFSTOPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument
{
    private static final long serialVersionUID = 1L;
    
    public IADIFSTOPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IADIFSTOP$0 = 
        new javax.xml.namespace.QName("", "IAD.IF.STOP");
    
    
    /**
     * Gets the "IAD.IF.STOP" element
     */
    public com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP getIADIFSTOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP)get_store().find_element_user(IADIFSTOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAD.IF.STOP" element
     */
    public void setIADIFSTOP(com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP iadifstop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP)get_store().find_element_user(IADIFSTOP$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP)get_store().add_element_user(IADIFSTOP$0);
            }
            target.set(iadifstop);
        }
    }
    
    /**
     * Appends and returns a new empty "IAD.IF.STOP" element
     */
    public com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP addNewIADIFSTOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP)get_store().add_element_user(IADIFSTOP$0);
            return target;
        }
    }
    /**
     * An XML IAD.IF.STOP(@).
     *
     * This is a complex type.
     */
    public static class IADIFSTOPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument.IADIFSTOP
    {
        private static final long serialVersionUID = 1L;
        
        public IADIFSTOPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEAD$0 = 
            new javax.xml.namespace.QName("", "HEAD");
        private static final javax.xml.namespace.QName OBJECT$2 = 
            new javax.xml.namespace.QName("", "OBJECT");
        private static final javax.xml.namespace.QName PRODUCT$4 = 
            new javax.xml.namespace.QName("", "PRODUCT");
        
        
        /**
         * Gets the "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD getHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "HEAD" element
         */
        public void setHEAD(com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                }
                target.set(head);
            }
        }
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD addNewHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "OBJECT" elements
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT[] getOBJECTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECT$2, targetList);
                com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT[] result = new com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT getOBJECTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OBJECT" element
         */
        public int sizeOfOBJECTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECT$2);
            }
        }
        
        /**
         * Sets array of all "OBJECT" element
         */
        public void setOBJECTArray(com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT[] objectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(objectArray, OBJECT$2);
            }
        }
        
        /**
         * Sets ith "OBJECT" element
         */
        public void setOBJECTArray(int i, com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(object);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT insertNewOBJECT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().insert_element_user(OBJECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT addNewOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "OBJECT" element
         */
        public void removeOBJECT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECT$2, i);
            }
        }
        
        /**
         * Gets the "PRODUCT" element
         */
        public java.lang.String getPRODUCT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRODUCT" element
         */
        public org.apache.xmlbeans.XmlString xgetPRODUCT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRODUCT" element
         */
        public boolean isSetPRODUCT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCT$4) != 0;
            }
        }
        
        /**
         * Sets the "PRODUCT" element
         */
        public void setPRODUCT(java.lang.String product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCT$4);
                }
                target.setStringValue(product);
            }
        }
        
        /**
         * Sets (as xml) the "PRODUCT" element
         */
        public void xsetPRODUCT(org.apache.xmlbeans.XmlString product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCT$4);
                }
                target.set(product);
            }
        }
        
        /**
         * Unsets the "PRODUCT" element
         */
        public void unsetPRODUCT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCT$4, 0);
            }
        }
    }
}
