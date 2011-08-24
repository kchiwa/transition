/*
 * An XML document type.
 * Localname: IAD.IF.ESTATE.FORSALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one IAD.IF.ESTATE.FORSALE(@) element.
 *
 * This is a complex type.
 */
public class IADIFESTATEFORSALEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument
{
    private static final long serialVersionUID = 1L;
    
    public IADIFESTATEFORSALEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IADIFESTATEFORSALE$0 = 
        new javax.xml.namespace.QName("", "IAD.IF.ESTATE.FORSALE");
    
    
    /**
     * Gets the "IAD.IF.ESTATE.FORSALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE getIADIFESTATEFORSALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE)get_store().find_element_user(IADIFESTATEFORSALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAD.IF.ESTATE.FORSALE" element
     */
    public void setIADIFESTATEFORSALE(com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE iadifestateforsale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE)get_store().find_element_user(IADIFESTATEFORSALE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE)get_store().add_element_user(IADIFESTATEFORSALE$0);
            }
            target.set(iadifestateforsale);
        }
    }
    
    /**
     * Appends and returns a new empty "IAD.IF.ESTATE.FORSALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE addNewIADIFESTATEFORSALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE)get_store().add_element_user(IADIFESTATEFORSALE$0);
            return target;
        }
    }
    /**
     * An XML IAD.IF.ESTATE.FORSALE(@).
     *
     * This is a complex type.
     */
    public static class IADIFESTATEFORSALEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE
    {
        private static final long serialVersionUID = 1L;
        
        public IADIFESTATEFORSALEImpl(org.apache.xmlbeans.SchemaType sType)
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
        public com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD getHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
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
        public void setHEAD(com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                }
                target.set(head);
            }
        }
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD addNewHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "OBJECT" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[] getOBJECTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECT$2, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT getOBJECTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public void setOBJECTArray(com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[] objectArray)
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
        public void setOBJECTArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, i);
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
        public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT insertNewOBJECT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT)get_store().insert_element_user(OBJECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT addNewOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
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
