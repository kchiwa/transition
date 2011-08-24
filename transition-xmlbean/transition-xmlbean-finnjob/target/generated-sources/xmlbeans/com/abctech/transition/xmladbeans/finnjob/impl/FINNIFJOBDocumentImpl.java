/*
 * An XML document type.
 * Localname: FINN.IF.JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one FINN.IF.JOB(@) element.
 *
 * This is a complex type.
 */
public class FINNIFJOBDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument
{
    private static final long serialVersionUID = 1L;
    
    public FINNIFJOBDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINNIFJOB$0 = 
        new javax.xml.namespace.QName("", "FINN.IF.JOB");
    
    
    /**
     * Gets the "FINN.IF.JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB getFINNIFJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB)get_store().find_element_user(FINNIFJOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FINN.IF.JOB" element
     */
    public void setFINNIFJOB(com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB finnifjob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB)get_store().find_element_user(FINNIFJOB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB)get_store().add_element_user(FINNIFJOB$0);
            }
            target.set(finnifjob);
        }
    }
    
    /**
     * Appends and returns a new empty "FINN.IF.JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB addNewFINNIFJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB)get_store().add_element_user(FINNIFJOB$0);
            return target;
        }
    }
    /**
     * An XML FINN.IF.JOB(@).
     *
     * This is a complex type.
     */
    public static class FINNIFJOBImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB
    {
        private static final long serialVersionUID = 1L;
        
        public FINNIFJOBImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEAD$0 = 
            new javax.xml.namespace.QName("", "HEAD");
        private static final javax.xml.namespace.QName OBJECT$2 = 
            new javax.xml.namespace.QName("", "OBJECT");
        
        
        /**
         * Gets the "HEAD" element
         */
        public com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD getHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
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
        public void setHEAD(com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                }
                target.set(head);
            }
        }
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        public com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD addNewHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "OBJECT" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[] getOBJECTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECT$2, targetList);
                com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[] result = new com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT getOBJECTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public void setOBJECTArray(com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[] objectArray)
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
        public void setOBJECTArray(int i, com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT insertNewOBJECT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT)get_store().insert_element_user(OBJECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT addNewOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
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
    }
}
