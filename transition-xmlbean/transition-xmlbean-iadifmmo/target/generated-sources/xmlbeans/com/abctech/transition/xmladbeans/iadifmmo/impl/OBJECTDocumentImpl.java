/*
 * An XML document type.
 * Localname: OBJECT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one OBJECT(@) element.
 *
 * This is a complex type.
 */
public class OBJECTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument
{
    private static final long serialVersionUID = 1L;
    
    public OBJECTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("", "OBJECT");
    
    
    /**
     * Gets the "OBJECT" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT getOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OBJECT" element
     */
    public void setOBJECT(com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT addNewOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    /**
     * An XML OBJECT(@).
     *
     * This is a complex type.
     */
    public static class OBJECTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTHEAD$0 = 
            new javax.xml.namespace.QName("", "OBJECT_HEAD");
        private static final javax.xml.namespace.QName OVERWRITEMMO$2 = 
            new javax.xml.namespace.QName("", "OVERWRITE_MMO");
        private static final javax.xml.namespace.QName MO$4 = 
            new javax.xml.namespace.QName("", "MO");
        
        
        /**
         * Gets the "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OBJECT_HEAD" element
         */
        public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD objecthead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                }
                target.set(objecthead);
            }
        }
        
        /**
         * Appends and returns a new empty "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                return target;
            }
        }
        
        /**
         * Gets the "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OVERWRITE_MMO" element
         */
        public void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$2);
                }
                target.set(overwritemmo);
            }
        }
        
        /**
         * Appends and returns a new empty "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$2);
                return target;
            }
        }
        
        /**
         * Gets array of all "MO" elements
         */
        public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[] getMOArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MO$4, targetList);
                com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[] result = new com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MO" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO getMOArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().find_element_user(MO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MO" element
         */
        public int sizeOfMOArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MO$4);
            }
        }
        
        /**
         * Sets array of all "MO" element
         */
        public void setMOArray(com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[] moArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(moArray, MO$4);
            }
        }
        
        /**
         * Sets ith "MO" element
         */
        public void setMOArray(int i, com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO mo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().find_element_user(MO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MO" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO insertNewMO(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().insert_element_user(MO$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MO" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO addNewMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().add_element_user(MO$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "MO" element
         */
        public void removeMO(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MO$4, i);
            }
        }
    }
}
