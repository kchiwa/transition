/*
 * An XML document type.
 * Localname: IAD.IF.JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one IAD.IF.JOB(@) element.
 *
 * This is a complex type.
 */
public class IADIFJOBDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument
{
    private static final long serialVersionUID = 1L;
    
    public IADIFJOBDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IADIFJOB$0 = 
        new javax.xml.namespace.QName("", "IAD.IF.JOB");
    
    
    /**
     * Gets the "IAD.IF.JOB" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB getIADIFJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB)get_store().find_element_user(IADIFJOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAD.IF.JOB" element
     */
    public void setIADIFJOB(com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB iadifjob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB)get_store().find_element_user(IADIFJOB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB)get_store().add_element_user(IADIFJOB$0);
            }
            target.set(iadifjob);
        }
    }
    
    /**
     * Appends and returns a new empty "IAD.IF.JOB" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB addNewIADIFJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB)get_store().add_element_user(IADIFJOB$0);
            return target;
        }
    }
    /**
     * An XML IAD.IF.JOB(@).
     *
     * This is a complex type.
     */
    public static class IADIFJOBImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument.IADIFJOB
    {
        private static final long serialVersionUID = 1L;
        
        public IADIFJOBImpl(org.apache.xmlbeans.SchemaType sType)
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
        public com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD getHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
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
        public void setHEAD(com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                }
                target.set(head);
            }
        }
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD addNewHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "OBJECT" elements
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT[] getOBJECTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECT$2, targetList);
                com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT[] result = new com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT getOBJECTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public void setOBJECTArray(com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT[] objectArray)
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
        public void setOBJECTArray(int i, com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT insertNewOBJECT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().insert_element_user(OBJECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT addNewOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
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
